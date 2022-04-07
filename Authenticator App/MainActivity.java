package com.example.authenticationverification;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    EditText uname, pass;
    Button blog, bclear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uname=(EditText)findViewById(R.id.editText1);
        pass=(EditText)findViewById(R.id.editText2);
        blog=(Button)findViewById(R.id.button1);
        bclear=(Button)findViewById(R.id.button2);

        blog.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                String na=uname.getText().toString();
                String p=pass.getText().toString();
                if(na.equals("admin") &&p.equals("admin"))
                    Toast.makeText(getApplicationContext(), "Authenticated...", Toast.LENGTH_LONG).show();
                else
                {
                    Toast.makeText(getApplicationContext(), "Un Authenticated...", Toast.LENGTH_LONG).show();
                    uname.setText("");
                    pass.setText("");
                }

            }
        });
        bclear.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                uname.setText("");
                pass.setText("");
            }
        });


    }

}