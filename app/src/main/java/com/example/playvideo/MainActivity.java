package com.example.playvideo;

import android.graphics.PixelFormat;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.VideoView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int random;
    long timer;
    boolean pressed;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button start = (Button)findViewById(R.id.buttonstart);
        Button one = (Button)findViewById(R.id.button1);
        Button two = (Button)findViewById(R.id.button2);
        Button zero = (Button)findViewById(R.id.button0);
        final TextView TV = (TextView)findViewById(R.id.textView) ;

        getWindow().setFormat(PixelFormat.UNKNOWN);


        start.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                random = new Random().nextInt(3);
                timer = System.currentTimeMillis();
                pressed = false;
                TV.setText("Your Score: " + score + ". ");

                if(random == 1) {
                    VideoView mVideoView2 = (VideoView) findViewById(R.id.videoView);
                    // VideoView mVideoView = new VideoView(this);
                    String uriPath = "android.resource://com.example.playvideo/" + R.raw.movie;
                    Uri uri2 = Uri.parse(uriPath);
                    mVideoView2.setVideoURI(uri2);
                    mVideoView2.requestFocus();
                    mVideoView2.start();
                }

                if(random == 2) {
                    VideoView mVideoView2 = (VideoView) findViewById(R.id.videoView);
                    // VideoView mVideoView = new VideoView(this);
                    String uriPath = "android.resource://com.example.playvideo/" + R.raw.moviee;
                    Uri uri2 = Uri.parse(uriPath);
                    mVideoView2.setVideoURI(uri2);
                    mVideoView2.requestFocus();
                    mVideoView2.start();
                }

                if(random == 0) {
                    VideoView mVideoView2 = (VideoView) findViewById(R.id.videoView);
                    // VideoView mVideoView = new VideoView(this);
                    String uriPath = "android.resource://com.example.playvideo/" + R.raw.movieee;
                    Uri uri2 = Uri.parse(uriPath);
                    mVideoView2.setVideoURI(uri2);
                    mVideoView2.requestFocus();
                    mVideoView2.start();
                }

            }
        });

        one.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                long reaction = System.currentTimeMillis() - timer;
                if(random == 1 & reaction<2850 & !pressed & reaction>1200) {
                    VideoView mVideoView2 = (VideoView) findViewById(R.id.videoView);
                    mVideoView2.stopPlayback();
                    score++;
                }
                pressed = true;
            }
        });

        two.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                long reaction = System.currentTimeMillis() - timer;
                if(random == 2 & reaction<2990 & !pressed & reaction>1300) {
                    VideoView mVideoView2 = (VideoView) findViewById(R.id.videoView);
                    mVideoView2.stopPlayback();
                    score++;
                }
                pressed = true;
            }
        });

        zero.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                long reaction = System.currentTimeMillis() - timer;
                if(random == 0 & reaction<3050 & !pressed & reaction>1400) {
                    VideoView mVideoView2 = (VideoView) findViewById(R.id.videoView);
                    mVideoView2.stopPlayback();
                    score++;
                }
                pressed = true;
            }
        });

    }




}

