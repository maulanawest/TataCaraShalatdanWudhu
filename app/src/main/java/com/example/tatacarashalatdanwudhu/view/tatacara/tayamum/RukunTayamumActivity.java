package com.example.tatacarashalatdanwudhu.view.tatacara.tayamum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.tatacarashalatdanwudhu.R;

public class RukunTayamumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rukun_tayamum);
    }

    public void btn_BackRukunTayamum(View view) {

        onBackPressed();
    }
}
