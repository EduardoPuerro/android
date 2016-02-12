package com.acme.holapersonalizado;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Capturamos al botón llamandolo mediante su id
        Button button = (Button)findViewById(R.id.hello);
        button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                EditText text = (EditText)findViewById(R.id.entry);
                String enterName = text.getText().toString();

                RadioGroup rg = (RadioGroup)findViewById(R.id.RadioGroup01);
                RadioButton rb = (RadioButton)findViewById(R.id.rdsr);
                RadioButton rba = (RadioButton)findViewById(R.id.rdsra);

                String tratamiento = new String();
                if(rg.getCheckedRadioButtonId() == rb.getId())
                {
                    tratamiento = "Señor";
                }
                else
                {
                    tratamiento = "Señora";
                }

                String salutation = getResources().getString(R.string.hello) + " "
                        + tratamiento + " "
                        + enterName;


                TextView out = (TextView) findViewById(R.id.out);
                out.setText(salutation);
            }

        });

        /*
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
