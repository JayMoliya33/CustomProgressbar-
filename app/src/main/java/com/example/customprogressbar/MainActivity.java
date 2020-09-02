package com.example.customprogressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.leo.simplearcloader.ArcConfiguration;
import com.leo.simplearcloader.SimpleArcDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showProgress(View view) {
        SimpleArcDialog dialog = new SimpleArcDialog(this);
        dialog.setConfiguration(new ArcConfiguration(this));
        dialog.setTitle("Loading...");
        dialog.show();
    }
}