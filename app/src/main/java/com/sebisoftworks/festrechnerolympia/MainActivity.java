package com.sebisoftworks.festrechnerolympia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button bier, alkf, radler, aeppler, wschorle, glasww, glasrw, glassekt, wasser, cola, fanta, aschorl, flaschww,
            flaschrw, flaschrow, flaschsekt, clear;
    TextView txtView;

    double sum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtView = (TextView) findViewById(R.id.textView);
        int ad=5;
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

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum = 0;
                txtView.setText(sum + "€");
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
        txtView.setText(sum + "€");
    }
}