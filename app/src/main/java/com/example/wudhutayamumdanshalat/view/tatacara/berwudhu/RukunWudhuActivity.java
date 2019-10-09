package com.example.wudhutayamumdanshalat.view.tatacara.berwudhu;

import android.os.Bundle;
import android.view.View;

import com.example.wudhutayamumdanshalat.R;
import com.example.wudhutayamumdanshalat.anim.RootAnim;

public class RukunWudhuActivity extends RootAnim {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rukun_wudhu);
    }

    public void btn_BackRukunberwudhu(View view) {

        onBackPressed();
    }
}
