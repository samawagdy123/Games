package com.finall.parkingsystem;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Handler h;
    Runnable r ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //handelar(class) to make this activity just wait only 5 sec with thread "backgroundthread"
        h = new Handler();
        r = ()-> {
            Intent n = new Intent(MainActivity.this,sign_In.class);
            startActivity(n);
            Toast.makeText(MainActivity.this, "Done", Toast.LENGTH_SHORT).show();
            finish();
        };
    }

    @Override
    protected void onStart() {
        super.onStart();
        h.postDelayed(r,2000);
    }

}
