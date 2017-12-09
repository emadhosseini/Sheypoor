package com.example.emad.sheypoor;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.lang.reflect.Field;

public class MainActivity extends AppCompatActivity {
    Typeface IranYekanBold;
    Typeface IranYekanLight;
    Typeface IranYekanRegular;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IranYekanLight = Typeface.createFromAsset(getAssets(), "Font/IRANYekanMobileLight.ttf");
        IranYekanRegular = Typeface.createFromAsset(getAssets(), "Font/IRANYekanMobileRegular.ttf");
        IranYekanBold = Typeface.createFromAsset(getAssets(), "Font/IRANYekanMobileBold.ttf");


        try {
            Field Nav_Style = Typeface.class.getDeclaredField("MONOSPACE");
            Nav_Style.setAccessible(true);
            Nav_Style.set(null, IranYekanBold);

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }



        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.search_menu,menu);
        return true;
    }




}


