package edu.aku.hassannaqvi.uen_tmk.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import edu.aku.hassannaqvi.uen_tmk.R;
import edu.aku.hassannaqvi.uen_tmk.core.MainApp;

public class SectionHAActivity extends Activity {

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

    private void SaveDraft() throws JSONException {

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
