package com.example.tatacarashalatdanwudhu.view.tatacara.tayamum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.tatacarashalatdanwudhu.R;

public class SyaratTayamumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syarat_tayamum);
    }

    public void btn_BackSyaratTayamum(View view) {

        onBackPressed();
    }
}
