package com.example.wudhutayamumdanshalat.view.video;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.wudhutayamumdanshalat.R;
import com.example.wudhutayamumdanshalat.anim.RootAnim;

public class VideoActivity extends RootAnim {

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
        overridePendingTransition(R.anim.left_to_right, R.anim.right_to_left);
    }
}
