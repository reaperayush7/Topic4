package com.example.topic4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class getDataActivity extends AppCompatActivity {
    TextView tvCapital;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_get_data );
        tvCapital = findViewById( R.id.tvCapital );

        Bundle bundle = getIntent().getExtras();

        if(bundle != null)
        {
            tvCapital.setText( bundle.getString( "getCapital" ) );
        }
        else
        {
            Toast.makeText( this, "No message", Toast.LENGTH_SHORT ).show();
        }
    }
}
