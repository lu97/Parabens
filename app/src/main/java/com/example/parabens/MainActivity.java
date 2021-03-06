package com.example.parabens;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import static com.example.parabens.SturbData.fillList;
public class MainActivity extends AppCompatActivity {
    List<Element> elements = fillList();
    ListAdapter listAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        listAdapter = new ListAdapter(this, elements);
        ListView elems = findViewById(R.id.elements);
        elems.setAdapter(listAdapter);
    }

}
