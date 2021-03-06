package com.example.wudhutayamumdanshalat.view.tatacara.tayamum;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.wudhutayamumdanshalat.R;
import com.example.wudhutayamumdanshalat.anim.RootAnim;

public class TayamumActivity extends RootAnim {

    Button syaratTayamumID, rukunTayamumID, caraTayamumID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tayamum);

        findViewById(R.id.syaratTayamum_Id).setOnClickListener(onClickListener);
        findViewById(R.id.rukunTayamum_Id).setOnClickListener(onClickListener);
        findViewById(R.id.caraTayamum_Id).setOnClickListener(onClickListener);
    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            int id = view.getId();

            Intent goToActivity;

            switch (id) {
                case R.id.syaratTayamum_Id:
                    goToActivity = new Intent(getApplicationContext(), SyaratTayamumActivity.class);
                    startActivity(goToActivity);
                    break;
                case R.id.rukunTayamum_Id:
                    goToActivity = new Intent(getApplicationContext(), RukunTayamumActivity.class);
                    startActivity(goToActivity);
                    break;
                case R.id.caraTayamum_Id:
                    goToActivity = new Intent(getApplicationContext(), CaraTayamumActivity.class);
                    startActivity(goToActivity);
                    break;
            }
        }
    };

    public void btn_BackTayamum(View view) {

        super.onBackPressed();
    }
}
