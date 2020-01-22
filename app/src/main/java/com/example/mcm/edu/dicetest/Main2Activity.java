package com.example.mcm.edu.dicetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Random;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    public ImageView dice1;
    public ImageView dice2;
    public Random rng2 = new Random(12);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final Button roll2 = findViewById(R.id.button2);
        final Button second2 = findViewById(R.id.back);
        Random rng2 = new Random(12);
        roll2.setText("Roll");
        second2.setText("Back");

        roll2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        rollDice2();
                        roll2.setText("Re-roll");

                    }
                }
        );
        second2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent back = new Intent(Main2Activity.this,MainActivity.class);
                        startActivity(back);
                    }
                }
        );


    }
    public void rollDice2(){
        int randomNumber2 = rng2.nextInt(12)+1;
        switch (randomNumber2){
            case(1):
                dice1.setImageResource(R.drawable.dice1);
                Toast.makeText(Main2Activity.this, "You got 1", Toast.LENGTH_LONG).show();
                break;
            case(2):
                dice1.setImageResource(R.drawable.dice1);
                dice2.setImageResource(R.drawable.dice1);
                Toast.makeText(Main2Activity.this, "You got 2", Toast.LENGTH_LONG).show();
                break;
            case(3):
                dice1.setImageResource(R.drawable.dice2);
                dice2.setImageResource(R.drawable.dice1);
                Toast.makeText(Main2Activity.this, "You got 3", Toast.LENGTH_LONG).show();
                break;
            case(4):
                dice1.setImageResource(R.drawable.dice2);
                dice2.setImageResource(R.drawable.dice2);
                Toast.makeText(Main2Activity.this, "You got 4", Toast.LENGTH_LONG).show();
                break;
            case(5):

                Toast.makeText(Main2Activity.this, "You got 5", Toast.LENGTH_LONG).show();
                break;
            case(6):
                dice1.setImageResource(R.drawable.dice3);
                dice2.setImageResource(R.drawable.dice3);
                Toast.makeText(Main2Activity.this, "You got 6", Toast.LENGTH_LONG).show();
                break;
            case(7):
                dice1.setImageResource(R.drawable.dice2);
                dice2.setImageResource(R.drawable.dice5);
                Toast.makeText(Main2Activity.this, "You got 7", Toast.LENGTH_LONG).show();
                break;
            case(8):
                dice1.setImageResource(R.drawable.dice4);
                dice2.setImageResource(R.drawable.dice4);
                Toast.makeText(Main2Activity.this, "You got 8", Toast.LENGTH_LONG).show();
                break;
            case(9):
                dice1.setImageResource(R.drawable.dice3);
                dice2.setImageResource(R.drawable.dice6);
                Toast.makeText(Main2Activity.this, "You got 9", Toast.LENGTH_LONG).show();
                break;
            case(10):
                dice1.setImageResource(R.drawable.dice5);
                dice2.setImageResource(R.drawable.dice5);
                Toast.makeText(Main2Activity.this, "You got 10", Toast.LENGTH_LONG).show();
                break;
            case(11):
                dice1.setImageResource(R.drawable.dice5);
                dice2.setImageResource(R.drawable.dice6);
                Toast.makeText(Main2Activity.this, "You got 11", Toast.LENGTH_LONG).show();
                break;
            case(12):
                dice1.setImageResource(R.drawable.dice6);
                dice2.setImageResource(R.drawable.dice6);
                Toast.makeText(Main2Activity.this, "You got 12", Toast.LENGTH_LONG).show();
                break;
        }
    }
}