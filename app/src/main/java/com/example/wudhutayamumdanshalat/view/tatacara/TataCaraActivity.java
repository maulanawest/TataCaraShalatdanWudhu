package com.example.wudhutayamumdanshalat.view.tatacara;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.wudhutayamumdanshalat.R;
import com.example.wudhutayamumdanshalat.anim.RootAnim;
import com.example.wudhutayamumdanshalat.view.tatacara.berwudhu.BerwudhuActivity;
import com.example.wudhutayamumdanshalat.view.tatacara.shalat.ShalatActivity;
import com.example.wudhutayamumdanshalat.view.tatacara.tayamum.TayamumActivity;

public class TataCaraActivity extends RootAnim {

    Button berwudhuID, tayamumID, shalatID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tata_cara);

        findViewById(R.id.berwudhu_Id).setOnClickListener(onClickListener);
        findViewById(R.id.tayamum_Id).setOnClickListener(onClickListener);
        findViewById(R.id.shalat_Id).setOnClickListener(onClickListener);

    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            int id = view.getId();

            Intent goToActivity;

            switch (id) {
                case R.id.berwudhu_Id:
                    goToActivity = new Intent(getApplicationContext(), BerwudhuActivity.class);
                    startActivity(goToActivity);
                    break;

                case R.id.tayamum_Id:
                    goToActivity = new Intent(getApplicationContext(), TayamumActivity.class);
                    startActivity(goToActivity);
                    break;

                case R.id.shalat_Id:
                    goToActivity = new Intent(getApplicationContext(), ShalatActivity.class);
                    startActivity(goToActivity);
                    break;
            }
        }
    };

    public void btn_BackTatacara(View view) {

        super.onBackPressed();

        overridePendingTransition(R.anim.left_to_right, R.anim.right_to_left);
    }
}
