package com.example.wudhutayamumdanshalat.anim;

import android.app.Activity;
import android.os.Bundle;

import com.example.wudhutayamumdanshalat.R;

public class RootAnim extends Activity {

    int onStartCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        onStartCount = 1;

        if (savedInstanceState == null) { // 1st time

            this.overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);

        } else {
            // already created so reverse animation

            onStartCount = 2;

        }
    }

    @Override
    protected void onStart() {
        super.onStart();

        if (onStartCount > 1) {
            this.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
        } else if (onStartCount == 1) {
            onStartCount++;
        }
    }
}
