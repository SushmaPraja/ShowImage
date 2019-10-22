package com.example.showimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RadioButton rbtnFish, rbtnCat, rbtnBird;
    ImageView showImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbtnFish = findViewById(R.id.rbFish);
        rbtnBird = findViewById(R.id.rbBird);
        rbtnCat = findViewById(R.id.rbCat);
        showImage = findViewById(R.id.viewImage);

        rbtnFish.setOnClickListener(this);
        rbtnCat.setOnClickListener(this);
        rbtnBird.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
            switch (v.getId()){
                case  R.id.rbBird:
                    showImage.setImageResource(R.drawable.bird);
                    break;
                case  R.id.rbCat:
                    showImage.setImageResource(R.drawable.cat);
                break;
                case R.id.rbFish:
                    showImage.setImageResource(R.drawable.fish);
                break;

            }
    }

}
