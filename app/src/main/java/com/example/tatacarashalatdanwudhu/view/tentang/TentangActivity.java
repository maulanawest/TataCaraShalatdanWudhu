package com.example.tatacarashalatdanwudhu.view.tentang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tatacarashalatdanwudhu.R;
import com.example.tatacarashalatdanwudhu.view.tatacara.TataCaraActivity;

public class TentangActivity extends AppCompatActivity {

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
}
