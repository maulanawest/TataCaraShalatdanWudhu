package com.example.tatacarashalatdanwudhu.view.tatacara.berwudhu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.tatacarashalatdanwudhu.R;

public class RukunWudhuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rukun_wudhu);
    }

    public void btn_BackRukunberwudhu(View view) {

        onBackPressed();
    }
}
