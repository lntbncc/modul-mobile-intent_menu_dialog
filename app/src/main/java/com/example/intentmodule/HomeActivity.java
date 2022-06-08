package com.example.intentmodule;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    TextView welcomeTV;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int menu = item.getItemId();
        switch (menu){
            case R.id.logout_menu:{
                Intent intent = new Intent(HomeActivity.this,MainActivity.class);
                startActivity(intent);
                Toast.makeText(this,"Logout Successfully",Toast.LENGTH_SHORT).show();
                finish();
                break;
            }
            case R.id.moreinfo_menu:{
                Toast.makeText(this, "Pressed more info menu button", Toast.LENGTH_SHORT).show();
            }
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        welcomeTV = findViewById(R.id.welcome_tv);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String username = extras.getString("Username");

        welcomeTV.setText(username);
        Toast.makeText(HomeActivity.this, "Welcome " + username + "!", Toast.LENGTH_SHORT).show();

    }
}