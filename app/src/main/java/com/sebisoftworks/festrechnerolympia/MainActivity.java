package com.sebisoftworks.festrechnerolympia;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button bier, alkf, radler, aeppler, wschorle, glasww, glasrw, glassekt, wasser, cola, fanta, aschorl, flaschww,
            flaschrw, flaschrow, flaschsekt, clear;

    TextView txtView;

    String[] waren = new String[66];

    ListView listView;

    double sum = 0;
    final List<String> ListElementsArrayList = new ArrayList<String>();

    @Override
    public void onConfigurationChanged(Configuration c) {
        super.onConfigurationChanged(c);
    }

    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new ArrayAdapter<String>
                (MainActivity.this, android.R.layout.simple_list_item_1, ListElementsArrayList);

        txtView = (TextView) findViewById(R.id.textView);
        bier = (Button) findViewById(R.id.buttonBier);
        alkf = (Button) findViewById(R.id.buttonBierOhne);
        radler = (Button) findViewById(R.id.buttonRadler);
        aeppler = (Button) findViewById(R.id.buttonAeppler);
        wschorle = (Button) findViewById(R.id.buttonWeinschorle);
        glasww = (Button) findViewById(R.id.buttonGlasWeiß);
        glasrw = (Button) findViewById(R.id.buttonGlasRot);
        glassekt = (Button) findViewById(R.id.buttonGlasSekt);
        wasser = (Button) findViewById(R.id.buttonWasser);
        cola = (Button) findViewById(R.id.buttonCola);
        fanta = (Button) findViewById(R.id.buttonFanta);
        aschorl = (Button) findViewById(R.id.buttonApfelschorle);
        flaschww = (Button) findViewById(R.id.buttonFlascheWeiß);
        flaschrw = (Button) findViewById(R.id.buttonFlascheRot);
        flaschrow = (Button) findViewById(R.id.buttonFlascheRose);
        flaschsekt = (Button) findViewById(R.id.buttonFlascheSekt);
        clear = (Button) findViewById(R.id.buttonClear);

        listView = (ListView) findViewById(R.id.ListView);


        listView.setAdapter(adapter);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum = 0;
                // txtView.setText(sum + "€");
                char[] hans = {'a', 'b', 'v'};
                txtView.setText(hans, 0, 3);
            }
        });
        bier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add(2);
            }
        });
        alkf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add(2);
            }
        });
        radler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add(2);
            }
        });
        aeppler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add(2);
            }
        });
        wschorle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add(2.5);
            }
        });
        glasww.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add(3);
            }
        });
        glasrw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add(3);
            }
        });
        glassekt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add(2);
            }
        });
        wasser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add(1);
            }
        });
        cola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add(1.5);
            }
        });
        fanta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add(1.5);
            }
        });
        aschorl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add(2);
            }
        });
        flaschww.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add(10);
            }
        });
        flaschrw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add(10);
            }
        });
        flaschrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add(10);
            }
        });
        flaschsekt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add(12);
            }
        });


    }

    private void add(double i) {
        sum += i;
        //txtView.setText(sum + "€");
        char[] hans = {'c', 'r', 'a'};
        txtView.setText(hans, 0, 3);
        ListElementsArrayList.add("Bier 3,50");

        adapter.notifyDataSetChanged();


    }
}