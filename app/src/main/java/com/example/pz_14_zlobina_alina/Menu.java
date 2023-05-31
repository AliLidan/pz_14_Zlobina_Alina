package com.example.pz_14_zlobina_alina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Menu extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imageView5) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        else if (v.getId() == R.id.imageView6) {
            Intent intent = new Intent(this, Exsisaze.class);
            startActivity(intent);
        }
        else if (v.getId() == R.id.imageView7) {
            Intent intent = new Intent(this, Zadachi .class);
            startActivity(intent);
        }
        else if (v.getId() == R.id.imageView8) {
            Intent intent = new Intent(this, Timer.class);
            startActivity(intent);
        }

        else {
            Toast toast = Toast.makeText(getApplicationContext(), "Невозможно выполнить!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}