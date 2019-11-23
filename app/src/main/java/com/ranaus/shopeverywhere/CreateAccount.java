package com.ranaus.shopeverywhere;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreateAccount extends AppCompatActivity {
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        register = (Button) findViewById(R.id.btn_register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(CreateAccount.this,Menu.class);
                startActivity(registerIntent);
                finish();
            }
        });
    }
}
