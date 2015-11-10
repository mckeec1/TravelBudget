package com.travelbudget.travelbudget;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.String;

public class mpgMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mpg_menu);
        initDisplayButton();}

        private void initDisplayButton() {
        Button displayButton = (Button)
                findViewById(R.id.button6);
        displayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View arg0) {

                EditText mpg = (EditText)
                        findViewById(R.id.strMPG);
                TextView textDisplay = (TextView)
                        findViewById(R.id.textView);
                String mpgToDisplay = mpg.getText().toString();
                System.out.println(mpgToDisplay);

            }
        });
    }


public void sendMessage(View view)
{
    Intent intent = new Intent(mpgMenu.this, optionsScreen1.class);
    startActivity(intent);


}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mpg_menu, menu);
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
