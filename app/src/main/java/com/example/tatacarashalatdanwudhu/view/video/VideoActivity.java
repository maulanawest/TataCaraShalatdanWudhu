package com.example.tatacarashalatdanwudhu.view.video;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tatacarashalatdanwudhu.R;

public class VideoActivity extends AppCompatActivity {

    Button videoWudhuId, videoTayamumId, videoShalatId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        findViewById(R.id.videoWudhu_Id).setOnClickListener(onClickListener);
        findViewById(R.id.videoTayamum_Id).setOnClickListener(onClickListener);
        findViewById(R.id.videoShalat_Id).setOnClickListener(onClickListener);
    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            int id = view.getId();

            switch (id) {
                case R.id.videoWudhu_Id:
                    startActivity(new Intent(getApplicationContext(), VideoWudhuActivity.class));
                    break;
                case R.id.videoTayamum_Id:
                    startActivity(new Intent(getApplicationContext(), VideoTayamumActivity.class));
                    break;
                case R.id.videoShalat_Id:
                    startActivity(new Intent(getApplicationContext(), VideoShalatActivity.class));
                    break;
            }
        }
    };

    public void btn_BackVideo(View view) {

        super.onBackPressed();
    }
}
