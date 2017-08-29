package edu.aku.hassannaqvi.uen_tmk.activities;

import android.os.Bundle;
import android.app.Activity;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.EditText;
import android.widget.CheckBox;

import butterknife.ButterKnife;
import edu.aku.hassannaqvi.uen_tmk.core.DatabaseHelper;
import edu.aku.hassannaqvi.uen_tmk.core.MainApp;

import butterknife.BindViews;

public class SectionHAActivity extends Activity {



    @BindViews(R.id.tha01)
    RadioGroup tha01;
    @BindViews(R.id.tha01a)
    RadioButton tha01a;
    @BindViews(R.id.tha01b)
    RadioButton tha01b;
    @BindViews(R.id.tha0188)
    RadioButton tha0188;
    @BindViews(R.id.tha02)
    EditText tha02;
    @BindViews(R.id.tha03)
    EditText tha03;
    @BindViews(R.id.tha04)
    EditText tha04;
    @BindViews(R.id.tha05)
    RadioGroup tha05;
    @BindViews(R.id.tha05a)
    RadioButton tha05a;
    @BindViews(R.id.tha05b)
    RadioButton tha05b;
    @BindViews(R.id.tha0588)
    RadioButton tha0588;
    @BindViews(R.id.tha06)
    RadioGroup tha06;
    @BindViews(R.id.tha06a)
    RadioButton tha06a;
    @BindViews(R.id.tha06b)
    RadioButton tha06b;
    @BindViews(R.id.tha0688)
    RadioButton tha0688;
    @BindViews(R.id.tha07a)
    CheckBox tha07a;
    @BindViews(R.id.tha07b)
    CheckBox tha07b;
    @BindViews(R.id.tha07c)
    CheckBox tha07c;
    @BindViews(R.id.tha07d)
    CheckBox tha07d;
    @BindViews(R.id.tha07e)
    CheckBox tha07e;
    @BindViews(R.id.tha07f)
    CheckBox tha07f;
    @BindViews(R.id.tha07g)
    CheckBox tha07g;
    @BindViews(R.id.tha07h)
    CheckBox tha07h;
    @BindViews(R.id.tha0788)
    CheckBox tha0788;
    @BindViews(R.id.tha0788x)
    EditText tha0788x;
    @BindViews(R.id.tha018)
    EditText tha018;
    @BindViews(R.id.tha09a)
    CheckBox tha09a;
    @BindViews(R.id.tha09b)
    CheckBox tha09b;
    @BindViews(R.id.tha09c)
    CheckBox tha09c;
    @BindViews(R.id.tha09d)
    CheckBox tha09d;
    @BindViews(R.id.tha10)
    RadioGroup tha10;
    @BindViews(R.id.tha10a)
    RadioButton tha10a;
    @BindViews(R.id.tha10b)
    RadioButton tha10b;
    @BindViews(R.id.tha10c)
    RadioButton tha10c;
    @BindViews(R.id.tha10d)
    RadioButton tha10d;
    @BindViews(R.id.tha10e)
    RadioButton tha10e;
    @BindViews(R.id.tha10f)
    RadioButton tha10f;
    @BindViews(R.id.tha10g)
    RadioButton tha10g;
    @BindViews(R.id.tha10h)
    RadioButton tha10h;
    @BindViews(R.id.tha10i)
    RadioButton tha10i;
    @BindViews(R.id.tha10j)
    RadioButton tha10j;
    @BindViews(R.id.tha10k)
    RadioButton tha10k;
    @BindViews(R.id.tha11a)
    CheckBox tha11a;
    @BindViews(R.id.tha11b)
    CheckBox tha11b;
    @BindViews(R.id.tha11c)
    CheckBox tha11c;
    @BindViews(R.id.tha11d)
    CheckBox tha11d;
    @BindViews(R.id.tha11e)
    CheckBox tha11e;
    @BindViews(R.id.tha11f)
    CheckBox tha11f;
    @BindViews(R.id.tha11g)
    CheckBox tha11g;
    @BindViews(R.id.tha11h)
    CheckBox tha11h;
    @BindViews(R.id.tha11i)
    CheckBox tha11i;
    @BindViews(R.id.tha11j)
    CheckBox tha11j;
    @BindViews(R.id.tha12)
    RadioGroup tha12;
    @BindViews(R.id.tha12a)
    RadioButton tha12a;
    @BindViews(R.id.tha12b)
    RadioButton tha12b;
    @BindViews(R.id.tha13)
    RadioGroup tha13;
    @BindViews(R.id.tha13a)
    RadioButton tha13a;
    @BindViews(R.id.tha13b)
    RadioButton tha13b;
    @BindViews(R.id.tha14)
    RadioGroup tha14;
    @BindViews(R.id.tha14a)
    RadioButton tha14a;
    @BindViews(R.id.tha14b)
    RadioButton tha14b;
    @BindViews(R.id.tha14c)
    RadioButton tha14c;
    @BindViews(R.id.tha15)
    RadioGroup tha15;
    @BindViews(R.id.tha15a)
    RadioButton tha15a;
    @BindViews(R.id.tha15b)
    RadioButton tha15b;
    @BindViews(R.id.tha16)
    RadioGroup tha16;
    @BindViews(R.id.tha16a)
    RadioButton tha16a;
    @BindViews(R.id.tha16b)
    RadioButton tha16b;
    @BindViews(R.id.tha16c)
    RadioButton tha16c;
    @BindViews(R.id.tha16d)
    RadioButton tha16d;
    @BindViews(R.id.tha1688)
    RadioButton tha1688;
    @BindViews(R.id.tha1688x)
    EditText tha1688x;
    @BindViews(R.id.tha17)
    RadioGroup tha17;
    @BindViews(R.id.tha17a)
    RadioButton tha17a;
    @BindViews(R.id.tha17b)
    RadioButton tha17b;
    @BindViews(R.id.tha17c)
    RadioButton tha17c;
    @BindViews(R.id.tha18)
    RadioGroup tha18;
    @BindViews(R.id.tha18a)
    RadioButton tha18a;
    @BindViews(R.id.tha18b)
    RadioButton tha18b;
    @BindViews(R.id.tha18c)
    RadioButton tha18c;
    @BindViews(R.id.tha18d)
    RadioButton tha18d;
    @BindViews(R.id.tha18e)
    RadioButton tha18e;
    @BindViews(R.id.tha19a)
    CheckBox tha19a;
    @BindViews(R.id.tha19b)
    CheckBox tha19b;
    @BindViews(R.id.tha19d)
    CheckBox tha19d;
    @BindViews(R.id.tha19e)
    CheckBox tha19e;
    @BindViews(R.id.tha19f)
    CheckBox tha19f;
    @BindViews(R.id.tha19g)
    CheckBox tha19g;
    @BindViews(R.id.tha19h)
    CheckBox tha19h;
    @BindViews(R.id.tha19i)
    CheckBox tha19i;
    @BindViews(R.id.tha20)
    RadioGroup tha20;
    @BindViews(R.id.tha20a)
    RadioButton tha20a;
    @BindViews(R.id.tha20b)
    RadioButton tha20b;
    @BindViews(R.id.tha20c)
    RadioButton tha20c;
    @BindViews(R.id.tha20hr)
    EditText tha20hr;
    @BindViews(R.id.tha20d)
    EditText tha20d;
    @BindViews(R.id.tha21)
    RadioGroup tha21;
    @BindViews(R.id.tha21a)
    RadioButton tha21a;
    @BindViews(R.id.tha21b)
    RadioButton tha21b;
    @BindViews(R.id.tha22)
    EditText tha22;
    @BindViews(R.id.tha23)
    RadioGroup tha23;
    @BindViews(R.id.tha23a)
    RadioButton tha23a;
    @BindViews(R.id.tha23b)
    RadioButton tha23b;
    @BindViews(R.id.tha24a)
    CheckBox tha24a;
    @BindViews(R.id.tha24b)
    CheckBox tha24b;
    @BindViews(R.id.tha24c)
    CheckBox tha24c;
    @BindViews(R.id.tha24d)
    CheckBox tha24d;
    @BindViews(R.id.tha24e)
    CheckBox tha24e;
    @BindViews(R.id.tha24f)
    CheckBox tha24f;
    @BindViews(R.id.tha24g)
    CheckBox tha24g;
    @BindViews(R.id.tha25)
    RadioGroup tha25;
    @BindViews(R.id.tha25a)
    RadioButton tha25a;
    @BindViews(R.id.tha25b)
    RadioButton tha25b;
    @BindViews(R.id.tha25c)
    RadioButton tha25c;
    @BindViews(R.id.tha26)
    EditText tha26;
    @BindViews(R.id.tha27)
    RadioGroup tha27;
    @BindViews(R.id.tha27a)
    RadioButton tha27a;
    @BindViews(R.id.tha27b)
    RadioButton tha27b;
    @BindViews(R.id.tha27c)
    RadioButton tha27c;
    @BindViews(R.id.tha27d)
    RadioButton tha27d;
    @BindViews(R.id.tha27e)
    RadioButton tha27e;
    @BindViews(R.id.tha27f)
    RadioButton tha27f;
    @BindViews(R.id.tha27g)
    RadioButton tha27g;
    @BindViews(R.id.tha27h)
    RadioButton tha27h;
    @BindViews(R.id.tha2788)
    RadioButton tha2788;
    @BindViews(R.id.tha2788x)
    EditText tha2788x;
    @BindViews(R.id.tha28)
    EditText tha28;
    @BindViews(R.id.tha29)
    EditText tha29;
    @BindViews(R.id.tha30)
    EditText tha30;
    @BindViews(R.id.tha31)
    RadioGroup tha31;
    @BindViews(R.id.tha31a)
    RadioButton tha31a;
    @BindViews(R.id.tha31b)
    RadioButton tha31b;
    @BindViews(R.id.tha31c)
    RadioButton tha31c;
    @BindViews(R.id.tha32)
    RadioGroup tha32;
    @BindViews(R.id.tha32a)
    RadioButton tha32a;
    @BindViews(R.id.tha32b)
    RadioButton tha32b;
    @BindViews(R.id.tha33)
    RadioGroup tha33;
    @BindViews(R.id.tha33a)
    RadioButton tha33a;
    @BindViews(R.id.tha33b)
    RadioButton tha33b;
    @BindViews(R.id.tha34)
    RadioGroup tha34;
    @BindViews(R.id.tha34a)
    RadioButton tha34a;
    @BindViews(R.id.tha34b)
    RadioButton tha34b;
    @BindViews(R.id.tha34c)
    RadioButton tha34c;
    @BindViews(R.id.tha34d)
    RadioButton tha34d;
    @BindViews(R.id.tha34e)
    RadioButton tha34e;
    @BindViews(R.id.tha34f)
    RadioButton tha34f;
    @BindViews(R.id.tha34g)
    RadioButton tha34g;
    @BindViews(R.id.tha34h)
    RadioButton tha34h;
    @BindViews(R.id.tha34i)
    RadioButton tha34i;
    @BindViews(R.id.tha34j)
    RadioButton tha34j;
    @BindViews(R.id.tha34k)
    RadioButton tha34k;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_ha);
        ButterKnife.bind(this);
    }

}
