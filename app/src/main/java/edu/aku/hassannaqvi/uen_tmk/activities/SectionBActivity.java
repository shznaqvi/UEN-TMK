package edu.aku.hassannaqvi.uen_tmk.activities;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.uen_tmk.R;
import edu.aku.hassannaqvi.uen_tmk.contracts.FamilyMembersContract;
import edu.aku.hassannaqvi.uen_tmk.core.MainApp;
import io.blackbox_vision.datetimepickeredittext.view.DatePickerInputEditText;

public class SectionBActivity extends AppCompatActivity {

    private static final String TAG = SectionBActivity.class.getName();
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.textView3)
    TextView textView3;
    @BindView(R.id.TotalMem)
    TextView totalMem;
    @BindView(R.id.Totalmwra)
    TextView totalmwra;
    @BindView(R.id.TotalChild)
    TextView totalChild;
    @BindView(R.id.tb02)
    EditText tb02;
    @BindView(R.id.tb03)
    RadioGroup tb03;
    @BindView(R.id.tb03a)
    RadioButton tb03a;
    @BindView(R.id.tb03b)
    RadioButton tb03b;
    @BindView(R.id.tb03c)
    RadioButton tb03c;
    @BindView(R.id.tb03d)
    RadioButton tb03d;
    @BindView(R.id.tb03e)
    RadioButton tb03e;
    @BindView(R.id.tb03f)
    RadioButton tb03f;
    @BindView(R.id.tb03g)
    RadioButton tb03g;
    @BindView(R.id.tb03h)
    RadioButton tb03h;
    @BindView(R.id.tb03i)
    RadioButton tb03i;
    @BindView(R.id.tb03j)
    RadioButton tb03j;
    @BindView(R.id.tb03k)
    RadioButton tb03k;
    @BindView(R.id.tb03l)
    RadioButton tb03l;
    @BindView(R.id.tb03m)
    RadioButton tb03m;
    @BindView(R.id.tb03n)
    RadioButton tb03n;
    @BindView(R.id.tb0388)
    RadioButton tb0388;
    @BindView(R.id.tb0388x)
    EditText tb0388x;
    @BindView(R.id.tb04)
    RadioGroup tb04;
    @BindView(R.id.tb04a)
    RadioButton tb04a;
    @BindView(R.id.tb04b)
    RadioButton tb04b;
    @BindView(R.id.tb05)
    EditText tb05;
    @BindView(R.id.tb06)
    EditText tb06;
    @BindView(R.id.tbdob)
    RadioGroup tbdob;
    @BindView(R.id.tbdob01)
    RadioButton tbdob01;
    @BindView(R.id.tbAge02)
    RadioButton tbAge02;
    @BindView(R.id.fldGrptb07)
    LinearLayout fldGrptb07;
    @BindView(R.id.tb07)
    DatePickerInputEditText tb07;
    @BindView(R.id.fldGrptb08)
    LinearLayout fldGrptb08;
    @BindView(R.id.tb08y)
    EditText tb08y;
    @BindView(R.id.tb08m)
    EditText tb08m;
    @BindView(R.id.tb09)
    EditText tb09;
    @BindView(R.id.tb10)
    RadioGroup tb10;
    @BindView(R.id.tb10a)
    RadioButton tb10a;
    @BindView(R.id.tb10b)
    RadioButton tb10b;
    @BindView(R.id.tb10c)
    RadioButton tb10c;
    @BindView(R.id.tb10d)
    RadioButton tb10d;
    @BindView(R.id.tb10e)
    RadioButton tb10e;
    @BindView(R.id.tb10f)
    RadioButton tb10f;
    @BindView(R.id.tb10g)
    RadioButton tb10g;
    @BindView(R.id.tb10h)
    RadioButton tb10h;
    @BindView(R.id.tb10i)
    RadioButton tb10i;
    @BindView(R.id.tb10j)
    RadioButton tb10j;
    @BindView(R.id.tb10k)
    RadioButton tb10k;
    @BindView(R.id.tb10l)
    RadioButton tb10l;
    @BindView(R.id.tb10999)
    RadioButton tb10999;
    @BindView(R.id.tb11)
    RadioGroup tb11;
    @BindView(R.id.tb11a)
    RadioButton tb11a;
    @BindView(R.id.tb11b)
    RadioButton tb11b;
    @BindView(R.id.tb11c)
    RadioButton tb11c;
    @BindView(R.id.tb11d)
    RadioButton tb11d;

    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_b);
        ButterKnife.bind(this);

