package com.csee5590.helloworldapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class HelloWorld extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helloworld);
        Button buttonLogout= (Button) findViewById(R.id.logoutButton);
        buttonLogout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(HelloWorld.this, MainActivity.class));
            }
        });
    }
}
