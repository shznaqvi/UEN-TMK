package edu.aku.hassannaqvi.tmk_midline_monitor19.activities;

import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.StrictMode;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import edu.aku.hassannaqvi.tmk_midline_monitor19.FormsList;
import edu.aku.hassannaqvi.tmk_midline_monitor19.R;
import edu.aku.hassannaqvi.tmk_midline_monitor19.contracts.AreasContract;
import edu.aku.hassannaqvi.tmk_midline_monitor19.contracts.FormsContract;
import edu.aku.hassannaqvi.tmk_midline_monitor19.contracts.VersionAppContract;
import edu.aku.hassannaqvi.tmk_midline_monitor19.core.AndroidDatabaseManager;
import edu.aku.hassannaqvi.tmk_midline_monitor19.core.DatabaseHelper;
import edu.aku.hassannaqvi.tmk_midline_monitor19.core.MainApp;
import edu.aku.hassannaqvi.tmk_midline_monitor19.sync.SyncForms;
import edu.aku.hassannaqvi.tmk_midline_monitor19.sync.SyncIM;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "MainActivity";

    String dtToday = new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime());
    @BindView(R.id.adminsec)
    LinearLayout adminsec;
    @BindView(R.id.lblheader)
    TextView lblheader;
    @BindView(R.id.recordSummary)
    TextView recordSummary;
    @BindView(R.id.spAreas)
    Spinner spAreas;
    static File file;
    SharedPreferences sharedPref;
    SharedPreferences.Editor editor;
    AlertDialog.Builder builder;
    String m_Text = "";
    ArrayList<String> lablesAreas;
    Collection<AreasContract> AreasList;
    Map<String, String> AreasMap;
    private Boolean exit = false;
    private String rSumText = "";
    @BindView(R.id.lblAppVersion)
    TextView lblAppVersion;
    /*Version Control*/
    VersionAppContract versionAppContract;
    String preVer = "", newVer = "";
    SharedPreferences sharedPrefDownload;
    SharedPreferences.Editor editorDownload;
    DownloadManager downloadManager;
    Long refID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }
        lblheader.setText("Welcome! " + MainApp.userName);

        if (MainApp.admin) {
            adminsec.setVisibility(View.VISIBLE);
        } else {
            adminsec.setVisibility(View.GONE);
        }

        /*TagID Start*/
        sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);
        editor = sharedPref.edit();

        builder = new AlertDialog.Builder(MainActivity.this);
        ImageView img = new ImageView(getApplicationContext());
        img.setImageResource(R.drawable.tagimg);
        img.setPadding(0, 15, 0, 15);
        builder.setCustomTitle(img);

        final EditText input = new EditText(MainActivity.this);
        input.setInputType(InputType.TYPE_CLASS_TEXT);
        builder.setView(input);

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                m_Text = input.getText().toString();
                if (!m_Text.equals("")) {
                    editor.putString("tagName", m_Text);
                    editor.commit();
                }
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        if (sharedPref.getString("tagName", null) == "" || sharedPref.getString("tagName", null) == null) {
            builder.show();
        }
        /*TagID End*/

        DatabaseHelper db = new DatabaseHelper(this);
        Collection<FormsContract> todaysForms = db.getTodayForms();
        Collection<FormsContract> unsyncedForms = db.getUnsyncedForms();

        rSumText += "TODAY'S RECORDS SUMMARY\r\n";

        rSumText += "=======================\r\n";
        rSumText += "\r\n";
        rSumText += "Total Forms Today: " + todaysForms.size() + "\r\n";
        rSumText += "\r\n";
        if (todaysForms.size() > 0) {
            rSumText += "\tFORMS' LIST: \r\n";
            String iStatus;
            rSumText += "--------------------------------------------------\r\n";
            rSumText += "[ DSS_ID ] \t[Form Status] \t[Sync Status]----------\r\n";
            rSumText += "--------------------------------------------------\r\n";

            for (FormsContract fc : todaysForms) {
                if (fc.getIstatus() != null) {
                    switch (fc.getIstatus()) {
                        case "1":
                            iStatus = "\tComplete";
                            break;
                        case "2":
                            iStatus = "\tIncomplete";
                            break;
                        case "3":
                            iStatus = "\tRefused";
                            break;
                        case "4":
                            iStatus = "\tRefused";
                            break;
                        default:
                            iStatus = "\tN/A";
                    }
                } else {
                    iStatus = "\tN/A";
                }

                rSumText += fc.getDSSID();

                rSumText += " " + iStatus + " ";

                rSumText += (fc.getSynced() == null ? "\t\tNot Synced" : "\t\tSynced");
                rSumText += "\r\n";
                rSumText += "--------------------------------------------------\r\n";
            }
        }


        if (MainApp.admin) {
            adminsec.setVisibility(View.VISIBLE);
            SharedPreferences syncPref = getSharedPreferences("SyncInfo", Context.MODE_PRIVATE);
            rSumText += "Last Data Download: \t" + syncPref.getString("LastDownSyncServer", "Never Updated");
            rSumText += "\r\n";
            rSumText += "Last Data Upload: \t" + syncPref.getString("LastUpSyncServer", "Never Synced");
            rSumText += "\r\n";
            rSumText += "\r\n";
            rSumText += "Unsynced Forms: \t" + unsyncedForms.size();
            rSumText += "\r\n";
        }
        Log.d(TAG, "onCreate: " + rSumText);
        recordSummary.setText(rSumText);


