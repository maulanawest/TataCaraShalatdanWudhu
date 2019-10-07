package com.example.tatacarashalatdanwudhu.view.tatacara.shalat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.tatacarashalatdanwudhu.R;

public class CaraShalatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cara_shalat);
    }

    public void btn_BackCaraShalat(View view) {
        onBackPressed();
    }
}
