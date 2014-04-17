package com.example.longwindingroad.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;


public class MainActivity extends Activity {

    Button start_adventure;
    Button load_adventure;
    LinearLayout main_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize all variables need to make the main menu
        main_menu = (LinearLayout) findViewById(R.id.main);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);



        //commented out to try a partially dynamic solution
        /*start_adventure = new Button(this);
        load_adventure = new Button(this);

        //set the text of the new Buttons before placing them in linear layout
        start_adventure.setText("Start Adventure");
        start_adventure.setTextSize(25);
        //start_adventure.setBackgroundColor(0xffdf7506);
        start_adventure.setPadding(0,30,0,30);
        start_adventure.setHighlightColor(0x111111);

        load_adventure.setText("Load Adventure");
        load_adventure.setTextSize(25);
        //load_adventure.setBackgroundColor(0xffdf7506);
        load_adventure.setPadding(0,30,0,30);
        load_adventure.setHighlightColor(0x111111);
        params.gravity = Gravity.CENTER_HORIZONTAL;

        //add Buttons to the layout
        main_menu.addView(start_adventure,params);
        main_menu.addView(load_adventure, params);*/



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
