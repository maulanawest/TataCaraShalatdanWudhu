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

import com.example.wudhutayamumdanshalat.anim.RootAnim;
import com.example.wudhutayamumdanshalat.dialog.DialogListener;
import com.example.wudhutayamumdanshalat.dialog.DialogRedudant;
import com.example.wudhutayamumdanshalat.view.tatacara.TataCaraActivity;
import com.example.wudhutayamumdanshalat.view.tentang.TentangActivity;
import com.example.wudhutayamumdanshalat.view.video.VideoActivity;

public class MainActivity extends RootAnim {

    Button dialogButtonYES_ID, dialogButtonCANCLE_ID;

    //Dialog dialog;
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
                    //openDialog();

                    alertDialog();
                    break;

            }
        }
    };

    //alert dialog option 1
    private void alertDialog() {

        new DialogRedudant.Builder(this)
                .setTitle("Hai.")
                .setMessage("Apakah kamu yakin ingin keluar dari aplikasi ini?")
                .setNegativeBtnTex("Cancel")
                .setNegativeBackground("#e3e3e3")
                .setPositiveBtnText("Ok")
                .setPositiveBackground("#ffffff")
                .isCancellable(false)
                .OnNegativeClickListener(new DialogListener() {
                    @Override
                    public void onClick() {

                    }
                })
                .OnPositiveClickListener(new DialogListener() {
                    @Override
                    public void onClick() {
                        MainActivity.this.finish();
                    }
                })
                .build();

    }

    //disable button back
    @Override
    public void onBackPressed() {

    }

    /*
    //dialog option 2
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
    */


}