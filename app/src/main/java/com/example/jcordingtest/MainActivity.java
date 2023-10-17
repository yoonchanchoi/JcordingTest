package com.example.jcordingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.jcordingtest.기사단원의무기.Solution5;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init(){
        Solution5 st1 = new Solution5();
        st1.main();
    }
}