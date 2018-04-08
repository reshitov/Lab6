package com.example.server.laba6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int guess;
    private boolean work_app;
    private EditText a;
    private Button button;
    private TextView random;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=(EditText)findViewById(R.id.editText);
        random=(TextView)findViewById(R.id.textView);
        button =(Button)findViewById(R.id.button);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        guess = (int) (Math.random() * 5);
                        random.setText(Integer.toString(guess));
                        work_app=false;
                        int num1 = Integer.parseInt(a.getText().toString());
                        if(!work_app&&num1>=0&&num1<=100) {
                            if (guess > num1) {
                                Toast.makeText(MainActivity.this, "Ваше число меньше", Toast.LENGTH_LONG).show();
                                //вывесчти через toast сообщение "ваше число меньше"
                            } else if (guess < num1) {
                                Toast.makeText(MainActivity.this, "Ваше число больше", Toast.LENGTH_LONG).show();
                                //вывести через toast сообщение "ваше число больше"
                            } else if (guess == num1) {
                                Toast.makeText(MainActivity.this, "Ваше число равно", Toast.LENGTH_LONG).show();
                                work_app=true;
                            }

                        }else{
                                Toast.makeText(MainActivity.this, "Необходимо указать число от 0 до 100", Toast.LENGTH_LONG).show();
                            work_app=false;
                        }

                    }

                });
                }



        }



