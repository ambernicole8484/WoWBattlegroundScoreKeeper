package com.example.android.wowbattlegroundscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.wowbattlegroundscorekeeper.R;

public class MainActivity extends AppCompatActivity {

    /**
     * Tracks score for the Alliance.
     */
    int scoreTeamAlliance = 0;

    /**
     * Tracks score for the Horde.
     */
    int scoreTeamHorde = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**

     * Displays the given score for the alliance.

     */

    public void displayForTeamAlliance(int score) {

        TextView scoreView = (TextView) findViewById(R.id.team_alliance_score);

        scoreView.setText(String.valueOf(score));

    }

    /**
     * Increase score by 1 for the alliance.
     */
    public void addOneForAlliance (View view){
        scoreTeamAlliance = scoreTeamAlliance + 1;
        displayForTeamAlliance(scoreTeamAlliance);
    }

    /**
     * Displays the given score for the Horde.
     */
    public void displayForTeamHorde(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_horde_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase score by 3 for Team B.
     */
    public void addOneForHorde (View view){
        scoreTeamHorde = scoreTeamHorde + 1;
        displayForTeamHorde(scoreTeamHorde);
    }


    public void resetAllianceAndHordeScore (View View){
        scoreTeamAlliance = 0;
        scoreTeamHorde = 0;
        displayForTeamAlliance(scoreTeamAlliance);
        displayForTeamHorde(scoreTeamHorde);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("scoreTeamAlliance", scoreTeamAlliance);
        outState.putInt("scoreTeamHorde", scoreTeamHorde);
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scoreTeamAlliance = savedInstanceState.getInt("scoreTeamAlliance");
        scoreTeamHorde = savedInstanceState.getInt ("scoreTeamHorde");
        displayForTeamAlliance(scoreTeamAlliance);
        displayForTeamHorde(scoreTeamHorde);

    }

}
