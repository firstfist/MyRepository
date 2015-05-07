package com.firstsecond.tax_income91;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Select_reduce extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_reduce);

        Button prevSelectReduce = (Button) findViewById(R.id.prev_select_reduce);
        prevSelectReduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        Button nextSelectReduce = (Button) findViewById(R.id.next_select_reduce);
        nextSelectReduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // receive intent
                Bundle bundle = getIntent().getExtras();
                String Income = bundle.getString("Income");
                String tax_source = bundle.getString("tax_source");
                String saving_kb = bundle.getString("savings_kb");
                String savings = bundle.getString("savings");
                String saving_private = bundle.getString("saving_private");


                Intent intent = new Intent(Select_reduce.this, Record_reduce.class);
                // send string intent
                intent.putExtra("Income", Income);
                intent.putExtra("tax_source", tax_source);
                intent.putExtra("saving_kb", saving_kb);
                intent.putExtra("savings", savings);
                intent.putExtra("saving_private", saving_private);
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_select_reduce, menu);
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
