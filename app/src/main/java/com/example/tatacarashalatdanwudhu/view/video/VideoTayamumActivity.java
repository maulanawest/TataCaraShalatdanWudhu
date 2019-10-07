package com.example.tatacarashalatdanwudhu.view.video;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.tatacarashalatdanwudhu.R;

public class VideoTayamumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_tayamum);
    }

    public void btn_BackVideoTayamum(View view) {
        super.onBackPressed();
    }
}
