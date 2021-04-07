package com.example.buttonevent2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        final RatingBar ratingbar = (RatingBar)
                findViewById(R.id.ratingbar);

        ratingbar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                {
                    Toast.makeText(getApplicationContext(), "New Rating:" +
                            rating, Toast.LENGTH_SHORT).show();
                }
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            Toast.makeText(getApplicationContext(), " 버튼 눌림" , Toast.LENGTH_SHORT).show();
            }


        });
    }
}
