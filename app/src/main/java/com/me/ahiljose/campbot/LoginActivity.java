package com.me.ahiljose.campbot;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button b1;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        b1 =(Button)findViewById(R.id.sub_but);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
        Toast.makeText(LoginActivity.this,"Okay",Toast.LENGTH_SHORT).show();
    }
}
