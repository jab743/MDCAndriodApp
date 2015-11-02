package com.example.welook.mdcandriodapp;

import android.app.FragmentManager;
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

import com.example.welook.mdcandriodapp.fragments.AboutusFragment;
import com.example.welook.mdcandriodapp.fragments.AccountFragment;
import com.example.welook.mdcandriodapp.fragments.BluetoothFragment;
import com.example.welook.mdcandriodapp.fragments.DashboadFragment;
import com.example.welook.mdcandriodapp.fragments.DeviceFragment;
import com.example.welook.mdcandriodapp.fragments.HelpFragment;
import com.example.welook.mdcandriodapp.fragments.MainFragment;
import com.example.welook.mdcandriodapp.fragments.SettingFragment;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        FragmentManager fn = getFragmentManager();
        fn.beginTransaction().replace(R.id.contet_Fram,new MainFragment()).commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
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

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        FragmentManager fn = getFragmentManager();
        int id = item.getItemId();

        if (id == R.id.nav_Dashboard) {
            fn.beginTransaction().replace(R.id.contet_Fram,new DashboadFragment()).commit();

        } else if (id == R.id.nav_Account) {
            fn.beginTransaction().replace(R.id.contet_Fram,new AccountFragment()).commit();

        } else if (id == R.id.nav_Connect) {
            fn.beginTransaction().replace(R.id.contet_Fram,new BluetoothFragment()).commit();

        }   else if (id == R.id.nav_manage) {
            fn.beginTransaction().replace(R.id.contet_Fram,new SettingFragment()).commit();

        } else if (id == R.id.nav_device) {
            fn.beginTransaction().replace(R.id.contet_Fram,new DeviceFragment()).commit();
        }else if (id == R.id.nav_help) {
            fn.beginTransaction().replace(R.id.contet_Fram,new HelpFragment()).commit();


        }else if (id == R.id.nav_about) {
            fn.beginTransaction().replace(R.id.contet_Fram,new AboutusFragment()).commit();


        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
