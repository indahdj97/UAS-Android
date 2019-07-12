package com.dijeh.indah.uas1;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Collections;
import java.util.HashMap;

public class Pendaftaran extends AppCompatActivity implements View.OnClickListener{
    private EditText editTextNik;
    private EditText editTextNama;
    private EditText editTextAlamat;
    String JK;
    Spinner spinnerJK;
    String[] pilihanJK = {"Laki-laki", "Perempuan"};

    private Button buttonAdd;
    private Button buttonView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pendaftaran);


        editTextNik = (EditText)findViewById(R.id.eNik);
        editTextNama = (EditText)findViewById(R.id.eNama);
        editTextAlamat = (EditText)findViewById(R.id.eAlamat);
        spinnerJK = findViewById(R.id.gender);

        buttonAdd = (Button)findViewById(R.id.btnKirim);
        buttonView = (Button)findViewById(R.id.btnDaftar);


        buttonAdd.setOnClickListener(this);
        buttonView.setOnClickListener(this);

        ArrayAdapter adapter = new ArrayAdapter(Pendaftaran.this, R.layout.support_simple_spinner_dropdown_item, pilihanJK);
        spinnerJK.setAdapter(adapter);
    }

    private void addEmployee(){
        final String name = editTextNama.getText().toString().trim();
        final String nik = editTextNik.getText().toString().trim();
        final String alamat = editTextAlamat.getText().toString().trim();
        final String spin = spinnerJK.getSelectedItem().toString().trim();

        class AddEmployee extends AsyncTask<Void, Void, String> {

            ProgressDialog loading;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(Pendaftaran.this, "Menambahkan...", "Tunggu...", false, false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(Pendaftaran.this, s, Toast.LENGTH_LONG).show();
            }

            @Override
            protected String doInBackground(Void... voids) {
                HashMap<String, String> params = new HashMap<>();
                params.put(konfigurasi.KEY_PENG_NAMA, name);
                params.put(konfigurasi.KEY_PENG_NIK, nik);
                params.put(konfigurasi.KEY_PENG_ALAMAT, alamat);
                params.put(konfigurasi.KEY_PENG_JK, spin);

                RequestHandler rh = new RequestHandler();
                String res = rh.sendPostRequest(konfigurasi.URL_ADD, params);
                return res;
            }
        }
        AddEmployee ae = new AddEmployee();
        ae.execute();
    }

    private void addEmployee1(){
        final String name = editTextNama.getText().toString().trim();
        final String nik = editTextNik.getText().toString().trim();
        final String alamat = editTextAlamat.getText().toString().trim();
        final String spin = spinnerJK.getSelectedItem().toString().trim();

        class AddEmployee extends AsyncTask<Void, Void, String> {

            ProgressDialog loading;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(Pendaftaran.this, "Menambahkan...", "Tunggu...", false, false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(Pendaftaran.this, s, Toast.LENGTH_LONG).show();
            }

            @Override
            protected String doInBackground(Void... voids) {
                HashMap<String, String> params = new HashMap<>();
                params.put(konfigurasi.KEY_PENG_NAMA, name);
                params.put(konfigurasi.KEY_PENG_NIK, nik);
                params.put(konfigurasi.KEY_PENG_ALAMAT, alamat);
                params.put(konfigurasi.KEY_PENG_JK, spin);

                RequestHandler rh = new RequestHandler();
                String res = rh.sendPostRequest(konfigurasi.URL_ADD, params);
                return res;
            }
        }
        AddEmployee ae = new AddEmployee();
        ae.execute();
    }

    @Override
    public void onClick(View view) {
        if (view == buttonAdd){
            if (spinnerJK.getSelectedItem().toString().equals(pilihanJK[0])){
                addEmployee();
            }else if (spinnerJK.getSelectedItem().toString().equals(pilihanJK[1])){
                addEmployee1();
            }
        }
        if (view == buttonView){
            Intent a = new Intent(Pendaftaran.this, TampilSemua.class);
            startActivity(a);
        }
    }
}
