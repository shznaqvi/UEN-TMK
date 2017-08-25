package edu.aku.hassannaqvi.uen_tmk.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.uen_tmk.core.MainApp;

public class SectionCActivity extends Activity {

    @BindView(R.id.te01)
    RadioGroup te01;
    @BindView(R.id.te01a)
    RadioButton te01a;
    @BindView(R.id.te01b)
    RadioButton te01b;
    @BindView(R.id.te01c)
    RadioButton te01c;
    @BindView(R.id.te01d)
    RadioButton te01d;
    @BindView(R.id.te01e)
    RadioButton te01e;
    @BindView(R.id.te01f)
    RadioButton te01f;
    @BindView(R.id.te01g)
    RadioButton te01g;
    @BindView(R.id.te01h)
    RadioButton te01h;
    @BindView(R.id.te01i)
    RadioButton te01i;
    @BindView(R.id.te01j)
    RadioButton te01j;
    @BindView(R.id.te01k)
    RadioButton te01k;
    @BindView(R.id.te01l)
    RadioButton te01l;
    @BindView(R.id.te02)
    RadioGroup te02;
    @BindView(R.id.te02a)
    RadioButton te02a;
    @BindView(R.id.te02b)
    RadioButton te02b;
    @BindView(R.id.te02c)
    RadioButton te02c;
    @BindView(R.id.te02d)
    RadioButton te02d;
    @BindView(R.id.te02e)
    RadioButton te02e;
    @BindView(R.id.te02f)
    RadioButton te02f;
    @BindView(R.id.te02g)
    RadioButton te02g;
    @BindView(R.id.te02h)
    RadioButton te02h;
    @BindView(R.id.te02i)
    RadioButton te02i;
    @BindView(R.id.te02j)
    RadioButton te02j;
    @BindView(R.id.te02k)
    RadioButton te02k;
    @BindView(R.id.te02l)
    RadioButton te02l;
    @BindView(R.id.te02m)
    RadioButton te02m;
    @BindView(R.id.te02n)
    RadioButton te02n;
    @BindView(R.id.te02o)
    RadioButton te02o;
    @BindView(R.id.te03)
    RadioGroup te03;
    @BindView(R.id.te03a)
    RadioButton te03a;
    @BindView(R.id.te03b)
    RadioButton te03b;
    @BindView(R.id.te03c)
    RadioButton te03c;
    @BindView(R.id.te03d)
    RadioButton te03d;
    @BindView(R.id.te03e)
    RadioButton te03e;
    @BindView(R.id.te03f)
    RadioButton te03f;
    @BindView(R.id.te03g)
    RadioButton te03g;
    @BindView(R.id.te03h)
    RadioButton te03h;
    @BindView(R.id.te03i)
    RadioButton te03i;
    @BindView(R.id.te03j)
    RadioButton te03j;
    @BindView(R.id.te03k)
    RadioButton te03k;
    @BindView(R.id.te03l)
    RadioButton te03l;
    @BindView(R.id.te03m)
    RadioButton te03m;
    @BindView(R.id.te03n)
    RadioButton te03n;
    @BindView(R.id.te03o)
    RadioButton te03o;
    @BindView(R.id.te03p)
    RadioButton te03p;
    @BindView(R.id.te03q)
    RadioButton te03q;
    @BindView(R.id.te04)
    EditText te04;
    @BindView(R.id.te05)
    RadioGroup te05;
    @BindView(R.id.te05a)
    RadioButton te05a;
    @BindView(R.id.te05b)
    RadioButton te05b;
    @BindView(R.id.te0588)
    RadioButton te0588;
    @BindView(R.id.te0588x)
    EditText te0588x;
    @BindView(R.id.te06)
    RadioGroup te06;
    @BindView(R.id.te06a)
    RadioButton te06a;
    @BindView(R.id.te06b)
    RadioButton te06b;
    @BindView(R.id.te06c)
    RadioButton te06c;
    @BindView(R.id.te06d)
    RadioButton te06d;
    @BindView(R.id.te0688)
    RadioButton te0688;
    @BindView(R.id.te0688x)
    EditText te0688x;
    @BindView(R.id.te07)
    RadioGroup te07;
    @BindView(R.id.te07a)
    RadioButton te07a;
    @BindView(R.id.te07b)
    RadioButton te07b;
    @BindView(R.id.te07c)
    RadioButton te07c;
    @BindView(R.id.te07d)
    RadioButton te07d;
    @BindView(R.id.te07e)
    RadioButton te07e;
    @BindView(R.id.te07f)
    RadioButton te07f;
    @BindView(R.id.te07g)
    RadioButton te07g;
    @BindView(R.id.te07h)
    RadioButton te07h;
    @BindView(R.id.te07i)
    RadioButton te07i;
    @BindView(R.id.te07j)
    RadioButton te07j;
    @BindView(R.id.te07k)
    RadioButton te07k;
    @BindView(R.id.te07l)
    RadioButton te07l;
    @BindView(R.id.te0788)
    RadioButton te0788;
    @BindView(R.id.te0788x)
    EditText te0788x;
    @BindView(R.id.te08a)
    RadioGroup te08a;
    @BindView(R.id.te08aa)
    RadioButton te08aa;
    @BindView(R.id.te08ab)
    RadioButton te08ab;
    @BindView(R.id.te08b)
    RadioGroup te08b;
    @BindView(R.id.te08ba)
    RadioButton te08ba;
    @BindView(R.id.te08bb)
    RadioButton te08bb;
    @BindView(R.id.te08c)
    RadioGroup te08c;
    @BindView(R.id.te08ca)
    RadioButton te08ca;
    @BindView(R.id.te08cb)
    RadioButton te08cb;
    @BindView(R.id.te08d)
    RadioGroup te08d;
    @BindView(R.id.te08da)
    RadioButton te08da;
    @BindView(R.id.te08db)
    RadioButton te08db;
    @BindView(R.id.te08e)
    RadioGroup te08e;
    @BindView(R.id.te08ea)
    RadioButton te08ea;
    @BindView(R.id.te08eb)
    RadioButton te08eb;
    @BindView(R.id.te08f)
    RadioGroup te08f;
    @BindView(R.id.te08fa)
    RadioButton te08fa;
    @BindView(R.id.te08fb)
    RadioButton te08fb;
    @BindView(R.id.te08g)
    RadioGroup te08g;
    @BindView(R.id.te08ga)
    RadioButton te08ga;
    @BindView(R.id.te08gb)
    RadioButton te08gb;
    @BindView(R.id.te08h)
    RadioGroup te08h;
    @BindView(R.id.te08ha)
    RadioButton te08ha;
    @BindView(R.id.te08hb)
    RadioButton te08hb;
    @BindView(R.id.te08i)
    RadioGroup te08i;
    @BindView(R.id.te08ia)
    RadioButton te08ia;
    @BindView(R.id.te08ib)
    RadioButton te08ib;
    @BindView(R.id.te08j)
    RadioGroup te08j;
    @BindView(R.id.te08ja)
    RadioButton te08ja;
    @BindView(R.id.te08jb)
    RadioButton te08jb;
    @BindView(R.id.te08k)
    RadioGroup te08k;
    @BindView(R.id.te08ka)
    RadioButton te08ka;
    @BindView(R.id.te08kb)
    RadioButton te08kb;
    @BindView(R.id.te08l)
    RadioGroup te08l;
    @BindView(R.id.te08la)
    RadioButton te08la;
    @BindView(R.id.te08lb)
    RadioButton te08lb;
    @BindView(R.id.te08m)
    RadioGroup te08m;
    @BindView(R.id.te08ma)
    RadioButton te08ma;
    @BindView(R.id.te08mb)
    RadioButton te08mb;
    @BindView(R.id.te08n)
    RadioGroup te08n;
    @BindView(R.id.te08na)
    RadioButton te08na;
    @BindView(R.id.te08nb)
    RadioButton te08nb;
    @BindView(R.id.te08o)
    RadioGroup te08o;
    @BindView(R.id.te08oa)
    RadioButton te08oa;
    @BindView(R.id.te08ob)
    RadioButton te08ob;
    @BindView(R.id.te08p)
    RadioGroup te08p;
    @BindView(R.id.te08pa)
    RadioButton te08pa;
    @BindView(R.id.te08pb)
    RadioButton te08pb;
    @BindView(R.id.te08q)
    RadioGroup te08q;
    @BindView(R.id.te08qa)
    RadioButton te08qa;
    @BindView(R.id.te08qb)
    RadioButton te08qb;
    @BindView(R.id.te08r)
    RadioGroup te08r;
    @BindView(R.id.te08ra)
    RadioButton te08ra;
    @BindView(R.id.te08rb)
    RadioButton te08rb;
    @BindView(R.id.te09a)
    RadioGroup te09a;
    @BindView(R.id.te09aa)
    RadioButton te09aa;
    @BindView(R.id.te09ab)
    RadioButton te09ab;
    @BindView(R.id.te09b)
    RadioGroup te09b;
    @BindView(R.id.te09ba)
    RadioButton te09ba;
    @BindView(R.id.te09bb)
    RadioButton te09bb;
    @BindView(R.id.te09c)
    RadioGroup te09c;
    @BindView(R.id.te09ca)
    RadioButton te09ca;
    @BindView(R.id.te09cb)
    RadioButton te09cb;
    @BindView(R.id.te09d)
    RadioGroup te09d;
    @BindView(R.id.te09da)
    RadioButton te09da;
    @BindView(R.id.te09db)
    RadioButton te09db;
    @BindView(R.id.te09e)
    RadioGroup te09e;
    @BindView(R.id.te09ea)
    RadioButton te09ea;
    @BindView(R.id.te09eb)
    RadioButton te09eb;
    @BindView(R.id.te09f)
    RadioGroup te09f;
    @BindView(R.id.te09fa)
    RadioButton te09fa;
    @BindView(R.id.te09fb)
    RadioButton te09fb;
    @BindView(R.id.te09g)
    RadioGroup te09g;
    @BindView(R.id.te09ga)
    RadioButton te09ga;
    @BindView(R.id.te09gb)
    RadioButton te09gb;
    @BindView(R.id.te09h)
    RadioGroup te09h;
    @BindView(R.id.te09ha)
    RadioButton te09ha;
    @BindView(R.id.te09hb)
    RadioButton te09hb;
    @BindView(R.id.te09i)
    RadioGroup te09i;
    @BindView(R.id.te09ia)
    RadioButton te09ia;
    @BindView(R.id.te09ib)
    RadioButton te09ib;
    @BindView(R.id.te10)
    RadioGroup te10;
    @BindView(R.id.te10a)
    RadioButton te10a;
    @BindView(R.id.te10b)
    RadioButton te10b;
    @BindView(R.id.te11)
    RadioGroup te11;
    @BindView(R.id.te11a)
    RadioButton te11a;
    @BindView(R.id.te11b)
    RadioButton te11b;
    @BindView(R.id.fldGrpte12)
    LinearLayout fldGrpte12;
    @BindView(R.id.te12)
    RadioGroup te12;
    @BindView(R.id.te12a)
    RadioButton te12a;
    @BindView(R.id.te12b)
    RadioButton te12b;
    @BindView(R.id.te1288)
    RadioButton te1288;
    @BindView(R.id.te1288x)
    EditText te1288x;
    @BindView(R.id.te13)
    RadioGroup te13;
    @BindView(R.id.te13a)
    RadioButton te13a;
    @BindView(R.id.te13b)
    RadioButton te13b;
    @BindView(R.id.fldGrpte14)
    LinearLayout fldGrpte14;
    @BindView(R.id.te14a)
    EditText te14a;
    @BindView(R.id.te14b)
    EditText te14b;
    @BindView(R.id.te14c)
    EditText te14c;
    @BindView(R.id.te14d)
    EditText te14d;
    @BindView(R.id.te14e)
    EditText te14e;
    @BindView(R.id.te14f)
    EditText te14f;
    @BindView(R.id.te15)
    RadioGroup te15;
    @BindView(R.id.te15a)
    RadioButton te15a;
    @BindView(R.id.te15b)
    RadioButton te15b;
    @BindView(R.id.te16)
    RadioGroup te16;
    @BindView(R.id.te16a)
    RadioButton te16a;
    @BindView(R.id.te16b)
    RadioButton te16b;
    @BindView(R.id.te16c)
    RadioButton te16c;
    @BindView(R.id.te16d)
    RadioButton te16d;
    @BindView(R.id.te16e)
    RadioButton te16e;
    @BindView(R.id.te16f)
    RadioButton te16f;
    @BindView(R.id.te16g)
    RadioButton te16g;
    @BindView(R.id.te16h)
    RadioButton te16h;
    @BindView(R.id.te1688)
    RadioButton te1688;
    @BindView(R.id.te1688x)
    EditText te1688x;
    @BindView(R.id.te17)
    EditText te17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_e);
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
