package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Toast toast = Toast.makeText(getApplicationContext(),
                "Пора покормить кота!", Toast.LENGTH_SHORT);
        toast.show();
        toast.setGravity(Gravity.CENTER, 0, 0);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Click");
                toast.show();
            }
        });
        TextView textView = (TextView) findViewById(R.id.text);
        final EditText editText = (EditText) findViewById(R.id.edtext);


        Button bt = (Button) findViewById(R.id.btn);
        bt.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                Toast ts= Toast.makeText(getApplicationContext(), "Нажата кнопка" + " " + editText.getText(), Toast.LENGTH_SHORT);
                ts.show();
            }
        });

    }
}
