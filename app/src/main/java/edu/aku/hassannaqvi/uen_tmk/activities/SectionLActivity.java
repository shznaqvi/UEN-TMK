package edu.aku.hassannaqvi.uen_tmk.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.uen_tmk.core.MainApp;

public class SectionLActivity extends Activity {

    @BindView(R.id.tl01)
    RadioGroup tl01;
    @BindView(R.id.tl01a)
    RadioButton tl01a;
    @BindView(R.id.tl01b)
    RadioButton tl01b;
    @BindView(R.id.tl01c)
    RadioButton tl01c;
    @BindView(R.id.tl0188)
    RadioButton tl0188;
    @BindView(R.id.tl0188x)
    EditText tl0188x;
    @BindView(R.id.fldGrptl02)
    LinearLayout fldGrptl02;
    @BindView(R.id.tl02)
    RadioGroup tl02;
    @BindView(R.id.tl02a)
    RadioButton tl02a;
    @BindView(R.id.tl02b)
    RadioButton tl02b;
    @BindView(R.id.tl03)
    RadioGroup tl03;
    @BindView(R.id.tl03a)
    RadioButton tl03a;
    @BindView(R.id.tl03b)
    RadioButton tl03b;
    @BindView(R.id.tl04a)
    CheckBox tl04a;
    @BindView(R.id.tl04b)
    CheckBox tl04b;
    @BindView(R.id.tl04c)
    CheckBox tl04c;
    @BindView(R.id.tl04d)
    CheckBox tl04d;
    @BindView(R.id.tl05)
    RadioGroup tl05;
    @BindView(R.id.tl05a)
    RadioButton tl05a;
    @BindView(R.id.tl05b)
    RadioButton tl05b;
    @BindView(R.id.tl06)
    RadioGroup tl06;
    @BindView(R.id.tl06a)
    RadioButton tl06a;
    @BindView(R.id.tl06b)
    RadioButton tl06b;
    @BindView(R.id.tl07a)
    CheckBox tl07a;
    @BindView(R.id.tl07b)
    CheckBox tl07b;
    @BindView(R.id.tl07c)
    CheckBox tl07c;
    @BindView(R.id.tl07d)
    CheckBox tl07d;
    @BindView(R.id.tl08a)
    CheckBox tl08a;
    @BindView(R.id.tl08b)
    CheckBox tl08b;
    @BindView(R.id.tl08c)
    CheckBox tl08c;
    @BindView(R.id.tl08d)
    CheckBox tl08d;
    @BindView(R.id.tl08e)
    CheckBox tl08e;
    @BindView(R.id.tl08f)
    CheckBox tl08f;
    @BindView(R.id.tl08g)
    CheckBox tl08g;
    @BindView(R.id.tl08h)
    CheckBox tl08h;
    @BindView(R.id.tl08i)
    CheckBox tl08i;
    @BindView(R.id.tl09)
    RadioGroup tl09;
    @BindView(R.id.tl09a)
    RadioButton tl09a;
    @BindView(R.id.tl09b)
    RadioButton tl09b;
    @BindView(R.id.tl09c)
    RadioButton tl09c;
    @BindView(R.id.tl09d)
    RadioButton tl09d;
    @BindView(R.id.tl0988)
    RadioButton tl0988;
    @BindView(R.id.tl0988x)
    EditText tl0988x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_l);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        //TODO implement
        MainApp.endActivity(this, this);
    }

    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {
        //TODO implement
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sL = new JSONObject();

        sL.put("tl01", tl01a.isChecked() ? "1" : tl01b.isChecked() ? "2" : tl01c.isChecked() ? "3"
                : tl0188.isChecked() ? "88" : "0");
        sL.put("tl0188x", tl0188x.getText().toString());

        sL.put("tl02", tl02a.isChecked() ? "1" : tl02b.isChecked() ? "2" : "0");
        sL.put("tl03", tl03a.isChecked() ? "1" : tl03b.isChecked() ? "2" : "0");

        sL.put("tl04a", tl04a.isChecked() ? "1" : "0");
        sL.put("tl04b", tl04b.isChecked() ? "2" : "0");
        sL.put("tl04c", tl04c.isChecked() ? "3" : "0");
        sL.put("tl04d", tl04d.isChecked() ? "4" : "0");

        sL.put("tl05", tl05a.isChecked() ? "1" : tl05b.isChecked() ? "2" : "0");
        sL.put("tl06", tl06a.isChecked() ? "1" : tl06b.isChecked() ? "2" : "0");

        sL.put("tl07a", tl07a.isChecked() ? "1" : "0");
        sL.put("tl07b", tl07b.isChecked() ? "2" : "0");
        sL.put("tl07c", tl07c.isChecked() ? "3" : "0");
        sL.put("tl07d", tl07d.isChecked() ? "4" : "0");

        sL.put("tl08a", tl08a.isChecked() ? "1" : "0");
        sL.put("tl08b", tl08b.isChecked() ? "2" : "0");
        sL.put("tl08c", tl08c.isChecked() ? "3" : "0");
        sL.put("tl08d", tl08d.isChecked() ? "4" : "0");
        sL.put("tl08e", tl08e.isChecked() ? "5" : "0");
        sL.put("tl08f", tl08f.isChecked() ? "6" : "0");
        sL.put("tl08g", tl08g.isChecked() ? "7" : "0");
        sL.put("tl08h", tl08h.isChecked() ? "8" : "0");
        sL.put("tl08i", tl08i.isChecked() ? "9" : "0");

        sL.put("tl09", tl09a.isChecked() ? "1" : tl09b.isChecked() ? "2" : tl09c.isChecked() ? "3"
                : tl09d.isChecked() ? "4" : tl0988.isChecked() ? "88" : "0");
        sL.put("tl0988x", tl0988x.getText().toString());

//        MainApp.fc.setROW_sl(String.valueOf(sL));
    }
}

