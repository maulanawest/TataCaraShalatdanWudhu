package com.example.tatacarashalatdanwudhu.view.video;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.tatacarashalatdanwudhu.R;

public class VideoShalatActivity extends AppCompatActivity {

    private VideoView v_Shalat_id;
    private MediaController mediaController;
    Button videoShalat_Id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_shalat);

        v_Shalat_id = (VideoView) findViewById(R.id.video_Shalat_id);

        playVideo();

    }

    public void btn_BackVideoShalat(View view) {

        onBackPressed();

    }

    private void playVideo() {

        mediaController = new MediaController(this);
        mediaController.setAnchorView(v_Shalat_id);
        v_Shalat_id.setMediaController(mediaController);
        v_Shalat_id.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.tatacarashalatdanwudhu));;
        //v_Shalat_id.start();
    }

}
