package com.sd3lab.ahmadhassan.mathgamechapter2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class GameActivity extends Activity implements View.OnClickListener {

    int partA = 9;
    int partB = 9;
    int correctAnswer = partA * partB;
    int wrongAnswer1 = partA * partB + 1;
    int wrongAnswer2 = partA * partB - 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        //Get the view objects
        TextView textObjectPartA = (TextView) findViewById(R.id.textPartA);
        TextView textObjectPartB = (TextView) findViewById(R.id.textPartB);
        //Get the button objects
        Button buttonObjectChoice1 = (Button) findViewById(R.id.buttonChoice1);
        Button buttonObjectChoice2 = (Button) findViewById(R.id.buttonChoice2);
        Button buttonObjectChoice3 = (Button) findViewById(R.id.buttonChoice3);
        //Set Values
        textObjectPartA.setText("" + partA);
        textObjectPartB.setText("" + partB);
        buttonObjectChoice1.setText("" + correctAnswer);
        buttonObjectChoice2.setText("" + wrongAnswer1);
        buttonObjectChoice3.setText("" + wrongAnswer2);
        //Create onclick listener for buttons
        buttonObjectChoice1.setOnClickListener(this);
        buttonObjectChoice2.setOnClickListener(this);
        buttonObjectChoice3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //declare a new int to be used in all the cases
        int answerGiven = 0;
        Button buttonObjectChoice1 = (Button) findViewById(R.id.buttonChoice1);
        Button buttonObjectChoice2 = (Button) findViewById(R.id.buttonChoice2);
        Button buttonObjectChoice3 = (Button) findViewById(R.id.buttonChoice3);

        switch (view.getId()) {
            case R.id.buttonChoice1:
                //initialize a new int with the value contained in buttonObjectChoice1
                answerGiven = Integer.parseInt("" + buttonObjectChoice1.getText());
                //Is it the right answer?
                if (answerGiven == correctAnswer) {
                    //yay it's the right answer
                    Toast.makeText(getApplicationContext(), "Well done!", Toast.LENGTH_LONG).show();
                } else {
                    //Wrong right answer
                    Toast.makeText(getApplicationContext(), "Sorry that's wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.buttonChoice2:
                //initialize a new int with the value contained in buttonObjectChoice2
                answerGiven = Integer.parseInt("" + buttonObjectChoice2.getText());
                if (answerGiven == correctAnswer) {
                    //yay it's the right answer
                    Toast.makeText(getApplicationContext(), "Well done!", Toast.LENGTH_LONG).show();
                } else {
                    //Wrong right answer
                    Toast.makeText(getApplicationContext(), "Sorry that's wrong", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.buttonChoice3:
                //initialize a new int with the value contained in buttonObjectChoice3
                answerGiven = Integer.parseInt("" + buttonObjectChoice3.getText());
                if (answerGiven == correctAnswer) {
                    //yay it's the right answer
                    Toast.makeText(getApplicationContext(), "Well done!", Toast.LENGTH_LONG).show();
                } else {
                    //Wrong right answer
                    Toast.makeText(getApplicationContext(), "Sorry that's wrong", Toast.LENGTH_LONG).show();
                }
                break;
        }
    }
}
