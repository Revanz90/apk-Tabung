package com.example.apkmenghitungvolumedankelilingtabung;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText jariJari, tinggi;
    Button hitung;
    TextView volume, keliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jariJari = findViewById(R.id.etJariJari);
        tinggi = findViewById(R.id.etTinggi);
        hitung = findViewById(R.id.btnHitung);
        volume = findViewById(R.id.tvVolume);
        keliling = findViewById(R.id.tvKeliling);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double jari = Double.parseDouble(jariJari.getText().toString());
                double t = Double.parseDouble(tinggi.getText().toString());

                double v = Math.PI * jari * jari * t;
                double k = 2 * Math.PI * jari * (jari + t);

                volume.setText("Volume: " + v);
                keliling.setText("Keliling: " + k);
            }
        });
    }
}