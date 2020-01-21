package com.example.mcm.edu.dicetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Random;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;


public class Main2Activity extends AppCompatActivity {
    public TextView number2;
    public Random rng2 = new Random(12);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final Button roll2 = findViewById(R.id.button2);
        final Button second2 = findViewById(R.id.back);
        number2 = findViewById(R.id.name2);
        number2.setText("");
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
                number2.setText("You got 1");
                Toast.makeText(Main2Activity.this, "You got 1", Toast.LENGTH_LONG).show();
                break;
            case(2):
                number2.setText("You got 2");
                Toast.makeText(Main2Activity.this, "You got 2", Toast.LENGTH_LONG).show();
                break;
            case(3):
                number2.setText("You got 3");
                Toast.makeText(Main2Activity.this, "You got 3", Toast.LENGTH_LONG).show();
                break;
            case(4):
                number2.setText("You got 4");
                Toast.makeText(Main2Activity.this, "You got 4", Toast.LENGTH_LONG).show();
                break;
            case(5):
                number2.setText("You got 5");
                Toast.makeText(Main2Activity.this, "You got 5", Toast.LENGTH_LONG).show();
                break;
            case(6):
                number2.setText("You got 6");
                Toast.makeText(Main2Activity.this, "You got 6", Toast.LENGTH_LONG).show();
                break;
            case(7):
                number2.setText("You got 7");
                Toast.makeText(Main2Activity.this, "You got 7", Toast.LENGTH_LONG).show();
                break;
            case(8):
                number2.setText("You got 8");
                Toast.makeText(Main2Activity.this, "You got 8", Toast.LENGTH_LONG).show();
                break;
            case(9):
                number2.setText("You got 9");
                Toast.makeText(Main2Activity.this, "You got 9", Toast.LENGTH_LONG).show();
                break;
            case(10):
                number2.setText("You got 10");
                Toast.makeText(Main2Activity.this, "You got 10", Toast.LENGTH_LONG).show();
                break;
            case(11):
                number2.setText("You got 11");
                Toast.makeText(Main2Activity.this, "You got 11", Toast.LENGTH_LONG).show();
                break;
            case(12):
                number2.setText("You got 12");
                Toast.makeText(Main2Activity.this, "You got 12", Toast.LENGTH_LONG).show();
                break;
        }
    }
}