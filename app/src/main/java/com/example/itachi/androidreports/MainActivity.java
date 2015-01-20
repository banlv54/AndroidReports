package com.example.itachi.androidreports;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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


        }
        return false;
    }
}
