package com.example.wudhutayamumdanshalat.view.video;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.wudhutayamumdanshalat.R;
import com.example.wudhutayamumdanshalat.anim.RootAnim;

public class VideoWudhuActivity extends RootAnim {

    private VideoView video_Wudhu_id;
    private MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_wudhu);

        video_Wudhu_id = (VideoView) findViewById(R.id.video_Wudhu_id);

        playVideo();
    }

    private void playVideo() {

        mediaController = new MediaController(this);
        mediaController.setAnchorView(video_Wudhu_id);
        video_Wudhu_id.setMediaController(mediaController);
        video_Wudhu_id.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.tatacarashalatdanwudhu));

    }

    public void btn_BackVideoWudhu(View view) {
        super.onBackPressed();
    }
}
