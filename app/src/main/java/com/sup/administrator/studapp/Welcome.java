package com.sup.administrator.studapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Welcome extends AppCompatActivity {
String un,pw;
    Button b;
    String getuser,getpass,checkuser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
      //  SharedPreferences share=getPreferences("login",MODE_PRIVATE);
       // checkuser=share.getString("user",null);
       // if(checkuser==null)
       // {
        //   Intent i=new Intent(getApplicationContext(),MainActivity.class);
        // startActivity(i);
       // }
        b=(Button)findViewById(R.id.butlogout);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor=getSharedPreferences("login",MODE_PRIVATE).edit();
                editor.clear();
                editor.apply();

                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

        SharedPreferences sharedPreferences=getSharedPreferences("login",MODE_PRIVATE);
        getuser=sharedPreferences.getString("user",null);
        getpass=sharedPreferences.getString("pass",null);
        Toast.makeText(getApplicationContext(),getuser,Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(),getpass,Toast.LENGTH_LONG).show();

        //Intent i=getIntent();
       // un=i.getExtras().getString("user");
        //pw=i.getExtras().getString("pass");
      //  Toast.makeText(getApplicationContext(),un,Toast.LENGTH_LONG);
      //  Toast.makeText(getApplicationContext(),pw,Toast.LENGTH_LONG);
    }
}
