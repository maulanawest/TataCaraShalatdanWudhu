package com.example.wudhutayamumdanshalat.view.video;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.wudhutayamumdanshalat.R;
import com.example.wudhutayamumdanshalat.anim.RootAnim;

public class VideoShalatActivity extends RootAnim {

    private VideoView v_Shalat_id;
    private MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_shalat);

        playVideo();

    }

    public void btn_BackVideoShalat(View view) {

        onBackPressed();

    }

    private void playVideo() {
        v_Shalat_id = (VideoView) findViewById(R.id.video_Shalat_id);
        mediaController = new MediaController(this);
        v_Shalat_id.setMediaController(mediaController);
        v_Shalat_id.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.latihanshalat4rakaat));;
        v_Shalat_id.start();
    }



}
