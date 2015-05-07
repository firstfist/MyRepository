package com.firstsecond.tax_income91;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Record_income extends ActionBarActivity {

    // variable
    private EditText edittextIncome1, edittextIncome2, edittextIncome3, edittextIncome4,
            edittextIncome5, edittextIncome6;
    private TextView textview_saving;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.record_income);

        // var refernce
        edittextIncome1 = (EditText) findViewById(R.id.edittextIncome1);
        edittextIncome2 = (EditText) findViewById(R.id.edittextIncome2);
        edittextIncome3 = (EditText) findViewById(R.id.edittextIncome3);
        edittextIncome5 = (EditText) findViewById(R.id.edittextIncome5);
        edittextIncome6 = (EditText) findViewById(R.id.edittextIncome6);
        textview_saving = (TextView) findViewById(R.id.textview_saving);


        edittextIncome5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int savings = Integer.parseInt(edittextIncome3.getText().toString());
                textview_saving.setText(String.valueOf(cal_savings(savings)));

            }
        });
        Button nextIncome = (Button) findViewById(R.id.next_income);
        nextIncome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // var text.toString
                String textview = textview_saving.toString();
                String Income = edittextIncome1.getText().toString();
                String tax_source = edittextIncome2.getText().toString();
                String saving_kb = edittextIncome5.getText().toString();
                String saving_private = edittextIncome6.getText().toString();
                Intent intent = new Intent(Record_income.this, Select_reduce.class);
                // send string intent
                intent.putExtra("Income", Income);
                intent.putExtra("tax_source", tax_source);
                intent.putExtra("saving_kb", saving_kb);
                intent.putExtra("savings", textview);
                intent.putExtra("saving_private", saving_private);
                startActivity(intent);
            }
        });

        Button prevIncome = (Button) findViewById(R.id.prev_income);
        prevIncome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    // Method cal_saving
    public int cal_savings(int a) {
        a = a - 10000;
        return a;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_record_income, menu);
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
