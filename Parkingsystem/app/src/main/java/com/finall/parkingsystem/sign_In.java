package com.finall.parkingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class sign_In extends AppCompatActivity {
    EditText password;
    EditText Email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign__in);
        password = (EditText) findViewById(R.id.pass);
        Email = (EditText) findViewById(R.id.email);

    }

    public void submit(View view) {

        Intent z = new Intent(this,book_one.class);
        startActivity(z);
    }

    public void sign_up(View view) {
            Intent up = new Intent(this,your_info.class);
            startActivity(up);
    }
    public void boo(View view) {
        Intent b = new Intent(this,book_one.class);
        startActivity(b);
    }
}




