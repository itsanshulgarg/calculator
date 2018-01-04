package com.example.anshulgarg.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = findViewById(R.id.button);
        t = findViewById(R.id.textView);



    }
    public void Reset (View view){
        String s =t.getText().toString();
        t.setText("0");
        Toast.makeText(this, "Reset done  ",Toast.LENGTH_SHORT).show();}


    public void increase(View view) {
    float s= t.getTextSize();
    t.setTextSize(s*0.34f);

    }
    public void Counter(View view){
        String s=t.getText().toString();

        int i =Integer.parseInt(s);

        i++;
        Toast.makeText(this, "Counter = "+i,Toast.LENGTH_SHORT).show();
        t.setText(i+"");
    }
}
