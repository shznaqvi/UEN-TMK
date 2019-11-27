package edu.aku.hassannaqvi.tmk_midline_monitor19.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.tmk_midline_monitor19.R;
import edu.aku.hassannaqvi.tmk_midline_monitor19.contracts.SectionIIMContract;
import edu.aku.hassannaqvi.tmk_midline_monitor19.core.DatabaseHelper;
import edu.aku.hassannaqvi.tmk_midline_monitor19.core.MainApp;

public class SectionIActivity extends AppCompatActivity
{

    private static final String TAG = SectionIActivity.class.getSimpleName();

    @BindView(R.id.activity_section_a)
    NestedScrollView scroll;
    @BindView(R.id.tiname)
    EditText tiname;
    @BindView(R.id.ti00)
    RadioGroup ti00;
    @BindView(R.id.ti00a)
    RadioButton ti00a;
    @BindView(R.id.ti00b)
    RadioButton ti00b;
    @BindView(R.id.ti01)
    RadioGroup ti01;
    @BindView(R.id.ti01a)
    RadioButton ti01a;
    @BindView(R.id.ti01b)
    RadioButton ti01b;
    @BindView(R.id.ti01888)
    RadioButton ti01888;
    @BindView(R.id.fldGrpti02)
    LinearLayout fldGrpti02;
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
    @BindView(R.id.fldGrpti03)
    LinearLayout fldGrpti03;
    @BindView(R.id.ti03)
    RadioGroup ti03;
    @BindView(R.id.ti03a)
    RadioButton ti03a;
    @BindView(R.id.ti03b)
    RadioButton ti03b;
    @BindView(R.id.ti03c)
    RadioButton ti03c;
    @BindView(R.id.ti04)
    RadioGroup ti04;
    @BindView(R.id.ti04a)
    RadioButton ti04a;
    @BindView(R.id.ti04b)
    RadioButton ti04b;
    @BindView(R.id.ti04888)
    RadioButton ti04888;
    @BindView(R.id.fldGrpti05)
    LinearLayout fldGrpti05;
    @BindView(R.id.ti05)
    EditText ti05;
    @BindView(R.id.ti05888)
    CheckBox ti05888;

    @BindView(R.id.tinameCount)
    TextView tinameCount;

    List<RadioGroup> grpMeasles2;
    String maxDate2Years;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_i);
        ButterKnife.bind(this);
        maxDate2Years = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTimeInMillis() - ((MainApp.MILLISECONDS_IN_2Years) + MainApp.MILLISECONDS_IN_DAY));

        tinameCount.setText("Child: " + MainApp.imsCount + " out of " + MainApp.totalImsCount);

        //        get data from sec B

