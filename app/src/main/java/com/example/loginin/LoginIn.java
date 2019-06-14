package com.example.loginin;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginIn extends BaseActivity{
    private Button button_login;
    private EditText login_text;
    private EditText pwd_text;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginin_layout);
        button_login = findViewById(R.id.btn_login);
        login_text = findViewById(R.id.text_name);
        pwd_text = findViewById(R.id.text_pwd);
        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (login_text.getText().toString().equals("tom") && pwd_text.getText().toString().equals("123")) {
                    Intent intent = new Intent(LoginIn.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (login_text.getText().toString().equals("") && pwd_text.getText().toString().equals("")) {
                    Toast.makeText(LoginIn.this, "用户名或密码不能为空！", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(LoginIn.this, "用户名或密码错误！", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}