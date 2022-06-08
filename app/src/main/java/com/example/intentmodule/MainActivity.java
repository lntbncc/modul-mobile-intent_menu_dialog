package com.example.intentmodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText usernameEditText;
    EditText passwordEditText;
    Button loginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText = findViewById(R.id.username_et);
        passwordEditText = findViewById(R.id.password_et);
        loginBtn = findViewById(R.id.login_btn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(usernameEditText.getText().toString().length()!=0 && passwordEditText.getText().toString().length()!=0){
                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                    intent.putExtra("Username", usernameEditText.getText().toString());
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "Terdapat kesalahan pada input", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}