package com.finall.parkingsystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class your_info extends AppCompatActivity {
    EditText pass;
    EditText Em;
    EditText ph;
    EditText fn;
    EditText ln;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_info);
        pass = (EditText) findViewById(R.id.pass);
        Em = (EditText) findViewById(R.id.EMAIL);
        ph = (EditText) findViewById(R.id.PHONE);
        fn = (EditText) findViewById(R.id.FN);
        ln = (EditText) findViewById(R.id.LN);
    }

    public void submit(View view) {
        Intent s = new Intent(this,your_info.class);
        startActivity(s);
    }

    public void sign_in(View view) {
            Intent in = new Intent(this,sign_In.class);
            startActivity(in);
    }
}