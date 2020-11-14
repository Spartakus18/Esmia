package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class cours3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cours3);

        Button b4 =findViewById(R.id.button);
        EditText edit1 =findViewById(R.id.text7);
        EditText edit2 =findViewById(R.id.text6);
        EditText edit3 =findViewById(R.id.text5);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valeur = edit3.getText().toString();
                String valeur1 = edit2.getText().toString();
                String valeur2 = edit1.getText().toString();

                AlertDialog alertDialog1 = new AlertDialog.Builder(cours3.this).create();
                alertDialog1.setMessage("Voulez-vous enregistrer"+valeur +""+valeur1 +""+valeur2);
                alertDialog1.setButton(AlertDialog.BUTTON_POSITIVE, "Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i = new Intent(getApplicationContext(), cours2.class);
                        startActivity(i);

                    }
                });

                alertDialog1.setButton(AlertDialog.BUTTON_NEGATIVE, "Non", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent n = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(n);
                    }
                });
                alertDialog1.show();


            }
        });
    }
}