package com.example.mcm.edu.dicetest;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Random;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    public ImageView dc;
    public Random rng = new Random(6);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button roll = findViewById(R.id.button);
        final Button second = findViewById(R.id.twelvedice);
        dc = findViewById(R.id.dice);
        second.setText("Click here for 2 dice");

        roll.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        rollDice();
                        roll.setEnabled(false);

                        final Runnable enableButton = new Runnable() {
                            @Override
                            public void run() {
                                roll.setEnabled(true);
                            }
                        };
                        new Handler().postDelayed(enableButton,5000);

                    }
                }
        );
        second.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent twelve = new Intent(MainActivity.this,Main2Activity.class);
                        startActivity(twelve);
                    }
                }
        );


    }
    public void rollDice(){
        int randomNumber = rng.nextInt(6)+1;
        switch (randomNumber){
            case(1):
                dc.setImageResource(R.drawable.dice1);
                Toast.makeText(MainActivity.this, "You got 1", Toast.LENGTH_LONG).show();
                break;
            case(2):
                dc.setImageResource(R.drawable.dice2);
                Toast.makeText(MainActivity.this, "You got 2", Toast.LENGTH_LONG).show();
                break;
            case(3):
                dc.setImageResource(R.drawable.dice3);
                Toast.makeText(MainActivity.this, "You got 3", Toast.LENGTH_LONG).show();
                break;
            case(4):
                dc.setImageResource(R.drawable.dice4);
                Toast.makeText(MainActivity.this, "You got 4", Toast.LENGTH_LONG).show();
                break;
            case(5):
                dc.setImageResource(R.drawable.dice5);
                Toast.makeText(MainActivity.this, "You got 5", Toast.LENGTH_LONG).show();
                break;
            case(6):
                dc.setImageResource(R.drawable.dice6);
                Toast.makeText(MainActivity.this, "You got 6", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
