package com.edu.feicui.ck.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.edu.feicui.ck.R;

public class LogoActivity extends AppCompatActivity {

    private ImageView img_logo;
    private Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);
        img_logo = (ImageView) findViewById(R.id.iv_logo);
        animation = AnimationUtils.loadAnimation(this, R.anim.anim_logo);
        animation.setAnimationListener(animationListener);
        img_logo.startAnimation(animation);
    }
    private Animation.AnimationListener animationListener = new Animation.AnimationListener() {
        @Override
        public void onAnimationStart(Animation animation) {

        }

        @Override
        public void onAnimationEnd(Animation animation) {
            Intent intent = new Intent(LogoActivity.this,
                    TelmsgActivity.class);
            startActivity(intent);
            finish();

        }

        @Override
        public void onAnimationRepeat(Animation animation) {

        }
    };
}
