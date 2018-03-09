 package com.tdroid.tjah.splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {

    private TextView mTextView;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView = findViewById(R.id.ImageSplash);
        mTextView = findViewById(R.id.tvSplash);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.mytransition);
        mImageView.startAnimation(animation);
        mTextView.startAnimation(animation);

       final Intent i = new Intent(this, Main2Activity.class);

        Thread time = new Thread(){
            public void run(){
                try{
                    sleep(5000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();
                }
            }
        };
             time.start();
    }
}
