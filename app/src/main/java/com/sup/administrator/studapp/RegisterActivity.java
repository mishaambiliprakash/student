package com.sup.administrator.studapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.jar.Attributes;

public class RegisterActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7,ed8;
    Button b1,b2;
    String s1,s2,s3,s4,s5,s6,s7,s8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
     ed1=(EditText)findViewById(R.id.name);
        ed2=(EditText)findViewById(R.id.admn);
        ed3=(EditText)findViewById(R.id.roll);
        ed4=(EditText)findViewById(R.id.college);
        ed5=(EditText)findViewById(R.id.place);
        ed6=(EditText)findViewById(R.id.stud);
        ed7=(EditText)findViewById(R.id.pass1);
        ed8=(EditText)findViewById(R.id.confirm);
        b1=(Button)findViewById(R.id.reg);
        b2=(Button)findViewById(R.id.already);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1 = ed1.getText().toString();
                s2 = ed2.getText().toString();
                s3 = ed3.getText().toString();
                s4 = ed4.getText().toString();
                s5 = ed5.getText().toString();
                s6 = ed6.getText().toString();
                s7 = ed7.getText().toString();
                s8 = ed8.getText().toString();
                if (s7.equals(s8)) {
                    Toast.makeText(getApplicationContext(), s1, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), s2, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), s3, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), s4, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), s5, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), s6, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), s7, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), s8, Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"password and confirm password did not match",Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), "Successfully registered", Toast.LENGTH_LONG).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(a);
            }
        });
    }
}
