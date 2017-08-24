package edu.aku.hassannaqvi.uen_tmk.activities;

import android.os.Bundle;
import android.app.Activity;
import android.widget.Spinner;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.EditText;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.uen_tmk.core.MainApp;

public class SectionIActivity extends Activity {

    @BindView(R.id.ti01)
    Spinner ti01;
    @BindView(R.id.ti02)
    RadioGroup ti02;
    @BindView(R.id.ti02a)
    RadioButton ti02a;
    @BindView(R.id.ti02b)
    RadioButton ti02b;
    @BindView(R.id.ti02c)
    RadioButton ti02c;
    @BindView(R.id.ti02d)
    RadioButton ti02d;
    @BindView(R.id.ti02e)
    RadioButton ti02e;
    @BindView(R.id.ti02f)
    RadioButton ti02f;
    @BindView(R.id.ti02g)
    RadioButton ti02g;
    @BindView(R.id.ti02h)
    RadioButton ti02h;
    @BindView(R.id.ti02i)
    RadioButton ti02i;
    @BindView(R.id.ti0288)
    RadioButton ti0288;
    @BindView(R.id.ti0288x)
    EditText ti0288x;
    @BindView(R.id.ti03m)
    EditText ti03m;
    @BindView(R.id.ti03d)
    EditText ti03d;
    @BindView(R.id.ti03h)
    EditText ti03h;
    @BindView(R.id.ti03888)
    CheckBox ti03888;
    @BindView(R.id.ti04)
    RadioGroup ti04;
    @BindView(R.id.ti04a)
    RadioButton ti04a;
    @BindView(R.id.ti04b)
    RadioButton ti04b;
    @BindView(R.id.fldGrpti05)
    LinearLayout fldGrpti05;
    @BindView(R.id.ti05a)
    CheckBox ti05a;
    @BindView(R.id.ti05b)
    CheckBox ti05b;
    @BindView(R.id.ti05c)
    CheckBox ti05c;
    @BindView(R.id.ti05d)
    CheckBox ti05d;
    @BindView(R.id.ti05e)
    CheckBox ti05e;
    @BindView(R.id.ti05f)
    CheckBox ti05f;
    @BindView(R.id.ti05g)
    CheckBox ti05g;
    @BindView(R.id.ti05h)
    CheckBox ti05h;
    @BindView(R.id.ti06)
    RadioGroup ti06;
    @BindView(R.id.ti06a)
    RadioButton ti06a;
    @BindView(R.id.ti06b)
    RadioButton ti06b;
    @BindView(R.id.fldGrpti07)
    LinearLayout fldGrpti07;
    @BindView(R.id.ti07a)
    CheckBox ti07a;
    @BindView(R.id.ti07b)
    CheckBox ti07b;
    @BindView(R.id.ti07c)
    CheckBox ti07c;
    @BindView(R.id.ti07d)
    CheckBox ti07d;
    @BindView(R.id.ti07e)
    CheckBox ti07e;
    @BindView(R.id.ti07f)
    CheckBox ti07f;
    @BindView(R.id.ti07g)
    CheckBox ti07g;
    @BindView(R.id.ti07h)
    CheckBox ti07h;
    @BindView(R.id.ti0788)
    CheckBox ti0788;
    @BindView(R.id.ti0788x)
    EditText ti0788x;
    @BindView(R.id.fldGrpti08)
    LinearLayout fldGrpti08;
    @BindView(R.id.ti08a)
    CheckBox ti08a;
    @BindView(R.id.ti08b)
    CheckBox ti08b;
    @BindView(R.id.ti08c)
    CheckBox ti08c;
    @BindView(R.id.ti08d)
    CheckBox ti08d;
    @BindView(R.id.ti08e)
    CheckBox ti08e;
    @BindView(R.id.ti08f)
    CheckBox ti08f;
    @BindView(R.id.ti08g)
    CheckBox ti08g;
    @BindView(R.id.ti08h)
    CheckBox ti08h;
    @BindView(R.id.ti0888)
    CheckBox ti0888;
    @BindView(R.id.ti0888x)
    EditText ti0888x;
    @BindView(R.id.ti09)
    RadioGroup ti09;
    @BindView(R.id.ti09a)
    RadioButton ti09a;
    @BindView(R.id.ti09b)
    RadioButton ti09b;
    @BindView(R.id.ti10)
    RadioGroup ti10;
    @BindView(R.id.ti10a)
    RadioButton ti10a;
    @BindView(R.id.ti10b)
    RadioButton ti10b;
    @BindView(R.id.fldGrpti11)
    LinearLayout fldGrpti11;
    @BindView(R.id.ti11m)
    EditText ti11m;
    @BindView(R.id.ti11d)
    EditText ti11d;
    @BindView(R.id.ti11h)
    EditText ti11h;
    @BindView(R.id.ti11888)
    CheckBox ti11888;
    @BindView(R.id.ti12m)
    EditText ti12m;
    @BindView(R.id.ti12d)
    EditText ti12d;
    @BindView(R.id.ti13m)
    EditText ti13m;
    @BindView(R.id.ti13d)
    EditText ti13d;
    @BindView(R.id.ti14)
    RadioGroup ti14;
    @BindView(R.id.ti14a)
    RadioButton ti14a;
    @BindView(R.id.ti14b)
    RadioButton ti14b;
    @BindView(R.id.ti14c)
    RadioButton ti14c;
    @BindView(R.id.ti14d)
    RadioButton ti14d;
    @BindView(R.id.ti14e)
    RadioButton ti14e;
    @BindView(R.id.ti14f)
    RadioButton ti14f;
    @BindView(R.id.ti14g)
    RadioButton ti14g;
    @BindView(R.id.ti14h)
    RadioButton ti14h;
    @BindView(R.id.ti14i)
    RadioButton ti14i;
    @BindView(R.id.ti14j)
    RadioButton ti14j;
    @BindView(R.id.ti14k)
    RadioButton ti14k;
    @BindView(R.id.ti14l)
    RadioButton ti14l;
    @BindView(R.id.ti1488)
    RadioButton ti1488;
    @BindView(R.id.ti1488x)
    EditText ti1488x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_i);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        //TODO implement

        MainApp.endActivity(this,this);
    }

    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {
        //TODO implement
    }
}

