package com.sup.administrator.studapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText ed1,ed2,ed3;
    Button b1,b2;
    String s1,s2;
    String studid="mzc";
    String pass="college";
    String checkusername;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences preferences=getSharedPreferences("login",MODE_PRIVATE);
        checkusername=preferences.getString("user",null);
        if(checkusername!=null)
        {
            Intent i=new Intent(getApplicationContext(),Welcome.class);
            startActivity(i);
        }


        ed1=(EditText)findViewById(R.id.studid);
        ed2=(EditText)findViewById(R.id.pass);
        b1=(Button)findViewById(R.id.buttonlogin);
        b2=(Button)findViewById(R.id.buttonreg);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=ed1.getText().toString();
                s2=ed2.getText().toString();
               if((s1.equals(studid))&&(s2.equals(pass))){
                   SharedPreferences.Editor editor=getSharedPreferences("login",MODE_PRIVATE).edit();
                   editor.putString("user",s1);
                   editor.putString("pass",s2);
                   editor.apply();
                   Intent e=new Intent(getApplicationContext(),Welcome.class);
                   e.putExtra("user",s1);
                   e.putExtra("pass",s2);
                   startActivity(e);

                }
                else {
                   Toast.makeText(getApplicationContext(),"You are not authorized",Toast.LENGTH_LONG).show();
               }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=ed1.getText().toString();
                s2=ed2.getText().toString();
                Intent i=new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(i);
            }
        });
    }
}
