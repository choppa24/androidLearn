package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int pointCounter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void point3(View view){
        pointCounter+=3;
        display();
    }
    public void point2(View view){
        pointCounter += 2;
        display();
    }
    public void point1(View view){
        pointCounter += 1;
        display();
    }
    private void display(){
        TextView points = (TextView) findViewById(R.id.point_counter);
        points.setText(""+ pointCounter);
    }
}