package com.example.homework5part2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_open_notes) {
            Intent intentNotes = new Intent(this, NotesActivity.class);
            startActivity(intentNotes);
            Toast.makeText(MainActivity.this, "Открыть записную книжку", Toast.LENGTH_LONG).show();
            return true;
        } else if (id == R.id.calendar_open) {
            Intent intentCalendar = new Intent(this, CalendarActivity.class);
            startActivity(intentCalendar);
            Toast.makeText(MainActivity.this, "Открыть планировщик задач", Toast.LENGTH_LONG).show();
            return true;
        } else if (id == R.id.adress_open) {
            Intent intentAdress = new Intent(this, AdressActivity.class);
            startActivity(intentAdress);
            Toast.makeText(MainActivity.this, "Узнать адрес", Toast.LENGTH_LONG).show();
            return true;
        } else if (id == R.id.pay_open) {
            Intent intentPay = new Intent(this, PayActivity.class);
            startActivity(intentPay);
            Toast.makeText(MainActivity.this, "Оплатить счет", Toast.LENGTH_LONG).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
