package edu.aku.hassannaqvi.uen_tmk.activities;

import android.app.Activity;
import android.os.Bundle;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.uen_tmk.R;

public class SectionHAActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_ha);
    }

    private void SaveDraft() throws JSONException {

        JSONObject sHA = new JSONObject();

        sHA.put("th101", th101a.isChecked() ? "1" : th101b.isChecked() ? "2" : th10188.isChecked() ? "888" : "0");
        sHA.put("th102", th102.getText().toString());
        sHA.put("th103", th103.getText().toString());
        sHA.put("th104", th104.getText().toString());

        sHA.put("th105", th105a.isChecked() ? "1" : th105b.isChecked() ? "2" : th10588.isChecked() ? "888" : "0");
        sHA.put("th106", th106a.isChecked() ? "1" : th106b.isChecked() ? "2" : th10688.isChecked() ? "888" : "0");
        sHA.put("th107a", th107a.isChecked() ? "1" : "0");
        sHA.put("th107b", th107b.isChecked() ? "1" : "0");
        sHA.put("th107c", th107c.isChecked() ? "1" : "0");
        sHA.put("th107d", th107d.isChecked() ? "1" : "0");
        sHA.put("th107e", th107e.isChecked() ? "1" : "0");
        sHA.put("th107f", th107f.isChecked() ? "1" : "0");
        sHA.put("th107g", th107g.isChecked() ? "1" : "0");
        sHA.put("th107h", th107h.isChecked() ? "1" : "0");
        sHA.put("th107i", th107i.isChecked() ? "1" : "0");
        sHA.put("th107j", th107j.isChecked() ? "1" : "0");
        sHA.put("th10788", th10788.isChecked() ? "1" : "0");

        sHA.put("th10788x", th10788x.getText().toString());

        sHA.put("th108", th108.getText().toString());

        sHA.put("th109a", th109a.isChecked() ? "1" : "0");
        sHA.put("th109b", th109b.isChecked() ? "1" : "0");
        sHA.put("th109c", th109c.isChecked() ? "1" : "0");
        sHA.put("th109d", th109d.isChecked() ? "1" : "0");


        sHA.put("th110", th110a.isChecked() ? "1" : th110b.isChecked() ? "2"
                : th110c.isChecked() ? "3"
                : th110d.isChecked() ? "4"
                : th110e.isChecked() ? "5"
                : th110f.isChecked() ? "6"
                : th110g.isChecked() ? "7"
                : th110h.isChecked() ? "8"
                : th110i.isChecked() ? "9"
                : th110j.isChecked() ? "10"
                : th110k.isChecked() ? "11"
                : "0");


        sHA.put("th111a", th111a.isChecked() ? "1" : "0");
        sHA.put("th111b", th111b.isChecked() ? "1" : "0");
        sHA.put("th111c", th111c.isChecked() ? "1" : "0");
        sHA.put("th111d", th111d.isChecked() ? "1" : "0");
        sHA.put("th111e", th111e.isChecked() ? "1" : "0");
        sHA.put("th111f", th111f.isChecked() ? "1" : "0");
        sHA.put("th111g", th111g.isChecked() ? "1" : "0");
        sHA.put("th111h", th111h.isChecked() ? "1" : "0");
        sHA.put("th111i", th111i.isChecked() ? "1" : "0");
        sHA.put("th111j", th111j.isChecked() ? "1" : "0");
        sHA.put("th111k", th111k.isChecked() ? "1" : "0");

        sHA.put("th112", th112a.isChecked() ? "1" : th112b.isChecked() ? "2" : "0");
        sHA.put("th113", th113a.isChecked() ? "1" : th113b.isChecked() ? "2" : "0");

        sHA.put("th114", th114a.isChecked() ? "1" : th114b.isChecked() ? "2" : th114c.isChecked() ? "3" : "0");
        sHA.put("th115", th115a.isChecked() ? "1" : th115b.isChecked() ? "2" : "0");
        sHA.put("th116", th116a.isChecked() ? "1" : th116b.isChecked() ? "2" : th116c.isChecked() ? "3" : th11688.isChecked() ? "888" : "0");

        sHA.put("th11688x", th11688x.getText().toString());


        sHA.put("th117", th117a.isChecked() ? "1" : th117b.isChecked() ? "2" : th117c.isChecked() ? "3" : "0");

        sHA.put("th118", th118a.isChecked() ? "1" : th118b.isChecked() ? "2"
                : th118c.isChecked() ? "3"
                : th118d.isChecked() ? "4"
                : th118e.isChecked() ? "5"
                : "0");


        sHA.put("th119a", th119a.isChecked() ? "1" : "0");
        sHA.put("th119b", th119b.isChecked() ? "1" : "0");
        sHA.put("th119c", th119c.isChecked() ? "1" : "0");
        sHA.put("th119d", th119d.isChecked() ? "1" : "0");
        sHA.put("th119e", th119e.isChecked() ? "1" : "0");
        sHA.put("th119f", th119f.isChecked() ? "1" : "0");
        sHA.put("th119g", th119g.isChecked() ? "1" : "0");
        sHA.put("th119h", th119h.isChecked() ? "1" : "0");
        sHA.put("th119i", th119i.isChecked() ? "1" : "0");


        sHA.put("th120", th120a.isChecked() ? "1" : th120b.isChecked() ? "2" : th120c.isChecked() ? "3" : "0");

        sHA.put("th120hr", th120hr.getText().toString());
        sHA.put("th120d", th120d.getText().toString());

        sHA.put("th121", th121a.isChecked() ? "1" : th121b.isChecked() ? "2" : "0");
        sHA.put("th122", th122.getText().toString());
        sHA.put("th123", th123a.isChecked() ? "1" : th123b.isChecked() ? "2" : "0");

        sHA.put("th124a", th124a.isChecked() ? "1" : "0");
        sHA.put("th124b", th124b.isChecked() ? "1" : "0");
        sHA.put("th124c", th124c.isChecked() ? "1" : "0");
        sHA.put("th124d", th124d.isChecked() ? "1" : "0");
        sHA.put("th124e", th124e.isChecked() ? "1" : "0");
        sHA.put("th124f", th124f.isChecked() ? "1" : "0");
        sHA.put("th124g", th124g.isChecked() ? "1" : "0");
        sHA.put("th124h", th124h.isChecked() ? "1" : "0");
        sHA.put("th124i", th124i.isChecked() ? "1" : "0");
        sHA.put("th124i", th124j.isChecked() ? "1" : "0");


        sHA.put("th125", th125a.isChecked() ? "1" : th125b.isChecked() ? "2" : th125c.isChecked() ? "3" : "0");
        sHA.put("th126", th126.getText().toString());

        sHA.put("th127", th127a.isChecked() ? "1" : th127b.isChecked() ? "2"
                : th127c.isChecked() ? "3"
                : th127d.isChecked() ? "4"
                : th127e.isChecked() ? "5"
                : th127f.isChecked() ? "6"
                : th127g.isChecked() ? "7"
                : th127h.isChecked() ? "8"
                : th127i.isChecked() ? "9"
                : th12788.isChecked() ? "88"
                : "0");


        sHA.put("th12788x", th12788x.getText().toString());
        sHA.put("th128", th128.getText().toString());
        sHA.put("th129", th129.getText().toString());
        sHA.put("th130", th130.getText().toString());

        sHA.put("th131", th131a.isChecked() ? "1" : th131b.isChecked() ? "2" : th131c.isChecked() ? "3" : "0");
        sHA.put("th132", th132a.isChecked() ? "1" : th132b.isChecked() ? "2" : "0");
        sHA.put("th133", th133a.isChecked() ? "1" : th133a.isChecked() ? "2" : "0");


        sHA.put("th134", th134a.isChecked() ? "1" : th134b.isChecked() ? "2"
                : th134c.isChecked() ? "3"
                : th134d.isChecked() ? "4"
                : th134e.isChecked() ? "5"
                : th134f.isChecked() ? "6"
                : th134g.isChecked() ? "7"
                : th134h.isChecked() ? "8"
                : th134i.isChecked() ? "9"
                : th134j.isChecked() ? "10"
                : th134k.isChecked() ? "11"
                : "0");

        AppMain.fc.sHA(String.valueOf(sHA));

    }
}