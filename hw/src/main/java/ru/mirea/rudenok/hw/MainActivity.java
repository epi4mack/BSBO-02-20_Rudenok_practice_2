package ru.mirea.rudenok.hw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show_snack(View view)
    {
        Snackbar.make(view, "rudenok bsbo-02-20", Snackbar.LENGTH_SHORT).show();
    }

    public void show_time(View view)
    {
        MyTimeDialog dialog = new MyTimeDialog(MainActivity.this);
    }



    public void show_date(View view)
    {
        MydateDialog dialog = new MydateDialog(MainActivity.this);
    }

    public void show_progres(View v)
    {
        MyProgresDialog dialog = new MyProgresDialog(MainActivity.this);
    }
}