package com.dator.claudette;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4ITH", "OnCreate has started");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("4ITH", "OnStart has started");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("4ITH", "OnResume has started");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("4ITH", "OnStop has started");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("4ITH", "OnPause has started");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("4ITH", "OnRestart has started");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4ITH", "OnDestroy has started");
    }

    public void ToastMsg(View v) {
        Toast.makeText(this, "Welcome to Hyatt Ziva Concun Hotel in Mexico!", Toast.LENGTH_SHORT).show();
    }

    public void SnackbarMsg(View v) {
        Snackbar.make(v, "We hope you Enjoy your stay!", Snackbar.LENGTH_LONG).show();
    }
}
