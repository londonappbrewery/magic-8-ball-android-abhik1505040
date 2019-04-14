package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView ballImage ;
    Button askButton ;
    int[] ballImageArray= {R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5} ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        askButton= (Button) findViewById(R.id.askButton) ;
        ballImage = (ImageView) findViewById(R.id.ballImage) ;
        ballImage.setVisibility(View.INVISIBLE);

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int choice = new Random().nextInt(5) ;
                ballImage.setVisibility(View.VISIBLE);
                ballImage.setImageResource(ballImageArray[choice]);
                //Log.e("kamla","How?");

            }
        });
    }
}
