package com.example.android.justjava2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int quantity = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the '+' button is clicked.
     */
    public void increment(View view) {
        findViewById(R.id.decrement).setEnabled(true); //Enabling the decrement button which might have been disabled previously
        quantity = quantity + 1;
        display(quantity);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method is called when the '-' button is clicked.
     */
    public void decrement(View view) {
        //checking if the current value of quantity is zero
        if(quantity>0)
            quantity = quantity - 1;
        else
            findViewById(R.id.decrement).setEnabled(false);     //deactivating the button

        display(quantity);
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

    /**
     *
     * The final function which calculates and returns the value
     */

    public void submitOrder(View view) {
        String priceMessage = "Total: ₹" + quantity*100 +"\nThank you!";
        displayMessage(priceMessage);
    }


}
