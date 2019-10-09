package com.example.wudhutayamumdanshalat;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.example.wudhutayamumdanshalat.view.tatacara.TataCaraActivity;
import com.example.wudhutayamumdanshalat.view.tentang.TentangActivity;
import com.example.wudhutayamumdanshalat.view.video.VideoActivity;

public class MainActivity extends AppCompatActivity {

    Button dialogButtonYES_ID, dialogButtonCANCLE_ID;
    ;
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

        dialogButtonYES_ID = (Button) findViewById(R.id.dialogButtonYES_ID);
        dialogButtonCANCLE_ID = (Button) findViewById(R.id.dialogButtonCANCLE_ID);

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

    //disable button back
    @Override
    public void onBackPressed() {

    }

    //dialog
    public void openDialog() {

        dialog = new Dialog(MainActivity.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCancelable(false);

        //get Layout Custom Dialog
        dialog.setContentView(R.layout.alert_dialog);
        dialogButtonYES_ID = (Button) dialog.findViewById(R.id.dialogButtonYES_ID);
        dialogButtonYES_ID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MainActivity.this.finish();
            }
        });

        dialogButtonCANCLE_ID = (Button) dialog.findViewById(R.id.dialogButtonCANCLE_ID);
        dialogButtonCANCLE_ID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dialog.dismiss();
            }
        });
        dialog.show();
    }


}