package com.example.tatacarashalatdanwudhu.view.tentang;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.tatacarashalatdanwudhu.R;

public class PengertianTayamumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengertian_tayamum);

    }

    public void btn_Back(View view) {

        super.onBackPressed();
    }
}
