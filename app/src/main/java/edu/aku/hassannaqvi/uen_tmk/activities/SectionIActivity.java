package edu.aku.hassannaqvi.uen_tmk.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.uen_tmk.R;
import edu.aku.hassannaqvi.uen_tmk.core.DatabaseHelper;
import edu.aku.hassannaqvi.uen_tmk.core.MainApp;
import io.blackbox_vision.datetimepickeredittext.view.DatePickerInputEditText;

public class SectionIActivity extends AppCompatActivity {

    private static final String TAG = SectionIActivity.class.getSimpleName();

    @BindView(R.id.activity_section_a)
    ScrollView activitySectionA;
    @BindView(R.id.ti01)
    RadioGroup ti01;
    @BindView(R.id.ti01a)
    RadioButton ti01a;
    @BindView(R.id.ti01b)
    RadioButton ti01b;
    @BindView(R.id.ti01888)
    RadioButton ti01888;
    @BindView(R.id.ti02a)
    CheckBox ti02a;
    @BindView(R.id.ti02b)
    CheckBox ti02b;
    @BindView(R.id.ti02c)
    CheckBox ti02c;
    @BindView(R.id.ti02d)
    CheckBox ti02d;
    @BindView(R.id.ti0288)
    CheckBox ti0288;
    @BindView(R.id.ti0288x)
    EditText ti0288x;
    @BindView(R.id.ti03)
    RadioGroup ti03;
    @BindView(R.id.ti03a)
    RadioButton ti03a;
    @BindView(R.id.ti03b)
    RadioButton ti03b;
    @BindView(R.id.tic03c)
    RadioButton ti03c;
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
    @BindView(R.id.fldGrpti02)
    LinearLayout fldGrpti02;
    @BindView(R.id.fldGrpti05)
    LinearLayout fldGrpti05;
    @BindView(R.id.fldGrpti03)
    LinearLayout fldGrpti03;

    @BindViews({R.id.bcgDate, R.id.opv0Date, R.id.opv1Date, R.id.penta1Date, R.id.pcv1Date, R.id.opv2Date, R.id.penta2Date
            , R.id.pcv2Date, R.id.opv3Date, R.id.penta3Date, R.id.pcv3Date, R.id.ipvDate, R.id.measles1Date, R.id.measles2Date})
    List<DatePickerInputEditText> dates;

    @BindViews({R.id.fldGrpBcgC, R.id.fldGrpopv0C, R.id.fldGrpPenta1C, R.id.fldGrppcv1C, R.id.fldGrpopv1C, R.id.fldGrppenta2C,
            R.id.fldGrppcv2C, R.id.fldGrpopv2C, R.id.fldGrpenta3C, R.id.fldGrppcv3C, R.id.fldGrpopv3C, R.id.fldGrpipvC,
            R.id.fldGrpmeasles1C, R.id.fldGrpmeasles2C})
    List<LinearLayout> fldGrpCard;


    @BindViews({R.id.fldGrpBcgM, R.id.fldGrpOpv0M, R.id.fldGrpPenta1M, R.id.fldGrppcv1M, R.id.fldGrpopv1M, R.id.fldGrppenta2M,
            R.id.fldGrppcv2M, R.id.fldGrpopv2M, R.id.fldGrpPenta3M, R.id.fldGrppcv3M, R.id.fldGrpopv3M, R.id.fldGrpipvM,
            R.id.fldGrpMeasles1M, R.id.fldGrpMeasles2M})
    List<LinearLayout> fldGrpMother;

    @BindViews({R.id.bcgC, R.id.opv0C, R.id.penta1C, R.id.pcv1C, R.id.opv1C, R.id.penta2C, R.id.pcv2C, R.id.opv2C, R.id.penta3C,
            R.id.pcv3C, R.id.opv3C, R.id.ipvC, R.id.measles1C, R.id.measles2C})
    List<RadioGroup> rdoCard;

    @BindViews({R.id.bcgC, R.id.bcgM, R.id.opv0C, R.id.opv0M, R.id.penta1C, R.id.penta1M, R.id.pcv1C, R.id.pcv1M,
            R.id.opv1C, R.id.opv1M, R.id.penta2C, R.id.pcv2C, R.id.pcv2M, R.id.opv2C, R.id.opv2M, R.id.penta3C, R.id.penta3M,
            R.id.pcv3C, R.id.pcv3M, R.id.opv3C, R.id.opv3M, R.id.ipvC, R.id.ipvM, R.id.measles1C, R.id.measles1M,
            R.id.measles2C, R.id.measles2M})
    List<RadioGroup> rdoAll;

