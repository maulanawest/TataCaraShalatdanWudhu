package com.example.wudhutayamumdanshalat.view.tentang;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.wudhutayamumdanshalat.R;
import com.example.wudhutayamumdanshalat.anim.RootAnim;

public class TentangActivity extends RootAnim {

    Button tentangWudhuId, tentangTayamumId, tentangShalatId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);

        findViewById(R.id.tentangWudhu_Id).setOnClickListener(onClickListener);
        findViewById(R.id.tentangTayamum_Id).setOnClickListener(onClickListener);
        findViewById(R.id.tentangShalat_Id).setOnClickListener(onClickListener);
    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            int id = view.getId();

            switch (id){
                case R.id.tentangWudhu_Id:
                startActivity(new Intent(getApplicationContext(), PengertianWudhuActivity.class));
                break;

                case R.id.tentangTayamum_Id:
                    startActivity(new Intent(getApplicationContext(), PengertianTayamumActivity.class));
                    break;

                case R.id.tentangShalat_Id:
                    startActivity(new Intent(getApplicationContext(), PengertianShalatActivity.class));
                    break;
            }
        }
    };

    public void btn_BackTentang(View view) {

        super.onBackPressed();
        overridePendingTransition(R.anim.left_to_right, R.anim.right_to_left);
    }
}
