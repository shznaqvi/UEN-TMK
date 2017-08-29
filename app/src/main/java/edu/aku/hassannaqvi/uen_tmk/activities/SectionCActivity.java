package edu.aku.hassannaqvi.uen_tmk.activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.view.View;
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

public class SectionCActivity extends Activity {

    @BindView(R.id.tc01)
    RadioGroup tc01;
    @BindView(R.id.tc01a)
    RadioButton tc01a;
    @BindView(R.id.tc01b)
    RadioButton tc01b;
    @BindView(R.id.tc01c)
    RadioButton tc01c;
    @BindView(R.id.tc01d)
    RadioButton tc01d;
    @BindView(R.id.tc01e)
    RadioButton tc01e;
    @BindView(R.id.tc01f)
    RadioButton tc01f;
    @BindView(R.id.tc01g)
    RadioButton tc01g;
    @BindView(R.id.tc01h)
    RadioButton tc01h;
    @BindView(R.id.tc01i)
    RadioButton tc01i;
    @BindView(R.id.tc01j)
    RadioButton tc01j;
    @BindView(R.id.tc01k)
    RadioButton tc01k;
    @BindView(R.id.tc01l)
    RadioButton tc01l;
    @BindView(R.id.tc02)
    RadioGroup tc02;
    @BindView(R.id.tc02a)
    RadioButton tc02a;
    @BindView(R.id.tc02b)
    RadioButton tc02b;
    @BindView(R.id.tc02c)
    RadioButton tc02c;
    @BindView(R.id.tc02d)
    RadioButton tc02d;
    @BindView(R.id.tc02e)
    RadioButton tc02e;
    @BindView(R.id.tc02f)
    RadioButton tc02f;
    @BindView(R.id.tc02g)
    RadioButton tc02g;
    @BindView(R.id.tc02h)
    RadioButton tc02h;
    @BindView(R.id.tc02i)
    RadioButton tc02i;
    @BindView(R.id.tc02j)
    RadioButton tc02j;
    @BindView(R.id.tc02k)
    RadioButton tc02k;
    @BindView(R.id.tc02l)
    RadioButton tc02l;
    @BindView(R.id.tc02m)
    RadioButton tc02m;
    @BindView(R.id.tc02n)
    RadioButton tc02n;
    @BindView(R.id.tc02o)
    RadioButton tc02o;
    @BindView(R.id.tc03)
    RadioGroup tc03;
    @BindView(R.id.tc03a)
    RadioButton tc03a;
    @BindView(R.id.tc03b)
    RadioButton tc03b;
    @BindView(R.id.tc03c)
    RadioButton tc03c;
    @BindView(R.id.tc03d)
    RadioButton tc03d;
    @BindView(R.id.tc03e)
    RadioButton tc03e;
    @BindView(R.id.tc03f)
    RadioButton tc03f;
    @BindView(R.id.tc03g)
    RadioButton tc03g;
    @BindView(R.id.tc03h)
    RadioButton tc03h;
    @BindView(R.id.tc03i)
    RadioButton tc03i;
    @BindView(R.id.tc03j)
    RadioButton tc03j;
    @BindView(R.id.tc03k)
    RadioButton tc03k;
    @BindView(R.id.tc03l)
    RadioButton tc03l;
    @BindView(R.id.tc03m)
    RadioButton tc03m;
    @BindView(R.id.tc03n)
    RadioButton tc03n;
    @BindView(R.id.tc03o)
    RadioButton tc03o;
    @BindView(R.id.tc03p)
    RadioButton tc03p;
    @BindView(R.id.tc03q)
    RadioButton tc03q;
    @BindView(R.id.tc04)
    EditText tc04;
    @BindView(R.id.tc05)
    RadioGroup tc05;
    @BindView(R.id.tc05a)
    RadioButton tc05a;
    @BindView(R.id.tc05b)
    RadioButton tc05b;
    @BindView(R.id.tc0588)
    RadioButton tc0588;
    @BindView(R.id.tc0588x)
    EditText tc0588x;
    @BindView(R.id.tc06)
    RadioGroup tc06;
    @BindView(R.id.tc06a)
    RadioButton tc06a;
    @BindView(R.id.tc06b)
    RadioButton tc06b;
    @BindView(R.id.tc06c)
    RadioButton tc06c;
    @BindView(R.id.tc06d)
    RadioButton tc06d;
    @BindView(R.id.tc0688)
    RadioButton tc0688;
    @BindView(R.id.tc0688x)
    EditText tc0688x;
    @BindView(R.id.tc07)
    RadioGroup tc07;
    @BindView(R.id.tc07a)
    RadioButton tc07a;
    @BindView(R.id.tc07b)
    RadioButton tc07b;
    @BindView(R.id.tc07c)
    RadioButton tc07c;
    @BindView(R.id.tc07d)
    RadioButton tc07d;
    @BindView(R.id.tc07e)
    RadioButton tc07e;
    @BindView(R.id.tc07f)
    RadioButton tc07f;
    @BindView(R.id.tc07g)
    RadioButton tc07g;
    @BindView(R.id.tc07h)
    RadioButton tc07h;
    @BindView(R.id.tc07i)
    RadioButton tc07i;
    @BindView(R.id.tc07j)
    RadioButton tc07j;
    @BindView(R.id.tc07k)
    RadioButton tc07k;
    @BindView(R.id.tc07l)
    RadioButton tc07l;
    @BindView(R.id.tc0788)
    RadioButton tc0788;
    @BindView(R.id.tc0788x)
    EditText tc0788x;
    @BindView(R.id.tc08a)
    RadioGroup tc08a;
    @BindView(R.id.tc08aa)
    RadioButton tc08aa;
    @BindView(R.id.tc08ab)
    RadioButton tc08ab;
    @BindView(R.id.tc08b)
    RadioGroup tc08b;
    @BindView(R.id.tc08ba)
    RadioButton tc08ba;
    @BindView(R.id.tc08bb)
    RadioButton tc08bb;
    @BindView(R.id.tc08c)
    RadioGroup tc08c;
    @BindView(R.id.tc08ca)
    RadioButton tc08ca;
    @BindView(R.id.tc08cb)
    RadioButton tc08cb;
    @BindView(R.id.tc08d)
    RadioGroup tc08d;
    @BindView(R.id.tc08da)
    RadioButton tc08da;
    @BindView(R.id.tc08db)
    RadioButton tc08db;
    @BindView(R.id.tc08e)
    RadioGroup tc08e;
    @BindView(R.id.tc08ea)
    RadioButton tc08ea;
    @BindView(R.id.tc08eb)
    RadioButton tc08eb;
    @BindView(R.id.tc08f)
    RadioGroup tc08f;
    @BindView(R.id.tc08fa)
    RadioButton tc08fa;
    @BindView(R.id.tc08fb)
    RadioButton tc08fb;
    @BindView(R.id.tc08g)
    RadioGroup tc08g;
    @BindView(R.id.tc08ga)
    RadioButton tc08ga;
    @BindView(R.id.tc08gb)
    RadioButton tc08gb;
    @BindView(R.id.tc08h)
    RadioGroup tc08h;
    @BindView(R.id.tc08ha)
    RadioButton tc08ha;
    @BindView(R.id.tc08hb)
    RadioButton tc08hb;
    @BindView(R.id.tc08i)
    RadioGroup tc08i;
    @BindView(R.id.tc08ia)
    RadioButton tc08ia;
    @BindView(R.id.tc08ib)
    RadioButton tc08ib;
    @BindView(R.id.tc08j)
    RadioGroup tc08j;
    @BindView(R.id.tc08ja)
    RadioButton tc08ja;
    @BindView(R.id.tc08jb)
    RadioButton tc08jb;
    @BindView(R.id.tc08k)
    RadioGroup tc08k;
    @BindView(R.id.tc08ka)
    RadioButton tc08ka;
    @BindView(R.id.tc08kb)
    RadioButton tc08kb;
    @BindView(R.id.tc08l)
    RadioGroup tc08l;
    @BindView(R.id.tc08la)
    RadioButton tc08la;
    @BindView(R.id.tc08lb)
    RadioButton tc08lb;
    @BindView(R.id.tc08m)
    RadioGroup tc08m;
    @BindView(R.id.tc08ma)
    RadioButton tc08ma;
    @BindView(R.id.tc08mb)
    RadioButton tc08mb;
    @BindView(R.id.tc08n)
    RadioGroup tc08n;
    @BindView(R.id.tc08na)
    RadioButton tc08na;
    @BindView(R.id.tc08nb)
    RadioButton tc08nb;
    @BindView(R.id.tc08o)
    RadioGroup tc08o;
    @BindView(R.id.tc08oa)
    RadioButton tc08oa;
    @BindView(R.id.tc08ob)
    RadioButton tc08ob;
    @BindView(R.id.tc08p)
    RadioGroup tc08p;
    @BindView(R.id.tc08pa)
    RadioButton tc08pa;
    @BindView(R.id.tc08pb)
    RadioButton tc08pb;
    @BindView(R.id.tc08q)
    RadioGroup tc08q;
    @BindView(R.id.tc08qa)
    RadioButton tc08qa;
    @BindView(R.id.tc08qb)
    RadioButton tc08qb;
    @BindView(R.id.tc08r)
    RadioGroup tc08r;
    @BindView(R.id.tc08ra)
    RadioButton tc08ra;
    @BindView(R.id.tc08rb)
    RadioButton tc08rb;
    @BindView(R.id.tc09a)
    RadioGroup tc09a;
    @BindView(R.id.tc09aa)
    RadioButton tc09aa;
    @BindView(R.id.tc09ab)
    RadioButton tc09ab;
    @BindView(R.id.tc09b)
    RadioGroup tc09b;
    @BindView(R.id.tc09ba)
    RadioButton tc09ba;
    @BindView(R.id.tc09bb)
    RadioButton tc09bb;
    @BindView(R.id.tc09c)
    RadioGroup tc09c;
    @BindView(R.id.tc09ca)
    RadioButton tc09ca;
    @BindView(R.id.tc09cb)
    RadioButton tc09cb;
    @BindView(R.id.tc09d)
    RadioGroup tc09d;
    @BindView(R.id.tc09da)
    RadioButton tc09da;
    @BindView(R.id.tc09db)
    RadioButton tc09db;
    @BindView(R.id.tc09e)
    RadioGroup tc09e;
    @BindView(R.id.tc09ea)
    RadioButton tc09ea;
    @BindView(R.id.tc09eb)
    RadioButton tc09eb;
    @BindView(R.id.tc09f)
    RadioGroup tc09f;
    @BindView(R.id.tc09fa)
    RadioButton tc09fa;
    @BindView(R.id.tc09fb)
    RadioButton tc09fb;
    @BindView(R.id.tc09g)
    RadioGroup tc09g;
    @BindView(R.id.tc09ga)
    RadioButton tc09ga;
    @BindView(R.id.tc09gb)
    RadioButton tc09gb;
    @BindView(R.id.tc09h)
    RadioGroup tc09h;
    @BindView(R.id.tc09ha)
    RadioButton tc09ha;
    @BindView(R.id.tc09hb)
    RadioButton tc09hb;
    @BindView(R.id.tc09i)
    RadioGroup tc09i;
    @BindView(R.id.tc09ia)
    RadioButton tc09ia;
    @BindView(R.id.tc09ib)
    RadioButton tc09ib;
    @BindView(R.id.tc10)
    RadioGroup tc10;
    @BindView(R.id.tc10a)
    RadioButton tc10a;
    @BindView(R.id.tc10b)
    RadioButton tc10b;
    @BindView(R.id.tc11)
    RadioGroup tc11;
    @BindView(R.id.tc11a)
    RadioButton tc11a;
    @BindView(R.id.tc11b)
    RadioButton tc11b;
    @BindView(R.id.fldGrpte12)
    LinearLayout fldGrpte12;
    @BindView(R.id.tc12)
    RadioGroup tc12;
    @BindView(R.id.tc12a)
    RadioButton tc12a;
    @BindView(R.id.tc12b)
    RadioButton tc12b;
    @BindView(R.id.tc12888)
    RadioButton tc12888;
    @BindView(R.id.tc13)
    RadioGroup tc13;
    @BindView(R.id.tc13a)
    RadioButton tc13a;
    @BindView(R.id.tc13b)
    RadioButton tc13b;
    @BindView(R.id.fldGrpte14)
    LinearLayout fldGrpte14;
    @BindView(R.id.tc14a)
    EditText tc14a;
    @BindView(R.id.tc14b)
    EditText tc14b;
    @BindView(R.id.tc14c)
    EditText tc14c;
    @BindView(R.id.tc14d)
    EditText tc14d;
    @BindView(R.id.tc14e)
    EditText tc14e;
    @BindView(R.id.tc14f)
    EditText tc14f;
    @BindView(R.id.tc15)
    RadioGroup tc15;
    @BindView(R.id.tc15a)
    RadioButton tc15a;
    @BindView(R.id.tc15b)
    RadioButton tc15b;
    @BindView(R.id.tc15888)
    RadioButton tc15888;
    @BindView(R.id.tc16)
    RadioGroup tc16;
    @BindView(R.id.tc16a)
    RadioButton tc16a;
    @BindView(R.id.tc16b)
    RadioButton tc16b;
    @BindView(R.id.tc16c)
    RadioButton tc16c;
    @BindView(R.id.tc16d)
    RadioButton tc16d;
    @BindView(R.id.tc16e)
    RadioButton tc16e;
    @BindView(R.id.tc16f)
    RadioButton tc16f;
    @BindView(R.id.tc16g)
    RadioButton tc16g;
    @BindView(R.id.tc16h)
    RadioButton tc16h;
    @BindView(R.id.tc1688)
    RadioButton tc1688;
    @BindView(R.id.tc1688x)
    EditText tc1688x;
    @BindView(R.id.tc17)
    EditText tc17;
    @BindView(R.id.tc17888)
    CheckBox tc17888;
    @BindView(R.id.tc18)
    RadioGroup tc18;
    @BindView(R.id.tc18a)
    RadioButton tc18a;
    @BindView(R.id.tc18b)
    RadioButton tc18b;
    @BindView(R.id.fldGrptc19)
    LinearLayout fldGrptc19;
    @BindView(R.id.tc19)
    EditText tc19;
    @BindView(R.id.tc20)
    RadioGroup tc20;
    @BindView(R.id.tc20a)
    RadioButton tc20a;
    @BindView(R.id.tc20b)
    RadioButton tc20b;
    @BindView(R.id.fldGrptc21)
    LinearLayout fldGrptc21;
    @BindView(R.id.tc21)
    EditText tc21;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_c);
        ButterKnife.bind(this);

        tc18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (tc18a.isChecked()) {
                    fldGrptc19.setVisibility(View.VISIBLE);

                } else {
                    fldGrptc19.setVisibility(View.GONE);
                    tc19.setText(null);
                }
            }
        });

        tc20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (tc20a.isChecked()) {
                    fldGrptc21.setVisibility(View.VISIBLE);

                } else {
                    fldGrptc21.setVisibility(View.GONE);
                    tc21.setText(null);
                }
            }
        });

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

        JSONObject sC = new JSONObject();

        sC.put("tc01", tc01a.isChecked() ? "1" : tc01b.isChecked() ? "2" : tc01c.isChecked() ? "3"
                : tc01d.isChecked() ? "4" : tc01e.isChecked() ? "5" : tc01f.isChecked() ? "6"
                : tc01g.isChecked() ? "7" : tc01h.isChecked() ? "8" : tc01i.isChecked() ? "9" : tc01j.isChecked() ? "10"
                : tc01k.isChecked() ? "11" : tc01l.isChecked() ? "12" : "0");

        sC.put("tc02", tc02a.isChecked() ? "1" : tc02b.isChecked() ? "2" : tc02c.isChecked() ? "3"
                : tc02d.isChecked() ? "4" : tc02e.isChecked() ? "5" : tc02f.isChecked() ? "6"
                : tc02g.isChecked() ? "7" : tc02h.isChecked() ? "8" : tc02i.isChecked() ? "9" : tc02j.isChecked() ? "10"
                : tc02k.isChecked() ? "11" : tc02l.isChecked() ? "12" : tc02m.isChecked() ? "13"
                : tc02n.isChecked() ? "14" : tc02o.isChecked() ? "15" : "0");

        sC.put("tc03", tc03a.isChecked() ? "1" : tc03b.isChecked() ? "2" : tc03c.isChecked() ? "3"
                : tc03d.isChecked() ? "4" : tc03e.isChecked() ? "5" : tc03f.isChecked() ? "6"
                : tc03g.isChecked() ? "7" : tc03h.isChecked() ? "8" : tc03i.isChecked() ? "9" : tc03j.isChecked() ? "10"
                : tc03k.isChecked() ? "11" : tc03l.isChecked() ? "12" : tc03m.isChecked() ? "13"
                : tc03n.isChecked() ? "14" : tc03o.isChecked() ? "15" : tc03p.isChecked() ? "16"
                : tc03q.isChecked() ? "17" : "0");

        sC.put("tc04", tc04.getText().toString());
        sC.put("tc05", tc05a.isChecked() ? "1" : tc05b.isChecked() ? "2"
                : tc0588.isChecked() ? "88" : "0");
        sC.put("tc0588x", tc0588x.getText().toString());
        sC.put("tc06", tc06a.isChecked() ? "1" : tc06b.isChecked() ? "2"
                : tc06b.isChecked() ? "3" : tc06c.isChecked() ? "4"
                : tc0688.isChecked() ? "88" : "0");
        sC.put("tc0688x", tc0688x.getText().toString());
        sC.put("tc07", tc07a.isChecked() ? "1" : tc07b.isChecked() ? "2" : tc07c.isChecked() ? "3"
                : tc07d.isChecked() ? "4" : tc07e.isChecked() ? "5" : tc07f.isChecked() ? "6"
                : tc07g.isChecked() ? "7" : tc07h.isChecked() ? "8" : tc07i.isChecked() ? "9"
                : tc07j.isChecked() ? "10" : tc07k.isChecked() ? "11" : tc07l.isChecked() ? "12"
                : tc0788.isChecked() ? "88" : "0");
        sC.put("tc0788x", tc0788x.getText().toString());

        sC.put("tc08a", tc08aa.isChecked() ? "1" : tc08ab.isChecked() ? "2" : "0");
        sC.put("tc08b", tc08ba.isChecked() ? "1" : tc08bb.isChecked() ? "2" : "0");
        sC.put("tc08c", tc08ca.isChecked() ? "1" : tc08cb.isChecked() ? "2" : "0");
        sC.put("tc08d", tc08da.isChecked() ? "1" : tc08db.isChecked() ? "2" : "0");
        sC.put("tc08e", tc08ea.isChecked() ? "1" : tc08eb.isChecked() ? "2" : "0");
        sC.put("tc08f", tc08fa.isChecked() ? "1" : tc08fb.isChecked() ? "2" : "0");
        sC.put("tc08g", tc08ga.isChecked() ? "1" : tc08gb.isChecked() ? "2" : "0");
        sC.put("tc08h", tc08ha.isChecked() ? "1" : tc08hb.isChecked() ? "2" : "0");
        sC.put("tc08i", tc08ia.isChecked() ? "1" : tc08ib.isChecked() ? "2" : "0");
        sC.put("tc08j", tc08ja.isChecked() ? "1" : tc08jb.isChecked() ? "2" : "0");
        sC.put("tc08k", tc08ka.isChecked() ? "1" : tc08kb.isChecked() ? "2" : "0");
        sC.put("tc08l", tc08la.isChecked() ? "1" : tc08lb.isChecked() ? "2" : "0");
        sC.put("tc08m", tc08ma.isChecked() ? "1" : tc08mb.isChecked() ? "2" : "0");
        sC.put("tc08n", tc08na.isChecked() ? "1" : tc08nb.isChecked() ? "2" : "0");
        sC.put("tc08o", tc08oa.isChecked() ? "1" : tc08ob.isChecked() ? "2" : "0");
        sC.put("tc08p", tc08pa.isChecked() ? "1" : tc08pb.isChecked() ? "2" : "0");
        sC.put("tc08q", tc08qa.isChecked() ? "1" : tc08qb.isChecked() ? "2" : "0");
        sC.put("tc08r", tc08ra.isChecked() ? "1" : tc08rb.isChecked() ? "2" : "0");

        sC.put("tc09a", tc09aa.isChecked() ? "1" : tc09ab.isChecked() ? "2" : "0");
        sC.put("tc09b", tc09ba.isChecked() ? "1" : tc09bb.isChecked() ? "2" : "0");
        sC.put("tc09c", tc09ca.isChecked() ? "1" : tc09cb.isChecked() ? "2" : "0");
        sC.put("tc09d", tc09da.isChecked() ? "1" : tc09db.isChecked() ? "2" : "0");
        sC.put("tc09e", tc09ea.isChecked() ? "1" : tc09eb.isChecked() ? "2" : "0");
        sC.put("tc09f", tc09fa.isChecked() ? "1" : tc09fb.isChecked() ? "2" : "0");
        sC.put("tc09g", tc09ga.isChecked() ? "1" : tc09gb.isChecked() ? "2" : "0");
        sC.put("tc09h", tc09ha.isChecked() ? "1" : tc09hb.isChecked() ? "2" : "0");
        sC.put("tc09i", tc09ia.isChecked() ? "1" : tc09ib.isChecked() ? "2" : "0");

        sC.put("tc10", tc10a.isChecked() ? "1" : tc10b.isChecked() ? "2" : "0");
        sC.put("tc11", tc11a.isChecked() ? "1" : tc11b.isChecked() ? "2" : "0");
        sC.put("tc12", tc12a.isChecked() ? "1" : tc12b.isChecked() ? "2"
                : tc12888.isChecked() ? "888" : "0");
        sC.put("tc13", tc13a.isChecked() ? "1" : tc13b.isChecked() ? "2" : "0");

        sC.put("tc14a", tc14a.getText().toString());
        sC.put("tc14b", tc14b.getText().toString());
        sC.put("tc14c", tc14c.getText().toString());
        sC.put("tc14d", tc14d.getText().toString());
        sC.put("tc14e", tc14e.getText().toString());
        sC.put("tc14f", tc14f.getText().toString());

        sC.put("tc15", tc15a.isChecked() ? "1" : tc15b.isChecked() ? "2"
                : tc15888.isChecked() ? "888" : "0");

        sC.put("tc16", tc16a.isChecked() ? "1" : tc16b.isChecked() ? "2" : tc16c.isChecked() ? "3"
                : tc16d.isChecked() ? "4" : tc16e.isChecked() ? "5" : tc16f.isChecked() ? "6"
                : tc16g.isChecked() ? "7" : tc16h.isChecked() ? "8" : tc1688.isChecked() ? "88"
                : "0");
        sC.put("tc1688x", tc1688x.getText().toString());

        sC.put("tc17", tc17888.isChecked() ? "888" : tc17.getText().toString());
        sC.put("tc18", tc18a.isChecked() ? "1" : tc18b.isChecked() ? "2"
                : "0");
        sC.put("tc19", tc19.getText().toString());
        sC.put("tc20", tc20a.isChecked() ? "1" : tc20b.isChecked() ? "2"
                : "0");
        sC.put("tc21", tc21.getText().toString());

        //        MainApp.fc.setROW_sb(String.valueOf(sc));
    }

}