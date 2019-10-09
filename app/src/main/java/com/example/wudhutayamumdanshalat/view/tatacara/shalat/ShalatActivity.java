package com.example.wudhutayamumdanshalat.view.tatacara.shalat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.wudhutayamumdanshalat.R;
import com.example.wudhutayamumdanshalat.anim.RootAnim;

public class ShalatActivity extends RootAnim {

    Button syaratShalatID, rukunShalatID, caraShalatID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shalat);

        findViewById(R.id.syaratShalat_Id).setOnClickListener(onClickListener);
        findViewById(R.id.rukunShalat_Id).setOnClickListener(onClickListener);
        findViewById(R.id.caraShalat_Id).setOnClickListener(onClickListener);
    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            int id = view.getId();

            Intent goToActivity;

            switch (id)
            {
                case R.id.syaratShalat_Id:
                    goToActivity = new Intent(getApplicationContext(), SyaratShalatActivity.class);
                    startActivity(goToActivity);
                    break;

                case R.id.rukunShalat_Id:
                    goToActivity = new Intent(getApplicationContext(), RukunShalatActivity.class);
                    startActivity(goToActivity);
                    break;

                case R.id.caraShalat_Id:
                    goToActivity = new Intent(getApplicationContext(), CaraShalatActivity.class);
                    startActivity(goToActivity);
                    break;
            }
        }
    };

    public void btn_BackShalat(View view) {

        onBackPressed();
    }
}
