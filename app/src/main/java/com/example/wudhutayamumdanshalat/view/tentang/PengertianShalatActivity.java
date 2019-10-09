package com.example.wudhutayamumdanshalat.view.tentang;

import android.os.Bundle;
import android.view.View;

import com.example.wudhutayamumdanshalat.R;
import com.example.wudhutayamumdanshalat.anim.RootAnim;

public class PengertianShalatActivity extends RootAnim {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengertian_shalat);
    }

    public void btn_BackShalat(View view) {

        super.onBackPressed();
    }
}
