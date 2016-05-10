package br.com.estacio.ic.monitoramento.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.estacio.ic.monitoramento.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String DEBUG_TAG = "JLSM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mapaButton = (Button)findViewById(R.id.mapaButton);
        mapaButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent it = new Intent(this, MapsActivity.class);
        startActivity(it);
    }

}

