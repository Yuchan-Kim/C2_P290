package com.example.c2_p290;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox food0,food1, food2, food3, food4, food5, food6, food7, food8, food9 ;
    Button add, sub, enter, clear;
    TextView totalC, quantityC;
    int calories[] = {10, 100, 200, 300, 400, 500, 0, 700, 800, 10};
    int collections[] = new int[10];
    int total = 0, quantity = 0, totalStore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = (Button)findViewById(R.id.plus);
        sub = (Button)findViewById(R.id.minus);
        enter = (Button)findViewById(R.id.enter);
        clear = (Button)findViewById(R.id.clear);
        food0 = (CheckBox)findViewById(R.id.A);
        food1 = (CheckBox) findViewById(R.id.B);
        food2 = (CheckBox) findViewById(R.id.C);
        food3 = (CheckBox) findViewById(R.id.D);
        food4 = (CheckBox) findViewById(R.id.E);
        food5 = (CheckBox) findViewById(R.id.F);
        food6 = (CheckBox) findViewById(R.id.G);
        food7 = (CheckBox) findViewById(R.id.H);
        food8 = (CheckBox) findViewById(R.id.I);
        food9 = (CheckBox) findViewById(R.id.J);
        totalC = (TextView)findViewById(R.id.total);
        quantityC = (TextView)findViewById(R.id.quantity);





        for (int i=0; i< collections.length; i++){
            collections[i] = 0;
        }

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quantity+=1;
                quantityC.setText(quantity+"");
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (quantity ==0){
                    quantityC.setText("Quantity");
                }else{
                    quantity -=1;
                    quantityC.setText(quantity+"");
                }
            }
        });
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for (int i=0; i< calories.length; i++){
                    if(collections[i] == 1){
                        total += calories[i];
                        collections[i] = 0;
                    }
                }
                int finalAnswer=0;
                finalAnswer+=total * quantity;
                total =0;
                totalStore += finalAnswer;

                totalC.setText(totalStore+"");


                food0.setChecked(false);
                food1.setChecked(false);
                food2.setChecked(false);
                food3.setChecked(false);
                food4.setChecked(false);
                food5.setChecked(false);
                food6.setChecked(false);
                food7.setChecked(false);
                food8.setChecked(false);
                food9.setChecked(false);


            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total =0;
                quantity=0;
                totalStore=0;
                quantityC.setText("Quantity");
                totalC.setText("Total");
                food0.setChecked(false);
                food1.setChecked(false);
                food2.setChecked(false);
                food3.setChecked(false);
                food4.setChecked(false);
                food5.setChecked(false);
                food6.setChecked(false);
                food7.setChecked(false);
                food8.setChecked(false);
                food9.setChecked(false);
                for(int i=0; i< collections.length; i++){
                    collections[i]=0;
                }
            }
        });

    }

    public void onCheckBoxClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();
        switch(view.getId()) {
            case R.id.A:
                if (checked) {
                    collections[0]=1;
                }
                else {
                    collections[0]=0;
                }
                break;

            case R.id.B:
                if (checked) {
                    collections[1]=1;
                }
                else {
                    collections[1]=0;
                }
                break;
            case R.id.C:
                if (checked) {
                    collections[2]=1;
                }
                else {
                    collections[2]=0;
                }
                break;
            case R.id.D:
                if (checked) {
                    collections[3]=1;
                }
                else {
                    collections[3]=0;
                }

                break;
            case R.id.E:
                if (checked) {
                    collections[4]=1;
                }
                else {
                    collections[4]=0;
                }

                break;
            case R.id.F:
                if (checked) {
                    collections[5]=1;
                }
                else {
                    collections[5]=0;
                }
                break;
            case R.id.G:
                if (checked) {
                    collections[6]=1;
                }
                else {
                    collections[6]=0;
                }
                break;
            case R.id.H:
                if (checked) {
                    collections[7]=1;
                }
                else {
                    collections[7]=0;
                }

                break;
            case R.id.I:
                if (checked) {
                    collections[8]=1;
                }
                else {
                    collections[8]=0;
                }

                break;
            case R.id.J:
                if (checked) {
                    collections[9] = 1;
                }
                else {
                    collections[9]=0;
                }
                break;

        }
    }
}
