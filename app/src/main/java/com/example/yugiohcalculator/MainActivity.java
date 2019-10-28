package com.example.yugiohcalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    private String editLifeBy;
    private int playerOneLife;
    private int playerTwoLife;
    private TextView editLifeByView;

    public MainActivity()
    {
        editLifeBy = "";
        playerOneLife = 8000;
        playerTwoLife = 8000;
    }

    public void lifeCalculator(View view)
    {
        Button calculatorButton = (Button)view;
        int buttonPressed = Integer.parseInt(calculatorButton.getTag().toString());
        TextView editLifeByView = (TextView)findViewById(R.id.editLifeByView);

        if (editLifeBy.length() < 5)
        {

            if (buttonPressed == 9) {
                editLifeBy += "9";
                editLifeByView.setText(editLifeBy);
            }
            if (buttonPressed == 8) {
                editLifeBy += "8";
                editLifeByView.setText(editLifeBy);
            }
            if (buttonPressed == 7) {
                editLifeBy += "7";
                editLifeByView.setText(editLifeBy);
            }
            if (buttonPressed == 6) {
                editLifeBy += "6";
                editLifeByView.setText(editLifeBy);
            }
            if (buttonPressed == 5) {
                editLifeBy += "5";
                editLifeByView.setText(editLifeBy);
            }
            if (buttonPressed == 4) {
                editLifeBy += "4";
                editLifeByView.setText(editLifeBy);
            }
            if (buttonPressed == 3) {
                editLifeBy += "3";
                editLifeByView.setText(editLifeBy);
            }
            if (buttonPressed == 2) {
                editLifeBy += "2";
                editLifeByView.setText(editLifeBy);
            }
            if (buttonPressed == 1) {
                editLifeBy += "1";
                editLifeByView.setText(editLifeBy);
            }
            if (buttonPressed == 0) {
                editLifeBy += "0";
                editLifeByView.setText(editLifeBy);
            }
            if (buttonPressed == 11) {
                editLifeBy += "00";
                editLifeByView.setText(editLifeBy);
            }
            if (buttonPressed == 111) {
                editLifeBy += "000";
                editLifeByView.setText(editLifeBy);
            }
        }
    }

    public void diceSimulator(View view)
    {
        int numberRolled;

        Random generator = new Random();
        numberRolled = generator.nextInt(6) + 1;
        Button dice = (Button)findViewById(R.id.dice);
        dice.setText("Dice: " + Integer.toString(numberRolled));
    }

    public void clearCalculation(View view)
    {
        editLifeBy = "";
        editLifeByView = (TextView)findViewById(R.id.editLifeByView);
        editLifeByView.setText("0");
    }

    public void addLifePlayerOne(View view)
    {
        if (!editLifeBy.equals(""))
        {
            TextView playerOneLifeView = (TextView) findViewById(R.id.playerOneLifeView);
            playerOneLife += Integer.parseInt(editLifeBy);
            playerOneLifeView.setText(Integer.toString(playerOneLife));
            clearCalculation(editLifeByView);
        }
    }

    public void addLifePlayerTwo(View view)
    {
        if (!editLifeBy.equals(""))
        {
            TextView playerTwoLifeView = (TextView) findViewById(R.id.playerTwoLifeView);
            playerTwoLife += Integer.parseInt(editLifeBy);
            playerTwoLifeView.setText(Integer.toString(playerTwoLife));
            clearCalculation(editLifeByView);
        }
    }

    public void subtractLifePlayerOne(View view)
    {
        if (!editLifeBy.equals(""))
        {
            TextView playerOneLifeView = (TextView) findViewById(R.id.playerOneLifeView);
            playerOneLife -= Integer.parseInt(editLifeBy);
            playerOneLifeView.setText(Integer.toString(playerOneLife));
            clearCalculation(editLifeByView);
        }
    }

    public void subtractLifePlayerTwo(View view)
    {
        if (!editLifeBy.equals("")) {
            TextView playerTwoLifeView = (TextView) findViewById(R.id.playerTwoLifeView);
            playerTwoLife -= Integer.parseInt(editLifeBy);
            playerTwoLifeView.setText(Integer.toString(playerTwoLife));
            clearCalculation(editLifeByView);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}