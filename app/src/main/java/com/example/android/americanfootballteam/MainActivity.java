package com.example.android.americanfootballteam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamA = 0;
    int teamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void touchDownTeamA(View view) {
        teamA += 6;
        display(teamA, teamB);
    }

    public void touchDownTeamB(View view) {
        teamB += 6;
        display(teamA, teamB);
    }

    public void patTeamA(View view) {
        teamA++;
        display(teamA, teamB);
    }

    public void patTeamB(View view) {
        teamB++;
        display(teamA, teamB);
    }

    public void fieldGoalTeamA(View view) {
        teamA += 3;
        display(teamA, teamB);
    }

    public void fieldGoalTeamB(View view) {
        teamB += 3;
        display(teamA, teamB);
    }

    public void safetyTeamA(View view) {
        teamA += 3;
        display(teamA, teamB);
    }

    public void safetyTeamB(View view) {
        teamB += 3;
        display(teamA, teamB);
    }

    public void reset(View view) {
        teamA = 0;
        teamB = 0;
        display(teamA, teamB);
    }


    /**
     * Displays the given score for both Teams.
     */
    public void display(int scoreA, int scoreB) {
        TextView scoreViewA = (TextView) findViewById(R.id.team_a_score);
        scoreViewA.setText(String.valueOf(scoreA));
        TextView scoreViewB = (TextView) findViewById(R.id.team_b_score);
        scoreViewB.setText(String.valueOf(scoreB));
    }

}
