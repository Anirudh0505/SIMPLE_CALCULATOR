package com.example.simple_calculator;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // define the global variable

    // variable number1, number2 for input input number
    // Add_button, result textView

    EditText number1;
    EditText number2;
    Button Add_button;
    Button Sub;
    Button MuL;
    Button Div;
    TextView result;
    int ans = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // by ID we can use each component which id is assign in xml file
        number1 = (EditText) findViewById(R.id.editText_first_no);
        number2 = (EditText) findViewById(R.id.editText_second_no);
        Add_button = (Button) findViewById(R.id.button1);
        Sub = (Button) findViewById(R.id.button2);
        MuL = (Button)  findViewById(R.id.button3);
        Div = (Button)  findViewById(R.id.button4);
        result = (TextView) findViewById(R.id.textView_answer);

        // Add_button add clicklistener
        Add_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // num1 or num2 double type
                // get data which is in edittext, convert it to string
                // using parse Double convert it to Double type
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                // add both number and store it to sum
                double sum = num1 + num2;
                // set it ot result textview
                result.setText(Double.toString(sum));
            }
        });
        Sub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // num1 or num2 double type
                // get data which is in edittext, convert it to string
                // using parse Double convert it to Double type
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                // add both number and store it to sum
                double sum = num1 - num2;
                // set it ot result textview
                result.setText(Double.toString(sum));
            }
        });
        // MuL_button add clicklistener
        MuL.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {

                    // num1 or num2 double type
                    // get data which is in edittext, convert it to string
                    // using parse Double convert it to Double type
                    double num1 = Double.parseDouble(number1.getText().toString());
                    double num2 = Double.parseDouble(number2.getText().toString());
                    // add both number and store it to sum
                    double MuL = num1 * num2;
                    // set it ot result textview
                    result.setText(Double.toString(MuL));
                }
        });
            // Div_button add clicklistener
        Div.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {

                    // num1 or num2 double type
                    // get data which is in edittext, convert it to string
                    // using parse Double convert it to Double type
                    double num1 = Double.parseDouble(number1.getText().toString());
                    double num2 = Double.parseDouble(number2.getText().toString());
                    // add both number and store it to sum
                    double Div = num1 / num2;
                    // set it ot result textview
                    result.setText(Double.toString(Div));
                }
            });
    }
}