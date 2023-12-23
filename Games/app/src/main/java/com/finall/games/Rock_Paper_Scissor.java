package com.finall.games;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Rock_Paper_Scissor extends AppCompatActivity {
    ImageView iv_cpu, iv_me;
    ImageView btn_sex, btn_herpies, btn_hand;
    String myChoice, cpuChoice, result;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock__paper__scissor);
        iv_cpu = (ImageView) findViewById(R.id.computer_move_img);
        iv_me = (ImageView) findViewById(R.id.user_move_img);

        btn_sex = (ImageView) findViewById(R.id.rock_btn);
        btn_herpies = (ImageView) findViewById(R.id.scissors_btn);
        btn_hand = (ImageView) findViewById(R.id.paper_btn);

        r = new Random();
    }

    public void rock(View view) {
        myChoice = "sex";
        iv_me.setImageResource(R.drawable.rock_icon);
        calculate();
    }

    public void scissor(View view) {
        myChoice = "herpies";
        iv_me.setImageResource(R.drawable.scissors_icon);
        calculate();
    }
    // when player click on scissor icon
    public void paper(View view) {
        myChoice = "hand";
        iv_me.setImageResource(R.drawable.paper_icon);
        calculate();
    }
    public void calculate() {
        int cpu = r.nextInt(3);
        if (cpu == 0) {
            cpuChoice = "sex";
            iv_cpu.setImageResource(R.drawable.rock_icon);
        } else if (cpu == 1) {
            cpuChoice = "herpies";
            iv_cpu.setImageResource(R.drawable.scissors_icon);
        } else if (cpu == 2) {
            cpuChoice = "hand";
            iv_cpu.setImageResource(R.drawable.paper_icon);
        }

        if (myChoice.equals("sex")) {
            switch (cpuChoice.substring(0)) {
                case "sex":
                    result = "match";
                    break;
                case "herpies":
                    result = "win";
                    break;
                case "hand":
                    result = "lose";
                    break;
            }
        } else if (myChoice.equals("herpies")) {
            switch (cpuChoice.substring(0)) {
                case "sex":
                    result = "lose";
                    break;
                case "herpies":
                    result = "match";
                    break;
                case "hand":
                    result = "win";
                    break;
            }
        } else if (myChoice.equals("hand")) {
            switch (cpuChoice.substring(0)) {
                case "sex":
                    result = "win";
                    break;
                case "herpies":
                    result = "lose";
                    break;
                case "hand":
                    result = "match";
                    break;
            }
        }
        Toast.makeText(this, "You " + result, Toast.LENGTH_SHORT).show();
    }

    public void rest(View view) {
    }
}