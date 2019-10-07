package com.example.tatacarashalatdanwudhu.view.tatacara.berwudhu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tatacarashalatdanwudhu.R;

public class BerwudhuActivity extends AppCompatActivity {

    Button syaratBerwudhuID, rukunWudhuID, caraBerwudhuID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berwudhu);

        findViewById(R.id.syaratBerwudhu_Id).setOnClickListener(onClickListener);
        findViewById(R.id.rukunWudhu_Id).setOnClickListener(onClickListener);
        findViewById(R.id.caraBerwudhu_Id).setOnClickListener(onClickListener);

    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            int id = (view.getId());

            Intent goToActivity;

            switch (id) {
                case R.id.syaratBerwudhu_Id:
                    goToActivity = new Intent(getApplicationContext(), SyaratBerwudhuActivity.class);
                    startActivity(goToActivity);
                    break;
                case R.id.rukunWudhu_Id:
                    goToActivity = new Intent(getApplicationContext(), RukunWudhuActivity.class);
                    startActivity(goToActivity);
                    break;
                case R.id.caraBerwudhu_Id:
                    goToActivity = new Intent(getApplicationContext(), CaraBerWudhuActivity.class);
                    startActivity(goToActivity);
                    break;
            }
        }
    };

    public void btn_BackBerwudhu(View view) {

        super.onBackPressed();
    }
}
