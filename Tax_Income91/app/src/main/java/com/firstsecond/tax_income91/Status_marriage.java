package com.firstsecond.tax_income91;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;


public class Status_marriage extends ActionBarActivity {

    private RadioButton marriageAllyear, marriageOfyear, divorce, dead;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.status_marriage);

        // Prev
        Button prevMarriage = (Button) findViewById(R.id.prev_marriage);
        prevMarriage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        marriageAllyear = (RadioButton) findViewById(R.id.radiobutton_marriage1);
        marriageOfyear = (RadioButton) findViewById(R.id.radiobutton_marriage2);
        divorce = (RadioButton) findViewById(R.id.radiobutton_marriage3);
        dead = (RadioButton) findViewById(R.id.radiobutton_marriage4);

        Button nextMarriage = (Button) findViewById(R.id.next_marriage);
        nextMarriage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (marriageAllyear.isChecked())
                    startActivity(new Intent(getApplicationContext(), Status_filing.class));
                else if (marriageOfyear.isChecked())
                    startActivity((new Intent(getApplicationContext(), Status_filing.class)));
                else if (divorce.isChecked())
                    startActivity(new Intent(getApplicationContext(), Money_except.class));
                else if (dead.isChecked())
                    startActivity(new Intent(getApplicationContext(), Money_except.class));
                else {
                    AlertDialog.Builder alert = new AlertDialog.Builder(Status_marriage.this);
                    alert.setMessage("กรุณาเลือกสถานภาพการสมรส");
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
        getMenuInflater().inflate(R.menu.menu_status_marriage, menu);
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
