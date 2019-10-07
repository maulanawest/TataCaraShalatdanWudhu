package com.example.tatacarashalatdanwudhu.view.tatacara.shalat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.tatacarashalatdanwudhu.R;

public class SyaratShalatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syarat_shalat);
    }

    public void btn_BackSyaratShalat(View view) {

        onBackPressed();
    }
}
