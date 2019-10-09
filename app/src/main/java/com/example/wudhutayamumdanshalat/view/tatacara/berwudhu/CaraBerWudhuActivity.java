package com.example.wudhutayamumdanshalat.view.tatacara.berwudhu;

import android.os.Bundle;
import android.view.View;

import com.example.wudhutayamumdanshalat.R;
import com.example.wudhutayamumdanshalat.anim.RootAnim;

public class CaraBerWudhuActivity extends RootAnim {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cara_ber_wudhu);
    }

    public void btn_BackCaraberwudhu(View view) {

        onBackPressed();
    }
}
