package com.example.alik.projectpi;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Typeface myTypeface = Typeface.createFromAsset(getAssets(),"showg.ttf");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_start = (Button)findViewById(R.id.button1);
        Button btn_video = (Button)findViewById(R.id.button2);
        Button btn_lihat = (Button)findViewById(R.id.button3);
        Button btn_dengar = (Button)findViewById(R.id.button4);
        Button btn_exit = (Button)findViewById(R.id.button5);

        btn_start.setTypeface(myTypeface);
        btn_video.setTypeface(myTypeface);
        btn_lihat.setTypeface(myTypeface);
        btn_dengar.setTypeface(myTypeface);
        btn_exit.setTypeface(myTypeface);

        btn_start.setOnClickListener(this);
        btn_video.setOnClickListener(this);
        btn_lihat.setOnClickListener(this);
        btn_dengar.setOnClickListener(this);
        btn_exit.setOnClickListener(this);

        startService(new Intent(this, MusicService.class));
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setMessage("Anda yakin ingin keluar?")
                .setPositiveButton("Ya", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                        System.exit(0);
                    }
                })
                .setNegativeButton("Tidak", null)
                .show();
    }

    @Override
    public void onClick(View v) {
        Intent pindah;
        switch (v.getId()){
            case R.id.button4:
                AlertDialog.Builder add = new AlertDialog.Builder(MainActivity.this);
                add.setTitle("Tentang Pembuat")
                        .setMessage("Abdul Malik MS\n50414724\n3IA06")
                        .setCancelable(false)
                        .setPositiveButton("OK", new AlertDialog.OnClickListener() {
                            public void onClick(DialogInterface dialog, int iid) {
                                dialog.cancel();
                            }
                        }).show();
                break;
            case R.id.button3:
                pindah = new Intent(this, VideoActivity.class);//activity kata-kata
                startActivity(pindah);
                break;
            case R.id.button2:
                pindah = new Intent(this, LihatActivity.class);//activity huruf kecil
                startActivity(pindah);
                break;
            case R.id.button1:
                startActivity(new Intent(this, DengarActivity.class));//activity huruf kapital
                break;
            case R.id.button5:
                AlertDialog.Builder keluar = new AlertDialog.Builder(MainActivity.this);
                keluar.setMessage("Anda yakin ingin keluar?")
                        .setCancelable(false)
                        .setPositiveButton("Ya", new AlertDialog.OnClickListener() {
                            public void onClick(DialogInterface arg0, int arg1) {
                                finish();
                                System.exit(0);
                            }
                        })
                        .setNegativeButton("Tidak", new AlertDialog.OnClickListener() {
                            public void onClick(DialogInterface dialog, int arg1) {
                            dialog.cancel();
                        }
                }).show();
                break;
        }
    }
}
