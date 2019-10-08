package com.example.tatacarashalatdanwudhu.view.video;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.tatacarashalatdanwudhu.R;

public class VideoTayamumActivity extends AppCompatActivity {

    VideoView video_Tayamum_id;
    MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_tayamum);

        video_Tayamum_id = (VideoView) findViewById(R.id.video_Tayamum_id);

        playVideo();
    }

    public void btn_BackVideoTayamum(View view) {
        super.onBackPressed();
    }

    private void playVideo() {

        mediaController = new MediaController(this);
        mediaController.setAnchorView(video_Tayamum_id);
        video_Tayamum_id.setMediaController(mediaController);
        video_Tayamum_id.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.videoanimasipembelajaranwudhudantayamum));
        //v_Shalat_id.start();
    }
}
