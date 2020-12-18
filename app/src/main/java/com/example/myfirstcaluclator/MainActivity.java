package com.example.myfirstcaluclator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0,buttonAdd, buttonSub, buttonMul, buttonDiv
            , buttonper, buttonbackspace, buttonequal, buttonDot, buttonClear;
    TextView textview1 , textview2;
    double first, second, result;
    String operation, answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1= (Button)findViewById(R.id.button1);
        button2= (Button)findViewById(R.id.button2);
        button3= (Button)findViewById(R.id.button3);
        button4= (Button)findViewById(R.id.button4);
        button5= (Button)findViewById(R.id.button5);
        button6= (Button)findViewById(R.id.button6);
        button7= (Button)findViewById(R.id.button7);
        button8= (Button)findViewById(R.id.button8);
        button9= (Button)findViewById(R.id.button9);
        button0= (Button)findViewById(R.id.button0);
        buttonSub= (Button)findViewById(R.id.buttonMin);
        buttonAdd= (Button)findViewById(R.id.buttonAdd);
        buttonMul= (Button)findViewById(R.id.buttonMul);
        buttonDiv= (Button)findViewById(R.id.buttonDivide);
        buttonDot= (Button)findViewById(R.id.buttonDot);
        buttonbackspace= (Button)findViewById(R.id.buttonBackspace);
        buttonequal= (Button)findViewById(R.id.buttonEqual);
        buttonper= (Button)findViewById(R.id.buttonPercent);
        buttonClear=(Button)findViewById(R.id.buttonClear);
        textview1= findViewById(R.id.Textview1);
        textview2= findViewById(R.id.Textview2);
//
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview1.setText(null);
                textview2.setText(null);
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textview2.getText().toString() + button0.getText().toString();
                textview2.setText(text);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textview2.getText().toString() + button1.getText().toString();
                textview2.setText(text);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textview2.getText().toString() + button2.getText().toString();
                textview2.setText(text);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textview2.getText().toString() + button3.getText().toString();
                textview2.setText(text);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textview2.getText().toString() + button4.getText().toString();
                textview2.setText(text);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textview2.getText().toString() + button5.getText().toString();
                textview2.setText(text);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textview2.getText().toString() + button6.getText().toString();
                textview2.setText(text);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textview2.getText().toString() + button7.getText().toString();
                textview2.setText(text);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textview2.getText().toString() + button8.getText().toString();
                textview2.setText(text);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textview2.getText().toString() + button9.getText().toString();
                textview2.setText(text);
            }
        });
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = textview2.getText().toString() + buttonDot.getText().toString();
                textview2.setText(text);
            }
        });
        buttonbackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String backspace =null;
                if(textview2.getText().length()>0)
                {
                    StringBuilder stringBuilder= new StringBuilder(textview2.getText());
                    stringBuilder.deleteCharAt(textview2.getText().length()-1);
                    backspace= stringBuilder.toString();
                    textview2.setText(backspace);
                }
            }
        });
        // code for operators

        buttonper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                first= Double.parseDouble((String) textview2.getText());
                primary  = String.format("%.2f",first);
                textview1.setText(primary);
                textview2.setText(null);
                operation="%";
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                first= Double.parseDouble((String) textview2.getText());
                primary  = String.format("%.2f",first);
                textview1.setText(primary);
                textview2.setText(null);
                operation="-";
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                first= Double.parseDouble((String) textview2.getText());
                primary  = String.format("%.2f",first);
                textview1.setText(primary);
                textview2.setText(null);
                operation="+";
            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                first= Double.parseDouble((String) textview2.getText());
                primary  = String.format("%.2f",first);
                textview1.setText(primary);
                textview2.setText(null);
                operation="*";
            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String primary;
                first= Double.parseDouble((String) textview2.getText());
                primary  = String.format("%.2f",first);
                textview1.setText(primary);
                textview2.setText(null);
                operation="/";
            }
        });


        // equal
        buttonequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second=Double.parseDouble((String) textview2.getText());
                if(operation=="+")
                {
                    result = first+second;
                    answer= String.format("%.2f",result);
                    textview2.setText(answer);
                    textview1.setText(null);
                }
                if(operation=="-")
                {
                    result = first-second;
                    answer= String.format("%.2f",result);
                    textview2.setText(answer);
                    textview1.setText(null);
                }
                if(operation=="*")
                {
                    result = first*second;
                    answer= String.format("%.2f",result);
                    textview2.setText(answer);
                    textview1.setText(null);
                }
                if(operation=="/")
                {
                    result = first/second;
                    answer= String.format("%.2f",result);
                    textview2.setText(answer);
                    textview1.setText(null);
                }
                if(operation=="%")
                {
                    result = first%second;
                    answer= String.format("%.2f",result);
                    textview2.setText(answer);
                    textview1.setText(null);
                }

            }
        });


    }
}