package edu.aku.hassannaqvi.tmk_midline_monitor.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.tmk_midline_monitor.R;
import edu.aku.hassannaqvi.tmk_midline_monitor.core.DatabaseHelper;
import edu.aku.hassannaqvi.tmk_midline_monitor.core.MainApp;

public class EndingActivity extends Activity {

    private static final String TAG = EndingActivity.class.getSimpleName();
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.istatus)
    RadioGroup istatus;
    @BindView(R.id.istatus1)
    RadioButton istatus1;
    @BindView(R.id.istatus2)
    RadioButton istatus2;
    @BindView(R.id.istatus3)
    RadioButton istatus3;
    @BindView(R.id.istatus4)
    RadioButton istatus4;
    @BindView(R.id.istatus5)
    RadioButton istatus5;
    @BindView(R.id.istatus6)
    RadioButton istatus6;
    @BindView(R.id.istatus7)
    RadioButton istatus7;
    @BindView(R.id.istatus96)
    RadioButton istatus96;
    @BindView(R.id.istatus96x)
    EditText istatus96x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ending);
        ButterKnife.bind(this);

        Boolean check = getIntent().getExtras().getBoolean("complete");

        if (check) {
            istatus1.setEnabled(true);
            istatus2.setEnabled(false);
            istatus3.setEnabled(false);
            istatus4.setEnabled(false);
            istatus5.setEnabled(false);
            istatus6.setEnabled(false);
            istatus7.setEnabled(false);
            istatus96.setEnabled(false);
            istatus96x.setEnabled(false);
            istatus96x.setText(null);

        } else {
            //fldGrpmn0823Reason.setVisibility(View.GONE);
            istatus1.setEnabled(false);
        }

        istatus.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (istatus96.isChecked()) {
                    istatus96x.setVisibility(View.VISIBLE);
                    istatus96x.requestFocus();
                } else {
                    istatus96x.setText(null);
                    istatus96x.setVisibility(View.GONE);
                }
            }
        });

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {

        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            SaveDraft();
            if (UpdateDB()) {

                MainApp.familyMembersList.clear();
                MainApp.memFlag = 0;

                MainApp.TotalMembersCount = 0;
                MainApp.TotalMWRACount = 0;
                MainApp.TotalNonMWRACount = 0;
                MainApp.mwraCount = 1;
                MainApp.TotalChildCount = 0;
                MainApp.imsCount = 1;
                MainApp.totalImsCount = 0;
                MainApp.lstChild.clear();
                MainApp.childsMap.clear();

                MainApp.counter = 0;

//    Total No of Alive members got from Section B

/*                MainApp.currentStatusCount = 0;
                MainApp.currentDeceasedCheck = 0;
                MainApp.currentMotherCheck = 0;*/

                MainApp.selectedPos = -1;

                MainApp.randID = 1;

                MainApp.isRsvp = false;
                MainApp.isHead = false;

                MainApp.flag = true;

                finish();

                Intent endSec = new Intent(this, MainActivity.class);
                endSec.putExtra("complete", false);
                startActivity(endSec);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void SaveDraft() {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        MainApp.fc.setIstatus(istatus1.isChecked() ? "1"
                : istatus2.isChecked() ? "2"
                : istatus3.isChecked() ? "3"
                : istatus4.isChecked() ? "4"
                : istatus5.isChecked() ? "4"
                : istatus6.isChecked() ? "6"
                : istatus7.isChecked() ? "7"
                : istatus96.isChecked() ? "96"
                : "0");

        MainApp.fc.setIstatus96x(istatus96x.getText().toString());


        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateEnding();
        /*if (MainApp.memFlag != 0) {
            db.updateFamilyMember();
        }
        if (MainApp.currentDeceasedCheck != 0) {
            db.updateDeceasedMother();
        }
        if (MainApp.currentMotherCheck != 0) {
            db.updateMother();
        }
        if (MainApp.totalChild != 0) {
            db.updateIM();
        }
*/
        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    private boolean formValidation() {
        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        if (istatus.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Not Selected): " + getString(R.string.dcstatus), Toast.LENGTH_LONG).show();
            istatus1.setError("Please Select One");    // Set Error on last radio button
            Log.i(TAG, "istatus: This data is Required!");
            return false;
        } else {
            istatus1.setError(null);
        }

        if (istatus96.isChecked()) {

            if (istatus96x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                istatus96x.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "istatus96x: This data is Required!");
                return false;
            } else {
                istatus96x.setError(null);
            }

        }


        return true;
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }


}
