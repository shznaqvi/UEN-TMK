package edu.aku.hassannaqvi.uen_tmk.activities;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.uen_tmk.R;
import edu.aku.hassannaqvi.uen_tmk.contracts.MWRAContract;
import edu.aku.hassannaqvi.uen_tmk.core.DatabaseHelper;
import edu.aku.hassannaqvi.uen_tmk.core.MainApp;

public class SectionDActivity extends Activity {

    private static final String TAG = SectionDActivity.class.getSimpleName();

    @BindView(R.id.scroll)
    ScrollView scroll;
    @BindView(R.id.td01)
    RadioGroup td01;
    @BindView(R.id.td01a)
    RadioButton td01a;
    @BindView(R.id.td01b)
    RadioButton td01b;
    @BindView(R.id.fldGrptd02)
    LinearLayout fldGrptd02;
    @BindView(R.id.td02)
    EditText td02;
    @BindView(R.id.td03lb)
    EditText td03lb;
    @BindView(R.id.td03sb)
    EditText td03sb;
    @BindView(R.id.td03mc)
    EditText td03mc;
    @BindView(R.id.td04)
    RadioGroup td04;
    @BindView(R.id.td04a)
    RadioButton td04a;
    @BindView(R.id.td04b)
    RadioButton td04b;
    @BindView(R.id.fldGrptd05)
    LinearLayout fldGrptd05;
    @BindView(R.id.td05)
    EditText td05;
    @BindView(R.id.mwraNames)
    Spinner mwraNames;

    Map<String, String> mwraMap;
    ArrayList<String> lstMwra;

    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_d);
        ButterKnife.bind(this);

