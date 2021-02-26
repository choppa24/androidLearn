package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int pointCounterTeamA = 0;
    private int pointCounterTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void reset(View view){
        pointCounterTeamA = 0;
        pointCounterTeamB = 0;
        displayTeamA();
        displayTeamB();
    }
    public void point3TeamA(View view){
        pointCounterTeamA+=3;
        displayTeamA();
    }
    public void point2TeamA(View view){
        pointCounterTeamA += 2;
        displayTeamA();
    }
    public void point1TeamA(View view){
        pointCounterTeamA+= 1;
        displayTeamA();
    }
    public void point3TeamB(View view){
        pointCounterTeamB+=3;
        displayTeamB();
    }
    public void point2TeamB(View view){
        pointCounterTeamB += 2;
        displayTeamB();
    }
    public void point1TeamB(View view){
        pointCounterTeamB+= 1;
        displayTeamB();
    }
    private void displayTeamA(){
        TextView points = (TextView) findViewById(R.id.point_counter_teamA);
        points.setText(""+ pointCounterTeamA);
    }
    private void displayTeamB(){
        TextView points = (TextView) findViewById(R.id.point_counter_teamB);
        points.setText(""+ pointCounterTeamB);
    }
}