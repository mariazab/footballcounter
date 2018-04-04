package com.example.android.footballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Variables for both teams.
     */
    int scoreOne = 0;
    int scoreTwo = 0;

    int foulsOne = 0;
    int foulsTwo = 0;

    int cornersOne = 0;
    int cornersTwo = 0;

    int offsidesOne= 0;
    int offsidesTwo = 0;

    /**
     * Displays the given score for Team 1.
     */
    public void displayForTeamOne(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreOne);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the fouls for Team 1
     */
    public void displayFoulsOne(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.foulsOne);
        scoreView.setText(String.valueOf(fouls));
    }

    /**
     * Displays the corners for Team 1
     */
    public void displayCornersOne(int corners) {
        TextView scoreView = (TextView) findViewById(R.id.cornersOne);
        scoreView.setText(String.valueOf(corners));
    }

    /**
     * Displays the offsides for Team 1
     */
    public void displayOffsidesOne(int offsides) {
        TextView scoreView = (TextView) findViewById(R.id.offsidesOne);
        scoreView.setText(String.valueOf(offsides));
    }

    /**
     * Add a goal for team 1 and displays it.
     */
    public void plusGoalOne (View v) {
        scoreOne += 1;
        displayForTeamOne(scoreOne);
    }


    /**
     * Add a foul and displays the fouls for Team 1.
     */
    public void plusFoulsOne (View v) {
        foulsOne += 1;
        displayFoulsOne(foulsOne);
    }

    /**
     * Add and displays the corners for Team 1.
     */
    public void plusCornersOne (View v) {
        cornersOne += 1;
        displayCornersOne(cornersOne);
    }

    /**
     * Add and displays the offsides for Team 1.
     */
    public void plusOffsidesOne (View v) {
        offsidesOne += 1;
        displayOffsidesOne(offsidesOne);
    }


    /**
     * Displays the given score for Team 2.
     */
    public void displayForTeamTwo(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreTwo);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the fouls for Team 2
     */
    public void displayFoulsTwo(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.foulsTwo);
        scoreView.setText(String.valueOf(fouls));
    }

    /**
     * Displays the corners for Team 1
     */
    public void displayCornersTwo(int corners) {
        TextView scoreView = (TextView) findViewById(R.id.cornersTwo);
        scoreView.setText(String.valueOf(corners));
    }

    /**
     * Displays the offsides for Team 1
     */
    public void displayOffsidesTwo(int offsides) {
        TextView scoreView = (TextView) findViewById(R.id.offsidesTwo);
        scoreView.setText(String.valueOf(offsides));
    }

    /**
     * Add a goal for team 2 and displays it.
     */
    public void plusGoalTwo (View v) {
        scoreTwo += 1;
        displayForTeamTwo(scoreTwo);
    }


    /**
     * Add a foul and displays the fouls for Team 2.
     */
    public void plusFoulsTwo (View v) {
        foulsTwo += 1;
        displayFoulsTwo(foulsTwo);
    }

    /**
     * Add and displays the corners for Team 2.
     */
    public void plusCornersTwo (View v) {
        cornersTwo += 1;
        displayCornersTwo(cornersTwo);
    }

    /**
     * Add and displays the offsides for Team 2.
     */
    public void plusOffsidesTwo (View v) {
        offsidesTwo += 1;
        displayOffsidesTwo(offsidesTwo);
    }

    /**
     * Resets the scores and displays them.
     */

    public void reset (View v) {


        scoreOne = 0;
        displayForTeamOne(scoreOne);
        scoreTwo = 0;
        displayForTeamTwo(scoreTwo);

        foulsOne = 0;
        displayFoulsOne(foulsOne);
        foulsTwo = 0;
        displayFoulsTwo(foulsTwo);

        cornersOne = 0;
        displayCornersOne(cornersOne);
        cornersTwo = 0;
        displayCornersTwo(cornersTwo);

        offsidesOne = 0;
        displayOffsidesOne(offsidesOne);
        offsidesTwo = 0;
        displayOffsidesTwo(offsidesTwo);
    }
}
