package edu.aku.hassannaqvi.uen_tmk.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
import edu.aku.hassannaqvi.uen_tmk.R;
import edu.aku.hassannaqvi.uen_tmk.core.DatabaseHelper;
import edu.aku.hassannaqvi.uen_tmk.core.MainApp;
import io.blackbox_vision.datetimepickeredittext.view.DatePickerInputEditText;

public class SectionEActivity extends AppCompatActivity {

    private static final String TAG = SectionEActivity.class.getSimpleName();

    @BindView(R.id.te01)
    EditText te01;
    @BindView(R.id.te02)
    EditText te02;
    @BindView(R.id.te03)
    RadioGroup te03;
    @BindView(R.id.te03a)
    RadioButton te03a;
    @BindView(R.id.te03b)
    RadioButton te03b;
    @BindView(R.id.te03c)
    RadioButton te03c;
    @BindView(R.id.te03d)
    RadioButton te03d;
    @BindView(R.id.te03e)
    RadioButton te03e;
    @BindView(R.id.te04)
    DatePickerInputEditText te04;
    @BindView(R.id.te05)
    RadioGroup te05;
    @BindView(R.id.te05a)
    RadioButton te05a;
    @BindView(R.id.te05b)
    RadioButton te05b;
    @BindView(R.id.te05c)
    RadioButton te05c;
    @BindView(R.id.te05d)
    RadioButton te05d;
    @BindView(R.id.te05e)
    RadioButton te05e;
    @BindView(R.id.te05f)
    RadioButton te05f;
    @BindView(R.id.te0588)
    RadioButton te0588;
    @BindView(R.id.te0588x)
    EditText te0588x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_e);
        ButterKnife.bind(this);

        te04.setManager(getSupportFragmentManager());



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

                Intent secNext = new Intent(this, SectionFActivity.class);
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

        JSONObject sE = new JSONObject();

        sE.put("te01", te01.getText().toString());
        sE.put("te02", te02.getText().toString());
        sE.put("te03", te03a.isChecked() ? "1" : te03b.isChecked() ? "2" : te03c.isChecked() ? "3"
                : te03d.isChecked() ? "4" : te03e.isChecked() ? "5" : "0");
        sE.put("te04", te04.getText().toString());
        sE.put("te05", te05a.isChecked() ? "1" : te05b.isChecked() ? "2" : te05c.isChecked() ? "3"
                : te05d.isChecked() ? "4" : te05e.isChecked() ? "5" : te05f.isChecked() ? "6" : te0588.isChecked() ? "88" : "0");
        sE.put("te0588x", te0588x.getText().toString());


        MainApp.fc.setsE(String.valueOf(sE));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    public boolean ValidateForm() {

        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        if (te01.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.te01), Toast.LENGTH_SHORT).show();
            te01.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "te01: This data is Required!");
            return false;
        } else {
            te01.setError(null);
        }

        if (te02.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.te02), Toast.LENGTH_SHORT).show();
            te02.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "te02: This data is Required!");
            return false;
        } else {
            te02.setError(null);
        }

        if (Integer.valueOf(te02.getText().toString()) < 15 || Integer.valueOf(te02.getText().toString()) > 49) {
            Toast.makeText(this, "ERROR(invalid): " + getString(R.string.te02), Toast.LENGTH_SHORT).show();
            te02.setError("Range is 15 to 49 Years");    // Set Error on last radio button

            Log.i(TAG, "te02: Range is 15 to 49 Years");
            return false;
        } else {
            te02.setError(null);
        }

        if (te03.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.te03), Toast.LENGTH_SHORT).show();
            te03a.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "te03: This data is Required!");
            return false;
        } else {
            te03a.setError(null);
        }

        if (te04.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.te04), Toast.LENGTH_SHORT).show();
            te04.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "te04: This data is Required!");
            return false;
        } else {
            te04.setError(null);
        }

        if (te05.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.te05), Toast.LENGTH_SHORT).show();
            te05a.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "te05: This data is Required!");
            return false;
        } else {
            te05a.setError(null);
        }

        if (te0588.isChecked() && te0588x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.te05) + " - " + getString(R.string.other), Toast.LENGTH_LONG).show();
            te0588x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "te0588x: This data is Required!");
            return false;
        } else {
            te0588x.setError(null);
        }


        return true;
    }



    /*@Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }*/






}
