package com.example.android.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int correctAnswers = 0;


    /**
     * Method to record correct answer for question 1.
     */
    public void questionOne() {

        RadioButton rbOne = findViewById(R.id.yes_radio_button);
        if (rbOne.isChecked()) {
            correctAnswers++;
        }

    }

    /**
     * Method to record correct answer for question 2.
     */

    public void questionTwo() {
        RadioButton rb4 = findViewById(R.id.question_two_choice4);


        if (rb4.isChecked()) {
            correctAnswers++;
        }


    }

    /**
     * Method to record correct answer for question 3.
     */
    public void questionThree() {

        CheckBox cb1 = findViewById(R.id.choice_one);
        CheckBox cb2 = findViewById(R.id.choice_two);
        CheckBox cb3 = findViewById(R.id.choice_three);
        CheckBox cb4 = findViewById(R.id.choice_four);


        if (cb2.isChecked() || cb4.isChecked()) {
            correctAnswers = correctAnswers + 0;
        } else if (cb1.isChecked() & cb3.isChecked())
            correctAnswers++;

    }

    /**
     * Method to record correct answer for question 4.
     */


    public void questionFour() {
        EditText answerQuestionFour = (EditText) findViewById(R.id.question_four);
        String answerOfQuestionFour = answerQuestionFour.getText().toString();
        {
            if (answerOfQuestionFour.equals(getString(R.string.sara_lance)))
                correctAnswers++;
        }
    }

    /**
     * Method to record correct answer for question 5.
     */

    public void questionFive() {
        RadioButton rb3 = findViewById(R.id.question_five_choice3);


        if (rb3.isChecked()) {
            correctAnswers++;
        }


    }

    /**
     * Method to record correct answer for question 6.
     */
    public void questionSix() {

        CheckBox q6Cb1 = findViewById(R.id.question_six_choice_one);
        CheckBox q6Cb2 = findViewById(R.id.question_six_choice_two);
        CheckBox q6Cb3 = findViewById(R.id.question_six_choice_three);
        CheckBox q6Cb4 = findViewById(R.id.question_six_choice_four);


        if (q6Cb2.isChecked() || q6Cb3.isChecked()) {
            correctAnswers = correctAnswers + 0;
        } else if (q6Cb1.isChecked() & q6Cb4.isChecked())
            correctAnswers++;

    }

    /**
     * Method to record correct answer for question 7.
     */
    public void questionSeven() {

        RadioButton q7Rb2 = findViewById(R.id.q7_no_radio_button);
        if (q7Rb2.isChecked()) {
            correctAnswers++;
        }

    }


    /**
     * Method to record correct answer for question 8.
     */


    public void questionEight() {
        EditText answerQuestionEight = (EditText) findViewById(R.id.question_eight);
        String answerOfQuestionEight = answerQuestionEight.getText().toString();
        {
            if (answerOfQuestionEight.equals(getString(R.string.flashpoint)))
                correctAnswers++;
        }
    }

    /**
     * Method to record correct answer for bonus question.
     */

    public void questionBonus(View view) {
        LayoutInflater inflater = getLayoutInflater();
        view = inflater.inflate(R.layout.cust_toast_layout,
                (ViewGroup) findViewById(R.id.relativeLayout1));

        Toast toast = new Toast(this);
        toast.setView(view);
        toast.show();


    }


    /**
     * Compile answers.
     */

    public void compileAnswers() {
        correctAnswers = 0;
        questionOne();
        questionTwo();
        questionThree();
        questionFour();
        questionFive();
        questionSix();
        questionSeven();
        questionEight();

    }

    /**
     * Method to display question results in a toast message.
     */
    public void submitAnswers(View view) {

        compileAnswers();
        EditText playerName = (EditText) findViewById(R.id.name);
        String name = playerName.getText().toString();
        String resultsMessage = name + " " + getString(R.string.got) + " " + correctAnswers + " " + getString(R.string.out_of);
        Toast.makeText(this, resultsMessage, Toast.LENGTH_LONG).show();


    }
}
