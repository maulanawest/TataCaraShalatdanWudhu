package com.example.wudhutayamumdanshalat.view.tatacara.shalat;

import android.os.Bundle;
import android.view.View;

import com.example.wudhutayamumdanshalat.R;
import com.example.wudhutayamumdanshalat.anim.RootAnim;

public class RukunShalatActivity extends RootAnim {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rukun_shalat);
    }

    public void btn_BackRukunShalat(View view) {
        onBackPressed();
    }
}
