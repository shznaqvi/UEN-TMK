package edu.aku.hassannaqvi.uen_tmk.activities;

import android.app.Activity;
import android.os.Bundle;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.uen_tmk.R;

public class SectionHBActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_hb);
    }

    private void SaveDraft() throws JSONException {

        JSONObject sHB = new JSONObject();

        sHB.put("th201", th201a.isChecked() ? "1" : th201b.isChecked() ? "2" : th20188.isChecked() ? "888" : "0");
        sHB.put("th202", th202.getText().toString());

        sHB.put("th203", th203a.isChecked() ? "1" : th203b.isChecked() ? "2" : th20388.isChecked() ? "888" : "0");
        sHB.put("th204", th204.getText().toString());
        sHB.put("th205", th205.getText().toString());
        sHB.put("th206", th206.getText().toString());
        sHB.put("th207", th207a.isChecked() ? "1" : th207b.isChecked() ? "2" : th20788.isChecked() ? "888" : "0");


        sHB.put("th208a", th208a.isChecked() ? "1" : "0");
        sHB.put("th208b", th208b.isChecked() ? "1" : "0");
        sHB.put("th208c", th208c.isChecked() ? "1" : "0");
        sHB.put("th208d", th208d.isChecked() ? "1" : "0");
        sHB.put("th208e", th208e.isChecked() ? "1" : "0");
        sHB.put("th208f", th208f.isChecked() ? "1" : "0");
        sHB.put("th208g", th208g.isChecked() ? "1" : "0");
        sHB.put("th208h", th208h.isChecked() ? "1" : "0");
        sHB.put("th2088", th2088.isChecked() ? "1" : "0");

        sHB.put("th20888x", th20888x.getText().toString());

        sHB.put("th209", th209.getText().toString());

        sHB.put("th210", th210a.isChecked() ? "1" : th210b.isChecked() ? "2"
                : th210c.isChecked() ? "3"
                : th210d.isChecked() ? "4"
                : "0");


        sHB.put("th211", th211a.isChecked() ? "1" : th211b.isChecked() ? "2"
                : th211c.isChecked() ? "3"
                : th211d.isChecked() ? "4"
                : th211e.isChecked() ? "4"
                : th211f.isChecked() ? "5"
                : th211g.isChecked() ? "6"
                : th211h.isChecked() ? "7"
                : th211i.isChecked() ? "8"
                : th211j.isChecked() ? "9"
                : th211k.isChecked() ? "10"
                : "0");


        sHB.put("th212a", th212a.isChecked() ? "1" : "0");
        sHB.put("th212b", th212b.isChecked() ? "1" : "0");
        sHB.put("th212c", th212c.isChecked() ? "1" : "0");
        sHB.put("th212d", th212d.isChecked() ? "1" : "0");
        sHB.put("th212e", th212e.isChecked() ? "1" : "0");
        sHB.put("th212f", th212f.isChecked() ? "1" : "0");
        sHB.put("th212g", th212g.isChecked() ? "1" : "0");
        sHB.put("th212h", th212h.isChecked() ? "1" : "0");

        sHB.put("th213", th213a.isChecked() ? "1" : th213b.isChecked() ? "2" : "0");
        sHB.put("th214", th214a.isChecked() ? "1" : th214b.isChecked() ? "2" : "0");
        sHB.put("th215", th215a.isChecked() ? "1" : th215b.isChecked() ? "2" : th215c.isChecked() ? "3" : "0");
        sHB.put("th216", th216a.isChecked() ? "1" : th216b.isChecked() ? "2" : "0");


        sHB.put("th217", th217a.isChecked() ? "1" : th217b.isChecked() ? "2"
                : th217c.isChecked() ? "3"
                : th217d.isChecked() ? "4"
                : th21788.isChecked() ? "88"
                : "0");


        sHB.put("th218", th218a.isChecked() ? "1" : th218b.isChecked() ? "2" : th218c.isChecked() ? "3" : "0");


        sHB.put("th219", th219a.isChecked() ? "1" : th219b.isChecked() ? "2"
                : th219c.isChecked() ? "3"
                : th219d.isChecked() ? "4"
                : th219e.isChecked() ? "5"
                : "0");


        sHB.put("th220a", th220a.isChecked() ? "1" : "0");
        sHB.put("th220b", th220b.isChecked() ? "1" : "0");
        sHB.put("th220c", th220c.isChecked() ? "1" : "0");
        sHB.put("th220d", th220d.isChecked() ? "1" : "0");
        sHB.put("th220e", th220e.isChecked() ? "1" : "0");
        sHB.put("th220f", th220f.isChecked() ? "1" : "0");
        sHB.put("th220g", th220g.isChecked() ? "1" : "0");

        sHB.put("th221", th221a.isChecked() ? "1" : th221b.isChecked() ? "2" : th221c.isChecked() ? "3" : "0");

        sHB.put("th221hr", th221hr.getText().toString());
        sHB.put("th221d", th221d.getText().toString());

        sHB.put("th222", th222a.isChecked() ? "1" : th222b.isChecked() ? "2" : "0");
        sHB.put("th223", th223.getText().toString());
        sHB.put("th224", th224a.isChecked() ? "1" : th224b.isChecked() ? "2" : "0");


        sHB.put("th225a", th225a.isChecked() ? "1" : "0");
        sHB.put("th225b", th225b.isChecked() ? "1" : "0");
        sHB.put("th225c", th225c.isChecked() ? "1" : "0");
        sHB.put("th225d", th225d.isChecked() ? "1" : "0");
        sHB.put("th225e", th225e.isChecked() ? "1" : "0");
        sHB.put("th225f", th225f.isChecked() ? "1" : "0");
        sHB.put("th225g", th225g.isChecked() ? "1" : "0");


        sHB.put("th226", th226a.isChecked() ? "1" : th226b.isChecked() ? "2" : th226c.isChecked() ? "3" : "0");
        sHB.put("th227", th227.getText().toString());
        sHB.put("th228", th228.getText().toString());


        sHB.put("th229", th229a.isChecked() ? "1" : th229b.isChecked() ? "2"
                : th229d.isChecked() ? "3"
                : th229e.isChecked() ? "4"
                : th229f.isChecked() ? "4"
                : th229g.isChecked() ? "5"
                : th229h.isChecked() ? "6"
                : th229i.isChecked() ? "7"
                : th22988.isChecked() ? "88"
                : "0");


        sHB.put("th22988x", th22988x.getText().toString());
        sHB.put("th230", th230.getText().toString());

        sHB.put("th231", th231a.isChecked() ? "1" : th231b.isChecked() ? "2" : "0");
        sHB.put("th232", th232a.isChecked() ? "1" : th232b.isChecked() ? "2" : th23288.isChecked() ? "888"
                : "0");

        sHB.put("th233", th233a.isChecked() ? "1" : th233b.isChecked() ? "2" : th23388.isChecked() ? "888"
                : "0");

        sHB.put("th234", th234.getText().toString());
        sHB.put("th235", th235a.isChecked() ? "1" : th235b.isChecked() ? "2" : th235c.isChecked() ? "3" : "0");


        sHB.put("th236a", th236a.isChecked() ? "1" : "0");
        sHB.put("th236b", th236b.isChecked() ? "1" : "0");
        sHB.put("th236c", th236c.isChecked() ? "1" : "0");
        sHB.put("th236d", th236d.isChecked() ? "1" : "0");
        sHB.put("th236e", th236e.isChecked() ? "1" : "0");
        sHB.put("th236f", th236f.isChecked() ? "1" : "0");
        sHB.put("th236g", th236g.isChecked() ? "1" : "0");
        sHB.put("th236h", th236h.isChecked() ? "1" : "0");
        sHB.put("th236i", th236i.isChecked() ? "1" : "0");
        sHB.put("th236j", th236j.isChecked() ? "1" : "0");
        sHB.put("th236k", th236k.isChecked() ? "1" : "0");
        sHB.put("th23688", th23688.isChecked() ? "1" : "0");

        sHB.put("th23688x", th23688x.getText().toString());

    }
}