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

    @BindView(R.id.td06)
    RadioGroup td06;
    @BindView(R.id.td06a)
    RadioButton td06a;
    @BindView(R.id.td06b)
    RadioButton td06b;
    @BindView(R.id.fldGrptd19)
    LinearLayout fldGrptd19;
    @BindView(R.id.td07)
    EditText td07;
    @BindView(R.id.td08)
    RadioGroup td08;
    @BindView(R.id.td08a)
    RadioButton td08a;
    @BindView(R.id.td08b)
    RadioButton td08b;
    @BindView(R.id.fldGrptd21)
    LinearLayout fldGrptd21;
    @BindView(R.id.td09)
    EditText td09;

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
            if (MainApp.familyMembersList.get(i).getAgeLess5().equals("2") && MainApp.familyMembersList.get(i).getAgeLess2().equals("2")) {
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

        td06.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (td06a.isChecked()) {
                    fldGrptd19.setVisibility(View.VISIBLE);

                } else {
                    fldGrptd19.setVisibility(View.GONE);
                    td07.setText(null);
                }
            }
        });

        td08.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (td08a.isChecked()) {
                    fldGrptd21.setVisibility(View.VISIBLE);

                } else {
                    fldGrptd21.setVisibility(View.GONE);
                    td09.setText(null);
                }
            }
        });


        /*childsMap = new HashMap<>();
        lstChild = new ArrayList<>();

        childsMap.put("....", "");
        lstChild.add("....");

        for (byte i = 0; i < MainApp.familyMembersList.size(); i++) {
            if (MainApp.familyMembersList.get(i).getAgeLess5().equals("1")) {
                childsMap.put(MainApp.familyMembersList.get(i).getName(), MainApp.familyMembersList.get(i).getSerialNo());
                lstChild.add(MainApp.familyMembersList.get(i).getName());
            }
        }

        td00.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, lstChild));*/
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

                    if (MainApp.TotalDeceasedMotherCount > 0) {
                        Intent secNext = new Intent(this, SectionEActivity.class);
                        startActivity(secNext);
                    } else if (MainApp.TotalDeceasedChildCount > 0) {
                        Intent secNext = new Intent(this, SectionFActivity.class);
                        startActivity(secNext);
                    } else {
                        Intent secNext = new Intent(this, SectionIActivity.class);
                        startActivity(secNext);
                    }
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
        td06.clearCheck();
        td07.setText(null);
        td08.clearCheck();
        td09.setText(null);
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
        sD.put("td01", mwraNames.getSelectedItem().toString());
        sD.put("td02", td01a.isChecked() ? "1" : td01b.isChecked() ? "2" : "0");
        sD.put("td03", td02.getText().toString());
        sD.put("td04lb", td03lb.getText().toString());
        sD.put("td04sb", td03sb.getText().toString());
        sD.put("td04mc", td03mc.getText().toString());
        sD.put("td05", td04a.isChecked() ? "1" : td04b.isChecked() ? "2" : "0");
        sD.put("td06", td05.getText().toString());

        sD.put("tc07", td06a.isChecked() ? "1" : td06b.isChecked() ? "2"
                : "0");
        sD.put("td08", td07.getText().toString());

        if (td06a.isChecked()) {
            MainApp.TotalDeceasedMotherCount = Integer.valueOf(td07.getText().toString());
        }

        sD.put("td09", td08a.isChecked() ? "1" : td08b.isChecked() ? "2"
                : "0");
        sD.put("td010", td09.getText().toString());

        if (td08a.isChecked()) {
            MainApp.TotalDeceasedChildCount = Integer.valueOf(td09.getText().toString());
        }

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

        if (td06.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.td06), Toast.LENGTH_SHORT).show();
            td06b.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "td06: This data is Required!");
            return false;
        } else {
            td06b.setError(null);
        }

        if (td06a.isChecked()) {
            if (td07.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.td07), Toast.LENGTH_SHORT).show();
                td07.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "td07: This data is Required!");
                return false;
            } else {
                td07.setError(null);
            }
            if (Integer.valueOf(td07.getText().toString()) < 1) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.td07), Toast.LENGTH_SHORT).show();
                td07.setError("Greater then 0!");    // Set Error on last radio button

                Log.i(TAG, "td07: Greater then 0!");
                return false;
            } else {
                td07.setError(null);
            }
        }

        if (td08.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.td08), Toast.LENGTH_SHORT).show();
            td08b.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "td08: This data is Required!");
            return false;
        } else {
            td08b.setError(null);
        }

        if (td08a.isChecked()) {
            if (td09.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.td09), Toast.LENGTH_SHORT).show();
                td09.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "td09: This data is Required!");
                return false;
            } else {
                td09.setError(null);
            }
            if (Integer.valueOf(td09.getText().toString()) < 1) {
                Toast.makeText(this, "ERROR(Invalid): " + getString(R.string.td09), Toast.LENGTH_SHORT).show();
                td09.setError("Greater then 0!");    // Set Error on last radio button

                Log.i(TAG, "td09: Greater then 0!");
                return false;
            } else {
                td09.setError(null);
            }
        }

        return true;
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }


}
