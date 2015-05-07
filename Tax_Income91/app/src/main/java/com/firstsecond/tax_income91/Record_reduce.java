package com.firstsecond.tax_income91;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


public class Record_reduce extends ActionBarActivity {

    private TextView expenses, reducetion, reduction_mate, textview_childnon, textview_child,
            textview_reduce_dad, textview_reduce_mom, textview_reduce_dad_mate,
            textview_reduce_mom_mate, textview_disabled;
    private EditText edittext_record_reduce1, edittext_record_reduce2, edittext_record_reduce3,
            edittext_record_reduce4, edittext_record_reduce5, edittext_record_reduce6,
            edittext_record_reduce7, edittext_record_reduce8, edittext_record_reduce9;
    private CheckBox checkbox_reduce_dad, checkbox_reduce_mom, checkbox_reduce_dad_mate,
            checkbox_reduce_mom_mate;
    private RadioGroup radiogroup_reduce1, radiogroup_reduce2, radiogroup_reduce3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.record_reduce);
        // var reference
        expenses = (TextView) findViewById(R.id.expense);

        reduction_mate = (TextView) findViewById(R.id.reduction_mate);
        textview_childnon = (TextView) findViewById(R.id.textview_childnon);
        textview_child = (TextView) findViewById(R.id.textview_child);
        textview_disabled = (TextView) findViewById(R.id.textview_disabled);

        edittext_record_reduce1 = (EditText) findViewById(R.id.edittext_record_reduce1);
        edittext_record_reduce2 = (EditText) findViewById(R.id.edittext_record_reduce2);
        edittext_record_reduce3 = (EditText) findViewById(R.id.edittext_record_reduce3);
        edittext_record_reduce4 = (EditText) findViewById(R.id.edittext_record_reduce4);
        edittext_record_reduce5 = (EditText) findViewById(R.id.edittext_record_reduce5);
        edittext_record_reduce6 = (EditText) findViewById(R.id.edittext_record_reduce6);
        edittext_record_reduce7 = (EditText) findViewById(R.id.edittext_record_reduce7);
        edittext_record_reduce8 = (EditText) findViewById(R.id.edittext_record_reduce8);
        edittext_record_reduce9 = (EditText) findViewById(R.id.edittext_record_reduce9);

        // set textview reduce dad & mom
        textview_reduce_dad = (TextView) findViewById(R.id.textview_reduce_dad);
        checkbox_reduce_dad = (CheckBox) findViewById(R.id.checkbox_reduce_dad);
        checkbox_reduce_dad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkbox_reduce_dad.isChecked()) {
                    textview_reduce_dad.setText("60000");
                } else {
                    textview_reduce_dad.setText("");
                }
            }
        });
        textview_reduce_mom = (TextView) findViewById(R.id.textview_reduce_mom);
        checkbox_reduce_mom = (CheckBox) findViewById(R.id.checkbox_reduce_mom);
        checkbox_reduce_mom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkbox_reduce_mom.isChecked()) {
                    textview_reduce_mom.setText("60000");
                } else {
                    textview_reduce_mom.setText("");
                }
            }
        });
        textview_reduce_dad_mate = (TextView) findViewById(R.id.textview_reduce_dad_mate);
        checkbox_reduce_dad_mate = (CheckBox) findViewById(R.id.checkbox_reduce_dad_mate);
        checkbox_reduce_dad_mate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkbox_reduce_dad_mate.isChecked()) {
                    textview_reduce_dad_mate.setText("60000");
                } else {
                    textview_reduce_dad_mate.setText("");
                }
            }
        });
        textview_reduce_mom_mate = (TextView) findViewById(R.id.textview_reduce_mom_mate);
        checkbox_reduce_mom_mate = (CheckBox) findViewById(R.id.checkbox_reduce_mom_mate);
        checkbox_reduce_mom_mate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkbox_reduce_mom_mate.isChecked()) {
                    textview_reduce_mom_mate.setText("60000");
                } else {
                    textview_reduce_mom_mate.setText("");
                }
            }
        });

        // Select radiobutton child_non
        radiogroup_reduce1 = (RadioGroup)findViewById(R.id.radiogroup_reduce1);
        radiogroup_reduce1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // find radiobutton_childnon is select
                if (checkedId == R.id.radiobutton_childnon1) {
                    textview_childnon.setText("15000");
                } else if (checkedId == R.id.radiobutton_childnon2) {
                    textview_childnon.setText("30000");
                } else if (checkedId == R.id.radiobutton_childnon3) {
                    textview_childnon.setText("45000");
                }
            }
        });

        //Select radiobutton child
        radiogroup_reduce2 = (RadioGroup)findViewById(R.id.radiogroup_reduce2);
        radiogroup_reduce2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // find radiobutton_child is select
                if(checkedId == R.id.radiobutton_child1){
                    textview_child.setText("17000");
                } else if (checkedId == R.id.radiobutton_child2){
                    textview_child.setText("34000");
                } else if (checkedId == R.id.radiobutton_child3){
                    textview_child.setText("51000");
                }
            }
        });

        // Select radiobutton_disabled
        radiogroup_reduce3 = (RadioGroup)findViewById(R.id.radiogroup_reduce3);
        radiogroup_reduce3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.radiobutton_disabled1){
                    textview_disabled.setText("60000");
                } else if (checkedId == R.id.radiobutton_disabled2){
                    textview_disabled.setText("120000");
                } else if (checkedId == R.id.radiobutton_disabled3){
                    textview_disabled.setText("180000");
                } else if (checkedId == R.id.radiobutton_disabled4){
                    textview_disabled.setText("240000");
                } else if (checkedId == R.id.radiobutton_disabled5){
                    textview_disabled.setText("300000");
                } else if (checkedId == R.id.radiobutton_disabled6){
                    textview_disabled.setText("360000");
                }
            }
        });

        // receive from select_reduce
        Bundle bundle = getIntent().getExtras();
        final String Income = bundle.getString("Income");
        final String tax_source = bundle.getString("tax_source");
        final String saving_kb = bundle.getString("saving_kb");
        final String savings = bundle.getString("savings");
        final String saving_private = bundle.getString("saving_private");

        final int expense = Integer.parseInt(Income);
        expenses.setText(String.valueOf(cal_expense(expense)));

        // settext reduction
        reducetion = (TextView) findViewById(R.id.reducetion);
        reducetion.setText(String.valueOf("30000"));

        final String insurance = edittext_record_reduce1.getText().toString();
        final String insurance_mate = edittext_record_reduce2.getText().toString();
        final String endowment = edittext_record_reduce3.getText().toString();
        final String endowment_pension = edittext_record_reduce4.getText().toString();
        final String LTF = edittext_record_reduce5.getText().toString();
        final String RMF = edittext_record_reduce6.getText().toString();
        final String loan_residence = edittext_record_reduce7.getText().toString();
        final String social_security = edittext_record_reduce8.getText().toString();
        final String travel = edittext_record_reduce9.getText().toString();

        Button prevRecordReduce = (Button) findViewById(R.id.prev_record_reduce);
        prevRecordReduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button nextRecordReduce = (Button) findViewById(R.id.next_record_reduce);
        nextRecordReduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String reduction = reducetion.toString();
                String reduce_dad = textview_reduce_dad.toString();
                String reduce_mom = textview_reduce_mom.toString();
                String reduce_dad_mate = textview_reduce_dad_mate.toString();
                String reduce_mom_mate = textview_reduce_mom_mate.toString();
                String childnon = textview_childnon.toString();
                String child = textview_child.toString();
                String disabled = textview_disabled.toString();
                Intent intent = new Intent(Record_reduce.this, Donate.class);
                intent.putExtra("expense", expense);
                intent.putExtra("reducetion", reduction);
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
            }
        });
    }

    // Method cal_expense
    public int cal_expense(int expense) {
        int income = 150000;
        int expenses;
        if (expense <= income) {
            expenses = (expense * 40) / 100;
            return expenses;
        } else {
            expenses = 60000;
            return expenses;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_record_reduce, menu);
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