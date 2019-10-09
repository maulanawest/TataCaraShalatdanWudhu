package com.example.wudhutayamumdanshalat.view.tentang;

import android.os.Bundle;
import android.view.View;

import com.example.wudhutayamumdanshalat.R;
import com.example.wudhutayamumdanshalat.anim.RootAnim;

public class PengertianWudhuActivity extends RootAnim {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengertian_wudhu);
    }

    public void btn_BackWudhu(View view) {

        super.onBackPressed();
    }
}
