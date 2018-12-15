package com.gzeinnumer.zeinbelajar7;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class NilaiActivity extends AppCompatActivity {
    private EditText etNP, etMK, etNUts, etNUas, etNTgs;
    private Button btnProsesNilai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nilai);
        etNP=(EditText) findViewById(R.id.etNB);
        etMK=(EditText) findViewById(R.id.etMK);
        etNUas=(EditText) findViewById(R.id.etNUas);
        etNUts=(EditText) findViewById(R.id.etNUts);
        etNTgs=(EditText) findViewById(R.id.etNTgs);
        btnProsesNilai = (Button) findViewById(R.id.btnProsesNilai);


    }

}
