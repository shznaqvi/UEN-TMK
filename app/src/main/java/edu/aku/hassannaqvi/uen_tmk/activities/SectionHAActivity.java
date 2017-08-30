package edu.aku.hassannaqvi.uen_tmk.activities;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import edu.aku.hassannaqvi.uen_tmk.R;
import edu.aku.hassannaqvi.uen_tmk.core.MainApp;

public class SectionHAActivity extends Activity {

    private static final String TAG = SectionHAActivity.class.getName();

    @BindView(R.id.tha01)
    RadioGroup tha01;
    @BindView(R.id.tha01a)
    RadioButton tha01a;
    @BindView(R.id.tha01b)
    RadioButton tha01b;
    @BindView(R.id.tha0188)
    RadioButton tha0188;
    @BindView(R.id.tha02)
    EditText tha02;
    @BindView(R.id.tha03)
    EditText tha03;
    @BindView(R.id.tha04)
    EditText tha04;
    @BindView(R.id.tha05)
    RadioGroup tha05;
    @BindView(R.id.tha05a)
    RadioButton tha05a;
    @BindView(R.id.tha05b)
    RadioButton tha05b;
    @BindView(R.id.tha0588)
    RadioButton tha0588;
    @BindView(R.id.tha06)
    RadioGroup tha06;
    @BindView(R.id.tha06a)
    RadioButton tha06a;
    @BindView(R.id.tha06b)
    RadioButton tha06b;
    @BindView(R.id.tha0688)
    RadioButton tha0688;
    @BindView(R.id.tha07a)
    CheckBox tha07a;
    @BindView(R.id.tha07b)
    CheckBox tha07b;
    @BindView(R.id.tha07c)
    CheckBox tha07c;
    @BindView(R.id.tha07d)
    CheckBox tha07d;
    @BindView(R.id.tha07e)
    CheckBox tha07e;
    @BindView(R.id.tha07f)
    CheckBox tha07f;
    @BindView(R.id.tha07g)
    CheckBox tha07g;
    @BindView(R.id.tha07h)
    CheckBox tha07h;
    @BindView(R.id.tha0788)
    CheckBox tha0788;
    @BindView(R.id.tha0788x)
    EditText tha0788x;
    @BindView(R.id.tha08)
    EditText tha08;
    @BindView(R.id.tha09a)
    CheckBox tha09a;
    @BindView(R.id.tha09b)
    CheckBox tha09b;
    @BindView(R.id.tha09c)
    CheckBox tha09c;
    @BindView(R.id.tha09d)
    CheckBox tha09d;
    @BindView(R.id.tha10)
    RadioGroup tha10;
    @BindView(R.id.tha10a)
    RadioButton tha10a;
    @BindView(R.id.tha10b)
    RadioButton tha10b;
    @BindView(R.id.tha10c)
    RadioButton tha10c;
    @BindView(R.id.tha10d)
    RadioButton tha10d;
    @BindView(R.id.tha10e)
    RadioButton tha10e;
    @BindView(R.id.tha10f)
    RadioButton tha10f;
    @BindView(R.id.tha10g)
    RadioButton tha10g;
    @BindView(R.id.tha10h)
    RadioButton tha10h;
    @BindView(R.id.tha10i)
    RadioButton tha10i;
    @BindView(R.id.tha10j)
    RadioButton tha10j;
    @BindView(R.id.tha10k)
    RadioButton tha10k;
    @BindView(R.id.tha11a)
    CheckBox tha11a;
    @BindView(R.id.tha11b)
    CheckBox tha11b;
    @BindView(R.id.tha11c)
    CheckBox tha11c;
    @BindView(R.id.tha11d)
    CheckBox tha11d;
    @BindView(R.id.tha11e)
    CheckBox tha11e;
    @BindView(R.id.tha11f)
    CheckBox tha11f;
    @BindView(R.id.tha11g)
    CheckBox tha11g;
    @BindView(R.id.tha11h)
    CheckBox tha11h;
    @BindView(R.id.tha11i)
    CheckBox tha11i;
    @BindView(R.id.tha11j)
    CheckBox tha11j;
    @BindView(R.id.tha12)
    RadioGroup tha12;
    @BindView(R.id.tha12a)
    RadioButton tha12a;
    @BindView(R.id.tha12b)
    RadioButton tha12b;
    @BindView(R.id.tha13)
    RadioGroup tha13;
    @BindView(R.id.tha13a)
    RadioButton tha13a;
    @BindView(R.id.tha13b)
    RadioButton tha13b;
    @BindView(R.id.tha14)
    RadioGroup tha14;
    @BindView(R.id.tha14a)
    RadioButton tha14a;
    @BindView(R.id.tha14b)
    RadioButton tha14b;
    @BindView(R.id.tha14c)
    RadioButton tha14c;
    @BindView(R.id.tha15)
    RadioGroup tha15;
    @BindView(R.id.tha15a)
    RadioButton tha15a;
    @BindView(R.id.tha15b)
    RadioButton tha15b;
    @BindView(R.id.tha16)
    RadioGroup tha16;
    @BindView(R.id.tha16a)
    RadioButton tha16a;
    @BindView(R.id.tha16b)
    RadioButton tha16b;
    @BindView(R.id.tha16c)
    RadioButton tha16c;
    @BindView(R.id.tha16d)
    RadioButton tha16d;
    @BindView(R.id.tha1688)
    RadioButton tha1688;
    @BindView(R.id.tha1688x)
    EditText tha1688x;
    @BindView(R.id.tha17)
    RadioGroup tha17;
    @BindView(R.id.tha17a)
    RadioButton tha17a;
    @BindView(R.id.tha17b)
    RadioButton tha17b;
    @BindView(R.id.tha17c)
    RadioButton tha17c;
    @BindView(R.id.tha18)
    RadioGroup tha18;
    @BindView(R.id.tha18a)
    RadioButton tha18a;
    @BindView(R.id.tha18b)
    RadioButton tha18b;
    @BindView(R.id.tha18c)
    RadioButton tha18c;
    @BindView(R.id.tha18d)
    RadioButton tha18d;
    @BindView(R.id.tha18e)
    RadioButton tha18e;
    @BindView(R.id.tha19a)
    CheckBox tha19a;
    @BindView(R.id.tha19b)
    CheckBox tha19b;
    @BindView(R.id.tha19c)
    CheckBox tha19c;
    @BindView(R.id.tha19d)
    CheckBox tha19d;
    @BindView(R.id.tha19e)
    CheckBox tha19e;
    @BindView(R.id.tha19f)
    CheckBox tha19f;
    @BindView(R.id.tha19g)
    CheckBox tha19g;
    @BindView(R.id.tha19h)
    CheckBox tha19h;
    @BindView(R.id.tha19i)
    CheckBox tha19i;
    @BindView(R.id.tha20)
    RadioGroup tha20;
    @BindView(R.id.tha20a)
    RadioButton tha20a;
    @BindView(R.id.tha20b)
    RadioButton tha20b;
    @BindView(R.id.tha20c)
    RadioButton tha20c;
    @BindView(R.id.tha20hr)
    EditText tha20hr;
    @BindView(R.id.tha20d)
    EditText tha20d;
    @BindView(R.id.tha21)
    RadioGroup tha21;
    @BindView(R.id.tha21a)
    RadioButton tha21a;
    @BindView(R.id.tha21b)
    RadioButton tha21b;
    @BindView(R.id.tha22)
    EditText tha22;
    @BindView(R.id.tha23)
    RadioGroup tha23;
    @BindView(R.id.tha23a)
    RadioButton tha23a;
    @BindView(R.id.tha23b)
    RadioButton tha23b;
    @BindView(R.id.tha24a)
    CheckBox tha24a;
    @BindView(R.id.tha24b)
    CheckBox tha24b;
    @BindView(R.id.tha24c)
    CheckBox tha24c;
    @BindView(R.id.tha24d)
    CheckBox tha24d;
    @BindView(R.id.tha24e)
    CheckBox tha24e;
    @BindView(R.id.tha24f)
    CheckBox tha24f;
    @BindView(R.id.tha24g)
    CheckBox tha24g;
    @BindView(R.id.tha25)
    RadioGroup tha25;
    @BindView(R.id.tha25a)
    RadioButton tha25a;
    @BindView(R.id.tha25b)
    RadioButton tha25b;
    @BindView(R.id.tha25c)
    RadioButton tha25c;
    @BindView(R.id.tha26)
    EditText tha26;
    @BindView(R.id.tha27)
    RadioGroup tha27;
    @BindView(R.id.tha27a)
    RadioButton tha27a;
    @BindView(R.id.tha27b)
    RadioButton tha27b;
    @BindView(R.id.tha27c)
    RadioButton tha27c;
    @BindView(R.id.tha27d)
    RadioButton tha27d;
    @BindView(R.id.tha27e)
    RadioButton tha27e;
    @BindView(R.id.tha27f)
    RadioButton tha27f;
    @BindView(R.id.tha27g)
    RadioButton tha27g;
    @BindView(R.id.tha27h)
    RadioButton tha27h;
    @BindView(R.id.tha2788)
    RadioButton tha2788;
    @BindView(R.id.tha2788x)
    EditText tha2788x;
    @BindView(R.id.tha28)
    EditText tha28;
    @BindView(R.id.tha29)
    EditText tha29;
    @BindView(R.id.tha30)
    EditText tha30;
    @BindView(R.id.tha31)
    RadioGroup tha31;
    @BindView(R.id.tha31a)
    RadioButton tha31a;
    @BindView(R.id.tha31b)
    RadioButton tha31b;
    @BindView(R.id.tha31c)
    RadioButton tha31c;
    @BindView(R.id.tha32)
    RadioGroup tha32;
    @BindView(R.id.tha32a)
    RadioButton tha32a;
    @BindView(R.id.tha32b)
    RadioButton tha32b;
    @BindView(R.id.tha33)
    RadioGroup tha33;
    @BindView(R.id.tha33a)
    RadioButton tha33a;
    @BindView(R.id.tha33b)
    RadioButton tha33b;
    @BindView(R.id.tha34)
    RadioGroup tha34;
    @BindView(R.id.tha34a)
    RadioButton tha34a;
    @BindView(R.id.tha34b)
    RadioButton tha34b;
    @BindView(R.id.tha34c)
    RadioButton tha34c;
    @BindView(R.id.tha34d)
    RadioButton tha34d;
    @BindView(R.id.tha34e)
    RadioButton tha34e;
    @BindView(R.id.tha34f)
    RadioButton tha34f;
    @BindView(R.id.tha34g)
    RadioButton tha34g;
    @BindView(R.id.tha34h)
    RadioButton tha34h;
    @BindView(R.id.tha34i)
    RadioButton tha34i;
    @BindView(R.id.tha34j)
    RadioButton tha34j;
    @BindView(R.id.tha34k)
    RadioButton tha34k;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_ha);
        ButterKnife.bind(this);
    }

    private boolean formValidation() {

        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        //        01
        if (tha01.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tha01), Toast.LENGTH_SHORT).show();
            tha01.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "tha01: This data is Required!");
            return false;
        } else {
            tha01.setError(null);
        }


        //        02
        if (tha02.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tha02), Toast.LENGTH_SHORT).show();
            tha02.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "tha02: This data is Required!");
            return false;
        } else {
            tha02.setError(null);
        }


        //        03
        if (tha03.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tha03), Toast.LENGTH_SHORT).show();
            tha03.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "tha03: This data is Required!");
            return false;
        } else {
            tha03.setError(null);
        }


        //        04
        if (tha04.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tha04), Toast.LENGTH_SHORT).show();
            tha04.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "tha04: This data is Required!");
            return false;
        } else {
            tha04.setError(null);
        }


        //        05
        if (tha05.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tha05), Toast.LENGTH_SHORT).show();
            tha05.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "tha05: This data is Required!");
            return false;
        } else {
            tha05.setError(null);
        }


        //        06
        if (tha06.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tha06), Toast.LENGTH_SHORT).show();
            tha06.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "tha06: This data is Required!");
            return false;
        } else {
            tha06.setError(null);
        }


        //        07
        if (!tha07a.isChecked()
                && !tha07b.isChecked()
                && !tha07c.isChecked()
                && !tha07d.isChecked()
                && !tha07e.isChecked()
                && !tha07f.isChecked()
                && !tha07g.isChecked()
                && !tha07h.isChecked()
                && !tha0788.isChecked()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tha07), Toast.LENGTH_LONG).show();
            tha07a.setError("This data is Required!");
            Log.i(TAG, "tha07a: This data is Required!");
            return false;
        } else {
            tha07a.setError(null);
        }


        //        0788
        if (tha0788.isChecked()) {
            if (tha0788.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.tha0788), Toast.LENGTH_SHORT).show();
                tha0788.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "tha0788: This data is Required!");
                return false;
            } else {
                tha0788.setError(null);
            }
        }


        //        08
        if (tha08.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tha08), Toast.LENGTH_SHORT).show();
            tha08.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "tha08: This data is Required!");
            return false;
        } else {
            tha08.setError(null);
        }


        //        09
        if (!tha09a.isChecked()
                && !tha09b.isChecked()
                && !tha09c.isChecked()
                && !tha09d.isChecked()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tha09), Toast.LENGTH_LONG).show();
            tha09a.setError("This data is Required!");
            Log.i(TAG, "tha09a: This data is Required!");
            return false;
        } else {
            tha09a.setError(null);
        }


        //        10
        if (tha10.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tha10), Toast.LENGTH_SHORT).show();
            tha10.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "tha10: This data is Required!");
            return false;
        } else {
            tha10.setError(null);
        }


        //        11
        if (!tha11a.isChecked()
                && !tha11b.isChecked()
                && !tha11c.isChecked()
                && !tha11d.isChecked()
                && !tha11e.isChecked()
                && !tha11f.isChecked()
                && !tha11g.isChecked()
                && !tha11h.isChecked()
                && !tha11i.isChecked()
                && !tha11j.isChecked()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tha11), Toast.LENGTH_LONG).show();
            tha11a.setError("This data is Required!");
            Log.i(TAG, "tha11a: This data is Required!");
            return false;
        } else {
            tha11a.setError(null);
        }


        //        12
        if (tha12.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tha12), Toast.LENGTH_SHORT).show();
            tha12.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "tha12: This data is Required!");
            return false;
        } else {
            tha12.setError(null);
        }


        //        13
        if (tha13.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tha13), Toast.LENGTH_SHORT).show();
            tha13.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "tha13: This data is Required!");
            return false;
        } else {
            tha13.setError(null);
        }


        //        14
        if (tha14.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tha14), Toast.LENGTH_SHORT).show();
            tha14.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "tha14: This data is Required!");
            return false;
        } else {
            tha14.setError(null);
        }


        //        15
        if (tha15.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tha15), Toast.LENGTH_SHORT).show();
            tha15.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "tha15: This data is Required!");
            return false;
        } else {
            tha15.setError(null);
        }


        //        16
        if (tha16.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tha16), Toast.LENGTH_SHORT).show();
            tha16.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "tha16: This data is Required!");
            return false;
        } else {
            tha16.setError(null);
        }


        //        1688
        if (tha1688.isChecked()) {
            if (tha1688.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.tha1688), Toast.LENGTH_SHORT).show();
                tha1688.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "tha1688: This data is Required!");
                return false;
            } else {
                tha1688.setError(null);
            }
        }


        //        17
        if (tha17.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tha17), Toast.LENGTH_SHORT).show();
            tha17.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "tha17: This data is Required!");
            return false;
        } else {
            tha17.setError(null);
        }


        //        18
        if (tha18.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tha18), Toast.LENGTH_SHORT).show();
            tha18.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "tha18: This data is Required!");
            return false;
        } else {
            tha18.setError(null);
        }


        //        19
        if (!tha19a.isChecked()
                && !tha19b.isChecked()
                && !tha19c.isChecked()
                && !tha19d.isChecked()
                && !tha19e.isChecked()
                && !tha19f.isChecked()
                && !tha19g.isChecked()
                && !tha19h.isChecked()
                && !tha19i.isChecked()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tha19), Toast.LENGTH_LONG).show();
            tha19a.setError("This data is Required!");
            Log.i(TAG, "tha19a: This data is Required!");
            return false;
        } else {
            tha19a.setError(null);
        }


        //        20
        if (tha20.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tha20), Toast.LENGTH_SHORT).show();
            tha20.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "tha20: This data is Required!");
            return false;
        } else {
            tha20.setError(null);
        }


        //        20hr
        if (tha20a.isChecked()) {
            if (tha20hr.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.tha20hr), Toast.LENGTH_SHORT).show();
                tha20hr.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "tha20hr: This data is Required!");
                return false;
            } else {
                tha20hr.setError(null);
            }
        }


        //        20d
        if (tha20b.isChecked()) {
            if (tha20d.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.tha20d), Toast.LENGTH_SHORT).show();
                tha20d.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "tha20d: This data is Required!");
                return false;
            } else {
                tha20d.setError(null);
            }
        }


        //        21
        if (tha21.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tha21), Toast.LENGTH_SHORT).show();
            tha21.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "tha21: This data is Required!");
            return false;
        } else {
            tha21.setError(null);
        }


        //        22
        if (tha22.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tha22), Toast.LENGTH_SHORT).show();
            tha22.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "tha22: This data is Required!");
            return false;
        } else {
            tha22.setError(null);
        }


        //        23
        if (tha23.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tha23), Toast.LENGTH_SHORT).show();
            tha23.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "tha23: This data is Required!");
            return false;
        } else {
            tha23.setError(null);
        }


        //        24
        if (!tha24a.isChecked()
                && !tha24b.isChecked()
                && !tha24c.isChecked()
                && !tha24d.isChecked()
                && !tha24e.isChecked()
                && !tha24f.isChecked()
                && !tha24g.isChecked()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tha24), Toast.LENGTH_LONG).show();
            tha24a.setError("This data is Required!");
            Log.i(TAG, "tha24a: This data is Required!");
            return false;
        } else {
            tha24a.setError(null);
        }


        //        25
        if (tha25.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tha25), Toast.LENGTH_SHORT).show();
            tha25.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "tha25: This data is Required!");
            return false;
        } else {
            tha25.setError(null);
        }


        //        26
        if (tha26.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tha26), Toast.LENGTH_SHORT).show();
            tha26.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "tha26: This data is Required!");
            return false;
        } else {
            tha26.setError(null);
        }


        //        27
        if (tha27.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tha27), Toast.LENGTH_SHORT).show();
            tha27.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "tha27: This data is Required!");
            return false;
        } else {
            tha27.setError(null);
        }


        //        2788x
        if (tha2788.isChecked()) {
            if (tha2788x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.tha2788x), Toast.LENGTH_SHORT).show();
                tha2788x.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "tha2788x: This data is Required!");
                return false;
            } else {
                tha2788x.setError(null);
            }
        }


        //        28
        if (tha28.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tha28), Toast.LENGTH_SHORT).show();
            tha28.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "tha28: This data is Required!");
            return false;
        } else {
            tha28.setError(null);
        }


        //        29
        if (tha29.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tha29), Toast.LENGTH_SHORT).show();
            tha29.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "tha29: This data is Required!");
            return false;
        } else {
            tha29.setError(null);
        }


        //        30
        if (tha30.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tha30), Toast.LENGTH_SHORT).show();
            tha30.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "tha30: This data is Required!");
            return false;
        } else {
            tha30.setError(null);
        }


        //        31
        if (tha31.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tha31), Toast.LENGTH_SHORT).show();
            tha31.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "tha31: This data is Required!");
            return false;
        } else {
            tha31.setError(null);
        }


        //        32
        if (tha32.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tha32), Toast.LENGTH_SHORT).show();
            tha32.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "tha32: This data is Required!");
            return false;
        } else {
            tha32.setError(null);
        }


        //        33
        if (tha33.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tha33), Toast.LENGTH_SHORT).show();
            tha33.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "tha33: This data is Required!");
            return false;
        } else {
            tha33.setError(null);
        }


        //        34
        if (tha34.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tha34), Toast.LENGTH_SHORT).show();
            tha34.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "tha34: This data is Required!");
            return false;
        } else {
            tha34.setError(null);
        }


        return true;
    }

    private void SaveDraft() throws JSONException {

        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sHA = new JSONObject();

        sHA.put("tha01", tha01a.isChecked() ? "1" : tha01b.isChecked() ? "2" : tha0188.isChecked() ? "888" : "0");
        sHA.put("tha02", tha02.getText().toString());
        sHA.put("tha03", tha03.getText().toString());
        sHA.put("tha04", tha04.getText().toString());

        sHA.put("tha05", tha05a.isChecked() ? "1" : tha05b.isChecked() ? "2" : tha0588.isChecked() ? "888" : "0");
        sHA.put("tha06", tha06a.isChecked() ? "1" : tha06b.isChecked() ? "2" : tha0688.isChecked() ? "888" : "0");
        sHA.put("tha07a", tha07a.isChecked() ? "1" : "0");
        sHA.put("tha07b", tha07b.isChecked() ? "1" : "0");
        sHA.put("tha07c", tha07c.isChecked() ? "1" : "0");
        sHA.put("tha07d", tha07d.isChecked() ? "1" : "0");
        sHA.put("tha07e", tha07e.isChecked() ? "1" : "0");
        sHA.put("tha07f", tha07f.isChecked() ? "1" : "0");
        sHA.put("tha07g", tha07g.isChecked() ? "1" : "0");
        sHA.put("tha07h", tha07h.isChecked() ? "1" : "0");
        sHA.put("tha0788", tha0788.isChecked() ? "1" : "0");
        sHA.put("tha0788x", tha0788x.getText().toString());

        sHA.put("tha08", tha08.getText().toString());

        sHA.put("tha09a", tha09a.isChecked() ? "1" : "0");
        sHA.put("tha09b", tha09b.isChecked() ? "1" : "0");
        sHA.put("tha09c", tha09c.isChecked() ? "1" : "0");
        sHA.put("tha09d", tha09d.isChecked() ? "1" : "0");


        sHA.put("tha10", tha10a.isChecked() ? "1" : tha10b.isChecked() ? "2"
                : tha10c.isChecked() ? "3"
                : tha10d.isChecked() ? "4"
                : tha10e.isChecked() ? "5"
                : tha10f.isChecked() ? "6"
                : tha10g.isChecked() ? "7"
                : tha10h.isChecked() ? "8"
                : tha10i.isChecked() ? "9"
                : tha10j.isChecked() ? "10"
                : tha10k.isChecked() ? "11"
                : "0");


        sHA.put("tha11a", tha11a.isChecked() ? "1" : "0");
        sHA.put("tha11b", tha11b.isChecked() ? "1" : "0");
        sHA.put("tha11c", tha11c.isChecked() ? "1" : "0");
        sHA.put("tha11d", tha11d.isChecked() ? "1" : "0");
        sHA.put("tha11e", tha11e.isChecked() ? "1" : "0");
        sHA.put("tha11f", tha11f.isChecked() ? "1" : "0");
        sHA.put("tha11g", tha11g.isChecked() ? "1" : "0");
        sHA.put("tha11h", tha11h.isChecked() ? "1" : "0");
        sHA.put("tha11i", tha11i.isChecked() ? "1" : "0");
        sHA.put("tha11j", tha11j.isChecked() ? "1" : "0");

        sHA.put("tha12", tha12a.isChecked() ? "1" : tha12b.isChecked() ? "2" : "0");
        sHA.put("tha13", tha13a.isChecked() ? "1" : tha13b.isChecked() ? "2" : "0");

        sHA.put("tha14", tha14a.isChecked() ? "1" : tha14b.isChecked() ? "2" : tha14c.isChecked() ? "3" : "0");
        sHA.put("tha15", tha15a.isChecked() ? "1" : tha15b.isChecked() ? "2" : "0");
        sHA.put("tha16", tha16a.isChecked() ? "1" : tha16b.isChecked() ? "2" : tha16c.isChecked() ? "3" : tha1688.isChecked() ? "888" : "0");

        sHA.put("tha1688x", tha1688x.getText().toString());


        sHA.put("tha17", tha17a.isChecked() ? "1" : tha17b.isChecked() ? "2" : tha17c.isChecked() ? "3" : "0");

        sHA.put("tha18", tha18a.isChecked() ? "1" : tha18b.isChecked() ? "2"
                : tha18c.isChecked() ? "3"
                : tha18d.isChecked() ? "4"
                : tha18e.isChecked() ? "5"
                : "0");


        sHA.put("tha19a", tha19a.isChecked() ? "1" : "0");
        sHA.put("tha19b", tha19b.isChecked() ? "1" : "0");
        sHA.put("tha19c", tha19c.isChecked() ? "1" : "0");
        sHA.put("tha19d", tha19d.isChecked() ? "1" : "0");
        sHA.put("tha19e", tha19e.isChecked() ? "1" : "0");
        sHA.put("tha19f", tha19f.isChecked() ? "1" : "0");
        sHA.put("tha19g", tha19g.isChecked() ? "1" : "0");
        sHA.put("tha19h", tha19h.isChecked() ? "1" : "0");
        sHA.put("tha19i", tha19i.isChecked() ? "1" : "0");


        sHA.put("tha20", tha20a.isChecked() ? "1" : tha20b.isChecked() ? "2" : tha20c.isChecked() ? "3" : "0");

        sHA.put("tha20hr", tha20hr.getText().toString());
        sHA.put("tha20d", tha20d.getText().toString());

        sHA.put("tha21", tha21a.isChecked() ? "1" : tha21b.isChecked() ? "2" : "0");
        sHA.put("tha22", tha22.getText().toString());
        sHA.put("tha23", tha23a.isChecked() ? "1" : tha23b.isChecked() ? "2" : "0");

        sHA.put("tha24a", tha24a.isChecked() ? "1" : "0");
        sHA.put("tha24b", tha24b.isChecked() ? "1" : "0");
        sHA.put("tha24c", tha24c.isChecked() ? "1" : "0");
        sHA.put("tha24d", tha24d.isChecked() ? "1" : "0");
        sHA.put("tha24e", tha24e.isChecked() ? "1" : "0");
        sHA.put("tha24f", tha24f.isChecked() ? "1" : "0");
        sHA.put("tha24g", tha24g.isChecked() ? "1" : "0");


        sHA.put("tha25", tha25a.isChecked() ? "1" : tha25b.isChecked() ? "2" : tha25c.isChecked() ? "3" : "0");
        sHA.put("tha26", tha26.getText().toString());

        sHA.put("tha27", tha27a.isChecked() ? "1" : tha27b.isChecked() ? "2"
                : tha27c.isChecked() ? "3"
                : tha27d.isChecked() ? "4"
                : tha27e.isChecked() ? "5"
                : tha27f.isChecked() ? "6"
                : tha27g.isChecked() ? "7"
                : tha27h.isChecked() ? "8"
                : tha2788.isChecked() ? "88"
                : "0");


        sHA.put("tha2788x", tha2788x.getText().toString());
        sHA.put("tha28", tha28.getText().toString());
        sHA.put("tha29", tha29.getText().toString());
        sHA.put("tha30", tha30.getText().toString());

        sHA.put("tha31", tha31a.isChecked() ? "1" : tha31b.isChecked() ? "2" : tha31c.isChecked() ? "3" : "0");
        sHA.put("tha32", tha32a.isChecked() ? "1" : tha32b.isChecked() ? "2" : "0");
        sHA.put("tha33", tha33a.isChecked() ? "1" : tha33a.isChecked() ? "2" : "0");


        sHA.put("tha34", tha34a.isChecked() ? "1" : tha34b.isChecked() ? "2"
                : tha34c.isChecked() ? "3"
                : tha34d.isChecked() ? "4"
                : tha34e.isChecked() ? "5"
                : tha34f.isChecked() ? "6"
                : tha34g.isChecked() ? "7"
                : tha34h.isChecked() ? "8"
                : tha34i.isChecked() ? "9"
                : tha34j.isChecked() ? "10"
                : tha34k.isChecked() ? "11"
                : "0");

        MainApp.fc.sHA(String.valueOf(sHA));

    }

}
