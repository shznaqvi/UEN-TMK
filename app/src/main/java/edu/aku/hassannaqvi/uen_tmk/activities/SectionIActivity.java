package edu.aku.hassannaqvi.uen_tmk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;

import java.util.List;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.blackbox_vision.datetimepickeredittext.view.DatePickerInputEditText;

public class SectionIActivity extends AppCompatActivity {

    @BindView(R.id.activity_section_a)
    ScrollView activitySectionA;
    @BindView(R.id.ti01)
    RadioGroup ti01;
    @BindView(R.id.ti01a)
    RadioButton ti01a;
    @BindView(R.id.ti01b)
    RadioButton ti01b;
    @BindView(R.id.ti01c)
    RadioButton ti01c;
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
    @BindView(R.id.ti0288)
    RadioButton ti0288;
    @BindView(R.id.ti0288x)
    EditText ti0288x;
    @BindView(R.id.ti03)
    RadioGroup ti03;
    @BindView(R.id.ti03a)
    RadioButton ti03a;
    @BindView(R.id.ti03b)
    RadioButton ti03b;
    @BindView(R.id.tic03c)
    RadioButton tic03c;
    @BindView(R.id.fldGrpBcgM)
    LinearLayout fldGrpBcgM;
    @BindView(R.id.bcgM)
    RadioGroup bcgM;
    @BindView(R.id.bcgM01)
    RadioButton bcgM01;
    @BindView(R.id.bcgM02)
    RadioButton bcgM02;
    @BindView(R.id.fldGrpBcgC)
    LinearLayout fldGrpBcgC;
    @BindView(R.id.bcgC)
    RadioGroup bcgC;
    @BindView(R.id.bcgC01)
    RadioButton bcgC01;
    @BindView(R.id.bcgC02)
    RadioButton bcgC02;
    @BindView(R.id.bcgDate)
    DatePickerInputEditText bcgDate;
    @BindView(R.id.bcgPov)
    RadioGroup bcgPov;
    @BindView(R.id.bcgPova)
    RadioButton bcgPova;
    @BindView(R.id.bcgPovb)
    RadioButton bcgPovb;
    @BindView(R.id.bcgPovc)
    RadioButton bcgPovc;
    @BindView(R.id.bcgPovd)
    RadioButton bcgPovd;
    @BindView(R.id.bcgPove)
    RadioButton bcgPove;
    @BindView(R.id.bcgPovf)
    RadioButton bcgPovf;
    @BindView(R.id.bcgPovg)
    RadioButton bcgPovg;
    @BindView(R.id.bcgPovh)
    RadioButton bcgPovh;
    @BindView(R.id.fldGrpOpv0M)
    LinearLayout fldGrpOpv0M;
    @BindView(R.id.opv0M)
    RadioGroup opv0M;
    @BindView(R.id.opv0M01)
    RadioButton opv0M01;
    @BindView(R.id.opv0M02)
    RadioButton opv0M02;
    @BindView(R.id.fldGrpopv0C)
    LinearLayout fldGrpopv0C;
    @BindView(R.id.opv0C)
    RadioGroup opv0C;
    @BindView(R.id.opv0C01)
    RadioButton opv0C01;
    @BindView(R.id.opv0C02)
    RadioButton opv0C02;
    @BindView(R.id.opv0Date)
    DatePickerInputEditText opv0Date;
    @BindView(R.id.opv0Pov)
    RadioGroup opv0Pov;
    @BindView(R.id.opv0Pova)
    RadioButton opv0Pova;
    @BindView(R.id.opv0Povb)
    RadioButton opv0Povb;
    @BindView(R.id.opv0Povc)
    RadioButton opv0Povc;
    @BindView(R.id.opv0Povd)
    RadioButton opv0Povd;
    @BindView(R.id.opv0Pove)
    RadioButton opv0Pove;
    @BindView(R.id.opv0Povf)
    RadioButton opv0Povf;
    @BindView(R.id.opv0Povg)
    RadioButton opv0Povg;
    @BindView(R.id.opv0Povh)
    RadioButton opv0Povh;
    @BindView(R.id.fldGrpopv1M)
    LinearLayout fldGrpopv1M;
    @BindView(R.id.opv1M)
    RadioGroup opv1M;
    @BindView(R.id.opv1M01)
    RadioButton opv1M01;
    @BindView(R.id.opv1M02)
    RadioButton opv1M02;
    @BindView(R.id.fldGrpopv1C)
    LinearLayout fldGrpopv1C;
    @BindView(R.id.opv1C)
    RadioGroup opv1C;
    @BindView(R.id.opv1C01)
    RadioButton opv1C01;
    @BindView(R.id.opv1C02)
    RadioButton opv1C02;
    @BindView(R.id.opv1Date)
    DatePickerInputEditText opv1Date;
    @BindView(R.id.opv1Pov)
    RadioGroup opv1Pov;
    @BindView(R.id.opv1Pova)
    RadioButton opv1Pova;
    @BindView(R.id.opv1Povb)
    RadioButton opv1Povb;
    @BindView(R.id.opv1Povc)
    RadioButton opv1Povc;
    @BindView(R.id.opv1Povd)
    RadioButton opv1Povd;
    @BindView(R.id.opv1Pove)
    RadioButton opv1Pove;
    @BindView(R.id.opv1Povf)
    RadioButton opv1Povf;
    @BindView(R.id.opv1Povg)
    RadioButton opv1Povg;
    @BindView(R.id.opv1Povh)
    RadioButton opv1Povh;
    @BindView(R.id.fldGrpPenta1M)
    LinearLayout fldGrpPenta1M;
    @BindView(R.id.penta1M)
    RadioGroup penta1M;
    @BindView(R.id.penta1M01)
    RadioButton penta1M01;
    @BindView(R.id.Penta1M02)
    RadioButton penta1M02;
    @BindView(R.id.fldGrpPenta1C)
    LinearLayout fldGrpPenta1C;
    @BindView(R.id.penta1C)
    RadioGroup penta1C;
    @BindView(R.id.penta1C01)
    RadioButton penta1C01;
    @BindView(R.id.penta1C02)
    RadioButton penta1C02;
    @BindView(R.id.penta1Date)
    DatePickerInputEditText penta1Date;
    @BindView(R.id.penta1Pov)
    RadioGroup penta1Pov;
    @BindView(R.id.penta1Pova)
    RadioButton penta1Pova;
    @BindView(R.id.penta1Povb)
    RadioButton penta1Povb;
    @BindView(R.id.penta1Povc)
    RadioButton penta1Povc;
    @BindView(R.id.penta1Povd)
    RadioButton penta1Povd;
    @BindView(R.id.penta1Pove)
    RadioButton penta1Pove;
    @BindView(R.id.penta1Povf)
    RadioButton penta1Povf;
    @BindView(R.id.penta1Povg)
    RadioButton penta1Povg;
    @BindView(R.id.penta1Povh)
    RadioButton penta1Povh;
    @BindView(R.id.fldGrppcv1M)
    LinearLayout fldGrppcv1M;
    @BindView(R.id.pcv1M)
    RadioGroup pcv1M;
    @BindView(R.id.pcv1M01)
    RadioButton pcv1M01;
    @BindView(R.id.pcv1M02)
    RadioButton pcv1M02;
    @BindView(R.id.fldGrppcv1C)
    LinearLayout fldGrppcv1C;
    @BindView(R.id.pcv1C)
    RadioGroup pcv1C;
    @BindView(R.id.pcv1C01)
    RadioButton pcv1C01;
    @BindView(R.id.pcv1C02)
    RadioButton pcv1C02;
    @BindView(R.id.pcv1Date)
    DatePickerInputEditText pcv1Date;
    @BindView(R.id.pcv1Pov)
    RadioGroup pcv1Pov;
    @BindView(R.id.pcv1Pova)
    RadioButton pcv1Pova;
    @BindView(R.id.pcv1Povb)
    RadioButton pcv1Povb;
    @BindView(R.id.pcv1Povc)
    RadioButton pcv1Povc;
    @BindView(R.id.pcv1Povd)
    RadioButton pcv1Povd;
    @BindView(R.id.pcv1Pove)
    RadioButton pcv1Pove;
    @BindView(R.id.pcv1Povf)
    RadioButton pcv1Povf;
    @BindView(R.id.pcv1Povg)
    RadioButton pcv1Povg;
    @BindView(R.id.pcv1Povh)
    RadioButton pcv1Povh;
    @BindView(R.id.fldGrpopv2M)
    LinearLayout fldGrpopv2M;
    @BindView(R.id.opv2M)
    RadioGroup opv2M;
    @BindView(R.id.opv2M01)
    RadioButton opv2M01;
    @BindView(R.id.opv2M02)
    RadioButton opv2M02;
    @BindView(R.id.fldGrpopv2C)
    LinearLayout fldGrpopv2C;
    @BindView(R.id.opv2C)
    RadioGroup opv2C;
    @BindView(R.id.opv2C01)
    RadioButton opv2C01;
    @BindView(R.id.opv2C02)
    RadioButton opv2C02;
    @BindView(R.id.opv2Date)
    DatePickerInputEditText opv2Date;
    @BindView(R.id.opv2Pov)
    RadioGroup opv2Pov;
    @BindView(R.id.opv2Pova)
    RadioButton opv2Pova;
    @BindView(R.id.opv2Povb)
    RadioButton opv2Povb;
    @BindView(R.id.opv2Povc)
    RadioButton opv2Povc;
    @BindView(R.id.opv2Povd)
    RadioButton opv2Povd;
    @BindView(R.id.opv2Pove)
    RadioButton opv2Pove;
    @BindView(R.id.opv2Povf)
    RadioButton opv2Povf;
    @BindView(R.id.opv2Povg)
    RadioButton opv2Povg;
    @BindView(R.id.opv2Povh)
    RadioButton opv2Povh;
    @BindView(R.id.fldGrppenta2M)
    LinearLayout fldGrppenta2M;
    @BindView(R.id.penta2M)
    RadioGroup penta2M;
    @BindView(R.id.penta2M01)
    RadioButton penta2M01;
    @BindView(R.id.penta2M02)
    RadioButton penta2M02;
    @BindView(R.id.fldGrppenta2C)
    LinearLayout fldGrppenta2C;
    @BindView(R.id.penta2C)
    RadioGroup penta2C;
    @BindView(R.id.penta2C01)
    RadioButton penta2C01;
    @BindView(R.id.penta2C02)
    RadioButton penta2C02;
    @BindView(R.id.penta2Date)
    DatePickerInputEditText penta2Date;
    @BindView(R.id.penta2Pov)
    RadioGroup penta2Pov;
    @BindView(R.id.penta2Pova)
    RadioButton penta2Pova;
    @BindView(R.id.penta2Povb)
    RadioButton penta2Povb;
    @BindView(R.id.penta2Povc)
    RadioButton penta2Povc;
    @BindView(R.id.penta2Povd)
    RadioButton penta2Povd;
    @BindView(R.id.penta2Pove)
    RadioButton penta2Pove;
    @BindView(R.id.penta2Povf)
    RadioButton penta2Povf;
    @BindView(R.id.penta2Povg)
    RadioButton penta2Povg;
    @BindView(R.id.penta2Povh)
    RadioButton penta2Povh;
    @BindView(R.id.fldGrppcv2M)
    LinearLayout fldGrppcv2M;
    @BindView(R.id.pcv2M)
    RadioGroup pcv2M;
    @BindView(R.id.pcv2M01)
    RadioButton pcv2M01;
    @BindView(R.id.pcv2M02)
    RadioButton pcv2M02;
    @BindView(R.id.fldGrppcv2C)
    LinearLayout fldGrppcv2C;
    @BindView(R.id.pcv2C)
    RadioGroup pcv2C;
    @BindView(R.id.pcv2C01)
    RadioButton pcv2C01;
    @BindView(R.id.pcv2C02)
    RadioButton pcv2C02;
    @BindView(R.id.pcv2Date)
    DatePickerInputEditText pcv2Date;
    @BindView(R.id.pcv2Pov)
    RadioGroup pcv2Pov;
    @BindView(R.id.pcv2Pova)
    RadioButton pcv2Pova;
    @BindView(R.id.pcv2Povb)
    RadioButton pcv2Povb;
    @BindView(R.id.pcv2Povc)
    RadioButton pcv2Povc;
    @BindView(R.id.pcv2Povd)
    RadioButton pcv2Povd;
    @BindView(R.id.pcv2Pove)
    RadioButton pcv2Pove;
    @BindView(R.id.pcv2Povf)
    RadioButton pcv2Povf;
    @BindView(R.id.pcv2Povg)
    RadioButton pcv2Povg;
    @BindView(R.id.pcv2Povh)
    RadioButton pcv2Povh;
    @BindView(R.id.fldGrpopv3M)
    LinearLayout fldGrpopv3M;
    @BindView(R.id.opv3M)
    RadioGroup opv3M;
    @BindView(R.id.opv3M01)
    RadioButton opv3M01;
    @BindView(R.id.opv3M02)
    RadioButton opv3M02;
    @BindView(R.id.fldGrpopv3C)
    LinearLayout fldGrpopv3C;
    @BindView(R.id.opv3C)
    RadioGroup opv3C;
    @BindView(R.id.opv3C01)
    RadioButton opv3C01;
    @BindView(R.id.opv3C02)
    RadioButton opv3C02;
    @BindView(R.id.opv3Date)
    DatePickerInputEditText opv3Date;
    @BindView(R.id.opv3Pov)
    RadioGroup opv3Pov;
    @BindView(R.id.opv3Pova)
    RadioButton opv3Pova;
    @BindView(R.id.opv3Povb)
    RadioButton opv3Povb;
    @BindView(R.id.opv3Povc)
    RadioButton opv3Povc;
    @BindView(R.id.opv3Povd)
    RadioButton opv3Povd;
    @BindView(R.id.opv3Pove)
    RadioButton opv3Pove;
    @BindView(R.id.opv3Povf)
    RadioButton opv3Povf;
    @BindView(R.id.opv3Povg)
    RadioButton opv3Povg;
    @BindView(R.id.opv3Povh)
    RadioButton opv3Povh;
    @BindView(R.id.fldGrpPenta3M)
    LinearLayout fldGrpPenta3M;
    @BindView(R.id.penta3M)
    RadioGroup penta3M;
    @BindView(R.id.penta3M01)
    RadioButton penta3M01;
    @BindView(R.id.penta3M02)
    RadioButton penta3M02;
    @BindView(R.id.fldGrpenta3C)
    LinearLayout fldGrpenta3C;
    @BindView(R.id.penta3C)
    RadioGroup penta3C;
    @BindView(R.id.penta3C01)
    RadioButton penta3C01;
    @BindView(R.id.penta3C02)
    RadioButton penta3C02;
    @BindView(R.id.penta3Date)
    DatePickerInputEditText penta3Date;
    @BindView(R.id.penta3Pov)
    RadioGroup penta3Pov;
    @BindView(R.id.penta3Pova)
    RadioButton penta3Pova;
    @BindView(R.id.penta3Povb)
    RadioButton penta3Povb;
    @BindView(R.id.penta3Povc)
    RadioButton penta3Povc;
    @BindView(R.id.penta3Povd)
    RadioButton penta3Povd;
    @BindView(R.id.penta3Pove)
    RadioButton penta3Pove;
    @BindView(R.id.penta3Povf)
    RadioButton penta3Povf;
    @BindView(R.id.penta3Povg)
    RadioButton penta3Povg;
    @BindView(R.id.penta3Povh)
    RadioButton penta3Povh;
    @BindView(R.id.fldGrppcv3M)
    LinearLayout fldGrppcv3M;
    @BindView(R.id.pcv3M)
    RadioGroup pcv3M;
    @BindView(R.id.pcv3M01)
    RadioButton pcv3M01;
    @BindView(R.id.pcv3M02)
    RadioButton pcv3M02;
    @BindView(R.id.fldGrppcv3C)
    LinearLayout fldGrppcv3C;
    @BindView(R.id.pcv3C)
    RadioGroup pcv3C;
    @BindView(R.id.pcv3C01)
    RadioButton pcv3C01;
    @BindView(R.id.pcv3C02)
    RadioButton pcv3C02;
    @BindView(R.id.pcv3Date)
    DatePickerInputEditText pcv3Date;
    @BindView(R.id.pcv3Pov)
    RadioGroup pcv3Pov;
    @BindView(R.id.pcv3Pova)
    RadioButton pcv3Pova;
    @BindView(R.id.pcv3Povb)
    RadioButton pcv3Povb;
    @BindView(R.id.pcv3Povc)
    RadioButton pcv3Povc;
    @BindView(R.id.pcv3Povd)
    RadioButton pcv3Povd;
    @BindView(R.id.pcv3Pove)
    RadioButton pcv3Pove;
    @BindView(R.id.pcv3Povf)
    RadioButton pcv3Povf;
    @BindView(R.id.pcv3Povg)
    RadioButton pcv3Povg;
    @BindView(R.id.pcv3Povh)
    RadioButton pcv3Povh;
    @BindView(R.id.fldGrpipvM)
    LinearLayout fldGrpipvM;
    @BindView(R.id.ipvM)
    RadioGroup ipvM;
    @BindView(R.id.ipvM01)
    RadioButton ipvM01;
    @BindView(R.id.ipvM02)
    RadioButton ipvM02;
    @BindView(R.id.fldGrpipvC)
    LinearLayout fldGrpipvC;
    @BindView(R.id.ipvC)
    RadioGroup ipvC;
    @BindView(R.id.ipvC01)
    RadioButton ipvC01;
    @BindView(R.id.ipvC02)
    RadioButton ipvC02;
    @BindView(R.id.ipvDate)
    DatePickerInputEditText ipvDate;
    @BindView(R.id.ipvPov)
    RadioGroup ipvPov;
    @BindView(R.id.ipvPova)
    RadioButton ipvPova;
    @BindView(R.id.ipvPovb)
    RadioButton ipvPovb;
    @BindView(R.id.ipvPovc)
    RadioButton ipvPovc;
    @BindView(R.id.ipvPovd)
    RadioButton ipvPovd;
    @BindView(R.id.ipvPove)
    RadioButton ipvPove;
    @BindView(R.id.ipvPovf)
    RadioButton ipvPovf;
    @BindView(R.id.ipvPovg)
    RadioButton ipvPovg;
    @BindView(R.id.ipvPovh)
    RadioButton ipvPovh;
    @BindView(R.id.fldGrpMeasles1M)
    LinearLayout fldGrpMeasles1M;
    @BindView(R.id.measles1M)
    RadioGroup measles1M;
    @BindView(R.id.measles1M01)
    RadioButton measles1M01;
    @BindView(R.id.measles1M02)
    RadioButton measles1M02;
    @BindView(R.id.fldGrpmeasles1C)
    LinearLayout fldGrpmeasles1C;
    @BindView(R.id.measles1C)
    RadioGroup measles1C;
    @BindView(R.id.measles1C01)
    RadioButton measles1C01;
    @BindView(R.id.measles1C02)
    RadioButton measles1C02;
    @BindView(R.id.measles1Date)
    DatePickerInputEditText measles1Date;
    @BindView(R.id.measles1Pov)
    RadioGroup measles1Pov;
    @BindView(R.id.measles1Pova)
    RadioButton measles1Pova;
    @BindView(R.id.measles1Povb)
    RadioButton measles1Povb;
    @BindView(R.id.measles1Povc)
    RadioButton measles1Povc;
    @BindView(R.id.measles1Povd)
    RadioButton measles1Povd;
    @BindView(R.id.measles1Pove)
    RadioButton measles1Pove;
    @BindView(R.id.measles1Povf)
    RadioButton measles1Povf;
    @BindView(R.id.measles1Povg)
    RadioButton measles1Povg;
    @BindView(R.id.measles1Povh)
    RadioButton measles1Povh;
    @BindView(R.id.fldGrpMeasles2M)
    LinearLayout fldGrpMeasles2M;
    @BindView(R.id.measles2M)
    RadioGroup measles2M;
    @BindView(R.id.measles2M01)
    RadioButton measles2M01;
    @BindView(R.id.measles2M02)
    RadioButton measles2M02;
    @BindView(R.id.measles2Pov)
    RadioGroup measles2Pov;
    @BindView(R.id.measles2Pova)
    RadioButton measles2Pova;
    @BindView(R.id.measles2Povb)
    RadioButton measles2Povb;
    @BindView(R.id.measles2Povc)
    RadioButton measles2Povc;
    @BindView(R.id.measles2Povd)
    RadioButton measles2Povd;
    @BindView(R.id.measles2Pove)
    RadioButton measles2Pove;
    @BindView(R.id.measles2Povf)
    RadioButton measles2Povf;
    @BindView(R.id.measles2Povg)
    RadioButton measles2Povg;
    @BindView(R.id.measles2Povh)
    RadioButton measles2Povh;
    @BindView(R.id.fldGrpmeasles2C)
    LinearLayout fldGrpmeasles2C;
    @BindView(R.id.measles2C)
    RadioGroup measles2C;
    @BindView(R.id.measles2C01)
    RadioButton measles2C01;
    @BindView(R.id.measles2C02)
    RadioButton measles2C02;
    @BindView(R.id.measles2Date)
    DatePickerInputEditText measles2Date;
    @BindView(R.id.ti04)
    RadioGroup ti04;
    @BindView(R.id.ti04a)
    RadioButton ti04a;
    @BindView(R.id.ti04b)
    RadioButton ti04b;
    @BindView(R.id.ti04888)
    RadioButton ti04888;
    @BindView(R.id.ti05)
    EditText ti05;
    @BindView(R.id.ti05888)
    CheckBox ti05888;

    @BindViews({R.id.bcgDate, R.id.opv0Date, R.id.opv1Date, R.id.penta1Date, R.id.pcv1Date, R.id.opv2Date, R.id.pcv2Date,
            R.id.opv3Date, R.id.penta3Date, R.id.pcv3Date, R.id.ipvDate, R.id.measles1Date, R.id.measles2Date})
    List<DatePickerInputEditText> dates;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_i);
        ButterKnife.bind(this);

        for (DatePickerInputEditText de : dates) {
            de.setManager(getSupportFragmentManager());
        }

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        //TODO implement
    }


    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {
        //TODO implement
    }


}
