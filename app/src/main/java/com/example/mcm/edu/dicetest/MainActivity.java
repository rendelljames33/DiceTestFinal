package com.example.mcm.edu.dicetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Random;


import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    public TextView number;
    public Random rng = new Random(6);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button roll = findViewById(R.id.button);
        number.setText("");
        Random rng = new Random(6);
        roll.setText("Roll");
        number = findViewById(R.id.name);
        roll.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        rollDice();
                        roll.setText("Re-roll");

                    }
                }
        );


    }
    public void rollDice(){
        int randomNumber = rng.nextInt(6)+1;
        switch (randomNumber){
            case(1):
                number.setText("You got 1");
                Toast.makeText(MainActivity.this, "You got 1", Toast.LENGTH_LONG).show();
                break;
            case(2):
                number.setText("You got 2");
                Toast.makeText(MainActivity.this, "You got 2", Toast.LENGTH_LONG).show();
                break;
            case(3):
                number.setText("You got 3");
                Toast.makeText(MainActivity.this, "You got 3", Toast.LENGTH_LONG).show();
                break;
            case(4):
                number.setText("You got 4");
                Toast.makeText(MainActivity.this, "You got 4", Toast.LENGTH_LONG).show();
                break;
            case(5):
                number.setText("You got 5");
                Toast.makeText(MainActivity.this, "You got 5", Toast.LENGTH_LONG).show();
                break;
            case(6):
                number.setText("You got 6");
                Toast.makeText(MainActivity.this, "You got 6", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
