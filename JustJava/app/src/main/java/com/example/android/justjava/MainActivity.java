package com.example.android.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submitOrder(View view){
        display(1);
        displayPrice(1*5);
    }
    private void display(int number){
        TextView zCounter = (TextView) findViewById(R.id.z_counter);
        zCounter.setText("" + number);
    }
    private void displayPrice(int number){
        TextView zCounter = (TextView) findViewById(R.id.pr_counter);
        zCounter.setText(number + "$");
    }

}