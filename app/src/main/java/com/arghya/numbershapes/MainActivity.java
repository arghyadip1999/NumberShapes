package com.arghya.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView output;
    public boolean checkPerfectSquare(int num) {
        double d = Math.sqrt(num);
        float fvar = (float) d;
        int ivar = (int) fvar;
        if (ivar == fvar) {
            return true;
        } else if(num == 0){
            return false;
        }
        else{
            return false;
        }
    }
    public boolean checkTriangular(int num) {
        if (num < 0) {
            return false;
        }
        int sum = 0;
        for (int n = 1; n <= num; n++) {
            sum = sum + n;
            if (sum == num) {
                return true;
            }
        }
            return false;
    }
    public void checkFunction(View view){
        EditText input = (EditText)findViewById(R.id.input);
        int number=Integer.parseInt(input.getText().toString());
        output = (TextView)findViewById(R.id.output);
        if(checkPerfectSquare(number) && checkTriangular(number)){
            output.setText("It is both perfect square and triangular number");
        }
        else if(!checkTriangular(number) && checkPerfectSquare(number)){
            output.setText("It is a perfect square");
        }
        else if(!checkPerfectSquare(number) && checkTriangular(number)){
            output.setText("It is a triangular number");
        }
        else{
            output.setText("It is neither a perfect square nor a triangular number");
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
