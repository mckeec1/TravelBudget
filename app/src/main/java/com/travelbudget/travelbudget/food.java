package com.travelbudget.travelbudget;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class food extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        initDisplayButton();}


        private void initDisplayButton() {
        Button displayButton = (Button)
                findViewById(R.id.button8);
        displayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                EditText food = (EditText)
                        findViewById(R.id.foodPrice);
                TextView textDisplay = (TextView)
                        findViewById(R.id.textView);
                String foodPricesA = food.getText().toString();
                System.out.println(foodPricesA);

                AlertDialog.Builder dlgAlert = new AlertDialog.Builder(food.this);
                dlgAlert.setMessage("Is this the right information: " + foodPricesA);
                dlgAlert.setTitle("Travel Budget");
                dlgAlert.setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                //dismiss the dialog
                                startActivity(new Intent(food.this, optionsScreen1.class));
                                Toast.makeText(food.this, "Data saved", Toast.LENGTH_SHORT).show()
                                ;
                            }


                        });
                dlgAlert.setCancelable(true);
                dlgAlert.create().show();

            }
        });
        }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_food, menu);
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
