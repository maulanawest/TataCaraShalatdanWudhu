package com.example.tatacarashalatdanwudhu.view.tatacara.shalat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tatacarashalatdanwudhu.R;

public class ShalatActivity extends AppCompatActivity {

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
