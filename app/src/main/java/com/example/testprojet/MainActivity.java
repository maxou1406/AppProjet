package com.example.testprojet;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
//test
public class MainActivity extends AppCompatActivity {

    Button btn_clique;
    TextView tv_maintext;
    int on=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeFields();
        btn_clique.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tv_maintext.setText(R.string.lucasmax);

                switchOnOff();

            }
        });
    }


    void switchOnOff(){
        if(on==1){
            btn_clique.setText("on");
            on=0;
        }else {
            btn_clique.setText("off");
            on=1;
        }
    }

    void initializeFields(){
        btn_clique=findViewById(R.id.button1);
        tv_maintext=findViewById(R.id.tv_1);
    }
}