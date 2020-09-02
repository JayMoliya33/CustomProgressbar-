package com.example.customprogressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;

import com.leo.simplearcloader.ArcConfiguration;
import com.leo.simplearcloader.SimpleArcDialog;
import com.leo.simplearcloader.SimpleArcLoader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void simplearc(View view) {
        SimpleArcDialog dialog = new SimpleArcDialog(this);
        dialog.setConfiguration(new ArcConfiguration(this));
        dialog.setTitle("Loading...");
        dialog.show();
    }

    public void simplearcCustomColor(View view) {
        SimpleArcDialog dialog = new SimpleArcDialog(this);
        ArcConfiguration configuration = new ArcConfiguration(this);
        configuration.setColors(getResources().getIntArray(R.array.color_1));
        configuration.setAnimationSpeed(8);
        configuration.setArcMargin(5);
        dialog.setConfiguration(configuration);
        dialog.setTitle("Loading...");
        dialog.show();
    }

    public void completeArc(View view) {
        SimpleArcDialog dialog = new SimpleArcDialog(this);
        ArcConfiguration configuration = new ArcConfiguration(this);
        configuration.setLoaderStyle(SimpleArcLoader.STYLE.COMPLETE_ARC);
        configuration.setAnimationSpeed(8);
        configuration.setArcMargin(5);
        dialog.setConfiguration(configuration);
        dialog.setTitle("Loading...");
        dialog.show();
    }
}