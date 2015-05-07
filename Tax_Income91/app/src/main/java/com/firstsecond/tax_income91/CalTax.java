package com.firstsecond.tax_income91;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class CalTax extends ActionBarActivity {
    private TextView textview_cal_salary, textview_cal_except, textview_cal_remain,
            textview_cal_expense, textview_cal_AfterExpense, textview_cal_reduce,
            textview_cal_remain1, textview_cal_support, textview_cal_remain2,
            textview_cal_donate, textview_cal_net, textview_caltax_net, textview_cal_tax,
            textview_cal_TaxSource, textview_cal_remain3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cal_tax);

        // receive donate
        Bundle bundle = getIntent().getExtras();
        String expense = bundle.getString("expense");
        String reducetion = bundle.getString("redicetion");
        String insurance = bundle.getString("insurance");
        String insurance_mate = bundle.getString("insurance_mate");
        String endowment = bundle.getString("endowment");
        String endowment_pension = bundle.getString("LTF");
        String LTF = bundle.getString("LTF");
        String RMF = bundle.getString("RMF");
        String loan_residence = bundle.getString("loan_residence");
        String social_security = bundle.getString("social_security");
        String travel = bundle.getString("travel");
        String reduce_dad = bundle.getString("textview_reduce_dad");
        String reduce_mom = bundle.getString("textview_reduce_mom");
        String reduce_dad_mate = bundle.getString("textview_reduce_dad_mate");
        String reduce_mom_mate = bundle.getString("textview_reduce_mom_mate");
        String childnon = bundle.getString("textview_childnon");
        String child = bundle.getString("textview_child");
        String disabled = bundle.getString("textview_disabled");

        // Show total Income
        String Income = bundle.getString("Income");
        textview_cal_salary = (TextView)findViewById(R.id.textview_cal_salary);
        textview_cal_salary.setText(Income);

        String tax_source = bundle.getString("tax_source");
        String saving_kb = bundle.getString("saving_kb");
        String savings = bundle.getString("savings");
        String saving_private = bundle.getString("saving_private");

        String support_edu = bundle.getString("support_edu");

        Button prevCalTax = (Button) findViewById(R.id.prev_caltax);
        prevCalTax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cal_tax, menu);
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
