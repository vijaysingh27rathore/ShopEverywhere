package com.ranaus.shopeverywhere;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btn_login:
                Intent loginIntent= new Intent(MainActivity.this,Menu.class);
                startActivity(loginIntent);
                finish();

                break;

            case R.id.forgot_password:
                Intent forgot = new Intent(MainActivity.this,ResetPassword.class);
                startActivity(forgot);

                break;

            case R.id.account:
                Intent noAccount = new  Intent(MainActivity.this,CreateAccount.class);
                startActivity(noAccount);

                break;
        }
    }
}
