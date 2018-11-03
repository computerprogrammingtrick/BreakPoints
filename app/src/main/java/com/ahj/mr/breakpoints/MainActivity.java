package com.ahj.mr.breakpoints;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText firstNumber;
    private EditText secondNumber;
    private Button add;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        add.setOnClickListener(this);
    }

    private void init() {
        firstNumber = (EditText) findViewById(R.id.MainActivity_EditText_FirstNumber);
        secondNumber = (EditText) findViewById(R.id.MainActivity_EditText_SecondNumber);
        add = (Button) findViewById(R.id.MainActivity_Button_Add);
        result = (TextView) findViewById(R.id.MainActivity_TextView_Result);
    }

    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public void onClick(View v) {
        int a = Integer.parseInt(firstNumber.getText().toString());
        int b = Integer.parseInt(secondNumber.getText().toString());
        int c = sum(a,b);
        result.setText(String.valueOf(c));
    }
}
