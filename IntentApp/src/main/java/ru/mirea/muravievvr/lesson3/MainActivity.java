package ru.mirea.muravievvr.lesson3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.SimpleDateFormat;
import android.os.Bundle;
import android.view.View;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    public void onClickSendData(View v) {
        long dateInMillis = System.currentTimeMillis();
        String format = "yyyy-MM-dd HH:mm:ss";
        final SimpleDateFormat sdf = new SimpleDateFormat(format);
        String dateString = sdf.format(new Date(dateInMillis));

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("date", dateString);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}