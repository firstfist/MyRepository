package com.firstsecond.tax_income91;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;


public class Status_filing extends ActionBarActivity {

    private RadioButton all, split, non_income;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.status_filing);

        all = (RadioButton)findViewById(R.id.radiobutton_filing1);
        split = (RadioButton)findViewById(R.id.radiobutton_filing2);
        non_income = (RadioButton)findViewById(R.id.radiobutton_filing3);

        Button prevFiling = (Button)findViewById(R.id.prev_filing);
        prevFiling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button nextFiling = (Button)findViewById(R.id.next_filing);
        nextFiling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (all.isChecked())
                    startActivity(new Intent(getApplicationContext(), Money_except.class));
                else if (split.isChecked())
                    startActivity(new Intent(getApplicationContext(), Money_except.class));
                else if (non_income.isChecked())
                    startActivity(new Intent(getApplicationContext(), Money_except.class));
                else {
                    AlertDialog.Builder alert = new AlertDialog.Builder(Status_filing.this);
                    alert.setMessage("กรุณาเลือกสถานการยื่นแบบ");
                    alert.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //do nothing
                        }
                    });
                    alert.show();
                }

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_status_filing, menu);
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
