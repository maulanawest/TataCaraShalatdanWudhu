package com.example.tatacarashalatdanwudhu.view.tatacara.berwudhu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.tatacarashalatdanwudhu.R;

public class CaraBerWudhuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cara_ber_wudhu);
    }

    public void btn_BackCaraberwudhu(View view) {

        onBackPressed();
    }
}
