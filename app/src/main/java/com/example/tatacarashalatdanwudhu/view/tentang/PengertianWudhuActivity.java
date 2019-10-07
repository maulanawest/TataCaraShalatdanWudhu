package com.example.tatacarashalatdanwudhu.view.tentang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.tatacarashalatdanwudhu.R;

public class PengertianWudhuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengertian_wudhu);
    }

    public void btn_BackWudhu(View view) {

        super.onBackPressed();
    }
}
