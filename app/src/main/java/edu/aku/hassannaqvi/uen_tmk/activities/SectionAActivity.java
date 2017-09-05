package edu.aku.hassannaqvi.uen_tmk.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.IdRes;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.uen_tmk.R;
import edu.aku.hassannaqvi.uen_tmk.contracts.FormsContract;
import edu.aku.hassannaqvi.uen_tmk.core.DatabaseHelper;
import edu.aku.hassannaqvi.uen_tmk.core.MainApp;

public class SectionAActivity extends Activity {

    private static final String TAG = SectionAActivity.class.getName();
    @BindView(R.id.ta01)
    EditText ta01;
    @BindView(R.id.ta02)
    RadioGroup ta02;
    @BindView(R.id.ta02a)
    RadioButton ta02a;
    @BindView(R.id.ta02b)
    RadioButton ta02b;
    @BindView(R.id.ta02c)
    RadioButton ta02c;
    @BindView(R.id.ta03)
    RadioGroup ta03;
    @BindView(R.id.ta03a)
    RadioButton ta03a;
    @BindView(R.id.ta03b)
    RadioButton ta03b;
    @BindView(R.id.ta03c)
    RadioButton ta03c;
    @BindView(R.id.ta04)
    Spinner ta04;
    @BindView(R.id.ta05h)
    EditText ta05h;
    @BindView(R.id.ta05u)
    EditText ta05u;
    @BindView(R.id.ta06)
    EditText ta06;
    @BindView(R.id.ta07)
    EditText ta07;
    @BindView(R.id.ta08)
    EditText ta08;
    @BindView(R.id.ta09)
    RadioGroup ta09;
    @BindView(R.id.ta09a)
    RadioButton ta09a;
    @BindView(R.id.ta09b)
    RadioButton ta09b;
    @BindView(R.id.btn_Continue)
    Button btn_Continue;
    @BindView(R.id.btn_End)
    Button btn_End;

    DatabaseHelper db;
    String[] ucs = new String[]{"....", "Lakhat", "Shaikh Bhirkio", "Tando Saeendad", "TMK 01", "TMK 02", "TMK 03", "Dando",
            "Ghulam Shah Bagrani", "Nazarpur", "Tando Ghulam Hyder", "Allah Yar Turk", "Jinhan Soomro",
            "Bulri Shah Karim", "Saeed Khan Lund", "Mullakatiar", "Saeed Matto", "Saeedpur"};
    int ucsPos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_a);
        ButterKnife.bind(this);

        db = new DatabaseHelper(this);

