package edu.aku.hassannaqvi.uen_tmk.activities;

import android.app.Activity;
import android.os.Bundle;

import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.EditText;
import android.widget.CheckBox;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.ButterKnife;
import butterknife.BindView;
import edu.aku.hassannaqvi.uen_tmk.R;
import edu.aku.hassannaqvi.uen_tmk.core.MainApp;

/**
 * Created by ali.azaz on 8/29/2017.
 */

public class SectionHBActivity extends Activity {

    private static final String TAG = SectionHBActivity.class.getName();

    @BindView(R.id.thb01)
    RadioGroup thb01;
    @BindView(R.id.thb01a)
    RadioButton thb01a;
    @BindView(R.id.thb01b)
    RadioButton thb01b;
    @BindView(R.id.thb01888)
    RadioButton thb01888;
    @BindView(R.id.thb02)
    EditText thb02;
    @BindView(R.id.thb03)
    RadioGroup thb03;
    @BindView(R.id.thb03a)
    RadioButton thb03a;
    @BindView(R.id.thb03b)
    RadioButton thb03b;
    @BindView(R.id.thb03888)
    RadioButton thb03888;
    @BindView(R.id.thb04)
    EditText thb04;
    @BindView(R.id.thb05)
    EditText thb05;
    @BindView(R.id.thb06)
    EditText thb06;
    @BindView(R.id.thb07)
    RadioGroup thb07;
    @BindView(R.id.thb07a)
    RadioButton thb07a;
    @BindView(R.id.thb07b)
    RadioButton thb07b;
    @BindView(R.id.thb07888)
    RadioButton thb07888;
    @BindView(R.id.thb08a)
    CheckBox thb08a;
    @BindView(R.id.thb08b)
    CheckBox thb08b;
    @BindView(R.id.thb08c)
    CheckBox thb08c;
    @BindView(R.id.thb08d)
    CheckBox thb08d;
    @BindView(R.id.thb08e)
    CheckBox thb08e;
    @BindView(R.id.thb08f)
    CheckBox thb08f;
    @BindView(R.id.thb08g)
    CheckBox thb08g;
    @BindView(R.id.thb08h)
    CheckBox thb08h;
    @BindView(R.id.thb088)
    CheckBox thb088;
    @BindView(R.id.thb0888x)
    EditText thb0888x;
    @BindView(R.id.thb09)
    EditText thb09;
    @BindView(R.id.thb10)
    RadioGroup thb10;
    @BindView(R.id.thb10a)
    RadioButton thb10a;
    @BindView(R.id.thb10b)
    RadioButton thb10b;
    @BindView(R.id.thb10c)
    RadioButton thb10c;
    @BindView(R.id.thb10d)
    RadioButton thb10d;
    @BindView(R.id.thb11)
    RadioGroup thb11;
    @BindView(R.id.thb11a)
    RadioButton thb11a;
    @BindView(R.id.thb11b)
    RadioButton thb11b;
    @BindView(R.id.thb11c)
    RadioButton thb11c;
    @BindView(R.id.thb11d)
    RadioButton thb11d;
    @BindView(R.id.thb11e)
    RadioButton thb11e;
    @BindView(R.id.thb11f)
    RadioButton thb11f;
    @BindView(R.id.thb11g)
    RadioButton thb11g;
    @BindView(R.id.thb11h)
    RadioButton thb11h;
    @BindView(R.id.thb11i)
    RadioButton thb11i;
    @BindView(R.id.thb11j)
    RadioButton thb11j;
    @BindView(R.id.thb11k)
    RadioButton thb11k;
    @BindView(R.id.thb12a)
    CheckBox thb12a;
    @BindView(R.id.thb12b)
    CheckBox thb12b;
    @BindView(R.id.thb12c)
    CheckBox thb12c;
    @BindView(R.id.thb12d)
    CheckBox thb12d;
    @BindView(R.id.thb12e)
    CheckBox thb12e;
    @BindView(R.id.thb12f)
    CheckBox thb12f;
    @BindView(R.id.thb12g)
    CheckBox thb12g;
    @BindView(R.id.thb12h)
    CheckBox thb12h;
    @BindView(R.id.thb13)
    RadioGroup thb13;
    @BindView(R.id.thb13a)
    RadioButton thb13a;
    @BindView(R.id.thb13b)
    RadioButton thb13b;
    @BindView(R.id.thb14)
    RadioGroup thb14;
    @BindView(R.id.thb14a)
    RadioButton thb14a;
    @BindView(R.id.thb14b)
    RadioButton thb14b;
    @BindView(R.id.thb15)
    RadioGroup thb15;
    @BindView(R.id.thb15a)
    RadioButton thb15a;
    @BindView(R.id.thb15b)
    RadioButton thb15b;
    @BindView(R.id.thb15c)
    RadioButton thb15c;
    @BindView(R.id.thb16)
    RadioGroup thb16;
    @BindView(R.id.thb16a)
    RadioButton thb16a;
    @BindView(R.id.thb16b)
    RadioButton thb16b;
    @BindView(R.id.thb17)
    RadioGroup thb17;
    @BindView(R.id.thb17a)
    RadioButton thb17a;
    @BindView(R.id.thb17b)
    RadioButton thb17b;
    @BindView(R.id.thb17c)
    RadioButton thb17c;
    @BindView(R.id.thb17d)
    RadioButton thb17d;
    @BindView(R.id.thb1788)
    RadioButton thb1788;
    @BindView(R.id.thb1788x)
    EditText thb1788x;
    @BindView(R.id.thb18)
    RadioGroup thb18;
    @BindView(R.id.thb18a)
    RadioButton thb18a;
    @BindView(R.id.thb18b)
    RadioButton thb18b;
    @BindView(R.id.thb18c)
    RadioButton thb18c;
    @BindView(R.id.thb19)
    RadioGroup thb19;
    @BindView(R.id.thb19a)
    RadioButton thb19a;
    @BindView(R.id.thb19b)
    RadioButton thb19b;
    @BindView(R.id.thb19c)
    RadioButton thb19c;
    @BindView(R.id.thb19d)
    RadioButton thb19d;
    @BindView(R.id.thb19e)
    RadioButton thb19e;
    @BindView(R.id.thb20a)
    CheckBox thb20a;
    @BindView(R.id.thb20b)
    CheckBox thb20b;
    @BindView(R.id.thb20c)
    CheckBox thb20c;
    @BindView(R.id.thb20d)
    CheckBox thb20d;
    @BindView(R.id.thb20e)
    CheckBox thb20e;
    @BindView(R.id.thb20f)
    CheckBox thb20f;
    @BindView(R.id.thb20g)
    CheckBox thb20g;
    @BindView(R.id.thb21)
    RadioGroup thb21;
    @BindView(R.id.thb21a)
    RadioButton thb21a;
    @BindView(R.id.thb21b)
    RadioButton thb21b;
    @BindView(R.id.thb21c)
    RadioButton thb21c;
    @BindView(R.id.thb21hr)
    EditText thb21hr;
    @BindView(R.id.thb21d)
    EditText thb21d;
    @BindView(R.id.thb22)
    RadioGroup thb22;
    @BindView(R.id.thb22a)
    RadioButton thb22a;
    @BindView(R.id.thb22b)
    RadioButton thb22b;
    @BindView(R.id.thb23)
    EditText thb23;
    @BindView(R.id.thb24)
    RadioGroup thb24;
    @BindView(R.id.thb24a)
    RadioButton thb24a;
    @BindView(R.id.thb24b)
    RadioButton thb24b;
    @BindView(R.id.thb25a)
    CheckBox thb25a;
    @BindView(R.id.thb25b)
    CheckBox thb25b;
    @BindView(R.id.thb25c)
    CheckBox thb25c;
    @BindView(R.id.thb25d)
    CheckBox thb25d;
    @BindView(R.id.thb25e)
    CheckBox thb25e;
    @BindView(R.id.thb25f)
    CheckBox thb25f;
    @BindView(R.id.thb25g)
    CheckBox thb25g;
    @BindView(R.id.thb26)
    RadioGroup thb26;
    @BindView(R.id.thb26a)
    RadioButton thb26a;
    @BindView(R.id.thb26b)
    RadioButton thb26b;
    @BindView(R.id.thb26c)
    RadioButton thb26c;
    @BindView(R.id.thb27)
    EditText thb27;
    @BindView(R.id.thb28)
    RadioGroup thb28;
    @BindView(R.id.thb28a)
    RadioButton thb28a;
    @BindView(R.id.thb28b)
    RadioButton thb28b;
    @BindView(R.id.thb28c)
    RadioButton thb28c;
    @BindView(R.id.thb28d)
    RadioButton thb28d;
    @BindView(R.id.thb28e)
    RadioButton thb28e;
    @BindView(R.id.thb28f)
    RadioButton thb28f;
    @BindView(R.id.thb28g)
    RadioButton thb28g;
    @BindView(R.id.thb28h)
    RadioButton thb28h;
    @BindView(R.id.thb28i)
    RadioButton thb28i;
    @BindView(R.id.thb2888)
    RadioButton thb2888;
    @BindView(R.id.thb2888x)
    EditText thb2888x;
    @BindView(R.id.thb29)
    EditText thb29;
    @BindView(R.id.thb30)
    EditText thb30;
    @BindView(R.id.thb31)
    RadioGroup thb31;
    @BindView(R.id.thb31a)
    RadioButton thb31a;
    @BindView(R.id.thb31b)
    RadioButton thb31b;
    @BindView(R.id.thb31c)
    RadioButton thb31c;
    @BindView(R.id.thb32)
    RadioGroup thb32;
    @BindView(R.id.thb32a)
    RadioButton thb32a;
    @BindView(R.id.thb32b)
    RadioButton thb32b;
    @BindView(R.id.thb3288)
    RadioButton thb3288;
    @BindView(R.id.thb33)
    RadioGroup thb33;
    @BindView(R.id.thb33a)
    RadioButton thb33a;
    @BindView(R.id.thb33b)
    RadioButton thb33b;
    @BindView(R.id.thb3388)
    RadioButton thb3388;
    @BindView(R.id.thb34)
    EditText thb34;
    @BindView(R.id.thb35)
    RadioGroup thb35;
    @BindView(R.id.thb35a)
    RadioButton thb35a;
    @BindView(R.id.thb35b)
    RadioButton thb35b;
    @BindView(R.id.thb35c)
    RadioButton thb35c;
    @BindView(R.id.thb36a)
    CheckBox thb36a;
    @BindView(R.id.thb36b)
    CheckBox thb36b;
    @BindView(R.id.thb36c)
    CheckBox thb36c;
    @BindView(R.id.thb36d)
    CheckBox thb36d;
    @BindView(R.id.thb36e)
    CheckBox thb36e;
    @BindView(R.id.thb36f)
    CheckBox thb36f;
    @BindView(R.id.thb36g)
    CheckBox thb36g;
    @BindView(R.id.thb36h)
    CheckBox thb36h;
    @BindView(R.id.thb36i)
    CheckBox thb36i;
    @BindView(R.id.thb36j)
    CheckBox thb36j;
    @BindView(R.id.thb36k)
    CheckBox thb36k;
    @BindView(R.id.thb3688)
    CheckBox thb3688;
    @BindView(R.id.thb3688x)
    EditText thb3688x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_hb);
        ButterKnife.bind(this);
    }


    private void SaveDraft() throws JSONException {

        Toast.makeText(this, "Saving Draft for This Section", Toast.LENGTH_SHORT).show();

        JSONObject sHB = new JSONObject();

        sHB.put("thb01", thb01a.isChecked() ? "1" : thb01b.isChecked() ? "2" : thb01888.isChecked() ? "888" : "0");
        sHB.put("thb02", thb02.getText().toString());

        sHB.put("thb03", thb03a.isChecked() ? "1" : thb03b.isChecked() ? "2" : thb03888.isChecked() ? "888" : "0");
        sHB.put("thb04", thb04.getText().toString());
        sHB.put("thb05", thb05.getText().toString());
        sHB.put("thb06", thb06.getText().toString());
        sHB.put("thb07", thb07a.isChecked() ? "1" : thb07b.isChecked() ? "2" : thb07888.isChecked() ? "888" : "0");


        sHB.put("thb08a", thb08a.isChecked() ? "1" : "0");
        sHB.put("thb08b", thb08b.isChecked() ? "1" : "0");
        sHB.put("thb08c", thb08c.isChecked() ? "1" : "0");
        sHB.put("thb08d", thb08d.isChecked() ? "1" : "0");
        sHB.put("thb08e", thb08e.isChecked() ? "1" : "0");
        sHB.put("thb08f", thb08f.isChecked() ? "1" : "0");
        sHB.put("thb08g", thb08g.isChecked() ? "1" : "0");
        sHB.put("thb08h", thb08h.isChecked() ? "1" : "0");
        sHB.put("thb088", thb088.isChecked() ? "1" : "0");

        sHB.put("thb0888x", thb0888x.getText().toString());

        sHB.put("thb09", thb09.getText().toString());

        sHB.put("thb10", thb10a.isChecked() ? "1" : thb10b.isChecked() ? "2"
                : thb10c.isChecked() ? "3"
                : thb10d.isChecked() ? "4"
                : "0");


        sHB.put("thb11", thb11a.isChecked() ? "1" : thb11b.isChecked() ? "2"
                : thb11c.isChecked() ? "3"
                : thb11d.isChecked() ? "4"
                : thb11e.isChecked() ? "4"
                : thb11f.isChecked() ? "5"
                : thb11g.isChecked() ? "6"
                : thb11h.isChecked() ? "7"
                : thb11i.isChecked() ? "8"
                : thb11j.isChecked() ? "9"
                : thb11k.isChecked() ? "10"
                : "0");


        sHB.put("thb12a", thb12a.isChecked() ? "1" : "0");
        sHB.put("thb12b", thb12b.isChecked() ? "1" : "0");
        sHB.put("thb12c", thb12c.isChecked() ? "1" : "0");
        sHB.put("thb12d", thb12d.isChecked() ? "1" : "0");
        sHB.put("thb12e", thb12e.isChecked() ? "1" : "0");
        sHB.put("thb12f", thb12f.isChecked() ? "1" : "0");
        sHB.put("thb12g", thb12g.isChecked() ? "1" : "0");
        sHB.put("thb12h", thb12h.isChecked() ? "1" : "0");

        sHB.put("thb13", thb13a.isChecked() ? "1" : thb13b.isChecked() ? "2" : "0");
        sHB.put("thb14", thb14a.isChecked() ? "1" : thb14b.isChecked() ? "2" : "0");
        sHB.put("thb15", thb15a.isChecked() ? "1" : thb15b.isChecked() ? "2" : thb15c.isChecked() ? "3" : "0");
        sHB.put("thb16", thb16a.isChecked() ? "1" : thb16b.isChecked() ? "2" : "0");


        sHB.put("thb17", thb17a.isChecked() ? "1" : thb17b.isChecked() ? "2"
                : thb17c.isChecked() ? "3"
                : thb17d.isChecked() ? "4"
                : thb1788.isChecked() ? "88"
                : "0");


        sHB.put("thb18", thb18a.isChecked() ? "1" : thb18b.isChecked() ? "2" : thb18c.isChecked() ? "3" : "0");


        sHB.put("thb19", thb19a.isChecked() ? "1" : thb19b.isChecked() ? "2"
                : thb19c.isChecked() ? "3"
                : thb19d.isChecked() ? "4"
                : thb19e.isChecked() ? "5"
                : "0");


        sHB.put("thb20a", thb20a.isChecked() ? "1" : "0");
        sHB.put("thb20b", thb20b.isChecked() ? "1" : "0");
        sHB.put("thb20c", thb20c.isChecked() ? "1" : "0");
        sHB.put("thb20d", thb20d.isChecked() ? "1" : "0");
        sHB.put("thb20e", thb20e.isChecked() ? "1" : "0");
        sHB.put("thb20f", thb20f.isChecked() ? "1" : "0");
        sHB.put("thb20g", thb20g.isChecked() ? "1" : "0");

        sHB.put("thb21", thb21a.isChecked() ? "1" : thb21b.isChecked() ? "2" : thb21c.isChecked() ? "3" : "0");

        sHB.put("thb21hr", thb21hr.getText().toString());
        sHB.put("thb21d", thb21d.getText().toString());

        sHB.put("thb22", thb22a.isChecked() ? "1" : thb22b.isChecked() ? "2" : "0");
        sHB.put("thb23", thb23.getText().toString());
        sHB.put("thb24", thb24a.isChecked() ? "1" : thb24b.isChecked() ? "2" : "0");


        sHB.put("thb25a", thb25a.isChecked() ? "1" : "0");
        sHB.put("thb25b", thb25b.isChecked() ? "1" : "0");
        sHB.put("thb25c", thb25c.isChecked() ? "1" : "0");
        sHB.put("thb25d", thb25d.isChecked() ? "1" : "0");
        sHB.put("thb25e", thb25e.isChecked() ? "1" : "0");
        sHB.put("thb25f", thb25f.isChecked() ? "1" : "0");
        sHB.put("thb25g", thb25g.isChecked() ? "1" : "0");


        sHB.put("thb26", thb26a.isChecked() ? "1" : thb26b.isChecked() ? "2" : thb26c.isChecked() ? "3" : "0");
        sHB.put("thb27", thb27.getText().toString());


        sHB.put("thb28", thb28a.isChecked() ? "1"
                : thb28b.isChecked() ? "2"
                : thb28d.isChecked() ? "3"
                : thb28e.isChecked() ? "4"
                : thb28f.isChecked() ? "4"
                : thb28g.isChecked() ? "5"
                : thb28h.isChecked() ? "6"
                : thb28i.isChecked() ? "7"
                : thb2888.isChecked() ? "88"
                : "0");


        sHB.put("thb2888x", thb2888x.getText().toString());

        sHB.put("thb29", thb29.getText().toString());
        sHB.put("thb30", thb30.getText().toString());

        sHB.put("thb31", thb31a.isChecked() ? "1" : thb31b.isChecked() ? "2" : "0");
        sHB.put("thb32", thb32a.isChecked() ? "1" : thb32b.isChecked() ? "2" : thb3288.isChecked() ? "888"
                : "0");

        sHB.put("thb33", thb33a.isChecked() ? "1" : thb33b.isChecked() ? "2" : thb3388.isChecked() ? "888"
                : "0");

        sHB.put("thb34", thb34.getText().toString());
        sHB.put("thb35", thb35a.isChecked() ? "1" : thb35b.isChecked() ? "2" : thb35c.isChecked() ? "3" : "0");


        sHB.put("thb36a", thb36a.isChecked() ? "1" : "0");
        sHB.put("thb36b", thb36b.isChecked() ? "1" : "0");
        sHB.put("thb36c", thb36c.isChecked() ? "1" : "0");
        sHB.put("thb36d", thb36d.isChecked() ? "1" : "0");
        sHB.put("thb36e", thb36e.isChecked() ? "1" : "0");
        sHB.put("thb36f", thb36f.isChecked() ? "1" : "0");
        sHB.put("thb36g", thb36g.isChecked() ? "1" : "0");
        sHB.put("thb36h", thb36h.isChecked() ? "1" : "0");
        sHB.put("thb36i", thb36i.isChecked() ? "1" : "0");
        sHB.put("thb36j", thb36j.isChecked() ? "1" : "0");
        sHB.put("thb36k", thb36k.isChecked() ? "1" : "0");
        sHB.put("thb3688", thb3688.isChecked() ? "1" : "0");

        sHB.put("thb3688x", thb3688x.getText().toString());

        MainApp.fc.sHB(sHB);
    }

}