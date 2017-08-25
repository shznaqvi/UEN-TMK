package edu.aku.hassannaqvi.uen_tmk.activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SectionDActivity extends Activity {

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



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_d);
        ButterKnife.bind(this);

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

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {

    }


    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {

    }


}
