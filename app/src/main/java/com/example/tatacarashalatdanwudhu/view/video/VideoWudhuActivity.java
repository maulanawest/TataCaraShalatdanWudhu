package com.example.tatacarashalatdanwudhu.view.video;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.tatacarashalatdanwudhu.R;

public class VideoWudhuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_wudhu);
    }

    public void btn_BackVideoWudhu(View view) {
        super.onBackPressed();
    }
}
