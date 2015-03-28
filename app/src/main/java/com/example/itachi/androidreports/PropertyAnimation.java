package com.example.itachi.androidreports;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;

public class PropertyAnimation extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.property_animation);
        ImageView wheel = (ImageView)findViewById(R.id.wheel);
        AnimatorSet wheelSet = (AnimatorSet) AnimatorInflater.loadAnimator(getApplicationContext(),
            R.animator.wheel_spin);
        wheelSet.setTarget(wheel);
        wheelSet.start();

        //get the sun view
        ImageView sun = (ImageView)findViewById(R.id.sun);
        //load the sun movement animation
        AnimatorSet sunSet = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.sun_swing);
        //set the view as target
        sunSet.setTarget(sun);
        //start the animation
        sunSet.start();

        ValueAnimator skyAnim = ObjectAnimator.ofInt
            (findViewById(R.id.car_layout), "backgroundColor",
                Color.rgb(0x00, 0x00, 0x00), Color.rgb(0x00, 0x66, 0x99));
        skyAnim.setDuration(3000);
        skyAnim.setRepeatCount(ValueAnimator.INFINITE);
        skyAnim.setRepeatMode(ValueAnimator.REVERSE);
        skyAnim.setEvaluator(new ArgbEvaluator());
        skyAnim.start();

        ObjectAnimator cloudAnim = ObjectAnimator.ofFloat(findViewById(R.id.cloud1), "x", -350);
        cloudAnim.setDuration(3000);
        cloudAnim.setRepeatCount(ValueAnimator.INFINITE);
        cloudAnim.setRepeatMode(ValueAnimator.REVERSE);
        cloudAnim.start();

        ObjectAnimator cloudAnim2 = ObjectAnimator.ofFloat(findViewById(R.id.cloud2), "x", -300);
        cloudAnim2.setDuration(3000);
        cloudAnim2.setRepeatCount(ValueAnimator.INFINITE);
        cloudAnim2.setRepeatMode(ValueAnimator.REVERSE);
        cloudAnim2.start();
    }
}