package com.example.pwpb_java2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edtpanjang, edtlebar;
    private Button btnhitung;
    private TextView txtluas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Hitung Luas Persegi Panjang");

        edtpanjang = (EditText) findViewById(R.id.edt_panjang);
        edtlebar = (EditText) findViewById(R.id.edt_lebar);
        btnhitung = (Button) findViewById(R.id.btn_hitung);
        txtluas = (TextView) findViewById(R.id.txt_luas);

        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String panjang = edtpanjang.getText().toString().trim();
                String lebar = edtlebar.getText().toString().trim();

                double p = Double.parseDouble(panjang);
                double l = Double.parseDouble(lebar);

                double luas = p * l;

                txtluas.setText("Luas : "+luas);
            }
        });
    }
}
