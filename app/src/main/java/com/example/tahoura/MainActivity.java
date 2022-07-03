package com.example.tahoura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tahoura.ui.login.LoginActivity;


public class MainActivity extends AppCompatActivity {


    Animation logo,botLogo;
    ImageView image,image2;
    private static int SPLASH_SCREEN= 5000;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        if (Build.VERSION.SDK_INT < 16) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
        logo = AnimationUtils.loadAnimation(this,R.anim.imagveiew);
        botLogo = AnimationUtils.loadAnimation(this,R.anim.imageview2);
        setContentView(R.layout.activity_main);
        image=findViewById(R.id.imageView);
        image2=findViewById(R.id.imageView2);
        image.setAnimation(logo);
        image2.setAnimation(botLogo);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
            }
        },SPLASH_SCREEN);
    }



}