//            Set adapter to ucs spinner
        ta04.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, ucs));

        ta04.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                ucsPos = i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        ta09.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (i == R.id.ta09b) {
                    btn_Continue.setVisibility(View.GONE);
                    btn_End.setVisibility(View.VISIBLE);
                } else {
                    btn_Continue.setVisibility(View.VISIBLE);
                    btn_End.setVisibility(View.GONE);
                }
            }
        });

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        //TODO implement
        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Ending Section", Toast.LENGTH_SHORT).show();

                finish();

                startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {
        //TODO implement

        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                finish();

                startActivity(new Intent(this, SectionBActivity.class));
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }


    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        SharedPreferences sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);

        MainApp.fc = new FormsContract();

        MainApp.fc.setDevicetagID(sharedPref.getString("tagName", null));
        MainApp.fc.setFormDate(MainApp.dtToday);
        MainApp.fc.setUser(MainApp.userName);
        MainApp.fc.setDeviceID(Settings.Secure.getString(getApplicationContext().getContentResolver(),
                Settings.Secure.ANDROID_ID));

        JSONObject sa = new JSONObject();

        sa.put("ta01", ta01.getText().toString());
        sa.put("ta02", ta02a.isChecked() ? "1" : ta02b.isChecked() ? "2" : ta02c.isChecked() ? "3" : "0");
        sa.put("ta03", ta03a.isChecked() ? "1" : ta03b.isChecked() ? "2" : ta03c.isChecked() ? "3" : "0");
        sa.put("ta04", ucsPos);
        sa.put("ta05h", ta05h.getText().toString());
        sa.put("ta05u", ta05u.getText().toString());
        sa.put("ta06", ta06.getText().toString());
        sa.put("ta07", ta07.getText().toString());
        sa.put("ta08", ta08.getText().toString());
        sa.put("ta09", ta09a.isChecked() ? "1" : ta09b.isChecked() ? "2" : "0");

        MainApp.fc.setsA(String.valueOf(sa));

        setGPS();

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    private boolean UpdateDB() {

        Long updcount = db.addForm(MainApp.fc);
        MainApp.fc.set_ID(String.valueOf(updcount));

        if (updcount != 0) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();

            MainApp.fc.setUID(
                    (MainApp.fc.getDeviceID() + MainApp.fc.get_ID()));
            db.updateFormID();

            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    public void setGPS() {
        SharedPreferences GPSPref = getSharedPreferences("GPSCoordinates", Context.MODE_PRIVATE);

        try {
            String lat = GPSPref.getString("Latitude", "0");
            String lang = GPSPref.getString("Longitude", "0");
            String acc = GPSPref.getString("Accuracy", "0");
            String dt = GPSPref.getString("Time", "0");

            if (lat == "0" && lang == "0") {
                Toast.makeText(this, "Could not obtained GPS points", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "GPS set", Toast.LENGTH_SHORT).show();
            }

            String date = DateFormat.format("dd-MM-yyyy HH:mm", Long.parseLong(GPSPref.getString("Time", "0"))).toString();

            MainApp.fc.setGpsLat(GPSPref.getString("Latitude", "0"));
            MainApp.fc.setGpsLng(GPSPref.getString("Longitude", "0"));
            MainApp.fc.setGpsAcc(GPSPref.getString("Accuracy", "0"));
//            AppMain.fc.setGpsTime(GPSPref.getString(date, "0")); // Timestamp is converted to date above
            MainApp.fc.setGpsDT(date); // Timestamp is converted to date above

            Toast.makeText(this, "GPS set", Toast.LENGTH_SHORT).show();

        } catch (Exception e) {
            Log.e(TAG, "setGPS: " + e.getMessage());
        }
    }

    public boolean formValidation() {
        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

//        01
        if (ta01.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.ta01), Toast.LENGTH_SHORT).show();
            ta01.setError("This data is Required! ");    // Set Error on last radio button

            Log.i(TAG, "ta01: This data is Required!");
            return false;
        } else {
            ta01.setError(null);
        }

//        02
        if (ta02.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.ta02), Toast.LENGTH_SHORT).show();
            ta02c.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "ta02: This data is Required!");
            return false;
        } else {
            ta02c.setError(null);
        }

//        03
        if (ta03.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.ta03), Toast.LENGTH_SHORT).show();
            ta03c.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "ta03: This data is Required!");
            return false;
        } else {
            ta03c.setError(null);
        }

//        04
        if (ta04.getSelectedItem() == "....") {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.ta04), Toast.LENGTH_SHORT).show();
            ((TextView) ta04.getSelectedView()).setText("This Data is Required");
            ((TextView) ta04.getSelectedView()).setTextColor(Color.RED);

            Log.i(TAG, "ta04: This Data is Required!");
            return false;
        } else {
            ((TextView) ta04.getSelectedView()).setError(null);
        }

//        05
        if (ta05h.getText().toString().isEmpty() && ta05u.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.ta05), Toast.LENGTH_SHORT).show();
            ta05h.setError("This data is Required! ");    // Set Error on last radio button

            Log.i(TAG, "ta05: This data is Required!");
            return false;
        } else {
            ta05h.setError(null);
        }

//        06
        if (ta06.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.ta06), Toast.LENGTH_SHORT).show();
            ta06.setError("This data is Required! ");    // Set Error on last radio button

            Log.i(TAG, "ta06: This data is Required!");
            return false;
        } else {
            ta06.setError(null);
        }

//        07

/*        if (ta07.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.ta07), Toast.LENGTH_SHORT).show();
            ta07.setError("This data is Required! ");    // Set Error on last radio button

            Log.i(TAG, "ta07: This data is Required!");
            return false;
        } else {
            ta07.setError(null);
        } */

//        08

/*        if (ta08.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.ta08), Toast.LENGTH_SHORT).show();
            ta08.setError("This data is Required! ");    // Set Error on last radio button

            Log.i(TAG, "ta08: This data is Required!");
            return false;
        } else {
            ta08.setError(null);
        }*/

//        09
        if (ta09.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.ta09), Toast.LENGTH_SHORT).show();
            ta09b.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "ta09: This data is Required!");
            return false;
        } else {
            ta09b.setError(null);
        }

        return true;
    }

}

