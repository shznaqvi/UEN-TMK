package edu.aku.hassannaqvi.uen_tmk.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.uen_tmk.core.DatabaseHelper;
import edu.aku.hassannaqvi.uen_tmk.core.MainApp;
import io.blackbox_vision.datetimepickeredittext.view.DatePickerInputEditText;

public class SectionFActivity extends Activity {

    private static final String TAG = SectionFActivity.class.getSimpleName();

    @BindView(R.id.tf01)
    EditText tf01;
    @BindView(R.id.tf02)
    EditText tf02;
    @BindView(R.id.tf03)
    RadioGroup tf03;
    @BindView(R.id.tf03a)
    RadioButton tf03a;
    @BindView(R.id.tf03b)
    RadioButton tf03b;
    @BindView(R.id.tf04d)
    EditText tf04d;
    @BindView(R.id.tf04m)
    EditText tf04m;
    @BindView(R.id.tf04y)
    EditText tf04y;
    @BindView(R.id.tf05)
    RadioGroup tf05;
    @BindView(R.id.tf05a)
    RadioButton tf05a;
    @BindView(R.id.tf05b)
    RadioButton tf05b;
    @BindView(R.id.tf05c)
    RadioButton tf05c;
    @BindView(R.id.tf05d)
    RadioButton tf05d;
    @BindView(R.id.tf05e)
    RadioButton tf05e;
    @BindView(R.id.tf06)
    DatePickerInputEditText tf06;
    @BindView(R.id.tf07)
    RadioGroup tf07;
    @BindView(R.id.tf07a)
    RadioButton tf07a;
    @BindView(R.id.tf07b)
    RadioButton tf07b;
    @BindView(R.id.tf07c)
    RadioButton tf07c;
    @BindView(R.id.tf07d)
    RadioButton tf07d;
    @BindView(R.id.tf07e)
    RadioButton tf07e;
    @BindView(R.id.tf07f)
    RadioButton tf07f;
    @BindView(R.id.tf07g)
    RadioButton tf07g;
    @BindView(R.id.tf07h)
    RadioButton tf07h;
    @BindView(R.id.tf0788)
    RadioButton tf0788;
    @BindView(R.id.tf0788x)
    EditText tf0788x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_f);
        ButterKnife.bind(this);

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

                finish();

                Intent secNext = new Intent(this, SectionEActivity.class);
                startActivity(secNext);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }


    private boolean UpdateDB() {

        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateSG();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sF = new JSONObject();

        sF.put("tf01", tf01.getText().toString());
        sF.put("tf02", tf02.getText().toString());
        sF.put("tf03", tf03a.isChecked() ? "1" : tf03b.isChecked() ? "2" : "0");
        sF.put("tf04", tf04.getText().toString());
        sF.put("tf05", tf05a.isChecked() ? "1" : tf05b.isChecked() ? "2" : tf05c.isChecked() ? "3"
                : tf05d.isChecked() ? "4" : tf05e.isChecked() ? "5" : "0");
        sF.put("tf06", tf06.getText().toString());
        sF.put("te07", tf07a.isChecked() ? "1" : tf07b.isChecked() ? "2" : tf07c.isChecked() ? "3"
                : tf07d.isChecked() ? "4" : tf07e.isChecked() ? "5" : tf07f.isChecked() ? "6" : tf07g.isChecked() ? "7"
                : tf07h.isChecked() ? "8" : tf0788.isChecked() ? "88" : "0");
        sF.put("tf0788x", tf0788x.getText().toString());


        MainApp.fc.setsF(String.valueOf(sF));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    public boolean ValidateForm() {

        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        if (tf01.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tf01), Toast.LENGTH_SHORT).show();
            tf01.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "tf01: This data is Required!");
            return false;
        } else {
            tf01.setError(null);
        }

        if (tf02.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tf02), Toast.LENGTH_SHORT).show();
            tf02.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "tf02: This data is Required!");
            return false;
        } else {
            tf02.setError(null);
        }

        if (tf03.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tf03), Toast.LENGTH_SHORT).show();
            tf03a.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "tf03: This data is Required!");
            return false;
        } else {
            tf03a.setError(null);
        }

        if (tf04d.getText().toString().isEmpty() && tf04m.getText().toString().isEmpty() && tf04y.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tf04), Toast.LENGTH_SHORT).show();
            tf04d.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "tf04: This data is Required!");
            return false;
        } else {
            tf04d.setError(null);
        }


        if (Integer.valueOf(tf04d.getText().toString()) < 0 || Integer.valueOf(tf04d.getText().toString()) > 29) {
            Toast.makeText(this, "ERROR(invalid): " + getString(R.string.te04d), Toast.LENGTH_SHORT).show();
            tf04d.setError("Range is 0 to 29 Days");    // Set Error on last radio button

            Log.i(TAG, "tf04d: Range is 0 to 29 Days");
            return false;
        } else {
            tf04d.setError(null);
        }

        if (Integer.valueOf(tf04m.getText().toString()) < 0 || Integer.valueOf(tf04m.getText().toString()) > 11) {
            Toast.makeText(this, "ERROR(invalid): " + getString(R.string.te04m), Toast.LENGTH_SHORT).show();
            tf04m.setError("Range is 0 to 11 Months");    // Set Error on last radio button

            Log.i(TAG, "tf04d: Range is 0 to 11 Months");
            return false;
        } else {
            tf04m.setError(null);
        }

        if (Integer.valueOf(tf04y.getText().toString()) < 0 || Integer.valueOf(tf04y.getText().toString()) > 5) {
            Toast.makeText(this, "ERROR(invalid): " + getString(R.string.te04y), Toast.LENGTH_SHORT).show();
            tf04y.setError("Range is 0 to 5 Years");    // Set Error on last radio button

            Log.i(TAG, "tf04d: Range is 0 to 5 Years");
            return false;
        } else {
            tf04y.setError(null);
        }

        if (tf05.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tf05), Toast.LENGTH_SHORT).show();
            tf05a.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "tf05: This data is Required!");
            return false;
        } else {
            tf05a.setError(null);
        }

        if (tf06.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tf06), Toast.LENGTH_SHORT).show();
            tf06.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "tf06: This data is Required!");
            return false;
        } else {
            tf06.setError(null);
        }

        if (tf07.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tf07), Toast.LENGTH_SHORT).show();
            tf07a.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "tf07: This data is Required!");
            return false;
        } else {
            tf07a.setError(null);
        }

        if (tf0788.isChecked() && tf0788x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tf07) + " - " + getString(R.string.others), Toast.LENGTH_LONG).show();
            tf0788x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "tf0788x: This data is Required!");
            return false;
        } else {
            tf0788x.setError(null);
        }


        return true;
    }



    /*@Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }*/





}