//        Counter for serial no
        counter++;

//        DOB skip checker
        tbdob.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (tbdob01.isChecked()) {
                    fldGrptb07.setVisibility(View.VISIBLE);
                    fldGrptb08.setVisibility(View.GONE);
                    tb08y.setText(null);
                    tb08m.setText(null);
                } else {
                    tb07.setText(null);
                    fldGrptb08.setVisibility(View.VISIBLE);
                    fldGrptb07.setVisibility(View.GONE);
                }
            }
        });

        tb07.setManager(getSupportFragmentManager());

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        //TODO implement
    }

    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {
        //TODO implement
    }

    @OnClick(R.id.btn_addMore)
    void onBtnAddMoreClick() {
        //TODO implement
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        SharedPreferences sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);

        MainApp.fmc = new FamilyMembersContract();

        MainApp.fmc.set_UUID(MainApp.fc.getUID());
        MainApp.fmc.setFormDate(MainApp.fc.getFormDate());
        MainApp.fmc.setDeviceId(MainApp.fc.getDeviceID());
        MainApp.fmc.setUser(MainApp.fc.getUser());
        MainApp.fmc.setDevicetagID(sharedPref.getString("tagName", null));

        JSONObject sB = new JSONObject();

        sB.put("tb0", counter);
        sB.put("tb02", tb02.getText().toString());
        sB.put("tb03", tb03a.isChecked() ? "1" : tb03b.isChecked() ? "2" : tb03c.isChecked() ? "3"
                : tb03d.isChecked() ? "4" : tb03e.isChecked() ? "5" : tb03f.isChecked() ? "6"
                : tb03g.isChecked() ? "7" : tb03h.isChecked() ? "8" : tb03i.isChecked() ? "9" : tb03j.isChecked() ? "10"
                : tb03k.isChecked() ? "11" : tb03l.isChecked() ? "12" : tb03m.isChecked() ? "13"
                : tb03n.isChecked() ? "14" : tb0388.isChecked() ? "15" : "0");
        sB.put("tb0388x", tb0388x.getText().toString());
        sB.put("tb04", tb04a.isChecked() ? "1" : tb04b.isChecked() ? "2" : "0");
        sB.put("tb05", tb05.getText().toString());
        sB.put("tb06", tb06.getText().toString());

        if (tbdob01.isChecked()) {
            sB.put("tb07", tb07.getText().toString());
        } else {
            sB.put("tb08y", tb08y.getText().toString());
            sB.put("tb08m", tb08m.getText().toString());
        }

        sB.put("tb09", tb09.getText().toString());
        sB.put("tb10", tb10a.isChecked() ? "1" : tb10b.isChecked() ? "2" : tb10c.isChecked() ? "3"
                : tb10d.isChecked() ? "4" : tb10e.isChecked() ? "5" : tb10f.isChecked() ? "6"
                : tb10g.isChecked() ? "7" : tb10h.isChecked() ? "8" : tb10i.isChecked() ? "9" : tb10j.isChecked() ? "10"
                : tb10k.isChecked() ? "11" : tb10l.isChecked() ? "12" : tb10999.isChecked() ? "999"
                : "0");
        sB.put("tb11", tb11a.isChecked() ? "1" : tb11b.isChecked() ? "2"
                : tb11c.isChecked() ? "3" : tb11d.isChecked() ? "4" : "0");

        //        MainApp.fc.setROW_sb(String.valueOf(sB));
        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    public boolean formValidation() {
        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

//        01
        if (tb02.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tb02), Toast.LENGTH_SHORT).show();
            tb02.setError("This data is Required! ");    // Set Error on last radio button

            Log.i(TAG, "tb02: This data is Required!");
            return false;
        } else {
            tb02.setError(null);
        }

