package com.example.jcordingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.jcordingtest.명예의전당1.Solution1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init(){
        Solution1 st1 = new Solution1();
        st1.main();
    }
}