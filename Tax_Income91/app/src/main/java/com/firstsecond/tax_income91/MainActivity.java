package com.firstsecond.tax_income91;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;


public class MainActivity extends ActionBarActivity {

    private RadioButton single, marriage, widow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // reference id
        single = (RadioButton)findViewById(R.id.radiobutton_main1);
        marriage = (RadioButton)findViewById(R.id.radiobutton_main2);
        widow = (RadioButton)findViewById(R.id.radiobutton_main3);

        // create obj (new intent)
        Button btnMain = (Button) findViewById(R.id.btn_main);
        btnMain.setOnClickListener(new View.OnClickListener() {     // คลิกแล้วให้เกิดเหตุการณ์
            @Override
            public void onClick(View v) {
                if (single.isChecked()) {
                    startActivity(new Intent(getApplicationContext(), Money_except.class));
                    Log.w("Main_Select", "single");
                }
                else if (marriage.isChecked()) {
                    startActivity(new Intent(getApplicationContext(), Status_marriage.class));
                    Log.w("Main_Select", "marriage");
                }
                else if (widow.isChecked()) {
                    startActivity(new Intent(getApplicationContext(), Money_except.class));
                    Log.i("Main_Select", "widow");
                }
                else{
                    // show dialog this activity
                    AlertDialog.Builder dialogMain = new AlertDialog.Builder(MainActivity.this);
                            dialogMain.setMessage("กรุณาเลือกสถานภาพผู้มีเงินได้");
                            dialogMain.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    // do nothing
                                }
                            });
                            dialogMain.show();
                }
            }
        });
    }

    public void onBackPressed() {
        // Exit dialog
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("Exit");
        dialog.setCancelable(true);
        dialog.setMessage("คุณต้องการออกจากโปรแกรมใช่ไหม");

        dialog.setPositiveButton("ใช่", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Finish is Destroy Activity
                finish();
            }
        });

        dialog.setNegativeButton("ไม่", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        dialog.show();
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