//        02
        if (tb03.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tb03), Toast.LENGTH_SHORT).show();
            tb0388.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "tb03: This data is Required!");
            return false;
        } else {
            tb0388.setError(null);
        }

        if (tb0388.isChecked() && tb0388x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_SHORT).show();
            tb0388x.setError("This data is Required! ");    // Set Error on last radio button

            Log.i(TAG, "tb0388x: This data is Required!");
            return false;
        } else {
            tb0388x.setError(null);
        }

//        04
        if (tb04.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tb04), Toast.LENGTH_SHORT).show();
            tb04b.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "tb04: This data is Required!");
            return false;
        } else {
            tb04b.setError(null);
        }

//        05
        if (tb05.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tb05), Toast.LENGTH_SHORT).show();
            tb05.setError("This data is Required! ");    // Set Error on last radio button

            Log.i(TAG, "tb05: This data is Required!");
            return false;
        } else {
            tb05.setError(null);
        }

//        06
        if (tb06.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tb06), Toast.LENGTH_SHORT).show();
            tb06.setError("This data is Required! ");    // Set Error on last radio button

            Log.i(TAG, "tb06: This data is Required!");
            return false;
        } else {
            tb06.setError(null);
        }

//        07 & 08
        if (tbdob.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tbAge), Toast.LENGTH_SHORT).show();
            tbdob01.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "tbdob: This data is Required!");
            return false;
        } else {
            tbdob01.setError(null);
        }

        if (tbdob01.isChecked() && tb07.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tb07), Toast.LENGTH_SHORT).show();
            tb07.setError("This data is Required! ");    // Set Error on last radio button

            Log.i(TAG, "tb07: This data is Required!");
            return false;
        } else {
            tb07.setError(null);
        }

        if (tbAge02.isChecked()) {
            if (tb08y.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.year), Toast.LENGTH_SHORT).show();
                tb08y.setError("This data is Required! ");    // Set Error on last radio button

                Log.i(TAG, "tb08y: This data is Required!");
                return false;
            } else {
                tb08y.setError(null);
            }

            if (tb08m.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.month), Toast.LENGTH_SHORT).show();
                tb08m.setError("This data is Required! ");    // Set Error on last radio button

                Log.i(TAG, "tb08m: This data is Required!");
                return false;
            } else {
                tb08m.setError(null);
            }

            if (Integer.parseInt(tb08y.getText().toString()) > 0) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.year), Toast.LENGTH_SHORT).show();
                tb08y.setError("Greater then 0! ");    // Set Error on last radio button

                Log.i(TAG, "tb08y: Greater then 0!");
                return false;
            } else {
                tb08y.setError(null);
            }

            if (Integer.parseInt(tb08m.getText().toString()) > 0 || Integer.parseInt(tb08m.getText().toString()) <= 11) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.month), Toast.LENGTH_SHORT).show();
                tb08m.setError("Range from 1 - 11! ");    // Set Error on last radio button

                Log.i(TAG, "tb08m: Range from 1 - 11!");
                return false;
            } else {
                tb08m.setError(null);
            }
        }

//        09
        if (tb09.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tb09), Toast.LENGTH_SHORT).show();
            tb09.setError("This data is Required! ");    // Set Error on last radio button

            Log.i(TAG, "tb09: This data is Required!");
            return false;
        } else {
            tb09.setError(null);
        }

//        10
        if (tb10.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tb10), Toast.LENGTH_SHORT).show();
            tb10999.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "tb10: This data is Required!");
            return false;
        } else {
            tb10999.setError(null);
        }

//        11
        if (tb11.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tb11), Toast.LENGTH_SHORT).show();
            tb11d.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "tb11: This data is Required!");
            return false;
        } else {
            tb11d.setError(null);
        }

        return true;
    }

}
