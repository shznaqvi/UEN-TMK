package edu.aku.hassannaqvi.uen_tmk.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.uen_tmk.R;
import edu.aku.hassannaqvi.uen_tmk.contracts.FamilyMembersContract;
import edu.aku.hassannaqvi.uen_tmk.core.DatabaseHelper;
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
    @BindView(R.id.tb11e)
    RadioButton tb11e;

    @BindView(R.id.btn_ContNextSec)
    Button btn_ContNextSec;

    DatabaseHelper db;
    long ageInyears = 0;

    public static long ageInYears(String dateStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Calendar cal = getCalendarDate(dateStr);
        Date dob = cal.getTime();
        Date today = new Date();

        Long diff = today.getTime() - dob.getTime();

        //double ageindays = (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

        long ageInYears = (diff / (24 * 60 * 60 * 1000)) / 365;


        return ageInYears;

    }

    public static Calendar getCalendarDate(String value) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Calendar calendar = Calendar.getInstance();
        try {
            Date date = sdf.parse(value);
            calendar.setTime(date);
            return calendar;

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return calendar;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_b);
        ButterKnife.bind(this);

//        Counter for serial no
        MainApp.counter++;

        tb07.setManager(getSupportFragmentManager());

        String dateToday = new SimpleDateFormat("dd/MM/yyyy").format(System.currentTimeMillis());

        tb07.setMaxDate(dateToday);

        db = new DatabaseHelper(this);

//        Check for next sec button

        if (MainApp.TotalMembersCount == 0) {
            btn_ContNextSec.setVisibility(View.GONE);
        } else {
            btn_ContNextSec.setVisibility(View.VISIBLE);
        }

//        set head values
        totalMem.setText(String.valueOf(MainApp.TotalMembersCount));
        totalmwra.setText(String.valueOf(MainApp.TotalMWRACount));
        totalChild.setText(String.valueOf(MainApp.TotalChildCount));

//        Check HH

        if (MainApp.isHead) {
            tb03a.setEnabled(false);
        }

//        Skip Patterns

        tb04.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (i == R.id.tb04a) {
                    tb10a.setEnabled(false);
                } else {
                    tb10a.setEnabled(true);
                }
            }
        });

//        DOB skip checker
        tbdob.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (tbdob01.isChecked()) {
                    fldGrptb07.setVisibility(View.VISIBLE);
                    fldGrptb08.setVisibility(View.GONE);
                    tb08y.setText(null);
                    tb08m.setText(null);
                    //ageInyears = (ageInYears(tb07.getText().toString()));
                } else {
                    tb07.setText(null);
                    fldGrptb08.setVisibility(View.VISIBLE);
                    fldGrptb07.setVisibility(View.GONE);
                    //ageInyears = Long.valueOf(tb08y.getText().toString());
                }
            }
        });

