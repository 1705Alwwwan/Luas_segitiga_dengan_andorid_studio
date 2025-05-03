package com.example.luas_hitung_segitiga;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editTextAlas, editTextTinggi;
    Button buttonHitung;
    TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextAlas = findViewById(R.id.editTextAlas);
        editTextTinggi = findViewById(R.id.editTextTinggi);
        buttonHitung = findViewById(R.id.buttonHitung);
        textViewHasil = findViewById(R.id.textViewHasil);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String alasStr = editTextAlas.getText().toString();
                String tinggiStr = editTextTinggi.getText().toString();

                if (!alasStr.isEmpty() && !tinggiStr.isEmpty()) {
                    double alas = Double.parseDouble(alasStr);
                    double tinggi = Double.parseDouble(tinggiStr);
                    double luas = 0.5 * alas * tinggi;

                    textViewHasil.setText("Luas Segitiga: " + luas);
                } else {
                    textViewHasil.setText("Masukkan alas dan tinggi terlebih dahulu.");
                }
            }
        });
    }
}
