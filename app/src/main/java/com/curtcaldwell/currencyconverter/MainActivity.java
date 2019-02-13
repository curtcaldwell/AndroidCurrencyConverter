package com.curtcaldwell.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view) {

        EditText pesoAmountEditText = (EditText) findViewById(R.id.pesoAmountEditText);

        Double pesoAmountDouble = Double.parseDouble(pesoAmountEditText.getText().toString());

        Double pesoAmount = pesoAmountDouble * .051;

        Toast.makeText(this, "$" + pesoAmount.toString(), Toast.LENGTH_LONG).show();

        Log.i("amount", "$" + pesoAmountEditText.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
