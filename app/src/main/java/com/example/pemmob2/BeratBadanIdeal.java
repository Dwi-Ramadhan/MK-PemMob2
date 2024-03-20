package com.example.pemmob2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BeratBadanIdeal extends AppCompatActivity {
    EditText tinggi, berat, berat_ideal;
    Button proses_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berat_badan_ideal);

        tinggi = (EditText) findViewById(R.id.tinggiField);
        berat = (EditText) findViewById(R.id.beratField);
        berat_ideal = (EditText) findViewById(R.id.beratidealField);
        proses_btn = (Button) findViewById(R.id.prosesButton);

        proses_btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        float height = Float.parseFloat(tinggi.getText().toString())/100;
                        int weight = Integer.parseInt(berat.getText().toString());
                        float bmi = weight/(height*height);
                        String output = "BMI : "+bmi;
                        if(bmi < 18.5){
                            output += "   (Kekurangan Berat Badan)";
                        }else if(bmi < 25){
                            output += "   (Normal/Ideal)";
                        }else if(bmi < 30){
                            output += "   (Kelebihan Berat Badan)";
                        }else{
                            output += "   (Kegemukan/Obesitas)";
                        }
                        berat_ideal.setText(output);
                    }
                }
        );
    }
}