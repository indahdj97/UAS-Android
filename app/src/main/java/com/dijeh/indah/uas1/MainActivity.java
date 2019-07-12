package com.dijeh.indah.uas1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread thread = new Thread(){
            public void run(){
                try {
                    sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent a = new Intent(MainActivity.this, Pendaftaran.class);
                    startActivity(a);
                    finish();
                }
            }
        };
        thread.start();

        //progresbar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}
