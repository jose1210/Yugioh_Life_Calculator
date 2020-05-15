package com.example.yugiohcalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    private String editLifeBy;
    private int playerOneLife;
    private int playerTwoLife;
    private TextView editLifeByView;
    private TextView playerOneLifeView;
    private TextView playerTwoLifeView;
    private Button dice;

    public MainActivity()
    {
        editLifeBy = "";
        playerOneLife = 8000;
        playerTwoLife = 8000;
    }

    /**
     * Determines the amount to edit the players' life by depending on which button is pressed
     */
    public void lifeCalculator(View view)
    {
        Button calculatorButton = (Button)view;
        int buttonPressed = Integer.parseInt(calculatorButton.getTag().toString());
        TextView editLifeByView = findViewById(R.id.editLifeByView);

        if (editLifeBy.length() < 5)
        {
            if (buttonPressed == 9)
            {
                editLifeBy += "9";
                editLifeByView.setText(editLifeBy);
            }
            if (buttonPressed == 8)
            {
                editLifeBy += "8";
                editLifeByView.setText(editLifeBy);
            }
            if (buttonPressed == 7)
            {
                editLifeBy += "7";
                editLifeByView.setText(editLifeBy);
            }
            if (buttonPressed == 6) {
                editLifeBy += "6";
                editLifeByView.setText(editLifeBy);
            }
            if (buttonPressed == 5)
            {
                editLifeBy += "5";
                editLifeByView.setText(editLifeBy);
            }
            if (buttonPressed == 4) {
                editLifeBy += "4";
                editLifeByView.setText(editLifeBy);
            }
            if (buttonPressed == 3)
            {
                editLifeBy += "3";
                editLifeByView.setText(editLifeBy);
            }
            if (buttonPressed == 2)
            {
                editLifeBy += "2";
                editLifeByView.setText(editLifeBy);
            }
            if (buttonPressed == 1)
            {
                editLifeBy += "1";
                editLifeByView.setText(editLifeBy);
            }
            if (buttonPressed == 0)
            {
                editLifeBy += "0";
                editLifeByView.setText(editLifeBy);
            }
            if (buttonPressed == 11)
            {
                editLifeBy += "00";
                editLifeByView.setText(editLifeBy);
            }
            if (buttonPressed == 111)
            {
                editLifeBy += "000";
                editLifeByView.setText(editLifeBy);
            }
        }
    }

    /**
     * Simulates a dice being rolled when the dice button is pressed
     */
    public void diceSimulator(View view)
    {
        int numberRolled;

        Random generator = new Random();
        numberRolled = generator.nextInt(6) + 1;
        dice = (Button)findViewById(R.id.dice);
        dice.setText("Dice: " + Integer.toString(numberRolled));
    }

    /**
     * Clears the textview displaying the amount that the players life will be edited by
     */
    public void clearCalculation(View view)
    {
        editLifeBy = "";
        editLifeByView = findViewById(R.id.editLifeByView);
        editLifeByView.setText("0");
    }

    /**
     * Adds the amount determined from the life calculator method to player one
     */
    public void addLifePlayerOne(View view)
    {
        if (!editLifeBy.equals(""))
        {
            TextView playerOneLifeView = findViewById(R.id.playerOneLifeView);
            playerOneLife += Integer.parseInt(editLifeBy);
            playerOneLifeView.setText(Integer.toString(playerOneLife));
            clearCalculation(editLifeByView);
        }
    }

    /**
     *  Adds the amount determined from the life calculator method to player one
     */
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

    /**
     * Subtracts life from player one equal to the amount determined from the life calculator method
     */
    public void subtractLifePlayerOne(View view)
    {
        if (!editLifeBy.equals(""))
        {
            TextView playerOneLifeView = (TextView) findViewById(R.id.playerOneLifeView);
            if (playerOneLife > 0)
            {
                if(playerOneLife - Integer.parseInt(editLifeBy) > 0)
                {
                    playerOneLife -= Integer.parseInt(editLifeBy);
                    playerOneLifeView.setText(Integer.toString(playerOneLife));
                    clearCalculation(editLifeByView);
                }
                else
                {
                    playerOneLife = 0;
                    playerOneLifeView.setText(Integer.toString(playerOneLife));
                    clearCalculation(editLifeByView);
                }
            }
        }
    }

    /**
     * Subtracts life from player one equal to the amount determined from the life calculator method
     */
    public void subtractLifePlayerTwo(View view)
    {
        if (!editLifeBy.equals(""))
        {
            TextView playerTwoLifeView = (TextView) findViewById(R.id.playerTwoLifeView);
            if (playerTwoLife > 0)
            {
                if(playerTwoLife - Integer.parseInt(editLifeBy) > 0)
                {
                    playerTwoLife -= Integer.parseInt(editLifeBy);
                    playerTwoLifeView.setText(Integer.toString(playerTwoLife));
                    clearCalculation(editLifeByView);
                }
                else
                {
                    playerTwoLife = 0;
                    playerTwoLifeView.setText(Integer.toString(playerTwoLife));
                    clearCalculation(editLifeByView);
                }
            }
        }
    }

    /**
     * Resets all the values on the screen
     */
    public void resetGame(View view)
    {
        playerOneLife = 8000;
        playerTwoLife = 8000;
        editLifeBy = "";
        TextView playerOneLifeView = findViewById(R.id.playerOneLifeView);
        TextView playerTwoLifeView = findViewById(R.id.playerTwoLifeView);
        TextView editLifeByView = findViewById(R.id.editLifeByView);
        editLifeByView.setText("0");
        playerOneLifeView.setText(Integer.toString(playerOneLife));
        playerTwoLifeView.setText(Integer.toString(playerTwoLife));
        dice.setText("DICE: ?");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    }
}