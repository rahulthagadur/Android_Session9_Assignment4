package com.example.thagadur.android_session9_assignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Initialising Button
        final Button click=(Button)findViewById(R.id.click_btn);
        //here we show the context menu on Button Clicked
        click.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View v) {
                //To register the button with context menu.
                registerForContextMenu(click);
                openContextMenu(click);

            }
        });

    }

    //Getting Menu from the menu.xml file where items are initialised
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        menu.setHeaderTitle("Context Menu");
        getMenuInflater().inflate(R.menu.menu,menu);
        }

    //this function is to perform what should happen on clicking specific item
    //On clicking of specific item ,Toast Message is Shown
    @Override
    public boolean onContextItemSelected(MenuItem item) {
    switch (item.getItemId()){

        case R.id.item_1:
            Toast.makeText(this, "Item 1 Clicked", Toast.LENGTH_SHORT).show();
            break;
        case R.id.item_2:
            Toast.makeText(this, "Item 2 clicked", Toast.LENGTH_SHORT).show();
            break;
        case R.id.item_3:
            Toast.makeText(this, "Item 3 clicked", Toast.LENGTH_SHORT).show();
    }
    return true;
    }
}
