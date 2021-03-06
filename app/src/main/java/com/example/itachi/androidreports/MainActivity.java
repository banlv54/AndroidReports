package com.example.itachi.androidreports;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    private Animation animFade;
    private Button fade_in, fade_out, property;
    private ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Find by id
        image = (ImageView)findViewById(R.id.image_id);
        fade_in = (Button)findViewById(R.id.fade_in);
        fade_out = (Button)findViewById(R.id.fade_out);
        property = (Button)findViewById(R.id.property);
        // end

        // set on click
        fade_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animFade = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
                image.startAnimation(animFade);
            }
        });

        fade_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animFade = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out);
                image.startAnimation(animFade);
            }
        });

        property.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent property_intent = new Intent(getApplication(), PropertyAnimation.class);
                startActivity(property_intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        super.onOptionsItemSelected(item);
        switch(item.getItemId())
        {
            case R.id.zoomInOut:
                ImageView image = (ImageView)findViewById(R.id.image_id);
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale);
                image.startAnimation(animation);
                return true;
            case R.id.rotate360:
                ImageView image1 = (ImageView)findViewById(R.id.image_id);
                Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
                image1.startAnimation(animation1);
                return true;
            case R.id.fadeInOut:
                ImageView image2 = (ImageView)findViewById(R.id.image_id);
                Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
                image2.startAnimation(animation2);
                return true;
            case R.id.fadeAndRotate:
                ImageView image3 = (ImageView)findViewById(R.id.image_id);
                Animation animation3 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out_and_rotate);
                image3.startAnimation(animation3);
                return true;
            case R.id.translate:
                ImageView image4 = (ImageView)findViewById(R.id.image_id);
                Animation animation4 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translate);
                image4.startAnimation(animation4);
                return true;
        }
        return false;
    }
}
