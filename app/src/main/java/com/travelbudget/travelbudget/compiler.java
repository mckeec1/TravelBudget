package com.travelbudget.travelbudget;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Context;


public class compiler extends AppCompatActivity {

    //Variables mpgToDisplay;
    //Variables taxPaid;
    //Variables foodPricesA;
    //Variables hotelPrice;
    //Variables payable;

    Button button16;
    Button button18;

    String a;
    String b;
    String c;
    String e;

    public static final String SharedPrefManager = "PrefFile";
    SharedPreferences preferences = getSharedPreferences(SharedPrefManager, MODE_PRIVATE);
    String hotelPrice = preferences.getString("Hotel Price", "");





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compiler);


        //Bundle extras = getIntent().getExtras();
        //String a = extras.getString("mpgToDisplay");
        //MPG class
        //Intent intent=this.getIntent();
        //if(intent !=null)
           // a = intent.getStringExtra("mpgToDisplay");

        button16 = (Button)findViewById(R.id.button16);
        button18 = (Button)findViewById(R.id.button18);

        TextView mpg = (TextView) this.findViewById(R.id.mpg1);
        mpg.setText("Your mpg's are :"  + a);


        //State Tax
        Intent intent1 = this.getIntent();
        if(intent1 !=null)
            b = intent1.getStringExtra("taxPaid");
        TextView tax = (TextView)this.findViewById(R.id.tax1);
        tax.setText("Your tax average is :" + b);

        //Food
        Intent intent2 = this.getIntent();
        if(intent2 !=null)
            c = intent2.getStringExtra("foodPricesA");
        TextView food = (TextView)this.findViewById(R.id.food1);
        food.setText("Your food price is :" + c);

        //Hotel
        Intent intent3 = this.getIntent();
        if(intent3 !=null)
            hotelPrice = intent3.getStringExtra("Hotel Price");
        TextView hotel = (TextView)this.findViewById(R.id.hotel1);
        hotel.setText("Your hotel price is :" + hotelPrice);

        //People
        Intent intent4 = this.getIntent();
        if(intent4 !=null)
            e = intent4.getStringExtra("payable");
        TextView people = (TextView)this.findViewById(R.id.people1);
        people.setText("Your fellow passengers are :" + e);






    }

        public void onClick (View v) {
        if (v.getId() == R.id.button16) {
            Intent intent = new Intent(compiler.this, optionsScreen1.class);
            startActivity(intent);
        }else if (v.getId() == R.id.button18) {
                Intent intent = new Intent(compiler.this, finalPage.class);
                startActivity(intent);
            }
        }





    public void sendMessage(View view)
    {
        Intent intent = new Intent(compiler.this, optionsScreen1.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_compiler, menu);
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
