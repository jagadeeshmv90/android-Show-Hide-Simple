package com.j7ech.showinghiding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView bannerImage;
    Boolean bannerVisible = true;
    Button hitButton;
    public void showHide(View view){
        bannerImage = findViewById(R.id.bannerImage);
        hitButton =  findViewById(R.id.hitButton);
        if (bannerVisible){
            bannerImage.setVisibility(View.INVISIBLE);
            bannerVisible = false;
            hitButton.setText("Show the Pic");
        } else{
            bannerImage.setVisibility(View.VISIBLE);
            bannerVisible = true;
            hitButton.setText("Hide the Pic");
        }
        Log.i("this", "pressed Button");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}