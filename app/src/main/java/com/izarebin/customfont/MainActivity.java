package com.izarebin.customfont;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtyekan,txtkoodak,txtcopyright;
    Button btnclick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtyekan = (TextView) findViewById(R.id.txtyekan);
        txtkoodak = (TextView) findViewById(R.id.txtkoodak);
        txtcopyright = (TextView) findViewById(R.id.txtcopyright);
        btnclick = (Button) findViewById(R.id.btnclick);

        Typeface yekan_font = Typeface.createFromAsset(getAssets(), "fonts/yekan.ttf");
        Typeface koodak_font = Typeface.createFromAsset(getAssets(), "fonts/koodak.ttf");

        txtyekan.setTypeface(yekan_font);
        txtkoodak.setTypeface(koodak_font);
        txtcopyright.setTypeface(yekan_font);
        btnclick.setTypeface(koodak_font);
    }
}
