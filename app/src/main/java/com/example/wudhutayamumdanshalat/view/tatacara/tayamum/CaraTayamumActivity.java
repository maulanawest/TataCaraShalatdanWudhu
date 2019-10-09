package com.example.wudhutayamumdanshalat.view.tatacara.tayamum;

import android.os.Bundle;
import android.view.View;

import com.example.wudhutayamumdanshalat.R;
import com.example.wudhutayamumdanshalat.anim.RootAnim;

public class CaraTayamumActivity extends RootAnim {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cara_tayamum);
    }

    public void btn_BackCaraTayamum(View view) {

        onBackPressed();
    }
}
