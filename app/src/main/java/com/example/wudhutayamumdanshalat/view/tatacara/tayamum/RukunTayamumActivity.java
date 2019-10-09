package com.example.wudhutayamumdanshalat.view.tatacara.tayamum;

import android.os.Bundle;
import android.view.View;

import com.example.wudhutayamumdanshalat.R;
import com.example.wudhutayamumdanshalat.anim.RootAnim;

public class RukunTayamumActivity extends RootAnim {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rukun_tayamum);
    }

    public void btn_BackRukunTayamum(View view) {

        onBackPressed();
    }
}
