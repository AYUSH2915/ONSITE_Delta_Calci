package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

public class Calci extends AppCompatActivity implements Calci_in.Keyboard_inputlistner {
    private Calci_in input;
    private Calci_out output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        input = new Calci_in();
        output = new Calci_out();
        getSupportFragmentManager().beginTransaction().replace(R.id.container2,input).commit();
        getSupportFragmentManager().beginTransaction().replace(R.id.container1,output).commit();
    }

    @Override
    public void input(double inputsend) {
        output.updatetextview(inputsend);
    }
}