//        mwraNames.setText("Woman: " + MainApp.mwraCount + " out of " + MainApp.TotalMWRACount);

        //        get data from sec B

        mwraMap = new HashMap<>();
        lstMwra = new ArrayList<>();

        mwraMap.put("....", "");
        lstMwra.add("....");

        for (byte i = 0; i < MainApp.familyMembersList.size(); i++) {
            if (MainApp.familyMembersList.get(i).getAgeLess5().equals("2")) {
                mwraMap.put(MainApp.familyMembersList.get(i).getName(), MainApp.familyMembersList.get(i).getSerialNo());
                lstMwra.add(MainApp.familyMembersList.get(i).getName());
            }
        }

        mwraNames.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, lstMwra));

        td01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (td01a.isChecked()) {
                    fldGrptd02.setVisibility(View.VISIBLE);
                } else {
                    fldGrptd02.setVisibility(View.GONE);
                    td02.setText(null);
                    td03lb.setText(null);
                    td03sb.setText(null);
                    td03mc.setText(null);
                    td04.clearCheck();
                    td05.setText(null);

                }
            }
        });


        td04.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (td04a.isChecked()) {
                    fldGrptd05.setVisibility(View.VISIBLE);
                } else {
                    fldGrptd05.setVisibility(View.GONE);
                    td05.setText(null);
                }
            }
        });

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {

        Toast.makeText(this, "Not Processing This Section", Toast.LENGTH_SHORT).show();

        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();

        MainApp.endActivity(this, this);
    }


    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {

        if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                MainApp.mwraCount++;

                if (MainApp.mwraCount > MainApp.TotalMWRACount) {
                    finish();

                    Intent secNext = new Intent(this, SectionEActivity.class);
                    startActivity(secNext);
                } else {
                    /*Intent secNext = new Intent(this, SectionDActivity.class);
                    startActivity(secNext);*/

                    clearFields();

                    lstMwra.remove(position);
                    mwraMap.remove(position);

                    mwraNames.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, lstMwra));

                    scroll.setScrollY(0);


                }


            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void clearFields() {
        td01.clearCheck();
        td02.setText(null);
        td03lb.setText(null);
        td03sb.setText(null);
        td03mc.setText(null);
        td04.clearCheck();
        td05.setText(null);

    }

    private boolean UpdateDB() {

        DatabaseHelper db = new DatabaseHelper(this);

        Long updcount = db.addMWRA(MainApp.mw);
        MainApp.mw.set_ID(String.valueOf(updcount));

        if (updcount != -1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();

            MainApp.mw.setUID(
                    (MainApp.fc.getDeviceID() + MainApp.mw.get_ID()));
            db.updateMWRAID();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        SharedPreferences sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);

        MainApp.mw = new MWRAContract();

        MainApp.mw.set_UUID(MainApp.fc.getUID());
        MainApp.mw.setFormDate(MainApp.fc.getFormDate());
        MainApp.mw.setDeviceId(MainApp.fc.getDeviceID());
        MainApp.mw.setUser(MainApp.fc.getUser());
        MainApp.mw.setDevicetagID(sharedPref.getString("tagName", null));

        JSONObject sD = new JSONObject();

        sD.put("tdmwraSerial", mwraMap.get(mwraNames.getSelectedItem().toString()));
        sD.put("tdmwraName", mwraNames.getSelectedItem().toString());
        sD.put("td01", td01a.isChecked() ? "1" : td01b.isChecked() ? "2" : "0");
        sD.put("td02", td02.getText().toString());
        sD.put("td03lb", td03lb.getText().toString());
        sD.put("td03sb", td03sb.getText().toString());
        sD.put("td03mc", td03mc.getText().toString());
        sD.put("td04", td04a.isChecked() ? "1" : td04b.isChecked() ? "2" : "0");
        sD.put("td05", td05.getText().toString());

        MainApp.mw.setsD(String.valueOf(sD));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    public boolean ValidateForm() {

        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        //        01
        if (mwraNames.getSelectedItem() == "....") {
            Toast.makeText(this, "ERROR(Empty) MWRA name", Toast.LENGTH_SHORT).show();
            ((TextView) mwraNames.getSelectedView()).setText("This Data is Required");
            ((TextView) mwraNames.getSelectedView()).setTextColor(Color.RED);

            Log.i(TAG, "mwraNames: This Data is Required!");
            return false;
        } else {
            ((TextView) mwraNames.getSelectedView()).setError(null);
        }


        if (td01.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.td01), Toast.LENGTH_SHORT).show();
            td01b.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "td01: This data is Required!");
            return false;
        } else {
            td01b.setError(null);
        }

        if (td01a.isChecked()) {
            if (td02.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.td02), Toast.LENGTH_SHORT).show();
                td02.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "td02: This data is Required!");
                return false;
            } else {
                td02.setError(null);
            }

            if (Integer.parseInt(td02.getText().toString()) < 1) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.td02), Toast.LENGTH_SHORT).show();
                td02.setError("Zero not allowed");    // Set Error on last radio button

                Log.i(TAG, "td02: Zero not allowed");
                return false;
            } else {
                td02.setError(null);
            }


            if (td03lb.getText().toString().isEmpty() || td03sb.getText().toString().isEmpty() || td03mc.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.td03), Toast.LENGTH_SHORT).show();
                td03lb.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "td03: This data is Required!");
                return false;
            } else {
                td03lb.setError(null);
            }

            if (td04.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.td04), Toast.LENGTH_SHORT).show();
                td04b.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "td04: This data is Required!");
                return false;
            } else {
                td04b.setError(null);
            }

            if (td04a.isChecked()) {
                if (td05.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.td05), Toast.LENGTH_SHORT).show();
                    td05.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "td05: This data is Required!");
                    return false;
                } else {
                    td05.setError(null);
                }

                if (Integer.parseInt(td05.getText().toString()) < 4 || Integer.parseInt(td05.getText().toString()) > 42) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.td05), Toast.LENGTH_SHORT).show();
                    td05.setError("Range is 4 to 42 weeks");    // Set Error on last radio button

                    Log.i(TAG, "td05: Range is 4 to 42 weeks");
                    return false;
                } else {
                    td05.setError(null);
                }

            }


        }


        return true;
    }



    /*@Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }*/




}
