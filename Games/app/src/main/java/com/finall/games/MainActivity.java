package com.finall.games;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.parse.ParseUser;

public class MainActivity extends AppCompatActivity {
    TextView welcomeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        welcomeTextView=findViewById(R.id.welcomeTextView);
        String welcomeMessage="Welcome "+ ParseUser.getCurrentUser().getUsername();
        welcomeTextView.setText(welcomeMessage);

    }

    public void tic(View view) {
        Intent z = new Intent(this,Tic_Tac_toe.class);
        startActivity(z);
    }

    public void Gusse(View view) {
        Intent y= new Intent(this,snake_and_ladder.class);
        startActivity(y);
    }

    public void Rock(View view) {
        Intent n= new Intent(this,Rock_Paper_Scissor.class);
        startActivity(n);
    }
    public void playerTap(View view) {

    }

    public void clickFunction(View view) {
    }

    public void logout(View view) {
        ParseUser.logOut();
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
}