//        Textwatcher
        tb07.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                //if (checkChildLessThenFive(1)) {

                ageInyears = ageInYears(tb07.getText().toString());
                if (ageInyears < 5) {
                    tb09.setText("NA");
                    tb09.setEnabled(false);
                    tb10.clearCheck();
                    tb10a.setEnabled(false);
                    tb10b.setEnabled(false);
                    tb10c.setEnabled(false);
                    tb10d.setEnabled(false);
                    tb10e.setEnabled(false);
                    tb10f.setEnabled(false);
                    tb10g.setEnabled(false);
                    tb10h.setEnabled(false);
                    tb10i.setEnabled(false);
                    tb10j.setEnabled(false);
                    tb10k.setEnabled(false);
                    tb10l.setEnabled(false);

                    tb11b.setEnabled(false);
                    tb11b.setChecked(false);
                } else {
                    tb09.setText(null);
                    tb09.setEnabled(true);

                    tb10a.setEnabled(true);
                    tb10b.setEnabled(true);
                    tb10c.setEnabled(true);
                    tb10d.setEnabled(true);
                    tb10e.setEnabled(true);
                    tb10f.setEnabled(true);
                    tb10g.setEnabled(true);
                    tb10h.setEnabled(true);
                    tb10i.setEnabled(true);
                    tb10j.setEnabled(true);
                    tb10k.setEnabled(true);
                    tb10l.setEnabled(true);

                    tb11b.setEnabled(true);
                }
                //}
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        tb08y.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {


                if (!tb08y.getText().toString().isEmpty()) {

                    ageInyears = Long.valueOf(tb08y.getText().toString());
                    //if (checkChildLessThenFive(2)) {

                    if (ageInyears < 5) {
                        tb09.setText("NA");
                        tb09.setEnabled(false);
                        tb10a.setEnabled(false);
                        tb10b.setEnabled(false);
                        tb10c.setEnabled(false);
                        tb10d.setEnabled(false);
                        tb10e.setEnabled(false);
                        tb10f.setEnabled(false);
                        tb10g.setEnabled(false);
                        tb10h.setEnabled(false);
                        tb10i.setEnabled(false);
                        tb10j.setEnabled(false);
                        tb10k.setEnabled(false);
                        tb10l.setEnabled(false);

                        tb11b.setEnabled(false);
                        tb11b.setChecked(false);
                    } else {
                        tb09.setText(null);
                        tb09.setEnabled(true);

                        tb10a.setEnabled(true);
                        tb10b.setEnabled(true);
                        tb10c.setEnabled(true);
                        tb10d.setEnabled(true);
                        tb10e.setEnabled(true);
                        tb10f.setEnabled(true);
                        tb10g.setEnabled(true);
                        tb10h.setEnabled(true);
                        tb10i.setEnabled(true);
                        tb10j.setEnabled(true);
                        tb10k.setEnabled(true);
                        tb10l.setEnabled(true);

                        tb11b.setEnabled(true);
                    }
                    //}

                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


        tb0388.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (tb0388.isChecked()) {
                    tb0388x.setVisibility(View.VISIBLE);
                    tb0388x.requestFocus();
                } else {
                    tb0388x.setText(null);
                    tb0388x.setVisibility(View.GONE);
                }
            }
        });


    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        //TODO implement
        MainApp.endActivity(this, this);
    }

    @OnClick(R.id.btn_ContNextSec)
    void onBtnContNextSecClick() {
        //TODO implement

        startActivity(new Intent(this, SectionCActivity.class));
    }

    @OnClick(R.id.btn_addMore)
    void onBtnAddMoreClick() {
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

                if (ageInyears < 2 || Integer.valueOf(tb08y.getText().toString().isEmpty() ? "0" : tb08y.getText().toString()) < 2) {
                    MainApp.totalImsCount++;

                }
                if (ageInyears < 5) {
                    MainApp.TotalChildCount++;
                    MainApp.TotalMembersCount++;
                } else if (tb11b.isChecked() && tb04b.isChecked()
                        && (ageInyears > 15 || ageInyears < 49)) {
                    MainApp.TotalMWRACount++;
                    MainApp.TotalMembersCount++;
                } else {
                    MainApp.TotalMembersCount++;
                }

            }

            startActivity(new Intent(this, SectionBActivity.class));
        } else {
            Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
        }
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

        sB.put("tb01", MainApp.counter);
        sB.put("tb02", tb02.getText().toString());
        sB.put("tb03", tb03a.isChecked() ? "1" : tb03b.isChecked() ? "2" : tb03c.isChecked() ? "3"
                : tb03d.isChecked() ? "4" : tb03e.isChecked() ? "5" : tb03f.isChecked() ? "6"
                : tb03g.isChecked() ? "7" : tb03h.isChecked() ? "8" : tb03i.isChecked() ? "9" : tb03j.isChecked() ? "10"
                : tb03k.isChecked() ? "11" : tb03l.isChecked() ? "12" : tb03m.isChecked() ? "13"
                : tb03n.isChecked() ? "14" : tb0388.isChecked() ? "88" : "0");

        sB.put("tb0388x", tb0388x.getText().toString());

        if (!MainApp.isHead) {
            MainApp.isHead = tb03a.isChecked();
        }

        sB.put("tb04", tb04a.isChecked() ? "1" : tb04b.isChecked() ? "2" : "0");
        sB.put("tb05", tb05.getText().toString());
        sB.put("tb06", tb06.getText().toString());

        if (tbdob01.isChecked()) {
            sB.put("tb07", tb07.getText().toString());

        } else {
            sB.put("tb08y", tb08y.getText().toString());
            sB.put("tb08m", tb08m.getText().toString());
        }

        sB.put("tb09", tb09.getText().toString().equals("NA") ? "999" : tb09.getText().toString());
        sB.put("tb10", tb10a.isChecked() ? "1" : tb10b.isChecked() ? "2" : tb10c.isChecked() ? "3"
                : tb10d.isChecked() ? "4" : tb10e.isChecked() ? "5" : tb10f.isChecked() ? "6"
                : tb10g.isChecked() ? "7" : tb10h.isChecked() ? "8" : tb10i.isChecked() ? "9" : tb10j.isChecked() ? "10"
                : tb10k.isChecked() ? "11" : tb10l.isChecked() ? "12" : tb10999.isChecked() ? "999"
                : "0");
        sB.put("tb11", tb11a.isChecked() ? "1" : tb11b.isChecked() ? "2"
                : tb11c.isChecked() ? "3" : tb11d.isChecked() ? "4" : tb11e.isChecked() ? "5" : "0");


        MainApp.ageRdo = tbdob.indexOfChild(findViewById(tbdob.getCheckedRadioButtonId())) + 1;
        MainApp.fmc.setsB(String.valueOf(sB));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    private boolean UpdateDB() {

        Long updcount = db.addFamilyMembers(MainApp.fmc);
        MainApp.fmc.set_ID(String.valueOf(updcount));

        if (updcount != 0) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();

            MainApp.fmc.set_UID(
                    (MainApp.fmc.getDeviceId() + MainApp.fmc.get_ID()));
            db.updateFamilyMemberID();


            MainApp.familyMembersList.add(new FamilyMembersContract(tb02.getText().toString(),
                    ageInyears < 5 ? "1" : ageInyears < 2 ? "3" :
                            (tb11b.isChecked() && tb04b.isChecked()
                                    && (ageInyears > 15 || ageInyears < 49) ? "2" : "0")
                    , String.valueOf(MainApp.counter),
                    tb07.getText().toString().isEmpty() ?
                            tb08m.getText().toString() + "-" + tb08y.getText().toString() :
                            tb07.getText().toString()));
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
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

            if (Integer.parseInt(tb08y.getText().toString()) < 0) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.year), Toast.LENGTH_SHORT).show();
                tb08y.setError("Greater then 0! ");    // Set Error on last radio button

                Log.i(TAG, "tb08y: Greater then 0!");
                return false;
            } else {
                tb08y.setError(null);
            }

            if (Integer.parseInt(tb08m.getText().toString()) < 0 || Integer.parseInt(tb08m.getText().toString()) >= 11) {
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
            tb11e.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "tb11: This data is Required!");
            return false;
        } else {
            tb11e.setError(null);
        }


        if (!tb09.getText().toString().equals("NA") && !tb08y.getText().toString().isEmpty()) {

            if (Integer.parseInt(tb08y.getText().toString())
                    <= Integer.parseInt(tb09.getText().toString()) &&
                    !tb09.getText().toString().equals("888") && !tb09.getText().toString().equals("999") && !tb09.getText().toString().equals("777")) {
                Toast.makeText(this, "Age and years of education cannot be same or Years of education cannot be greater than age ", Toast.LENGTH_SHORT).show();
                tb09.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "tb09: This data is Required!");
                return false;
            } else {
                tb09.setError(null);
            }

        }


        if (!tb09.getText().toString().equals("NA")) {

            if (Integer.parseInt(tb09.getText().toString()) < 0 && (!tb09.getText().toString().equals("888") && !tb09.getText().toString().equals("999") && !tb09.getText().toString().equals("777"))
                    || Integer.parseInt(tb09.getText().toString()) > 20 && (!tb09.getText().toString().equals("888") && !tb09.getText().toString().equals("999") && !tb09.getText().toString().equals("777"))) {
                Toast.makeText(this, "Years of education cannot be less than 0 and cannot be greater than 20 ", Toast.LENGTH_SHORT).show();
                tb09.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "tb09: This data is Required!");
                return false;
            } else {
                tb09.setError(null);
            }

        }


        return true;
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }

}
