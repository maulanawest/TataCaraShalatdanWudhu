package com.example.wudhutayamumdanshalat.view.tatacara.tayamum;

import android.os.Bundle;
import android.view.View;

import com.example.wudhutayamumdanshalat.R;
import com.example.wudhutayamumdanshalat.anim.RootAnim;

public class SyaratTayamumActivity extends RootAnim {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syarat_tayamum);
    }

    public void btn_BackSyaratTayamum(View view) {

        onBackPressed();
    }
}