/*        if (MainApp.flag) {


            MainApp.childsMap.put("....", null);
            MainApp.lstChild.add("....");

            for (byte i = 0; i < MainApp.familyMembersList.size(); i++) {
                if (MainApp.familyMembersList.get(i).getAgeLess5().equals("3")) {
                    MainApp.childsMap.put(MainApp.familyMembersList.get(i).getName(), new FamilyMembersContract(MainApp.familyMembersList.get(i)));
                    MainApp.lstChild.add(MainApp.familyMembersList.get(i).getName());

                }
            }


        }
        tiname.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, MainApp.lstChild));

        tiname.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                MainApp.positionIm = i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        String dateToday = new SimpleDateFormat("dd/MM/yyyy").format(System.currentTimeMillis());

        for (DatePickerInputEditText de : dates) {
            de.setManager(getSupportFragmentManager());
            de.setMaxDate(dateToday);


        }*/


        /*ti03.setOnCheckedChangeListener(new OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (ti03a.isChecked()) {
                    for (DatePickerInputEditText de : dates) {
                        de.setVisibility(View.VISIBLE);
                        if (MainApp.ageRdo == 1 && (!tiname.getSelectedItem().equals("...."))) {
                            de.setMinDate(MainApp.convertDateFormat(MainApp.childsMap.get(tiname.getSelectedItem()).getDob()));
                        } else if (MainApp.ageRdo == 2 && (!tiname.getSelectedItem().equals("...."))) {
                            de.setMinDate(maxDate2Years);
                        }
                    }
                    for (LinearLayout le : fldGrpCard) {
                        le.setVisibility(View.VISIBLE);
                    }
                    for (TextView te : datesText) {
                        te.setVisibility(View.VISIBLE);
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
                        for (TextView te : datesText) {
                            te.setVisibility(View.GONE);
                        }
                    }
                    for (LinearLayout le : fldGrpMother) {
                        le.setVisibility(View.VISIBLE);
                    }

                }
            }
        });*/


        ti01.setOnCheckedChangeListener(new OnCheckedChangeListener()
        {
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
                    /*for (RadioGroup re : rdoAll) {
                        re.clearCheck();
                    }
                    for (DatePickerInputEditText de : dates) {
                        de.setText(null);
                    }

                    for (RadioGroup re : placeofVacc) {
                        re.clearCheck();
                    }*/
                    fldGrpti02.setVisibility(View.VISIBLE);

                }
            }
        });

        ti0288.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
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


        ti04.setOnCheckedChangeListener(new OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                if (ti04a.isChecked()) {
                    fldGrpti05.setVisibility(View.VISIBLE);
                    ti05.requestFocus();
                } else {
                    ti05.setText(null);
                    ti05888.setChecked(false);
                    fldGrpti05.setVisibility(View.GONE);
                }
            }
        });


        ti05888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
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
/*

        //================= Individual Skip Patterns of Vaccines=============

        // BCG
        for (RadioGroup rd : grpBcg) {
            rd.setOnCheckedChangeListener(bcg);
        }

        // Opv - 0

        for (RadioGroup rd : grpOpv0) {
            rd.setOnCheckedChangeListener(opv0);
        }

        // OPV1
        for (RadioGroup rd : grpOpv1) {
            rd.setOnCheckedChangeListener(opv1);
        }

        // Penta1
        for (RadioGroup rd : grpPenta1) {
            rd.setOnCheckedChangeListener(penta1);

        }

        // PCV1
        for (RadioGroup rd : grpPcv1) {
            rd.setOnCheckedChangeListener(pcv1);
        }

        // OPV2
        for (RadioGroup rd : grpOpv2) {
            rd.setOnCheckedChangeListener(opv2);
        }

        // Penta2
        for (RadioGroup rd : grpPenta2) {
            rd.setOnCheckedChangeListener(penta2);

        }

        // PCV2
        for (RadioGroup rd : grpPcv2) {
            rd.setOnCheckedChangeListener(pcv2);
        }


        // OPV3
        for (RadioGroup rd : grpOpv3) {
            rd.setOnCheckedChangeListener(opv3);
        }

        // Penta3
        for (RadioGroup rd : grpPenta3) {
            rd.setOnCheckedChangeListener(penta3);

        }

        // PCV3
        for (RadioGroup rd : grpPcv3) {
            rd.setOnCheckedChangeListener(pcv3);
        }

        // IPV
        for (RadioGroup rd : grpIpv) {
            rd.setOnCheckedChangeListener(ipv);
        }


        // Measles 1

        for (RadioGroup rd : grpMeasles1) {
            rd.setOnCheckedChangeListener(measles1);
        }

        // Measles 2
        for (RadioGroup rd : grpMeasles2) {
            rd.setOnCheckedChangeListener(measles2);
        }

        bcgdatenr.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrpbcgMDate.setVisibility(View.GONE);
                    bcgDateMMon.setText(null);
                    bcgDateMYear.setText(null);
                } else {
                    fldGrpbcgMDate.setVisibility(View.VISIBLE);
                }
            }
        });

        bcgdatenp.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrpBcgCDate.setVisibility(View.GONE);
                    bcgDate.setText(null);
                } else {
                    fldGrpBcgCDate.setVisibility(View.VISIBLE);
                }
            }
        });

        opv0datenr.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrpopv0MDate.setVisibility(View.GONE);
                    opv0DateMMon.setText(null);
                    opv0DateMYear.setText(null);
                } else {
                    fldGrpopv0MDate.setVisibility(View.VISIBLE);
                }
            }
        });

        opv0datenp.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrpOpv0CDate.setVisibility(View.GONE);
                    opv0Date.setText(null);
                } else {
                    fldGrpOpv0CDate.setVisibility(View.VISIBLE);
                }
            }
        });

        opv1datenr.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrpopv1MDate.setVisibility(View.GONE);
                    opv1DateMMon.setText(null);
                    opv1DateMYear.setText(null);
                } else {
                    fldGrpopv1MDate.setVisibility(View.VISIBLE);
                }
            }
        });

        opv1datenp.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrpOpv1CDate.setVisibility(View.GONE);
                    opv1Date.setText(null);
                } else {
                    fldGrpOpv1CDate.setVisibility(View.VISIBLE);
                }
            }
        });

        penta1datenr.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrppenta1MDate.setVisibility(View.GONE);
                    penta1DateMMon.setText(null);
                    penta1DateMYear.setText(null);
                } else {
                    fldGrppenta1MDate.setVisibility(View.VISIBLE);
                }
            }
        });

        penta1datenp.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrpPenta1CDate.setVisibility(View.GONE);
                    penta1Date.setText(null);
                } else {
                    fldGrpPenta1CDate.setVisibility(View.VISIBLE);
                }
            }
        });


        pcv1datenr.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrppcv1MDate.setVisibility(View.GONE);
                    pcv1DateMMon.setText(null);
                    pcv1DateMYear.setText(null);
                } else {
                    fldGrppcv1MDate.setVisibility(View.VISIBLE);
                }
            }
        });

        pcv1datenp.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrpPcv1CDate.setVisibility(View.GONE);
                    pcv1Date.setText(null);
                } else {
                    fldGrpPcv1CDate.setVisibility(View.VISIBLE);
                }
            }
        });

        opv2datenr.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrpopv2MDate.setVisibility(View.GONE);
                    opv2DateMMon.setText(null);
                    opv2DateMYear.setText(null);
                } else {
                    fldGrpopv2MDate.setVisibility(View.VISIBLE);
                }
            }
        });


        opv2datenp.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrpOpv2CDate.setVisibility(View.GONE);
                    opv2Date.setText(null);
                } else {
                    fldGrpOpv2CDate.setVisibility(View.VISIBLE);
                }
            }
        });

        penta2datenr.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrppenta2MDate.setVisibility(View.GONE);
                    penta2DateMMon.setText(null);
                    penta2DateMYear.setText(null);
                } else {
                    fldGrppenta2MDate.setVisibility(View.VISIBLE);
                }
            }
        });

        penta2datenp.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrpPenta2CDate.setVisibility(View.GONE);
                    penta2Date.setText(null);
                } else {
                    fldGrpPenta2CDate.setVisibility(View.VISIBLE);
                }
            }
        });


        pcv2datenr.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrppcv2MDate.setVisibility(View.GONE);
                    pcv2DateMMon.setText(null);
                    pcv2DateMYear.setText(null);
                } else {
                    fldGrppcv2MDate.setVisibility(View.VISIBLE);
                }
            }
        });

        pcv2datenp.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrpPcv2CDate.setVisibility(View.GONE);
                    pcv2Date.setText(null);
                } else {
                    fldGrpPcv2CDate.setVisibility(View.VISIBLE);
                }
            }
        });

        opv3datenr.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrpopv3MDate.setVisibility(View.GONE);
                    opv3DateMMon.setText(null);
                    opv3DateMYear.setText(null);
                } else {
                    fldGrpopv3MDate.setVisibility(View.VISIBLE);
                }
            }
        });


        opv3datenp.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrpOpv3CDate.setVisibility(View.GONE);
                    opv3Date.setText(null);
                } else {
                    fldGrpOpv3CDate.setVisibility(View.VISIBLE);
                }
            }
        });

        penta3datenr.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrppenta3MDate.setVisibility(View.GONE);
                    penta3DateMMon.setText(null);
                    penta3DateMYear.setText(null);
                } else {
                    fldGrppenta3MDate.setVisibility(View.VISIBLE);
                }
            }
        });

        penta3datenp.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrpPenta3CDate.setVisibility(View.GONE);
                    penta3Date.setText(null);
                } else {
                    fldGrpPenta3CDate.setVisibility(View.VISIBLE);
                }
            }
        });


        pcv3datenr.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrppcv3MDate.setVisibility(View.GONE);
                    pcv3DateMMon.setText(null);
                    pcv3DateMYear.setText(null);
                } else {
                    fldGrppcv3MDate.setVisibility(View.VISIBLE);
                }
            }
        });

        pcv3datenp.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrpPcv3CDate.setVisibility(View.GONE);
                    pcv3Date.setText(null);
                } else {
                    fldGrpPcv3CDate.setVisibility(View.VISIBLE);
                }
            }
        });

        ipvdatenr.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrpipvMDate.setVisibility(View.GONE);
                    ipvDateMMon.setText(null);
                    ipvDateMYear.setText(null);
                } else {
                    fldGrpipvMDate.setVisibility(View.VISIBLE);
                }
            }
        });

        ipvdatenp.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrpIpvCDate.setVisibility(View.GONE);
                    ipvDate.setText(null);
                } else {
                    fldGrpIpvCDate.setVisibility(View.VISIBLE);
                }
            }
        });

        measles1datenr.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrpmeasles1MDate.setVisibility(View.GONE);
                    measles1DateMMon.setText(null);
                    measles1DateMYear.setText(null);
                } else {
                    fldGrpmeasles1MDate.setVisibility(View.VISIBLE);
                }
            }
        });

        measles1datenp.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrpMeasles1CDate.setVisibility(View.GONE);
                    measles1Date.setText(null);
                } else {
                    fldGrpMeasles1CDate.setVisibility(View.VISIBLE);
                }
            }
        });

        measles2datenr.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrpmeasles2MDate.setVisibility(View.GONE);
                    measles2DateMMon.setText(null);
                    measles2DateMYear.setText(null);
                } else {
                    fldGrpmeasles2MDate.setVisibility(View.VISIBLE);
                }
            }
        });

        measles2datenp.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    fldGrpMeasles2CDate.setVisibility(View.GONE);
                    measles2Date.setText(null);
                } else {
                    fldGrpMeasles2CDate.setVisibility(View.VISIBLE);
                }
            }
        });
*/




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

                if (MainApp.imsCount < MainApp.totalImsCount) {
//                    finish();

                    MainApp.imsCount++;

/*                    MainApp.lstChild.remove(MainApp.positionIm);
                    MainApp.childsMap.remove(MainApp.positionIm);
                    MainApp.flag = false;*/
                    Intent secNext = new Intent(this, SectionIActivity.class);
                    //tiname.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, MainApp.lstChild));
                    startActivity(secNext);


                } else {
                    Intent secNext = new Intent(this, SectionJActivity.class);
                    startActivity(secNext);
                }

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    private boolean UpdateDB() {

        DatabaseHelper db = new DatabaseHelper(this);

        Long updcount = db.addChild(MainApp.ims);
        MainApp.ims.set_ID(String.valueOf(updcount));

        if (updcount != -1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();

            MainApp.ims.setUID(
                    (MainApp.fc.getDeviceID() + MainApp.ims.get_ID()));
            db.updateChildID();

            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        SharedPreferences sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);

        MainApp.ims = new SectionIIMContract();

        MainApp.ims.set_UUID(MainApp.fc.getUID());
        MainApp.ims.setFormDate(MainApp.fc.getFormDate());
        MainApp.ims.setDeviceId(MainApp.fc.getDeviceID());
        MainApp.ims.setUser(MainApp.fc.getUser());
        MainApp.ims.setDevicetagID(sharedPref.getString("tagName", null));

        JSONObject sI = new JSONObject();

        sI.put("ta01", MainApp.cluster);
        sI.put("ta05h", MainApp.hhno);
        sI.put("ta05u", MainApp.billno);

//        sI.put("tiImsSerial", MainApp.childsMap.get(tiname.getSelectedItem().toString()).getSerialNo());

        sI.put("tiname", tiname.getText().toString());
        sI.put("ti00", ti00a.isChecked() ? "1" : ti00b.isChecked() ? "2" : "0");
        sI.put("ti01", ti01a.isChecked() ? "1" : ti01b.isChecked() ? "2" : ti01888.isChecked() ? "888" : "0");
        sI.put("ti02a", ti02a.isChecked() ? "1" : "0");
        sI.put("ti02b", ti02b.isChecked() ? "2" : "0");
        sI.put("ti02c", ti02c.isChecked() ? "3" : "0");
        sI.put("ti02d", ti02d.isChecked() ? "4" : "0");
        sI.put("ti0288", ti0288.isChecked() ? "88" : "0");
        sI.put("ti0288x", ti0288x.getText().toString());
        sI.put("ti03", ti03a.isChecked() ? "1" : ti03b.isChecked() ? "2" : ti03c.isChecked() ? "3" : "0");
/*

        sI.put("bcgM", bcgM01.isChecked() ? "1" : bcgM02.isChecked() ? "2" : "0");
        sI.put("bcgdatenr", bcgdatenr.isChecked() ? "1" : "0");
        sI.put("bcgdateM_mon", bcgDateMMon.getText().toString());
        sI.put("bcgdateM_year", bcgDateMYear.getText().toString());
        sI.put("bcgC", bcgC01.isChecked() ? "1" : bcgC02.isChecked() ? "2" : "0");
        sI.put("bcgdatenp", bcgdatenp.isChecked() ? "1" : "0");
        sI.put("bcgDate", bcgDate.getText().toString());
        sI.put("bcgPov", bcgPova.isChecked() ? "1" : bcgPovb.isChecked() ? "2" : bcgPovc.isChecked() ? "3"
                : bcgPovd.isChecked() ? "4" : bcgPove.isChecked() ? "5" : bcgPovf.isChecked() ? "6" : bcgPovg.isChecked() ? "7"
                : bcgPovh.isChecked() ? "8" : "0");
        // BCG At Birth
        sI.put("opv0M", opv0M01.isChecked() ? "1" : opv0M02.isChecked() ? "2" : "0");
        sI.put("opv0datenr", opv0datenr.isChecked() ? "1" : "0");
        sI.put("opv0dateM_mon", opv0DateMMon.getText().toString());
        sI.put("opv0dateM_year", opv0DateMYear.getText().toString());
        sI.put("opv0C", opv0C01.isChecked() ? "1" : opv0C02.isChecked() ? "2" : "0");
        sI.put("opv0datenp", opv0datenp.isChecked() ? "1" : "0");
        sI.put("opv0Date", opv0Date.getText().toString());
        sI.put("opv0Pov", opv0Pova.isChecked() ? "1" : opv0Povb.isChecked() ? "2" : opv0Povc.isChecked() ? "3"
                : opv0Povd.isChecked() ? "4" : opv0Pove.isChecked() ? "5" : opv0Povf.isChecked() ? "6" : opv0Povg.isChecked() ? "7"
                : opv0Povh.isChecked() ? "8" : "0");
        //Polio At Birth
        sI.put("penta1M", penta1M01.isChecked() ? "1" : penta1M02.isChecked() ? "2" : "0");
        sI.put("penta1datenr", penta1datenr.isChecked() ? "1" : "0");
        sI.put("penta1dateM_mon", penta1DateMMon.getText().toString());
        sI.put("penta1dateM_year", penta1DateMYear.getText().toString());
        sI.put("penta1C", penta1C01.isChecked() ? "1" : penta1C02.isChecked() ? "2" : "0");
        sI.put("penta1datenp", penta1datenp.isChecked() ? "1" : "0");
        sI.put("penta1Date", penta1Date.getText().toString());
        sI.put("penta1Pov", penta1Pova.isChecked() ? "1" : penta1Povb.isChecked() ? "2" : penta1Povc.isChecked() ? "3"
                : penta1Povd.isChecked() ? "4" : penta1Pove.isChecked() ? "5" : penta1Povf.isChecked() ? "6" : penta1Povg.isChecked() ? "7"
                : penta1Povh.isChecked() ? "8" : "0");
        // Penta 1 at 6 weeks
        sI.put("pcv1M", pcv1M01.isChecked() ? "1" : pcv1M02.isChecked() ? "2" : "0");
        sI.put("pcv1datenr", pcv1datenr.isChecked() ? "1" : "0");
        sI.put("pcv1dateM_mon", pcv1DateMMon.getText().toString());
        sI.put("pcv1dateM_year", pcv1DateMYear.getText().toString());

        sI.put("pcv1C", pcv1C01.isChecked() ? "1" : pcv1C02.isChecked() ? "2" : "0");
        sI.put("pcv1datenp", pcv1datenp.isChecked() ? "1" : "0");
        sI.put("pcv1Date", pcv1Date.getText().toString());
        sI.put("pcv1Pov", pcv1Pova.isChecked() ? "1" : pcv1Povb.isChecked() ? "2" : pcv1Povc.isChecked() ? "3"
                : pcv1Povd.isChecked() ? "4" : pcv1Pove.isChecked() ? "5" : pcv1Povf.isChecked() ? "6" : pcv1Povg.isChecked() ? "7"
                : pcv1Povh.isChecked() ? "8" : "0");
        //PCV 1 at 6 weeks
        sI.put("opv1M", opv1M01.isChecked() ? "1" : opv1M02.isChecked() ? "2" : "0");
        sI.put("opv1datenr", opv1datenr.isChecked() ? "1" : "0");
        sI.put("opv1dateM_mon", opv1DateMMon.getText().toString());
        sI.put("opv1dateM_year", opv1DateMYear.getText().toString());
        sI.put("opv1C", opv1C01.isChecked() ? "1" : opv1C02.isChecked() ? "2" : "0");
        sI.put("opv1datenp", opv1datenp.isChecked() ? "1" : "0");
        sI.put("opv1Date", opv1Date.getText().toString());
        sI.put("opv1Pov", opv1Pova.isChecked() ? "1" : opv1Povb.isChecked() ? "2" : opv1Povc.isChecked() ? "3"
                : opv1Povd.isChecked() ? "4" : opv1Pove.isChecked() ? "5" : opv1Povf.isChecked() ? "6" : opv1Povg.isChecked() ? "7"
                : opv1Povh.isChecked() ? "8" : "0");
        // OPV 1 at 6 weeks
        sI.put("penta2M", penta2M01.isChecked() ? "1" : penta2M02.isChecked() ? "2" : "0");
        sI.put("penta2datenr", penta2datenr.isChecked() ? "1" : "0");
        sI.put("penta2dateM_mon", penta2DateMMon.getText().toString());
        sI.put("penta2dateM_year", penta2DateMYear.getText().toString());
        sI.put("penta2C", penta2C01.isChecked() ? "1" : penta2C02.isChecked() ? "2" : "0");
        sI.put("penta2datenp", penta2datenp.isChecked() ? "1" : "0");

        sI.put("penta2Date", penta2Date.getText().toString());
        sI.put("penta2Pov", penta2Pova.isChecked() ? "1" : penta2Povb.isChecked() ? "2" : penta2Povc.isChecked() ? "3"
                : penta2Povd.isChecked() ? "4" : penta2Pove.isChecked() ? "5" : penta2Povf.isChecked() ? "6" : penta2Povg.isChecked() ? "7"
                : penta2Povh.isChecked() ? "8" : "0");
        // Penta 2 at 10 weeks
        sI.put("pcv2M", pcv2M01.isChecked() ? "1" : pcv2M02.isChecked() ? "2" : "0");
        sI.put("pcv2datenr", pcv2datenr.isChecked() ? "1" : "0");
        sI.put("pcv2dateM_mon", pcv2DateMMon.getText().toString());
        sI.put("pcv2dateM_year", pcv2DateMYear.getText().toString());
        sI.put("pcv2C", pcv2C01.isChecked() ? "1" : pcv2C02.isChecked() ? "2" : "0");
        sI.put("pcv2datenp", pcv2datenp.isChecked() ? "1" : "0");
        sI.put("pcv2Date", pcv2Date.getText().toString());
        sI.put("pcv2Pov", pcv2Pova.isChecked() ? "1" : pcv2Povb.isChecked() ? "2" : pcv2Povc.isChecked() ? "3"
                : pcv2Povd.isChecked() ? "4" : pcv2Pove.isChecked() ? "5" : pcv2Povf.isChecked() ? "6" : pcv2Povg.isChecked() ? "7"
                : pcv2Povh.isChecked() ? "8" : "0");

        sI.put("opv2M", opv2M01.isChecked() ? "1" : opv2M02.isChecked() ? "2" : "0");
        sI.put("opv2datenr", opv2datenr.isChecked() ? "1" : "0");
        sI.put("opv2dateM_mon", opv2DateMMon.getText().toString());
        sI.put("opv2dateM_year", opv2DateMYear.getText().toString());
        sI.put("opv2C", opv2C01.isChecked() ? "1" : opv2C02.isChecked() ? "2" : "0");
        sI.put("opv2datenp", opv2datenp.isChecked() ? "1" : "0");

        sI.put("opv2Date", opv2Date.getText().toString());
        sI.put("opv2Pov", opv2Pova.isChecked() ? "1" : opv2Povb.isChecked() ? "2" : opv2Povc.isChecked() ? "3"
                : opv2Povd.isChecked() ? "4" : opv2Pove.isChecked() ? "5" : opv2Povf.isChecked() ? "6" : opv2Povg.isChecked() ? "7"
                : opv2Povh.isChecked() ? "8" : "0");

        // PCV 2 at 6 weeks
        sI.put("penta3M", penta3M01.isChecked() ? "1" : penta3M02.isChecked() ? "2" : "0");
        sI.put("penta3datenr", penta3datenr.isChecked() ? "1" : "0");
        sI.put("penta3dateM_mon", penta3DateMMon.getText().toString());
        sI.put("penta3dateM_year", penta3DateMYear.getText().toString());
        sI.put("penta3C", penta3C01.isChecked() ? "1" : penta3C02.isChecked() ? "2" : "0");
        sI.put("penta3datenp", penta3datenp.isChecked() ? "1" : "0");

        sI.put("penta3Date", penta3Date.getText().toString());
        sI.put("penta3Pov", penta3Pova.isChecked() ? "1" : penta3Povb.isChecked() ? "2" : penta3Povc.isChecked() ? "3"
                : penta3Povd.isChecked() ? "4" : penta3Pove.isChecked() ? "5" : penta3Povf.isChecked() ? "6" : penta3Povg.isChecked() ? "7"
                : penta3Povh.isChecked() ? "8" : "0");
        // OPV 2 at 6 weeks
        sI.put("pcv3M", pcv3M01.isChecked() ? "1" : pcv3M02.isChecked() ? "2" : "0");
        sI.put("pcv3datenr", pcv3datenr.isChecked() ? "1" : "0");
        sI.put("pcv3dateM_mon", pcv3DateMMon.getText().toString());
        sI.put("pcv3dateM_year", pcv3DateMYear.getText().toString());

        sI.put("pcv3C", pcv3C01.isChecked() ? "1" : pcv3C02.isChecked() ? "2" : "0");
        sI.put("pcv3datenp", pcv3datenp.isChecked() ? "1" : "0");

        sI.put("pcv3Date", pcv3Date.getText().toString());
        sI.put("pcv3Pov", pcv3Pova.isChecked() ? "1" : pcv3Povb.isChecked() ? "2" : pcv3Povc.isChecked() ? "3"
                : pcv3Povd.isChecked() ? "4" : pcv3Pove.isChecked() ? "5" : pcv3Povf.isChecked() ? "6" : pcv3Povg.isChecked() ? "7"
                : pcv3Povh.isChecked() ? "8" : "0");

        // Penta 3 at 14 weeks
        sI.put("opv3M", opv3M01.isChecked() ? "1" : opv3M02.isChecked() ? "2" : "0");
        sI.put("opv3datenr", opv3datenr.isChecked() ? "1" : "0");
        sI.put("opv3dateM_mon", opv3DateMMon.getText().toString());
        sI.put("opv3dateM_year", opv3DateMYear.getText().toString());
        sI.put("opv3C", opv3C01.isChecked() ? "1" : opv3C02.isChecked() ? "2" : "0");
        sI.put("opv3datenp", opv3datenp.isChecked() ? "1" : "0");

        sI.put("opv3Date", opv3Date.getText().toString());
        sI.put("opv3Pov", opv3Pova.isChecked() ? "1" : opv3Povb.isChecked() ? "2" : opv3Povc.isChecked() ? "3"
                : opv3Povd.isChecked() ? "4" : opv3Pove.isChecked() ? "5" : opv3Povf.isChecked() ? "6" : opv3Povg.isChecked() ? "7"
                : opv3Povh.isChecked() ? "8" : "0");

        // PCV 3 at 14 weeks
        sI.put("ipvM", ipvM01.isChecked() ? "1" : ipvM02.isChecked() ? "2" : "0");
        sI.put("ipvdatenr", ipvdatenr.isChecked() ? "1" : "0");
        sI.put("ipvdateM_mon", ipvDateMMon.getText().toString());
        sI.put("ipvdateM_year", ipvDateMYear.getText().toString());
        sI.put("ipvC", ipvC01.isChecked() ? "1" : ipvC02.isChecked() ? "2" : "0");
        sI.put("ipvdatenp", ipvdatenp.isChecked() ? "1" : "0");

        sI.put("ipvDate", ipvDate.getText().toString());
        sI.put("ipvPov", ipvPova.isChecked() ? "1" : ipvPovb.isChecked() ? "2" : ipvPovc.isChecked() ? "3"
                : ipvPovd.isChecked() ? "4" : ipvPove.isChecked() ? "5" : ipvPovf.isChecked() ? "6" : ipvPovg.isChecked() ? "7"
                : ipvPovh.isChecked() ? "8" : "0");
        // OPV 3 at 14 weeks
        sI.put("measles1M", measles1M01.isChecked() ? "1" : measles1M02.isChecked() ? "2" : "0");
        sI.put("measles1datenr", measles1datenr.isChecked() ? "1" : "0");
        sI.put("measles1dateM_mon", measles1DateMMon.getText().toString());
        sI.put("measles1dateM_year", measles1DateMYear.getText().toString());
        sI.put("measles1C", measles1C01.isChecked() ? "1" : measles1C02.isChecked() ? "2" : "0");
        sI.put("measles1datenp", measles1datenp.isChecked() ? "1" : "0");

        sI.put("measles1Date", measles1Date.getText().toString());
        sI.put("measles1Pov", measles1Pova.isChecked() ? "1" : measles1Povb.isChecked() ? "2" : measles1Povc.isChecked() ? "3"
                : measles1Povd.isChecked() ? "4" : measles1Pove.isChecked() ? "5" : measles1Povf.isChecked() ? "6" : measles1Povg.isChecked() ? "7"
                : measles1Povh.isChecked() ? "8" : "0");
        // IPV at 14 weeks
        sI.put("measles2M", measles2M01.isChecked() ? "1" : measles2M02.isChecked() ? "2" : "0");
        sI.put("measles2datenr", measles2datenr.isChecked() ? "1" : "0");
        sI.put("measles2dateM_mon", measles2DateMMon.getText().toString());
        sI.put("measles2dateM_year", measles2DateMYear.getText().toString());
        sI.put("measles2C", measles2C01.isChecked() ? "1" : measles2C02.isChecked() ? "2" : "0");
        sI.put("measles2datenp", measles2datenp.isChecked() ? "1" : "0");

        sI.put("measles2Date", measles2Date.getText().toString());
        sI.put("measles2Pov", measles2Pova.isChecked() ? "1" : measles2Povb.isChecked() ? "2" : measles2Povc.isChecked() ? "3"
                : measles2Povd.isChecked() ? "4" : measles2Pove.isChecked() ? "5" : measles2Povf.isChecked() ? "6"
                : measles2Povg.isChecked() ? "7" : measles2Povh.isChecked() ? "8" : "0");
*/

        sI.put("ti04", ti04a.isChecked() ? "1" : ti04b.isChecked() ? "2" : ti04888.isChecked() ? "888" : "0");
        sI.put("ti05", ti05.getText().toString());
        sI.put("ti05888", ti05888.isChecked() ? "888" : "0");


        MainApp.ims.setsI(String.valueOf(sI));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    public boolean ValidateForm() {

        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        /*if (tiname.getSelectedItem() == "....") {
            Toast.makeText(this, "ERROR(Empty)" + getString(R.string.name), Toast.LENGTH_SHORT).show();
            ((TextView) tiname.getSelectedView()).setText("This Data is Required");
            ((TextView) tiname.getSelectedView()).setTextColor(Color.RED);
            tiname.requestFocus();
            Log.i(TAG, "tiname: This Data is Required!");
            return false;
        } else {
            ((TextView) tiname.getSelectedView()).setError(null);
        }*/

        if (tiname.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.name), Toast.LENGTH_SHORT).show();
            tiname.setError("This data is Required!");
            tiname.requestFocus();
            Log.i(TAG, "tiname: This data is Required!");

            return false;
        } else {
            tiname.setError(null);
        }


        if (ti00.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.tiRespondentMother), Toast.LENGTH_SHORT).show();
            ti00a.setError("This data is Required!");    // Set Error on last radio button
            ti00a.setFocusable(true);
            ti00a.setFocusableInTouchMode(true);
            ti00a.requestFocus();
            Log.i(TAG, "ti00: This data is Required!");
            return false;
        } else {
            ti00a.setError(null);
        }

        if (ti01.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.ti01), Toast.LENGTH_SHORT).show();
            ti01888.setError("This data is Required!");    // Set Error on last radio button
            ti01888.setFocusable(true);
            ti01888.setFocusableInTouchMode(true);
            ti01888.requestFocus();
            Log.i(TAG, "ti01: This data is Required!");
            return false;
        } else {
            ti01888.setError(null);
        }

        if (ti01a.isChecked()) {
            if (ti03.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.ti03), Toast.LENGTH_SHORT).show();
                ti03c.setError("This data is Required!");    // Set Error on last radio button
                ti03c.setFocusable(true);
                ti03c.setFocusableInTouchMode(true);
                ti03c.requestFocus();
                Log.i(TAG, "ti03: This data is Required!");
                return false;
            } else {
                ti03c.setError(null);
            }
