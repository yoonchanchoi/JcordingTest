package com.example.jcordingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.jcordingtest.추억점수.Solution;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init(){
        Solution st = new Solution();
        st.main();
    }
}