    @BindViews({R.id.bcgPov, R.id.opv0Pov, R.id.penta1Pov, R.id.pcv1Pov, R.id.opv1Pov, R.id.penta2Pov, R.id.pcv2Pov, R.id.opv2Pov,
            R.id.penta3Pov, R.id.pcv3Pov, R.id.opv3Pov, R.id.ipvPov, R.id.measles1Pov, R.id.measles2Pov})
    List<RadioGroup> placeofVacc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_i);
        ButterKnife.bind(this);

        for (DatePickerInputEditText de : dates) {
            de.setManager(getSupportFragmentManager());
        }

        ti03.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (ti03a.isChecked()) {
                    for (DatePickerInputEditText de : dates) {
                        de.setVisibility(View.VISIBLE);
                    }
                    for (LinearLayout le : fldGrpCard) {
                        le.setVisibility(View.VISIBLE);
                    }
                    for (LinearLayout le : fldGrpMother) {
                        le.setVisibility(View.VISIBLE);
                    }
                } else {

                    for (LinearLayout le : fldGrpCard) {
                        le.setVisibility(View.GONE);
                        for (RadioGroup re : rdoCard) {
                            re.clearCheck();
                        }

                        for (DatePickerInputEditText de : dates) {
                            de.setVisibility(View.GONE);
                            de.setText(null);
                        }
                    }
                    for (LinearLayout le : fldGrpMother) {
                        le.setVisibility(View.VISIBLE);
                    }

                }
            }
        });


        ti01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (ti01a.isChecked()) {
                    fldGrpti02.setVisibility(View.GONE);
                    ti02a.setChecked(false);
                    ti02b.setChecked(false);
                    ti02c.setChecked(false);
                    ti02d.setChecked(false);
                    ti0288.setChecked(false);
                    ti0288x.setText(null);
                    fldGrpti03.setVisibility(View.VISIBLE);
                } else {
                    fldGrpti03.setVisibility(View.GONE);
                    for (RadioGroup re : rdoAll) {
                        re.clearCheck();
                    }
                    for (DatePickerInputEditText de : dates) {
                        de.setText(null);
                    }

                    for (RadioGroup re : placeofVacc) {
                        re.clearCheck();
                    }
                    fldGrpti02.setVisibility(View.VISIBLE);

                }
            }
        });

        ti0288.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    ti0288x.setVisibility(View.VISIBLE);
                    ti0288x.requestFocus();
                } else {
                    ti0288x.setVisibility(View.GONE);
                    ti0288x.setText(null);
                }
            }
        });

        ti05888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    ti05.setVisibility(View.GONE);
                    ti05.setText(null);
                } else {
                    ti05.setVisibility(View.VISIBLE);
                    ti05.requestFocus();
                }
            }
        });

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

                if (MainApp.TotalChildCount > 0) {
                    Intent secNext = new Intent(this, SectionJActivity.class);
                    startActivity(secNext);
                } else {
                    Intent secNext = new Intent(this, SectionKActivity.class);
                    startActivity(secNext);
                }

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    private boolean UpdateDB() {

        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateSI();

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

        JSONObject sI = new JSONObject();

        sI.put("ti01", ti01a.isChecked() ? "1" : ti01b.isChecked() ? "2" : ti01888.isChecked() ? "888" : "0");
        sI.put("ti02a", ti02a.isChecked() ? "1" : "0");
        sI.put("ti02b", ti02b.isChecked() ? "2" : "0");
        sI.put("ti02c", ti02c.isChecked() ? "3" : "0");
        sI.put("ti02d", ti02d.isChecked() ? "4" : "0");
        sI.put("ti0288", ti0288.isChecked() ? "88" : "0");
        sI.put("ti0288x", ti0288x.getText().toString());
        sI.put("ti03", ti03a.isChecked() ? "1" : ti03b.isChecked() ? "2" : ti03c.isChecked() ? "3" : "0");

        sI.put("bcgM", bcgM01.isChecked() ? "1" : bcgM02.isChecked() ? "2" : "0");
        sI.put("bcgC", bcgC01.isChecked() ? "1" : bcgC02.isChecked() ? "2" : "0");
        sI.put("bcgDate", bcgDate.getText().toString());
        sI.put("bcgPov", bcgPova.isChecked() ? "1" : bcgPovb.isChecked() ? "2" : bcgPovc.isChecked() ? "3"
                : bcgPovd.isChecked() ? "4" : bcgPove.isChecked() ? "5" : bcgPovf.isChecked() ? "6" : bcgPovg.isChecked() ? "7"
                : bcgPovh.isChecked() ? "8" : "0");
        // BCG At Birth
        sI.put("opv0M", opv0M01.isChecked() ? "1" : opv0M02.isChecked() ? "2" : "0");
        sI.put("opv0C", opv0C01.isChecked() ? "1" : opv0C02.isChecked() ? "2" : "0");
        sI.put("opv0Date", opv0Date.getText().toString());
        sI.put("opv0Pov", opv0Pova.isChecked() ? "1" : opv0Povb.isChecked() ? "2" : opv0Povc.isChecked() ? "3"
                : opv0Povd.isChecked() ? "4" : opv0Pove.isChecked() ? "5" : opv0Povf.isChecked() ? "6" : opv0Povg.isChecked() ? "7"
                : opv0Povh.isChecked() ? "8" : "0");
        //Polio At Birth
        sI.put("penta1M", penta1M01.isChecked() ? "1" : penta1M02.isChecked() ? "2" : "0");
        sI.put("penta1C", penta1C01.isChecked() ? "1" : penta1C02.isChecked() ? "2" : "0");
        sI.put("penta1Date", penta1Date.getText().toString());
        sI.put("penta1Pov", penta1Pova.isChecked() ? "1" : penta1Povb.isChecked() ? "2" : penta1Povc.isChecked() ? "3"
                : penta1Povd.isChecked() ? "4" : penta1Pove.isChecked() ? "5" : penta1Povf.isChecked() ? "6" : penta1Povg.isChecked() ? "7"
                : penta1Povh.isChecked() ? "8" : "0");
        // Penta 1 at 6 weeks
        sI.put("pcv1M", pcv1M01.isChecked() ? "1" : pcv1M02.isChecked() ? "2" : "0");
        sI.put("pcv1C", pcv1C01.isChecked() ? "1" : pcv1C02.isChecked() ? "2" : "0");
        sI.put("pcv1Date", pcv1Date.getText().toString());
        sI.put("pcv1Pov", pcv1Pova.isChecked() ? "1" : pcv1Povb.isChecked() ? "2" : pcv1Povc.isChecked() ? "3"
                : pcv1Povd.isChecked() ? "4" : pcv1Pove.isChecked() ? "5" : pcv1Povf.isChecked() ? "6" : pcv1Povg.isChecked() ? "7"
                : pcv1Povh.isChecked() ? "8" : "0");
        //PCV 1 at 6 weeks
        sI.put("opv1M", opv1M01.isChecked() ? "1" : opv1M02.isChecked() ? "2" : "0");
        sI.put("opv1C", opv1C01.isChecked() ? "1" : opv1C02.isChecked() ? "2" : "0");

        sI.put("opv1Date", opv1Date.getText().toString());
        sI.put("opv1Pov", opv1Pova.isChecked() ? "1" : opv1Povb.isChecked() ? "2" : opv1Povc.isChecked() ? "3"
                : opv1Povd.isChecked() ? "4" : opv1Pove.isChecked() ? "5" : opv1Povf.isChecked() ? "6" : opv1Povg.isChecked() ? "7"
                : opv1Povh.isChecked() ? "8" : "0");
        // OPV 1 at 6 weeks
        sI.put("penta2M", penta2M01.isChecked() ? "1" : penta2M02.isChecked() ? "2" : "0");
        sI.put("penta2C", penta2C01.isChecked() ? "1" : penta2C02.isChecked() ? "2" : "0");

        sI.put("penta2Date", penta2Date.getText().toString());
        sI.put("penta2Pov", penta2Pova.isChecked() ? "1" : penta2Povb.isChecked() ? "2" : penta2Povc.isChecked() ? "3"
                : penta2Povd.isChecked() ? "4" : penta2Pove.isChecked() ? "5" : penta2Povf.isChecked() ? "6" : penta2Povg.isChecked() ? "7"
                : penta2Povh.isChecked() ? "8" : "0");
        // Penta 2 at 10 weeks
        sI.put("pcv2M", pcv2M01.isChecked() ? "1" : pcv2M02.isChecked() ? "2" : "0");
        sI.put("pcv2C", pcv2C01.isChecked() ? "1" : pcv2C02.isChecked() ? "2" : "0");
        sI.put("pcv2Date", pcv2Date.getText().toString());
        sI.put("pcv2Pov", pcv2Pova.isChecked() ? "1" : pcv2Povb.isChecked() ? "2" : pcv2Povc.isChecked() ? "3"
                : pcv2Povd.isChecked() ? "4" : pcv2Pove.isChecked() ? "5" : pcv2Povf.isChecked() ? "6" : pcv2Povg.isChecked() ? "7"
                : pcv2Povh.isChecked() ? "8" : "0");

        sI.put("opv2M", opv2M01.isChecked() ? "1" : opv2M02.isChecked() ? "2" : "0");
        sI.put("opv2C", opv2C01.isChecked() ? "1" : opv2C02.isChecked() ? "2" : "0");

        sI.put("opv2Date", opv2Date.getText().toString());
        sI.put("opv2Pov", opv2Pova.isChecked() ? "1" : opv2Povb.isChecked() ? "2" : opv2Povc.isChecked() ? "3"
                : opv2Povd.isChecked() ? "4" : opv2Pove.isChecked() ? "5" : opv2Povf.isChecked() ? "6" : opv2Povg.isChecked() ? "7"
                : opv2Povh.isChecked() ? "8" : "0");

        // PCV 2 at 6 weeks
        sI.put("penta3M", penta3M01.isChecked() ? "1" : penta3M02.isChecked() ? "2" : "0");
        sI.put("penta3C", penta3C01.isChecked() ? "1" : penta3C02.isChecked() ? "2" : "0");

        sI.put("penta3Date", penta3Date.getText().toString());
        sI.put("penta3Pov", penta3Pova.isChecked() ? "1" : penta3Povb.isChecked() ? "2" : penta3Povc.isChecked() ? "3"
                : penta3Povd.isChecked() ? "4" : penta3Pove.isChecked() ? "5" : penta3Povf.isChecked() ? "6" : penta3Povg.isChecked() ? "7"
                : penta3Povh.isChecked() ? "8" : "0");
        // OPV 2 at 6 weeks
        sI.put("pcv3M", pcv3M01.isChecked() ? "1" : pcv3M02.isChecked() ? "2" : "0");
        sI.put("pcv3C", pcv3C01.isChecked() ? "1" : pcv3C02.isChecked() ? "2" : "0");

        sI.put("pcv3Date", pcv3Date.getText().toString());
        sI.put("pcv3Pov", pcv3Pova.isChecked() ? "1" : pcv3Povb.isChecked() ? "2" : pcv3Povc.isChecked() ? "3"
                : pcv3Povd.isChecked() ? "4" : pcv3Pove.isChecked() ? "5" : pcv3Povf.isChecked() ? "6" : pcv3Povg.isChecked() ? "7"
                : pcv3Povh.isChecked() ? "8" : "0");

        // Penta 3 at 14 weeks
        sI.put("opv3M", opv3M01.isChecked() ? "1" : opv3M02.isChecked() ? "2" : "0");
        sI.put("opv3C", opv3C01.isChecked() ? "1" : opv3C02.isChecked() ? "2" : "0");

        sI.put("opv3Date", opv3Date.getText().toString());
        sI.put("opv3Pov", opv3Pova.isChecked() ? "1" : opv3Povb.isChecked() ? "2" : opv3Povc.isChecked() ? "3"
                : opv3Povd.isChecked() ? "4" : opv3Pove.isChecked() ? "5" : opv3Povf.isChecked() ? "6" : opv3Povg.isChecked() ? "7"
                : opv3Povh.isChecked() ? "8" : "0");

        // PCV 3 at 14 weeks
        sI.put("ipvM", ipvM01.isChecked() ? "1" : ipvM02.isChecked() ? "2" : "0");
        sI.put("ipvC", ipvC01.isChecked() ? "1" : ipvC02.isChecked() ? "2" : "0");

        sI.put("ipvDate", ipvDate.getText().toString());
        sI.put("ipvPov", ipvPova.isChecked() ? "1" : ipvPovb.isChecked() ? "2" : ipvPovc.isChecked() ? "3"
                : ipvPovd.isChecked() ? "4" : ipvPove.isChecked() ? "5" : ipvPovf.isChecked() ? "6" : ipvPovg.isChecked() ? "7"
                : ipvPovh.isChecked() ? "8" : "0");
        // OPV 3 at 14 weeks
        sI.put("measles1M", measles1M01.isChecked() ? "1" : measles1M02.isChecked() ? "2" : "0");
        sI.put("measles1C", measles1C01.isChecked() ? "1" : measles1C02.isChecked() ? "2" : "0");

        sI.put("measles1Date", measles1Date.getText().toString());
        sI.put("measles1Pov", measles1Pova.isChecked() ? "1" : measles1Povb.isChecked() ? "2" : measles1Povc.isChecked() ? "3"
                : measles1Povd.isChecked() ? "4" : measles1Pove.isChecked() ? "5" : measles1Povf.isChecked() ? "6" : measles1Povg.isChecked() ? "7"
                : measles1Povh.isChecked() ? "8" : "0");
        // IPV at 14 weeks
        sI.put("measles2M", measles2M01.isChecked() ? "1" : measles2M02.isChecked() ? "2" : "0");
        sI.put("measles2C", measles2C01.isChecked() ? "1" : measles2C02.isChecked() ? "2" : "0");

        sI.put("measles2Date", measles2Date.getText().toString());
        sI.put("measles2Pov", measles2Pova.isChecked() ? "1" : measles2Povb.isChecked() ? "2" : measles2Povc.isChecked() ? "3"
                : measles2Povd.isChecked() ? "4" : measles2Pove.isChecked() ? "5" : measles2Povf.isChecked() ? "6"
                : measles2Povg.isChecked() ? "7" : measles2Povh.isChecked() ? "8" : "0");

        sI.put("ti04", ti04a.isChecked() ? "1" : ti04b.isChecked() ? "2" : ti04888.isChecked() ? "888" : "0");
        sI.put("ti05", ti05.getText().toString());
        sI.put("ti05888", ti05888.isChecked() ? "888" : "0");


        MainApp.fc.setsI(String.valueOf(sI));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    public boolean ValidateForm() {

        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        if (ti01.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.ti01), Toast.LENGTH_SHORT).show();
            ti01888.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "ti01: This data is Required!");
            return false;
        } else {
            ti01888.setError(null);
        }

        if (ti01a.isChecked()) {
            if (ti03.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.ti03), Toast.LENGTH_SHORT).show();
                ti03c.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "ti03: This data is Required!");
                return false;
            } else {
                ti03c.setError(null);
            }

            if (ti03a.isChecked()) {
                //============ BCG / Card Present ==========
                if (bcgC.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.bcg), Toast.LENGTH_SHORT).show();
                    bcgC02.setError("This data is Required!");
                    Log.i(TAG, "bcgC: This data is Required!");
                    return false;
                } else {
                    bcgC02.setError(null);
                }


                if (bcgDate.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.date), Toast.LENGTH_SHORT).show();
                    bcgDate.setError("This data is Required!");
                    Log.i(TAG, "bcgDate: This data is Required!");
                    return false;
                } else {
                    bcgDate.setError(null);
                }

                //============ Polio 0 / Card Present ==========
                if (opv0C.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv0), Toast.LENGTH_SHORT).show();
                    opv0C02.setError("This data is Required!");
                    Log.i(TAG, "opv0C: This data is Required!");
                    return false;
                } else {
                    opv0C02.setError(null);
                }

                if (opv0Date.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.date), Toast.LENGTH_SHORT).show();
                    opv0Date.setError("This data is Required!");
                    Log.i(TAG, "opv0Date: This data is Required!");
                    return false;
                } else {
                    opv0Date.setError(null);
                }

                //============ OPV 1 / Card Present ==========
                if (opv1C.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv1), Toast.LENGTH_SHORT).show();
                    opv1C02.setError("This data is Required!");
                    Log.i(TAG, "opv1C: This data is Required!");
                    return false;
                } else {
                    opv1C02.setError(null);
                }

                if (opv1Date.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.date), Toast.LENGTH_SHORT).show();
                    opv1Date.setError("This data is Required!");
                    Log.i(TAG, "opv1Date: This data is Required!");
                    return false;
                } else {
                    opv1Date.setError(null);
                }


                //============ Penta 1 / Card Present ==========
                if (penta1C.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.penta1), Toast.LENGTH_SHORT).show();
                    penta1C02.setError("This data is Required!");
                    Log.i(TAG, "penta1C: This data is Required!");
                    return false;
                } else {
                    penta1C02.setError(null);
                }

                if (penta1Date.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.date), Toast.LENGTH_SHORT).show();
                    penta1Date.setError("This data is Required!");
                    Log.i(TAG, "penta1Date: This data is Required!");
                    return false;
                } else {
                    penta1Date.setError(null);
                }


                //============ PCV 1 / Card Present ==========
                if (pcv1C.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.pcv1), Toast.LENGTH_SHORT).show();
                    pcv1C02.setError("This data is Required!");
                    Log.i(TAG, "pcv1C: This data is Required!");
                    return false;
                } else {
                    pcv1C02.setError(null);
                }

                if (pcv1Date.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.date), Toast.LENGTH_SHORT).show();
                    pcv1Date.setError("This data is Required!");
                    Log.i(TAG, "pcv1Date: This data is Required!");
                    return false;
                } else {
                    pcv1Date.setError(null);
                }

                //============ OPV 2 / Card Present ==========
                if (opv2C.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv2), Toast.LENGTH_SHORT).show();
                    opv2C02.setError("This data is Required!");
                    Log.i(TAG, "opv2C: This data is Required!");
                    return false;
                } else {
                    opv2C02.setError(null);
                }

                if (opv2Date.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.date), Toast.LENGTH_SHORT).show();
                    opv2Date.setError("This data is Required!");
                    Log.i(TAG, "opv2Date: This data is Required!");
                    return false;
                } else {
                    opv2Date.setError(null);
                }


                //============ Penta 2 / Card Present ==========
                if (penta2C.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.penta2), Toast.LENGTH_SHORT).show();
                    penta2C02.setError("This data is Required!");
                    Log.i(TAG, "penta2C: This data is Required!");
                    return false;
                } else {
                    penta2C02.setError(null);
                }


                if (penta2Date.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.date), Toast.LENGTH_SHORT).show();
                    penta2Date.setError("This data is Required!");
                    Log.i(TAG, "penta2Date: This data is Required!");
                    return false;
                } else {
                    penta2Date.setError(null);
                }
                //============ PCV 2 / Card Present ==========
                if (pcv2C.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.pcv2), Toast.LENGTH_SHORT).show();
                    pcv2C02.setError("This data is Required!");
                    Log.i(TAG, "pcv2C: This data is Required!");
                    return false;
                } else {
                    pcv2C02.setError(null);
                }

                if (pcv2Date.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.date), Toast.LENGTH_SHORT).show();
                    pcv2Date.setError("This data is Required!");
                    Log.i(TAG, "pcv2Date: This data is Required!");
                    return false;
                } else {
                    pcv2Date.setError(null);
                }

                //============ OPV 3 / Card Present ==========
                if (opv3C.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv3), Toast.LENGTH_SHORT).show();
                    opv3C02.setError("This data is Required!");
                    Log.i(TAG, "opv3C: This data is Required!");
                    return false;
                } else {
                    opv3C02.setError(null);
                }

                if (opv3Date.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.date), Toast.LENGTH_SHORT).show();
                    opv3Date.setError("This data is Required!");
                    Log.i(TAG, "opv3Date: This data is Required!");
                    return false;
                } else {
                    opv3Date.setError(null);
                }
                //============ Penta 3 / Card Present ==========
                if (penta3C.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.penta3), Toast.LENGTH_SHORT).show();
                    penta3C02.setError("This data is Required!");
                    Log.i(TAG, "penta3C: This data is Required!");
                    return false;
                } else {
                    penta3C02.setError(null);
                }

                if (penta3Date.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.date), Toast.LENGTH_SHORT).show();
                    penta3Date.setError("This data is Required!");
                    Log.i(TAG, "penta3Date: This data is Required!");
                    return false;
                } else {
                    penta3Date.setError(null);
                }

                //============ PCV 3 / Card Present ==========
                if (pcv3C.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.pcv3), Toast.LENGTH_SHORT).show();
                    pcv3C02.setError("This data is Required!");
                    Log.i(TAG, "pcv3C: This data is Required!");
                    return false;
                } else {
                    pcv3C02.setError(null);
                }

                if (pcv3Date.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.date), Toast.LENGTH_SHORT).show();
                    pcv3Date.setError("This data is Required!");
                    Log.i(TAG, "pcv3Date: This data is Required!");
                    return false;
                } else {
                    pcv3Date.setError(null);
                }


                //============ IPV / Card Present ==========
                if (ipvC.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.ipv), Toast.LENGTH_SHORT).show();
                    ipvC02.setError("This data is Required!");
                    Log.i(TAG, "ipvC: This data is Required!");
                    return false;
                } else {
                    ipvC02.setError(null);
                }


                if (ipvDate.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.date), Toast.LENGTH_SHORT).show();
                    ipvDate.setError("This data is Required!");
                    Log.i(TAG, "ipvDate: This data is Required!");
                    return false;
                } else {
                    ipvDate.setError(null);
                }
                //============ measles1 / Card Present ==========
                if (measles1C.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.measles1), Toast.LENGTH_SHORT).show();
                    measles1C02.setError("This data is Required!");
                    Log.i(TAG, "measles1C: This data is Required!");
                    return false;
                } else {
                    measles1C02.setError(null);
                }

                if (measles1Date.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.date), Toast.LENGTH_SHORT).show();
                    measles1Date.setError("This data is Required!");
                    Log.i(TAG, "measles1Date: This data is Required!");
                    return false;
                } else {
                    measles1Date.setError(null);
                }

                //============ measles2 / Card Present ==========
                if (measles2C.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.measles2), Toast.LENGTH_SHORT).show();
                    measles2C02.setError("This data is Required!");
                    Log.i(TAG, "measles2C: This data is Required!");
                    return false;
                } else {
                    measles2C02.setError(null);
                }

                if (measles2Date.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.date), Toast.LENGTH_SHORT).show();
                    measles2Date.setError("This data is Required!");
                    Log.i(TAG, "measles2Date: This data is Required!");
                    return false;
                } else {
                    measles2Date.setError(null);
                }

            }

            //============ BCG / Mother ==========
            if (bcgM.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bcg), Toast.LENGTH_SHORT).show();
                bcgM02.setError("This data is Required!");
                Log.i(TAG, "bcgM: This data is Required!");
                return false;
            } else {
                bcgM02.setError(null);
            }

            if (bcgPov.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.place), Toast.LENGTH_SHORT).show();
                bcgPova.setError("This data is Required!");
                Log.i(TAG, "bcgPov: This data is Required!");
                return false;
            } else {
                bcgPova.setError(null);
            }


            //============ Polio 0 / Mother ==========
            if (opv0M.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv0), Toast.LENGTH_SHORT).show();
                opv0M02.setError("This data is Required!");
                Log.i(TAG, "opv0M: This data is Required!");
                return false;
            } else {
                opv0M02.setError(null);
            }

            if (opv0Pov.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.place), Toast.LENGTH_SHORT).show();
                opv0Pova.setError("This data is Required!");
                Log.i(TAG, "opv0Pov: This data is Required!");
                return false;
            } else {
                opv0Pova.setError(null);
            }

            //============ OPV 1 / Mother ==========
            if (opv1M.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv1), Toast.LENGTH_SHORT).show();
                opv1M02.setError("This data is Required!");
                Log.i(TAG, "opv1M: This data is Required!");
                return false;
            } else {
                opv1M02.setError(null);
            }

            if (opv1Pov.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.place), Toast.LENGTH_SHORT).show();
                opv1Pova.setError("This data is Required!");
                Log.i(TAG, "opv1Pov: This data is Required!");
                return false;
            } else {
                opv1Pova.setError(null);
            }


            //============ Penta 1 / Mother ==========
            if (penta1M.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.penta1), Toast.LENGTH_SHORT).show();
                penta1M02.setError("This data is Required!");
                Log.i(TAG, "penta1M: This data is Required!");
                return false;
            } else {
                penta1M02.setError(null);
            }

            if (penta1Pov.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.place), Toast.LENGTH_SHORT).show();
                penta1Pova.setError("This data is Required!");
                Log.i(TAG, "penta1Pov: This data is Required!");
                return false;
            } else {
                penta1Pova.setError(null);
            }

            //============ PCV 1 / Mother ==========
            if (pcv1M.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.pcv1), Toast.LENGTH_SHORT).show();
                pcv1M02.setError("This data is Required!");
                Log.i(TAG, "pcv1M: This data is Required!");
                return false;
            } else {
                pcv1M02.setError(null);
            }


            if (pcv1Pov.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.place), Toast.LENGTH_SHORT).show();
                pcv1Pova.setError("This data is Required!");
                Log.i(TAG, "pcv1Pov: This data is Required!");
                return false;
            } else {
                pcv1Pova.setError(null);
            }

            //============ OPV 2 / Mother ==========
            if (opv2M.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv2), Toast.LENGTH_SHORT).show();
                opv2M02.setError("This data is Required!");
                Log.i(TAG, "opv2M: This data is Required!");
                return false;
            } else {
                opv2M02.setError(null);
            }

            if (opv2Pov.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.place), Toast.LENGTH_SHORT).show();
                opv2Pova.setError("This data is Required!");
                Log.i(TAG, "opv2Pov: This data is Required!");
                return false;
            } else {
                opv2Pova.setError(null);
            }

            //============ Penta 2 / Mother ==========
            if (penta2M.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.penta2), Toast.LENGTH_SHORT).show();
                penta2M02.setError("This data is Required!");
                Log.i(TAG, "penta2M: This data is Required!");
                return false;
            } else {
                penta2M02.setError(null);
            }

            if (penta2Pov.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.place), Toast.LENGTH_SHORT).show();
                penta2Pova.setError("This data is Required!");
                Log.i(TAG, "penta2Pov: This data is Required!");
                return false;
            } else {
                penta2Pova.setError(null);
            }

            //============ PCV 2 / Mother ==========
            if (pcv2M.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.pcv2), Toast.LENGTH_SHORT).show();
                pcv2M02.setError("This data is Required!");
                Log.i(TAG, "pcv2M: This data is Required!");
                return false;
            } else {
                pcv2M02.setError(null);
            }

            if (pcv2Pov.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.place), Toast.LENGTH_SHORT).show();
                pcv2Pova.setError("This data is Required!");
                Log.i(TAG, "pcv2Pov: This data is Required!");
                return false;
            } else {
                pcv2Pova.setError(null);
            }

            //============ OPV 3 / Mother ==========
            if (opv3M.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv3), Toast.LENGTH_SHORT).show();
                opv3M02.setError("This data is Required!");
                Log.i(TAG, "opv3M: This data is Required!");
                return false;
            } else {
                opv3M02.setError(null);
            }

            if (opv3Pov.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.place), Toast.LENGTH_SHORT).show();
                opv3Pova.setError("This data is Required!");
                Log.i(TAG, "opv3Pov: This data is Required!");
                return false;
            } else {
                opv3Pova.setError(null);
            }


            //============ Penta 3 / Mother ==========
            if (penta3M.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.penta3), Toast.LENGTH_SHORT).show();
                penta3M02.setError("This data is Required!");
                Log.i(TAG, "penta3M: This data is Required!");
                return false;
            } else {
                penta3M02.setError(null);
            }

            if (penta3Pov.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.place), Toast.LENGTH_SHORT).show();
                penta3Pova.setError("This data is Required!");
                Log.i(TAG, "penta3Pov: This data is Required!");
                return false;
            } else {
                penta3Pova.setError(null);
            }

            //============ PCV / Mother ==========
            if (pcv3M.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.pcv3), Toast.LENGTH_SHORT).show();
                pcv3M02.setError("This data is Required!");
                Log.i(TAG, "pcv3M: This data is Required!");
                return false;
            } else {
                pcv3M02.setError(null);
            }

            if (pcv3Pov.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.place), Toast.LENGTH_SHORT).show();
                pcv3Pova.setError("This data is Required!");
                Log.i(TAG, "pcv3Pov: This data is Required!");
                return false;
            } else {
                pcv3Pova.setError(null);
            }


            //============ IPV / Mother ==========
            if (ipvM.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.ipv), Toast.LENGTH_SHORT).show();
                ipvM02.setError("This data is Required!");
                Log.i(TAG, "ipvM: This data is Required!");
                return false;
            } else {
                ipvM02.setError(null);
            }

            if (ipvPov.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.place), Toast.LENGTH_SHORT).show();
                ipvPova.setError("This data is Required!");
                Log.i(TAG, "ipvPov: This data is Required!");
                return false;
            } else {
                ipvPova.setError(null);
            }

            //============ measles1 / Mother ==========
            if (measles1M.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.measles1), Toast.LENGTH_SHORT).show();
                measles1M02.setError("This data is Required!");
                Log.i(TAG, "measles1M: This data is Required!");
                return false;
            } else {
                measles1M02.setError(null);
            }

            if (measles1Pov.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.place), Toast.LENGTH_SHORT).show();
                measles1Pova.setError("This data is Required!");
                Log.i(TAG, "measles1Pov: This data is Required!");
                return false;
            } else {
                measles1Pova.setError(null);
            }

            //============ measles2 / Mother ==========
            if (measles2M.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.measles2), Toast.LENGTH_SHORT).show();
                measles2M02.setError("This data is Required!");
                Log.i(TAG, "measles2M: This data is Required!");
                return false;
            } else {
                measles2M02.setError(null);
            }

            if (measles2Pov.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.place), Toast.LENGTH_SHORT).show();
                measles2Pova.setError("This data is Required!");
                Log.i(TAG, "measles2Pov: This data is Required!");
                return false;
            } else {
                measles2Pova.setError(null);
            }

            if (ti04.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.ti04), Toast.LENGTH_SHORT).show();
                ti04888.setError("This data is Required!");
                Log.i(TAG, "ti04: This data is Required!");
                return false;
            } else {
                ti04888.setError(null);
            }

            if (ti04a.isChecked()) {

                if (!ti05888.isChecked()) {
                    if (ti05.getText().toString().isEmpty()) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.ti05), Toast.LENGTH_SHORT).show();
                        ti05.setError("This data is Required!");
                        Log.i(TAG, "ti05: This data is Required!");
                        return false;
                    } else {
                        ti05.setError(null);
                    }

                    if (Integer.valueOf(ti05.getText().toString()) < 1) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.ti05), Toast.LENGTH_SHORT).show();
                        ti05.setError("Zero not allowed");
                        Log.i(TAG, "ti05: Zero not allowed");
                        return false;
                    } else {
                        ti05.setError(null);
                    }

                }
            }


        } else {
            if (!(ti02a.isChecked() || ti02b.isChecked() || ti02c.isChecked() || ti02d.isChecked()
                    || ti0288.isChecked())) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.ti02), Toast.LENGTH_SHORT).show();
                ti02a.setError("This data is Required!");

                Log.i(TAG, "ti02: This data is Required!");
                return false;
            } else {
                ti02a.setError(null);
            }

            if (ti0288.isChecked() && ti0288x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.ti02) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                ti0288x.setError("This data is Required!");

                Log.i(TAG, "ti0288x: This data is Required!");
                return false;
            } else {
                ti0288x.setError(null);
            }
        }


        return true;
    }


}