//        Fill spinner
        lablesAreas = new ArrayList<>();
        AreasMap = new HashMap<>();
        lablesAreas.add("Select Area..");

        AreasList = db.getAllAreas(String.valueOf(MainApp.ucCode));
        for (AreasContract Areas : AreasList) {
            lablesAreas.add(Areas.getArea());
            AreasMap.put(Areas.getArea(), Areas.getAreacode());
        }

        spAreas.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, lablesAreas));

        spAreas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (spAreas.getSelectedItemPosition() != 0) {
                    MainApp.areaCode = Integer.valueOf(AreasMap.get(spAreas.getSelectedItem().toString()));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        /*Version Control*/
        sharedPrefDownload = getSharedPreferences("appDownload", MODE_PRIVATE);
        editorDownload = sharedPrefDownload.edit();

    }

    public void openForm(View v) {

        if (!permissionGrantedStuff()) return;

        if (spAreas.getSelectedItemPosition() != 0) {

            if (sharedPref.getString("tagName", null) != "" && sharedPref.getString("tagName", null) != null && !MainApp.userName.equals("0000")) {
                Intent oF = new Intent(MainActivity.this, SectionAActivity.class);
                startActivity(oF);
            } else {

                builder = new AlertDialog.Builder(MainActivity.this);
                ImageView img = new ImageView(getApplicationContext());
                img.setImageResource(R.drawable.tagimg);
                img.setPadding(0, 15, 0, 15);
                builder.setCustomTitle(img);

                final EditText input = new EditText(MainActivity.this);
                input.setInputType(InputType.TYPE_CLASS_TEXT);
                builder.setView(input);

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        m_Text = input.getText().toString();
                        if (!m_Text.equals("")) {
                            editor.putString("tagName", m_Text);
                            editor.commit();

                            if (!MainApp.userName.equals("0000")) {
                                Intent oF = new Intent(MainActivity.this, SectionAActivity.class);
                                startActivity(oF);
                            }
                        }
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                builder.show();
            }
        } else {
            Toast.makeText(getApplicationContext(), "Please select data from combobox!!", Toast.LENGTH_LONG).show();
        }
    }

    public void testGPS(View v) {

        SharedPreferences sharedPref = getSharedPreferences("GPSCoordinates", Context.MODE_PRIVATE);
        Log.d("MAP", "testGPS: " + sharedPref.getAll().toString());
        Map<String, ?> allEntries = sharedPref.getAll();
        for (Map.Entry<String, ?> entry : allEntries.entrySet()) {
            Log.d("Map", entry.getKey() + ": " + entry.getValue().toString());
        }

    }

    public void openDB(View v) {
        Intent dbmanager = new Intent(getApplicationContext(), AndroidDatabaseManager.class);
        startActivity(dbmanager);
    }

    public void CheckCluster(View v) {
        Intent cluster_list = new Intent(getApplicationContext(), FormsList.class);
        cluster_list.putExtra("dssid", MainApp.regionDss);
        startActivity(cluster_list);

    }

    public void syncServer(View view) {

        // Require permissions INTERNET & ACCESS_NETWORK_STATE
        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {

            Toast.makeText(getApplicationContext(), "Syncing Forms", Toast.LENGTH_SHORT).show();
            new SyncForms(this, true).execute();

            Toast.makeText(getApplicationContext(), "Syncing IM", Toast.LENGTH_SHORT).show();
            new SyncIM(this).execute();

            SharedPreferences syncPref = getSharedPreferences("SyncInfo", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = syncPref.edit();

            editor.putString("LastUpSyncServer", dtToday);

            editor.apply();

        } else {
            Toast.makeText(this, "No network connection available.", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void onBackPressed() {
        if (exit) {
            finish(); // finish activity
            startActivity(new Intent(this, LoginActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
        } else {
            Toast.makeText(this, "Press Back again to Exit.",
                    Toast.LENGTH_SHORT).show();
            exit = true;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    exit = false;
                }
            }, 3 * 1000);

        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        updatingApp();
    }

    //    Version Control
    private void updatingApp() {
        versionAppContract = new Gson().fromJson(getSharedPreferences("main", Context.MODE_PRIVATE).getString("appVersion", ""), VersionAppContract.class);
        if (versionAppContract != null) {

            if (versionAppContract.getVersioncode() != null) {
                preVer = MainApp.versionName + "." + MainApp.versionCode;
                newVer = versionAppContract.getVersionname() + "." + versionAppContract.getVersioncode();

                if (MainApp.versionCode < Integer.valueOf(versionAppContract.getVersioncode())) {
                    String fileName = DatabaseHelper.DATABASE_NAME.replace(".db", "-New-Apps");
                    file = new File(Environment.getExternalStorageDirectory() + File.separator + fileName, versionAppContract.getPathname());
                    lblAppVersion.setVisibility(View.VISIBLE);


                    if (file.exists()) {
                        lblAppVersion.setText("UEN-TMK Monitor New Version " + newVer + "  Downloaded.");
                        showDialog(newVer, preVer);
                    } else {
                        NetworkInfo networkInfo = ((ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE)).getActiveNetworkInfo();
                        if (networkInfo != null && networkInfo.isConnected()) {

                            lblAppVersion.setText("UEN-TMK Monitor App New Version " + newVer + " Downloading..");
                            downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                            Uri uri = Uri.parse(MainApp._UPDATE_URL + versionAppContract.getPathname());
                            DownloadManager.Request request = new DownloadManager.Request(uri);
                            request.setDestinationInExternalPublicDir(fileName, versionAppContract.getPathname())
                                    .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                                    .setTitle("Downloading UEN-TMK Monitor App new App ver." + newVer);
                            refID = downloadManager.enqueue(request);

                            editorDownload.putLong("refID", refID);
                            editorDownload.putBoolean("flag", false);
                            editorDownload.commit();

                        } else {
                            lblAppVersion.setText("UEN-TMK Monitor App New Version " + newVer + "  Available..\n(Can't download.. Internet connectivity issue!!)");
                        }
                    }

                } else {
                    lblAppVersion.setVisibility(View.GONE);
                    lblAppVersion.setText(null);
                }
            }
        }


        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                if (DownloadManager.ACTION_DOWNLOAD_COMPLETE.equals(intent.getAction())) {

                    DownloadManager.Query query = new DownloadManager.Query();
                    query.setFilterById(sharedPrefDownload.getLong("refID", 0));

                    downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                    Cursor cursor = downloadManager.query(query);
                    if (cursor.moveToFirst()) {
                        int colIndex = cursor.getColumnIndex(DownloadManager.COLUMN_STATUS);
                        if (DownloadManager.STATUS_SUCCESSFUL == cursor.getInt(colIndex)) {

                            editorDownload.putBoolean("flag", true);
                            editorDownload.commit();

                            Toast.makeText(context, "New App downloaded!!", Toast.LENGTH_SHORT).show();
                            lblAppVersion.setText("UEN-TMK Monitor App New Version " + newVer + "  Downloaded.");

                            ActivityManager am = (ActivityManager) getSystemService(ACTIVITY_SERVICE);
                            List<ActivityManager.RunningTaskInfo> taskInfo = am.getRunningTasks(1);
                            if (taskInfo.get(0).topActivity.getClassName().equals(MainActivity.class.getName())) {
                                showDialog(newVer, preVer);
                            }
                        }
                    }
                }
            }
        };

        registerReceiver(broadcastReceiver, new IntentFilter(DownloadManager.ACTION_DOWNLOAD_COMPLETE));
    }

    private void showDialog(String newVer, String preVer) {
        FragmentManager ft = getSupportFragmentManager();
        FragmentTransaction transaction = ft.beginTransaction();
        Fragment prev = ft.findFragmentByTag("dialog");
        if (prev != null) {
            transaction.remove(prev);
        }
        transaction.addToBackStack(null);
        DialogFragment newFragment = MyDialogFragment.newInstance(newVer, preVer);
        newFragment.show(ft, "dialog");

    }

    private boolean permissionGrantedStuff() {
        try {
            if (versionAppContract.getVersioncode() != null) {
                if (MainApp.versionCode < Integer.valueOf(versionAppContract.getVersioncode())) {
                    if (sharedPrefDownload.getBoolean("flag", true) && file.exists()) {
                        showDialog(newVer, preVer);
                        return false;
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            } else {
                Toast.makeText(this, "First Sync data!!", Toast.LENGTH_SHORT).show();
                return false;
            }
        } catch (Exception e) {
            Toast.makeText(this, "First Sync data!!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    public static class MyDialogFragment extends DialogFragment {

        String newVer, preVer;

        static MyDialogFragment newInstance(String newVer, String preVer) {
            MyDialogFragment f = new MyDialogFragment();

            Bundle args = new Bundle();
            args.putString("newVer", newVer);
            args.putString("preVer", preVer);
            f.setArguments(args);

            return f;
        }

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            newVer = getArguments().getString("newVer");
            preVer = getArguments().getString("preVer");

            return new AlertDialog.Builder(getActivity())
                    .setIcon(android.R.drawable.ic_dialog_info)
                    .setTitle("UEN-TMK Monitor App is available!")
                    .setMessage("UEN-TMK Monitor App " + newVer + " is now available. Your are currently using older version " + preVer + ".\nInstall new version to use this app.")
                    .setPositiveButton("INSTALL!!",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int whichButton) {
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setDataAndType(Uri.fromFile(file), "application/vnd.android.package-archive");
                                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                    startActivity(intent);
                                }
                            }
                    )
                    .create();
        }

    }


}
