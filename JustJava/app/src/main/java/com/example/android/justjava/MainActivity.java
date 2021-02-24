package com.example.android.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int quantity = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submitOrder(View view){
        displayPrice(quantity);
        displayThank();
    }
    public void decrement(View view){
        if (quantity > 0)
            quantity--;
        display(quantity);
    }
    public void increment(View view){
        quantity++;
        display(quantity);
    }
    private void display(int number){
        TextView qCounter = (TextView) findViewById(R.id.q_counter);
        qCounter.setText("" + number);
    }
    private void displayPrice(int number){
        TextView prCounter = (TextView) findViewById(R.id.pr_counter);
        prCounter.setText("Total: " +number*5 + "$");
    }
    private void displayThank(){
        TextView thank = (TextView) findViewById(R.id.thank);
        thank.setText("Thank!");
    }

}