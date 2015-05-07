package com.firstsecond.tax_income91;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Donate extends ActionBarActivity {
    private TextView textview_donate1, textview_donate2;
    private EditText edittext_donate1, edittext_donate2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.donate);

        // var ref
        edittext_donate1 = (EditText)findViewById(R.id.edittext_donate1);
        edittext_donate2 = (EditText)findViewById(R.id.edittext_donate2);

        final String support_edu = edittext_donate1.getText().toString();
        final String donate = edittext_donate2.getText().toString();
        Button prevDonate = (Button)findViewById(R.id.prev_donate);
        prevDonate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        // receive record_reduce
        Bundle bundle = getIntent().getExtras();
        final String expense = bundle.getString("expense");
        final String reducetion = bundle.getString("redicetion");
        final String insurance = bundle.getString("insurance");
        final String insurance_mate = bundle.getString("insurance_mate");
        final String endowment = bundle.getString("endowment");
        final String endowment_pension = bundle.getString("LTF");
        final String LTF = bundle.getString("LTF");
        final String RMF = bundle.getString("RMF");
        final String loan_residence = bundle.getString("loan_residence");
        final String social_security = bundle.getString("social_security");
        final String travel = bundle.getString("travel");
        final String reduce_dad = bundle.getString("textview_reduce_dad");
        final String reduce_mom = bundle.getString("textview_reduce_mom");
        final String reduce_dad_mate = bundle.getString("textview_reduce_dad_mate");
        final String reduce_mom_mate = bundle.getString("textview_reduce_mom_mate");
        final String childnon = bundle.getString("textview_childnon");
        final String child = bundle.getString("textview_child");
        final String disabled = bundle.getString("textview_disabled");

        final String Income = bundle.getString("Income");
        final String tax_source = bundle.getString("tax_source");
        final String saving_kb = bundle.getString("saving_kb");
        final String savings = bundle.getString("savings");
        final String saving_private = bundle.getString("saving_private");

        Button nextDonate = (Button)findViewById(R.id.next_donate);
        nextDonate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Donate.this, CalTax.class);
                intent.putExtra("support_edu", support_edu);
                intent.putExtra("donate", donate);

                intent.putExtra("expense", expense);
                intent.putExtra("reducetion", reducetion);
                intent.putExtra("insurance", insurance);
                intent.putExtra("insurance_mate", insurance_mate);
                intent.putExtra("endowment", endowment);
                intent.putExtra("endowment_pension", endowment_pension);
                intent.putExtra("LTF", LTF);
                intent.putExtra("RMF", RMF);
                intent.putExtra("loan_residence", loan_residence);
                intent.putExtra("social_security", social_security);
                intent.putExtra("travel", travel);
                intent.putExtra("textview_reduce_dad", reduce_dad);
                intent.putExtra("textview_reduce_mom", reduce_mom);
                intent.putExtra("textview_reduce_dad_mate", reduce_dad_mate);
                intent.putExtra("textview_reduce_mom_mate", reduce_mom_mate);
                intent.putExtra("textview_childnon", childnon);
                intent.putExtra("textview_child", child);
                intent.putExtra("textview_disabled", disabled);

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
        getMenuInflater().inflate(R.menu.menu_donate, menu);
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
