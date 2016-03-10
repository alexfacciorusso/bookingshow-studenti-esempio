package com.pascal.esempio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String valoreCliccato = getIntent().getStringExtra("valoreCliccato");
        TextView valoreView = (TextView) findViewById(R.id.valore);
        valoreView.setText(valoreCliccato);
    }
}
