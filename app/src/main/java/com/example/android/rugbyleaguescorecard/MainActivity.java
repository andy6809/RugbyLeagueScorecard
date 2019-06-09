package com.example.android.rugbyleaguescorecard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreHomeTeam = 0;
    int scoreAwayTeam = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when TRY is pressed and adds 4 points to Home team.
     * <p>
     * (A Try is like a touchdown in American Football except the ball must be grounded
     * behind the try line)
     */
    public void tryHomeTeam(View view) {
        scoreHomeTeam = scoreHomeTeam + 4;
        displayForHomeTeam(scoreHomeTeam);
    }

    /**
     * This method is called when CONVERSION is pressed and adds 2 points to Home team
     * <p>
     * (A Conversion is a chance to kick a goal for 2 extra points after a Try is scored
     * and is taken from a point in line with where the Try was grounded)
     */
    public void conversionHomeTeam(View view) {
        scoreHomeTeam = scoreHomeTeam + 2;
        displayForHomeTeam(scoreHomeTeam);
    }

    /**
     * This method is called when FIELD GOAL is pressed and adds 1 point to Home team
     */
    public void goalHomeTeam(View view) {
        scoreHomeTeam = scoreHomeTeam + 1;
        displayForHomeTeam(scoreHomeTeam);

    }

    /**
     * This method is called when PENALTY is pressed and adds 2 points to Home team
     */
    public void penaltyHomeTeam(View view) {
        scoreHomeTeam = scoreHomeTeam + 2;
        displayForHomeTeam(scoreHomeTeam);
    }

    /**
     * Displays the given score for Home team
     */
    public void displayForHomeTeam(int score) {
        TextView scoreView;
        scoreView = findViewById(R.id.home_team_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when TRY is pressed and adds 4 points to Away team.
     */
    public void tryAwayTeam(View view) {
        scoreAwayTeam = scoreAwayTeam + 4;
        displayForAwayTeam(scoreAwayTeam);
    }

    /**
     * This method is called when CONVERSION is pressed and adds 2 points to Away team
     */
    public void conversionAwayTeam(View view) {
        scoreAwayTeam = scoreAwayTeam + 2;
        displayForAwayTeam(scoreAwayTeam);
    }

    /**
     * This method is called when FIELD GOAL is pressed and adds 1 point to Away team
     */
    public void goalAwayTeam(View view) {
        scoreAwayTeam = scoreAwayTeam + 1;
        displayForAwayTeam(scoreAwayTeam);

    }

    /**
     * This method is called when PENALTY is pressed and adds 2 points to Away team
     */
    public void penaltyAwayTeam(View view) {
        scoreAwayTeam = scoreAwayTeam + 2;
        displayForAwayTeam(scoreAwayTeam);
    }

    /**
     * Displays the given score for Away Team.
     */
    public void displayForAwayTeam(int score) {
        TextView scoreView;
        scoreView = findViewById(R.id.away_team_score);
        scoreView.setText(String.valueOf(score));
    }

    public void reset(View view) {
        scoreHomeTeam = 0;
        scoreAwayTeam = 0;
        displayForHomeTeam(scoreHomeTeam);
        displayForAwayTeam(scoreAwayTeam);
    }


}
