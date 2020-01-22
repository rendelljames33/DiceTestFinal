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
    public ImageView imageView1;
    public ImageView imageView2;
    public Random rng2 = new Random(12);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final Button roll2 = findViewById(R.id.button2);
        final Button second2 = findViewById(R.id.back);
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
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
        int randomNumber2 = rng2.nextInt(6)+1;

        int total=0;


        switch (randomNumber2){
            case(1):
                total=1;
                imageView2.setImageResource(R.drawable.dice1);
                //Toast.makeText(Main2Activity.this, "You got "+(total2+total), Toast.LENGTH_SHORT).show();
                break;
            case(2):
                total=2;
                imageView2.setImageResource(R.drawable.dice2);
                //Toast.makeText(Main2Activity.this, "You got "+(total2+total), Toast.LENGTH_SHORT).show();
                break;
            case(3):
                total=3;
                imageView2.setImageResource(R.drawable.dice3);
                //Toast.makeText(Main2Activity.this, "You got "+(total2+total), Toast.LENGTH_SHORT).show();
                break;
            case(4):
                total=4;
                imageView2.setImageResource(R.drawable.dice4);
                //Toast.makeText(Main2Activity.this, "You got "+(total2+total), Toast.LENGTH_SHORT).show();
                break;
            case(5):
                total=5;
                imageView2.setImageResource(R.drawable.dice5);
                //Toast.makeText(Main2Activity.this, "You got "+(total2+total), Toast.LENGTH_SHORT).show();
                break;
            case(6):
                total=6;
                imageView2.setImageResource(R.drawable.dice6);
                //Toast.makeText(Main2Activity.this, "You got "+(total2+total), Toast.LENGTH_SHORT).show();
                break;

        }
        int randomNumber3 = rng2.nextInt(6)+1;
        int total2=0;
        switch (randomNumber3){
            case(1):
                total2=6;
                imageView1.setImageResource(R.drawable.dice6);
                //Toast.makeText(Main2Activity.this, "You got "+(total2+total), Toast.LENGTH_SHORT).show();
                break;
            case(2):
                total2=5;
                imageView1.setImageResource(R.drawable.dice5);
                //Toast.makeText(Main2Activity.this, "You got "+(total2+total), Toast.LENGTH_SHORT).show();
                break;
            case(3):
                total2=4;
                imageView1.setImageResource(R.drawable.dice4);
                //Toast.makeText(Main2Activity.this, "You got "+(total2+total), Toast.LENGTH_SHORT).show();
                break;
            case(4):
                total2=3;
                imageView1.setImageResource(R.drawable.dice3);
                //Toast.makeText(Main2Activity.this, "You got "+(total2+total), Toast.LENGTH_SHORT).show();
                break;
            case(5):
                total2=2;
                imageView1.setImageResource(R.drawable.dice2);
                //Toast.makeText(Main2Activity.this, "You got "+(total2+total), Toast.LENGTH_SHORT).show();
                break;
            case(6):
                total2=1;
                imageView1.setImageResource(R.drawable.dice1);
                //Toast.makeText(Main2Activity.this, "You got "+(total2+total), Toast.LENGTH_SHORT).show();
                break;
        }
        int totalf=total+total2;
        Toast.makeText(Main2Activity.this, "You got "+totalf, Toast.LENGTH_SHORT).show();


    }
}