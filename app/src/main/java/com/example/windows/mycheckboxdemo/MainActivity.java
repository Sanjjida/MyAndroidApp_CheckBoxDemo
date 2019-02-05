package com.example.windows.mycheckboxdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import java.lang.String;

public class MainActivity extends AppCompatActivity {
    private CheckBox linCheck, winCheck, macCheck;
    private Button showButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linCheck= (CheckBox)findViewById(R.id.LinuxCheckBoxId);
        winCheck= (CheckBox)findViewById(R.id.WindowsCheckBoxId);
        macCheck= (CheckBox)findViewById(R.id.MacCheckBoxId);

        showButton= (Button)findViewById(R.id.ButtonTextId);
        resultTextView= (TextView)findViewById(R.id.textviewId);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBulder= new StringBuilder();
                if(linCheck.isChecked())
                {
                    String value= linCheck.getText().toString();
                    //StringBuilder value + "is sold" ;
                    //StringBuilder.append(value + "is sold");
                }
                if(linCheck.isChecked())
                {
                    String value= winCheck.getText().toString();
                    //StringBuilder.append(value + "is sold");
                }
                if(linCheck.isChecked())
                {
                    String value= macCheck.getText().toString();
                    //StringBuilder value + "is sold" = StringBuilder.append(value + "is sold");
                    //StringBuilder.append(value + "is sold");
                }



            }
        });
    }
}
