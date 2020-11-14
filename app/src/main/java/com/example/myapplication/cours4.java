package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class cours4 extends AppCompatActivity {
String[] listItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cours4);

        ListView list1=findViewById(R.id.Liste);

        listItem = getResources().getStringArray(R.array.liste);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>( this,android.R.layout.simple_list_item_1, android.R.id.text1, listItem);
        list1.setAdapter(adapter);
        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value=adapter.getItem(position);
                Toast.makeText(getApplicationContext(),value, Toast.LENGTH_SHORT).show();
            }
        });
    }
}