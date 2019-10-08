package com.example.tatacarashalatdanwudhu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tatacarashalatdanwudhu.util.MessageAleertDialog;
import com.example.tatacarashalatdanwudhu.view.tatacara.TataCaraActivity;
import com.example.tatacarashalatdanwudhu.view.tentang.TentangActivity;
import com.example.tatacarashalatdanwudhu.view.video.VideoActivity;

public class MainActivity extends AppCompatActivity {

    Button tataCaraId, videoId, tentangId, tutupId;
    Dialog dialog;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.tataCara_id).setOnClickListener(onClickListener);
        findViewById(R.id.video_id).setOnClickListener(onClickListener);
        findViewById(R.id.tentang_id).setOnClickListener(onClickListener);
        findViewById(R.id.tutup_id).setOnClickListener(onClickListener);

    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            int id = v.getId();

            Intent goToActivity;

            switch (id) {
                case R.id.tataCara_id:
                    //untuk ke activity berikutnya
                    goToActivity = new Intent(getApplicationContext(), TataCaraActivity.class);
                    startActivity(goToActivity);
                    break;
                case R.id.video_id:
                    //DO something
                    goToActivity = new Intent(getApplicationContext(), VideoActivity.class);
                    startActivity(goToActivity);
                    break;
                case R.id.tentang_id:
                    //DO something
                    goToActivity = new Intent(getApplicationContext(), TentangActivity.class);
                    startActivity(goToActivity);
                    break;

                case R.id.tutup_id:
                    openDialog();
                    break;

            }
        }
    };

    public void openDialog() {

//        MessageAleertDialog messageAleertDialog = new MessageAleertDialog();
//        messageAleertDialog.show(getSupportFragmentManager(), "xxx");

        tutupId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dialog = new Dialog(context);
                dialog.setContentView(R.layout.alert_dialog);


            }
        });
        dialog.show();
    }
}