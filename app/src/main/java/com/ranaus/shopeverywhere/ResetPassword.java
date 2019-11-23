package com.ranaus.shopeverywhere;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ResetPassword extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.have_password:
            case R.id.btn_reset:
                Intent resetIntent = new Intent(ResetPassword.this,MainActivity.class);
                startActivity(resetIntent);
                finish();

                break;
        }
    }
}