/*
            //============ BCG / Mother ==========
            if (bcgM.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.bcg), Toast.LENGTH_SHORT).show();
                bcgM02.setError("This data is Required!");
                Log.i(TAG, "bcgM: This data is Required!");
                bcgM02.setFocusable(true);
                bcgM02.setFocusableInTouchMode(true);
                bcgM02.requestFocus();
                return false;
            } else {
                bcgM02.setError(null);
            }

            if (bcgM01.isChecked() && !bcgdatenr.isChecked()) {
                if (bcgDateMYear.getText().toString().isEmpty() && bcgDateMMon.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.bcg) + " - " + getString(R.string.date), Toast.LENGTH_SHORT).show();
                    bcgDateMYear.setError("This data is Required!");
                    bcgDateMMon.setError("This data is Required!");
                    Log.i(TAG, "bcgMDate: This data is Required!");
                    bcgDateMYear.requestFocus();
                    return false;
                } else {
                    bcgDateMYear.setError(null);
                    bcgDateMMon.setError(null);
                }
            }

            if (ti03a.isChecked()) {
                //============ BCG / Card Present ==========
                if (bcgC.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.bcg), Toast.LENGTH_SHORT).show();
                    bcgC02.setError("This data is Required!");
                    Log.i(TAG, "bcgC: This data is Required!");
                    bcgC02.setFocusable(true);
                    bcgC02.setFocusableInTouchMode(true);
                    bcgC02.requestFocus();

                    return false;
                } else {
                    bcgC02.setError(null);
                }


                if (bcgC01.isChecked() && !bcgdatenp.isChecked()) {
                    if (bcgDate.getText().toString().isEmpty()) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.bcg) + " - " + getString(R.string.date), Toast.LENGTH_SHORT).show();
                        bcgDate.setError("This data is Required!");
                        Log.i(TAG, "bcgDate: This data is Required!");
                        bcgDate.requestFocus();
                        return false;
                    } else {
                        bcgDate.setError(null);
                    }
                }
            }
            if (bcgC01.isChecked() || bcgM01.isChecked()) {

                if (bcgPov.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.bcg) + " - " + getString(R.string.place), Toast.LENGTH_SHORT).show();
                    bcgPova.setError("This data is Required!");
                    Log.i(TAG, "bcgPov: This data is Required!");
                    bcgPova.setFocusable(true);
                    bcgPova.setFocusableInTouchMode(true);
                    bcgPova.requestFocus();
                    return false;
                } else {
                    bcgPova.setError(null);
                }
            }


            //============ Polio 0 / Mother ==========
            if (opv0M.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv0), Toast.LENGTH_SHORT).show();
                opv0M02.setError("This data is Required!");
                Log.i(TAG, "opv0M: This data is Required!");
                opv0M02.setFocusable(true);
                opv0M02.setFocusableInTouchMode(true);
                opv0M02.requestFocus();
                return false;
            } else {
                opv0M02.setError(null);
            }

            if (opv0M01.isChecked() && !opv0datenr.isChecked()) {
                if (opv0DateMYear.getText().toString().isEmpty() && opv0DateMMon.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv0) + " - " + getString(R.string.date), Toast.LENGTH_SHORT).show();
                    opv0DateMYear.setError("This data is Required!");
                    opv0DateMMon.setError("This data is Required!");
                    Log.i(TAG, "opv0MDate: This data is Required!");
                    opv0DateMYear.requestFocus();
                    return false;
                } else {
                    opv0DateMYear.setError(null);
                    opv0DateMMon.setError(null);
                }
            }


            if (ti03a.isChecked()) {
                //============ Polio 0 / Card Present ==========
                if (opv0C.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv0), Toast.LENGTH_SHORT).show();
                    opv0C02.setError("This data is Required!");
                    Log.i(TAG, "opv0C: This data is Required!");
                    opv0C02.setFocusable(true);
                    opv0C02.setFocusableInTouchMode(true);
                    opv0C02.requestFocus();
                    return false;
                } else {
                    opv0C02.setError(null);
                }

                if (opv0C01.isChecked() && !opv0datenp.isChecked()) {
                    if (opv0Date.getText().toString().isEmpty()) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv0) + " - " + getString(R.string.date), Toast.LENGTH_SHORT).show();
                        opv0Date.setError("This data is Required!");
                        Log.i(TAG, "opv0Date: This data is Required!");
                        opv0Date.requestFocus();
                        return false;
                    } else {
                        opv0Date.setError(null);
                    }
                }
            }

            if (opv0C01.isChecked() || opv0M01.isChecked()) {
                if (opv0Pov.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv0) + " - " + getString(R.string.place), Toast.LENGTH_SHORT).show();
                    opv0Pova.setError("This data is Required!");
                    Log.i(TAG, "opv0Pov: This data is Required!");
                    opv0Pova.setFocusable(true);
                    opv0Pova.setFocusableInTouchMode(true);
                    opv0Pova.requestFocus();
                    return false;
                } else {
                    opv0Pova.setError(null);
                }
            }


            //============ OPV 1 / Mother ==========
            if (opv1M.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv1), Toast.LENGTH_SHORT).show();
                opv1M02.setError("This data is Required!");
                Log.i(TAG, "opv1M: This data is Required!");
                opv1M02.setFocusable(true);
                opv1M02.setFocusableInTouchMode(true);
                opv1M02.requestFocus();
                return false;
            } else {
                opv1M02.setError(null);
            }

            if (opv1M01.isChecked() && !opv1datenr.isChecked()) {
                if (opv1DateMYear.getText().toString().isEmpty() && opv1DateMMon.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv1) + " - " + getString(R.string.date), Toast.LENGTH_SHORT).show();
                    opv1DateMYear.setError("This data is Required!");
                    opv1DateMMon.setError("This data is Required!");
                    Log.i(TAG, "opv1MDate: This data is Required!");
                    opv1DateMYear.requestFocus();
                    return false;
                } else {
                    opv1DateMYear.setError(null);
                    opv1DateMMon.setError(null);
                }
            }

            if (ti03a.isChecked()) {
                //============ OPV 1 / Card Present ==========
                if (opv1C.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv1), Toast.LENGTH_SHORT).show();
                    opv1C02.setError("This data is Required!");
                    Log.i(TAG, "opv1C: This data is Required!");
                    opv1C02.setFocusable(true);
                    opv1C02.setFocusableInTouchMode(true);
                    opv1C02.requestFocus();
                    return false;
                } else {
                    opv1C02.setError(null);
                }

                if (opv1C01.isChecked() && !opv1datenp.isChecked()) {
                    if (opv1Date.getText().toString().isEmpty()) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv1) + " - " + getString(R.string.date), Toast.LENGTH_SHORT).show();
                        opv1Date.setError("This data is Required!");
                        Log.i(TAG, "opv1Date: This data is Required!");
                        opv1Date.requestFocus();
                        return false;
                    } else {
                        opv1Date.setError(null);
                    }
                }
            }



            if (opv1C01.isChecked() || opv1M01.isChecked()) {
                if (opv1Pov.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv1) + " - " + getString(R.string.place), Toast.LENGTH_SHORT).show();
                    opv1Pova.setError("This data is Required!");
                    Log.i(TAG, "opv1Pov: This data is Required!");
                    opv1Pova.setFocusable(true);
                    opv1Pova.setFocusableInTouchMode(true);
                    opv1Pova.requestFocus();
                    return false;
                } else {
                    opv1Pova.setError(null);
                }
            }

            //============ Penta 1 / Mother ==========
            if (penta1M.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.penta1), Toast.LENGTH_SHORT).show();
                penta1M02.setError("This data is Required!");
                Log.i(TAG, "penta1M: This data is Required!");
                penta1M02.setFocusable(true);
                penta1M02.setFocusableInTouchMode(true);
                penta1M02.requestFocus();
                return false;
            } else {
                penta1M02.setError(null);
            }

            if (penta1M01.isChecked() && !penta1datenr.isChecked()) {
                if (penta1DateMYear.getText().toString().isEmpty() && penta1DateMMon.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.penta1) + " - " + getString(R.string.date), Toast.LENGTH_SHORT).show();
                    penta1DateMYear.setError("This data is Required!");
                    penta1DateMMon.setError("This data is Required!");
                    Log.i(TAG, "penta1MDate: This data is Required!");
                    penta1DateMYear.requestFocus();
                    return false;
                } else {
                    penta1DateMYear.setError(null);
                    penta1DateMMon.setError(null);
                }
            }


            if (ti03a.isChecked()) {
                //============ Penta 1 / Card Present ==========
                if (penta1C.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.penta1), Toast.LENGTH_SHORT).show();
                    penta1C02.setError("This data is Required!");
                    Log.i(TAG, "penta1C: This data is Required!");
                    penta1C02.setFocusable(true);
                    penta1C02.setFocusableInTouchMode(true);
                    penta1C02.requestFocus();
                    return false;
                } else {
                    penta1C02.setError(null);
                }

                if (penta1C01.isChecked() && !penta1datenp.isChecked()) {
                    if (penta1Date.getText().toString().isEmpty()) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.penta1) + " - " + getString(R.string.date), Toast.LENGTH_SHORT).show();
                        penta1Date.setError("This data is Required!");
                        Log.i(TAG, "penta1Date: This data is Required!");
                        penta1Date.requestFocus();
                        return false;
                    } else {
                        penta1Date.setError(null);
                    }
                }
            }

            if (penta1C01.isChecked() || penta1M01.isChecked()) {
                if (penta1Pov.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.penta1) + " - " + getString(R.string.place), Toast.LENGTH_SHORT).show();
                    penta1Pova.setError("This data is Required!");
                    Log.i(TAG, "penta1Pov: This data is Required!");
                    penta1Pova.setFocusable(true);
                    penta1Pova.setFocusableInTouchMode(true);
                    penta1Pova.requestFocus();
                    return false;
                } else {
                    penta1Pova.setError(null);
                }
            }


            //============ PCV 1 / Mother ==========
            if (pcv1M.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.pcv1), Toast.LENGTH_SHORT).show();
                pcv1M02.setError("This data is Required!");
                Log.i(TAG, "pcv1M: This data is Required!");
                pcv1M02.setFocusable(true);
                pcv1M02.setFocusableInTouchMode(true);
                pcv1M02.requestFocus();
                return false;
            } else {
                pcv1M02.setError(null);
            }

            if (pcv1M01.isChecked() && !pcv1datenr.isChecked()) {
                if (pcv1DateMYear.getText().toString().isEmpty() && pcv1DateMMon.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.pcv1) + " - " + getString(R.string.date), Toast.LENGTH_SHORT).show();
                    pcv1DateMYear.setError("This data is Required!");
                    pcv1DateMMon.setError("This data is Required!");
                    Log.i(TAG, "pcv1MDate: This data is Required!");
                    pcv1DateMYear.requestFocus();
                    return false;
                } else {
                    pcv1DateMYear.setError(null);
                    pcv1DateMMon.setError(null);
                }
            }

            if (ti03a.isChecked()) {

                //============ PCV 1 / Card Present ==========
                if (pcv1C.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.pcv1), Toast.LENGTH_SHORT).show();
                    pcv1C02.setError("This data is Required!");
                    Log.i(TAG, "pcv1C: This data is Required!");
                    pcv1C02.setFocusable(true);
                    pcv1C02.setFocusableInTouchMode(true);
                    pcv1C02.requestFocus();
                    return false;
                } else {
                    pcv1C02.setError(null);
                }

                if (pcv1C01.isChecked() && !pcv1datenp.isChecked()) {
                    if (pcv1Date.getText().toString().isEmpty()) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.pcv1) + " - " + getString(R.string.date), Toast.LENGTH_SHORT).show();
                        pcv1Date.setError("This data is Required!");
                        Log.i(TAG, "pcv1Date: This data is Required!");
                        pcv1Date.requestFocus();
                        return false;
                    } else {
                        pcv1Date.setError(null);
                    }
                }
            }

            if (pcv1C01.isChecked() || pcv1M01.isChecked()) {
                if (pcv1Pov.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.pcv1) + " - " + getString(R.string.place), Toast.LENGTH_SHORT).show();
                    pcv1Pova.setError("This data is Required!");
                    Log.i(TAG, "pcv1Pov: This data is Required!");
                    pcv1Pova.setFocusable(true);
                    pcv1Pova.setFocusableInTouchMode(true);
                    pcv1Pova.requestFocus();
                    return false;
                } else {
                    pcv1Pova.setError(null);
                }
            }

            //============ OPV 2 / Mother ==========
            if (opv2M.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv2), Toast.LENGTH_SHORT).show();
                opv2M02.setError("This data is Required!");
                Log.i(TAG, "opv2M: This data is Required!");
                opv2M02.setFocusable(true);
                opv2M02.setFocusableInTouchMode(true);
                opv2M02.requestFocus();
                return false;
            } else {
                opv2M02.setError(null);
            }

            if (opv2M01.isChecked() && !opv2datenr.isChecked()) {
                if (opv2DateMYear.getText().toString().isEmpty() && opv2DateMMon.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv2) + " - " + getString(R.string.date), Toast.LENGTH_SHORT).show();
                    opv2DateMYear.setError("This data is Required!");
                    opv2DateMMon.setError("This data is Required!");
                    Log.i(TAG, "opv2MDate: This data is Required!");
                    opv2DateMYear.requestFocus();
                    return false;
                } else {
                    opv2DateMYear.setError(null);
                    opv2DateMMon.setError(null);
                }
            }

            if (ti03a.isChecked()) {
                //============ OPV 2 / Card Present ==========
                if (opv2C.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv2), Toast.LENGTH_SHORT).show();
                    opv2C02.setError("This data is Required!");
                    Log.i(TAG, "opv2C: This data is Required!");
                    opv2C02.setFocusable(true);
                    opv2C02.setFocusableInTouchMode(true);
                    opv2C02.requestFocus();
                    return false;
                } else {
                    opv2C02.setError(null);
                }

                if (opv2C01.isChecked() && !opv2datenp.isChecked()) {
                    if (opv2Date.getText().toString().isEmpty()) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv2) + " - " + getString(R.string.date), Toast.LENGTH_SHORT).show();
                        opv2Date.setError("This data is Required!");
                        Log.i(TAG, "opv2Date: This data is Required!");
                        opv2Date.requestFocus();
                        return false;
                    } else {
                        opv2Date.setError(null);
                    }
                }
            }


            if (opv2C01.isChecked() || opv2M01.isChecked()) {
                if (opv2Pov.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv2) + " - " + getString(R.string.place), Toast.LENGTH_SHORT).show();
                    opv2Pova.setError("This data is Required!");
                    Log.i(TAG, "opv2Pov: This data is Required!");
                    opv2Pova.setFocusable(true);
                    opv2Pova.setFocusableInTouchMode(true);
                    opv2Pova.requestFocus();
                    return false;
                } else {
                    opv2Pova.setError(null);
                }
            }

            //============ Penta 2 / Mother ==========
            if (penta2M.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.penta2), Toast.LENGTH_SHORT).show();
                penta2M02.setError("This data is Required!");
                Log.i(TAG, "penta2M: This data is Required!");
                penta2M02.setFocusable(true);
                penta2M02.setFocusableInTouchMode(true);
                penta2M02.requestFocus();
                return false;
            } else {
                penta2M02.setError(null);
            }

            if (penta2M01.isChecked() && !penta2datenr.isChecked()) {
                if (penta2DateMYear.getText().toString().isEmpty() && penta2DateMMon.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.penta2) + " - " + getString(R.string.date), Toast.LENGTH_SHORT).show();
                    penta2DateMYear.setError("This data is Required!");
                    penta2DateMMon.setError("This data is Required!");
                    Log.i(TAG, "penta2MDate: This data is Required!");
                    penta2DateMYear.requestFocus();
                    return false;
                } else {
                    penta2DateMYear.setError(null);
                    penta2DateMMon.setError(null);
                }
            }

            if (ti03a.isChecked()) {
                //============ Penta 2 / Card Present ==========
                if (penta2C.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.penta2), Toast.LENGTH_SHORT).show();
                    penta2C02.setError("This data is Required!");
                    Log.i(TAG, "penta2C: This data is Required!");
                    penta2C02.setFocusable(true);
                    penta2C02.setFocusableInTouchMode(true);
                    penta2C02.requestFocus();
                    return false;
                } else {
                    penta2C02.setError(null);
                }


                if (penta2C01.isChecked() && !penta2datenp.isChecked()) {
                    if (penta2Date.getText().toString().isEmpty()) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.penta2) + " - " + getString(R.string.date), Toast.LENGTH_SHORT).show();
                        penta2Date.setError("This data is Required!");
                        Log.i(TAG, "penta2Date: This data is Required!");
                        penta2Date.requestFocus();
                        return false;
                    } else {
                        penta2Date.setError(null);
                    }
                }
            }


            if (penta2C01.isChecked() || penta2M01.isChecked()) {
                if (penta2Pov.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.penta2) + " - " + getString(R.string.place), Toast.LENGTH_SHORT).show();
                    penta2Pova.setError("This data is Required!");
                    Log.i(TAG, "penta2Pov: This data is Required!");
                    penta2Pova.setFocusable(true);
                    penta2Pova.setFocusableInTouchMode(true);
                    penta2Pova.requestFocus();
                    return false;
                } else {
                    penta2Pova.setError(null);
                }
            }

            //============ PCV 2 / Mother ==========
            if (pcv2M.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.pcv2), Toast.LENGTH_SHORT).show();
                pcv2M02.setError("This data is Required!");
                Log.i(TAG, "pcv2M: This data is Required!");
                pcv2M02.setFocusable(true);
                pcv2M02.setFocusableInTouchMode(true);
                pcv2M02.requestFocus();
                return false;
            } else {
                pcv2M02.setError(null);
            }

            if (pcv2M01.isChecked() && !pcv2datenr.isChecked()) {
                if (pcv2DateMYear.getText().toString().isEmpty() && pcv2DateMMon.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.pcv2) + " - " + getString(R.string.date), Toast.LENGTH_SHORT).show();
                    pcv2DateMYear.setError("This data is Required!");
                    pcv2DateMMon.setError("This data is Required!");
                    Log.i(TAG, "pcv2MDate: This data is Required!");
                    pcv2DateMYear.requestFocus();
                    return false;
                } else {
                    pcv2DateMYear.setError(null);
                    pcv2DateMMon.setError(null);
                }
            }

            if (ti03a.isChecked()) {
                //============ PCV 2 / Card Present ==========
                if (pcv2C.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.pcv2), Toast.LENGTH_SHORT).show();
                    pcv2C02.setError("This data is Required!");
                    Log.i(TAG, "pcv2C: This data is Required!");
                    pcv2C02.setFocusable(true);
                    pcv2C02.setFocusableInTouchMode(true);
                    pcv2C02.requestFocus();
                    return false;
                } else {
                    pcv2C02.setError(null);
                }

                if (pcv2C01.isChecked() && !pcv2datenp.isChecked()) {
                    if (pcv2Date.getText().toString().isEmpty()) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.pcv2) + " - " + getString(R.string.date), Toast.LENGTH_SHORT).show();
                        pcv2Date.setError("This data is Required!");
                        Log.i(TAG, "pcv2Date: This data is Required!");
                        pcv2Date.requestFocus();
                        return false;
                    } else {
                        pcv2Date.setError(null);
                    }
                }
            }

            if (pcv2C01.isChecked() || pcv2M01.isChecked()) {
                if (pcv2Pov.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.pcv2) + " - " + getString(R.string.place), Toast.LENGTH_SHORT).show();
                    pcv2Pova.setError("This data is Required!");
                    Log.i(TAG, "pcv2Pov: This data is Required!");
                    pcv2Pova.setFocusable(true);
                    pcv2Pova.setFocusableInTouchMode(true);
                    pcv2Pova.requestFocus();
                    return false;
                } else {
                    pcv2Pova.setError(null);
                }
            }

            //============ OPV 3 / Mother ==========
            if (opv3M.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv3), Toast.LENGTH_SHORT).show();
                opv3M02.setError("This data is Required!");
                Log.i(TAG, "opv3M: This data is Required!");
                opv3M02.setFocusable(true);
                opv3M02.setFocusableInTouchMode(true);
                opv3M02.requestFocus();
                return false;
            } else {
                opv3M02.setError(null);
            }

            if (opv3M01.isChecked() && !opv3datenr.isChecked()) {
                if (opv3DateMYear.getText().toString().isEmpty() && opv3DateMMon.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv3) + " - " + getString(R.string.date), Toast.LENGTH_SHORT).show();
                    opv3DateMYear.setError("This data is Required!");
                    opv3DateMMon.setError("This data is Required!");
                    Log.i(TAG, "opv3MDate: This data is Required!");
                    opv3DateMYear.requestFocus();
                    return false;
                } else {
                    opv3DateMYear.setError(null);
                    opv3DateMMon.setError(null);
                }
            }

            if (ti03a.isChecked()) {
                //============ OPV 3 / Card Present ==========
                if (opv3C.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv3), Toast.LENGTH_SHORT).show();
                    opv3C02.setError("This data is Required!");
                    Log.i(TAG, "opv3C: This data is Required!");
                    opv3C02.setFocusable(true);
                    opv3C02.setFocusableInTouchMode(true);
                    opv3C02.requestFocus();
                    return false;
                } else {
                    opv3C02.setError(null);
                }

                if (opv3C01.isChecked() && !opv3datenp.isChecked()) {
                    if (opv3Date.getText().toString().isEmpty()) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv3) + " - " + getString(R.string.date), Toast.LENGTH_SHORT).show();
                        opv3Date.setError("This data is Required!");
                        Log.i(TAG, "opv3Date: This data is Required!");
                        opv3Date.requestFocus();
                        return false;
                    } else {
                        opv3Date.setError(null);
                    }
                }
            }


            if (opv3C01.isChecked() || opv3M01.isChecked()) {
                if (opv3Pov.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.opv3) + " - " + getString(R.string.place), Toast.LENGTH_SHORT).show();
                    opv3Pova.setError("This data is Required!");
                    Log.i(TAG, "opv3Pov: This data is Required!");
                    opv3Pova.setFocusable(true);
                    opv3Pova.setFocusableInTouchMode(true);
                    opv3Pova.requestFocus();
                    return false;
                } else {
                    opv3Pova.setError(null);
                }
            }

            //============ Penta 3 / Mother ==========
            if (penta3M.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.penta3), Toast.LENGTH_SHORT).show();
                penta3M02.setError("This data is Required!");
                Log.i(TAG, "penta3M: This data is Required!");
                penta3M02.setFocusable(true);
                penta3M02.setFocusableInTouchMode(true);
                penta3M02.requestFocus();
                return false;
            } else {
                penta3M02.setError(null);
            }

            if (penta3M01.isChecked() && !penta3datenr.isChecked()) {
                if (penta3DateMYear.getText().toString().isEmpty() && penta3DateMMon.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.penta3) + " - " + getString(R.string.date), Toast.LENGTH_SHORT).show();
                    penta3DateMYear.setError("This data is Required!");
                    penta3DateMMon.setError("This data is Required!");
                    Log.i(TAG, "penta3MDate: This data is Required!");
                    penta2DateMYear.requestFocus();
                    return false;
                } else {
                    penta3DateMYear.setError(null);
                    penta3DateMMon.setError(null);
                }
            }

            if (ti03a.isChecked()) {
                //============ Penta 3 / Card Present ==========
                if (penta3C.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.penta3), Toast.LENGTH_SHORT).show();
                    penta3C02.setError("This data is Required!");
                    Log.i(TAG, "penta3C: This data is Required!");
                    penta3C02.setFocusable(true);
                    penta3C02.setFocusableInTouchMode(true);
                    penta3C02.requestFocus();
                    return false;
                } else {
                    penta3C02.setError(null);
                }

                if (penta3C01.isChecked() && !penta3datenp.isChecked()) {
                    if (penta3Date.getText().toString().isEmpty()) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.penta3) + " - " + getString(R.string.date), Toast.LENGTH_SHORT).show();
                        penta3Date.setError("This data is Required!");
                        Log.i(TAG, "penta3Date: This data is Required!");
                        penta3Date.requestFocus();
                        return false;
                    } else {
                        penta3Date.setError(null);
                    }
                }
            }

            if (penta3C01.isChecked() || penta3M01.isChecked()) {
                if (penta3Pov.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.penta3) + " - " + getString(R.string.place), Toast.LENGTH_SHORT).show();
                    penta3Pova.setError("This data is Required!");
                    Log.i(TAG, "penta3Pov: This data is Required!");
                    penta3Pova.setFocusable(true);
                    penta3Pova.setFocusableInTouchMode(true);
                    penta3Pova.requestFocus();
                    return false;
                } else {
                    penta3Pova.setError(null);
                }
            }

            //============ PCV / Mother ==========
            if (pcv3M.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.pcv3), Toast.LENGTH_SHORT).show();
                pcv3M02.setError("This data is Required!");
                Log.i(TAG, "pcv3M: This data is Required!");
                pcv3M02.setFocusable(true);
                pcv3M02.setFocusableInTouchMode(true);
                pcv3M02.requestFocus();
                return false;
            } else {
                pcv3M02.setError(null);
            }

            if (pcv3M01.isChecked() && !pcv3datenr.isChecked()) {
                if (pcv3DateMYear.getText().toString().isEmpty() && pcv3DateMMon.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.pcv3) + " - " + getString(R.string.date), Toast.LENGTH_SHORT).show();
                    pcv3DateMYear.setError("This data is Required!");
                    pcv3DateMMon.setError("This data is Required!");
                    Log.i(TAG, "pcv3MDate: This data is Required!");
                    pcv3DateMYear.requestFocus();
                    return false;
                } else {
                    pcv3DateMYear.setError(null);
                    pcv3DateMMon.setError(null);
                }
            }

            if (ti03a.isChecked()) {
                //============ PCV 3 / Card Present ==========
                if (pcv3C.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.pcv3), Toast.LENGTH_SHORT).show();
                    pcv3C02.setError("This data is Required!");
                    Log.i(TAG, "pcv3C: This data is Required!");
                    pcv3C02.setFocusable(true);
                    pcv3C02.setFocusableInTouchMode(true);
                    pcv3C02.requestFocus();
                    return false;
                } else {
                    pcv3C02.setError(null);
                }

                if (pcv3C01.isChecked() && !pcv3datenp.isChecked()) {
                    if (pcv3Date.getText().toString().isEmpty()) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.pcv3) + " - " + getString(R.string.date), Toast.LENGTH_SHORT).show();
                        pcv3Date.setError("This data is Required!");
                        Log.i(TAG, "pcv3Date: This data is Required!");
                        pcv3Date.requestFocus();
                        return false;
                    } else {
                        pcv3Date.setError(null);
                    }
                }
            }

            if (pcv3C01.isChecked() || pcv3M01.isChecked()) {
                if (pcv3Pov.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.pcv3) + " - " + getString(R.string.place), Toast.LENGTH_SHORT).show();
                    pcv3Pova.setError("This data is Required!");
                    Log.i(TAG, "pcv3Pov: This data is Required!");
                    pcv3Pova.setFocusable(true);
                    pcv3Pova.setFocusableInTouchMode(true);
                    pcv3Pova.requestFocus();
                    return false;
                } else {
                    pcv3Pova.setError(null);
                }
            }


            //============ IPV / Mother ==========
            if (ipvM.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.ipv), Toast.LENGTH_SHORT).show();
                ipvM02.setError("This data is Required!");
                Log.i(TAG, "ipvM: This data is Required!");
                ipvM02.setFocusable(true);
                ipvM02.setFocusableInTouchMode(true);
                ipvM02.requestFocus();
                return false;
            } else {
                ipvM02.setError(null);
            }

            if (ipvM01.isChecked() && !ipvdatenr.isChecked()) {
                if (ipvDateMYear.getText().toString().isEmpty() && ipvDateMMon.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.ipv) + " - " + getString(R.string.date), Toast.LENGTH_SHORT).show();
                    ipvDateMYear.setError("This data is Required!");
                    ipvDateMMon.setError("This data is Required!");
                    Log.i(TAG, "ipvMDate: This data is Required!");
                    ipvDateMYear.requestFocus();
                    return false;
                } else {
                    ipvDateMYear.setError(null);
                    ipvDateMMon.setError(null);
                }
            }


            if (ti03a.isChecked()) {
                //============ IPV / Card Present ==========
                if (ipvC.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.ipv), Toast.LENGTH_SHORT).show();
                    ipvC02.setError("This data is Required!");
                    Log.i(TAG, "ipvC: This data is Required!");
                    ipvC02.setFocusable(true);
                    ipvC02.setFocusableInTouchMode(true);
                    ipvC02.requestFocus();
                    return false;
                } else {
                    ipvC02.setError(null);
                }


                if (ipvC01.isChecked() && !ipvdatenp.isChecked()) {
                    if (ipvDate.getText().toString().isEmpty()) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.ipv) + " - " + getString(R.string.date), Toast.LENGTH_SHORT).show();
                        ipvDate.setError("This data is Required!");
                        Log.i(TAG, "ipvDate: This data is Required!");
                        ipvDate.requestFocus();
                        return false;
                    } else {
                        ipvDate.setError(null);
                    }
                }
            }


            if (ipvC01.isChecked() || ipvM01.isChecked()) {
                if (ipvPov.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.ipv) + " - " + getString(R.string.place), Toast.LENGTH_SHORT).show();
                    ipvPova.setError("This data is Required!");
                    Log.i(TAG, "ipvPov: This data is Required!");
                    ipvPova.setFocusable(true);
                    ipvPova.setFocusableInTouchMode(true);
                    ipvPova.requestFocus();
                    return false;
                } else {
                    ipvPova.setError(null);
                }
            }

            //============ measles1 / Mother ==========
            if (measles1M.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.measles1), Toast.LENGTH_SHORT).show();
                measles1M02.setError("This data is Required!");
                Log.i(TAG, "measles1M: This data is Required!");
                measles1M02.setFocusable(true);
                measles1M02.setFocusableInTouchMode(true);
                measles1M02.requestFocus();
                return false;
            } else {
                measles1M02.setError(null);
            }

            if (measles1M01.isChecked() && !measles1datenr.isChecked()) {
                if (measles1DateMYear.getText().toString().isEmpty() && measles1DateMMon.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.measles1) + " - " + getString(R.string.date), Toast.LENGTH_SHORT).show();
                    measles1DateMYear.setError("This data is Required!");
                    measles1DateMMon.setError("This data is Required!");
                    Log.i(TAG, "measles1MDate: This data is Required!");
                    measles1DateMYear.requestFocus();
                    return false;
                } else {
                    measles1DateMYear.setError(null);
                    measles1DateMMon.setError(null);
                }
            }

            if (ti03a.isChecked()) {
                //============ measles1 / Card Present ==========
                if (measles1C.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.measles1), Toast.LENGTH_SHORT).show();
                    measles1C02.setError("This data is Required!");
                    Log.i(TAG, "measles1C: This data is Required!");
                    measles1C02.setFocusable(true);
                    measles1C02.setFocusableInTouchMode(true);
                    measles1C02.requestFocus();
                    return false;
                } else {
                    measles1C02.setError(null);
                }

                if (measles1C01.isChecked() && !measles1datenp.isChecked()) {
                    if (measles1Date.getText().toString().isEmpty()) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.measles1) + " - " + getString(R.string.date), Toast.LENGTH_SHORT).show();
                        measles1Date.setError("This data is Required!");
                        Log.i(TAG, "measles1Date: This data is Required!");
                        measles1Date.requestFocus();
                        return false;
                    } else {
                        measles1Date.setError(null);
                    }
                }
            }

            if (measles1C01.isChecked() || measles1M01.isChecked()) {
                if (measles1Pov.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.measles1) + " - " + getString(R.string.place), Toast.LENGTH_SHORT).show();
                    measles1Pova.setError("This data is Required!");
                    Log.i(TAG, "measles1Pov: This data is Required!");
                    measles1Pov.setFocusable(true);
                    measles1Pov.setFocusableInTouchMode(true);
                    measles1Pov.requestFocus();
                    return false;
                } else {
                    measles1Pova.setError(null);
                }
            }

            //============ measles2 / Mother ==========
            if (measles2M.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.measles2), Toast.LENGTH_SHORT).show();
                measles2M02.setError("This data is Required!");
                Log.i(TAG, "measles2M: This data is Required!");
                measles2M02.setFocusable(true);
                measles2M02.setFocusableInTouchMode(true);
                measles2M02.requestFocus();
                return false;
            } else {
                measles2M02.setError(null);
            }

            if (measles2M01.isChecked() && !measles2datenr.isChecked()) {
                if (measles2DateMYear.getText().toString().isEmpty() && measles1DateMMon.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.measles2) + " - " + getString(R.string.date), Toast.LENGTH_SHORT).show();
                    measles2DateMYear.setError("This data is Required!");
                    measles2DateMMon.setError("This data is Required!");
                    Log.i(TAG, "measles2MDate: This data is Required!");
                    measles2DateMYear.requestFocus();
                    return false;
                } else {
                    measles2DateMYear.setError(null);
                    measles2DateMMon.setError(null);
                }
            }

            if (ti03a.isChecked()) {

                //============ measles2 / Card Present ==========
                if (measles2C.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.measles2), Toast.LENGTH_SHORT).show();
                    measles2C02.setError("This data is Required!");
                    Log.i(TAG, "measles2C: This data is Required!");
                    measles2C02.setFocusable(true);
                    measles2C02.setFocusableInTouchMode(true);
                    measles2C02.requestFocus();
                    return false;
                } else {
                    measles2C02.setError(null);
                }

                if (measles2C01.isChecked() && !measles2datenp.isChecked()) {

                    if (measles2Date.getText().toString().isEmpty()) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.measles2) + " - " + getString(R.string.date), Toast.LENGTH_SHORT).show();
                        measles2Date.setError("This data is Required!");
                        Log.i(TAG, "measles2Date: This data is Required!");
                        measles2Date.requestFocus();
                        return false;
                    } else {
                        measles2Date.setError(null);
                    }
                }
            }

            if (measles2C01.isChecked() || measles2M01.isChecked()) {
                if (measles2Pov.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.measles2) + " - " + getString(R.string.place), Toast.LENGTH_SHORT).show();
                    measles2Pova.setError("This data is Required!");
                    Log.i(TAG, "measles2Pov: This data is Required!");
                    measles2Pova.setFocusable(true);
                    measles2Pova.setFocusableInTouchMode(true);
                    measles2Pova.requestFocus();
                    return false;
                } else {
                    measles2Pova.setError(null);
                }
            }*/

            if (ti04.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.ti04), Toast.LENGTH_SHORT).show();
                ti04888.setError("This data is Required!");
                Log.i(TAG, "ti04: This data is Required!");
                ti04a.setFocusable(true);
                ti04a.setFocusableInTouchMode(true);
                ti04a.requestFocus();
                return false;
            } else {
                ti04888.setError(null);
            }

            if (ti04a.isChecked()) {

                if (!ti05888.isChecked()) {
                    if (ti05.getText().toString().isEmpty()) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.ti05), Toast.LENGTH_SHORT).show();
                        ti05.setError("This data is Required!");
                        ti05.requestFocus();
                        Log.i(TAG, "ti05: This data is Required!");

                        return false;
                    } else {
                        ti05.setError(null);
                    }

                    if (Integer.parseInt(ti05.getText().toString()) < 1) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.ti05), Toast.LENGTH_SHORT).show();
                        ti05.setError("Zero not allowed");
                        ti05.requestFocus();
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
                ti02a.requestFocus();
                Log.i(TAG, "ti02: This data is Required!");
                return false;
            } else {
                ti02a.setError(null);
            }

            if (ti0288.isChecked() && ti0288x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty)" + getString(R.string.ti02) + " - " + getString(R.string.other), Toast.LENGTH_SHORT).show();
                ti0288x.setError("This data is Required!");
                ti0288x.requestFocus();
                Log.i(TAG, "ti0288x: This data is Required!");
                return false;
            } else {
                ti0288x.setError(null);
            }
        }


        return true;
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }


}


