package com.travelbudget.travelbudget;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.lang.Integer;

public class finalPage extends AppCompatActivity {

    public static final String SharedPrefManager = "PrefFile";


Integer int1;
    Integer int2;
    Integer int3;
    Integer int4;
    Integer int5;
    Integer finalMPGS;
    Integer total;
Button button19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_page);

        button19 = (Button)findViewById(R.id.button19);

        SharedPreferences preferences1 = getSharedPreferences(SharedPrefManager, Context.MODE_PRIVATE);
        String mpgs = preferences1.getString("MPG's", "default mpgs");
        SharedPreferences preferences3 = getSharedPreferences(SharedPrefManager, Context.MODE_PRIVATE);
        String mileage = preferences3.getString("Total mileage", "default People");
        SharedPreferences preferences2 = getSharedPreferences(SharedPrefManager, Context.MODE_PRIVATE);
        String food = preferences2.getString("Food", "default food");
        SharedPreferences preferences4 = getSharedPreferences(SharedPrefManager, Context.MODE_PRIVATE);
        String hotelPrice = preferences4.getString("Hotel price", "default price");
        SharedPreferences preferences5 = getSharedPreferences(SharedPrefManager, Context.MODE_PRIVATE);
        String misc = preferences5.getString("Extra spending", "default spending");


        int1 = new Integer (Integer.parseInt(mpgs));
        int2 = new Integer (Integer.parseInt(mileage));
        int3 = new Integer (Integer.parseInt(food));
        int4 = new Integer(Integer.parseInt(hotelPrice));
        int5 = new Integer (Integer.parseInt(misc));
        finalMPGS = int2 * 2 / int1;
        total = finalMPGS + int3 + int4 + int5;
        TextView eq1 = (TextView) this.findViewById(R.id.amount);
        eq1.setText("$" + total);



    }

    public void onClick (View v) {
        if (v.getId() == R.id.button19) {
            Intent intent = new Intent(finalPage.this, optionsScreen1.class);
            startActivity(intent);}}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_final_page, menu);
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
