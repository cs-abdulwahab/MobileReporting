package com.mujahid.mobilereporting;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ToggleButton;

public class menuLayoutActivity extends AppCompatActivity {
    private DrawerLayout nDrawerLayout;
    private ActionBarDrawerToggle nToggle;


    @Override
   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_layout);
        nDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        nToggle = new ActionBarDrawerToggle(this, nDrawerLayout, R.string.open, R.string.close );
        nDrawerLayout.addDrawerListener(nToggle);
        nToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);




      nDrawerLayout.setOnClickListener(new View.OnClickListener() {
          @Override
           public void onClick(View v) {
               Intent drawerIntent = new Intent(menuLayoutActivity.this, menuLayoutActivity.class);
                menuLayoutActivity.this.startActivity(drawerIntent);
            }
       });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (nToggle.onOptionsItemSelected(item))
            return true;

        return super.onOptionsItemSelected(item);
    }
}
