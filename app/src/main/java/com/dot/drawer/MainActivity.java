package com.dot.drawer;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowTitleEnabled(false);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);
        webview = findViewById(R.id.webView);

        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webview.setWebViewClient(new MyWebViewClient());
        webview.loadUrl("http://amazingit.in/schoolerp/dashboard");
    }

    class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {

            return false;
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
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
        //if (id == R.id.action_settings) {
            //return true;
        //}

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.

        switch (item.getItemId()) {
            case R.id.menu_x11:
                webview.loadUrl("http://amazingit.in/schoolerp/student");
                break;
            case R.id.menu_x12:
                webview.loadUrl("http://amazingit.in/schoolerp/parents");
                break;
            case R.id.menu_x13:
                webview.loadUrl("http://amazingit.in/schoolerp/teacher");
                break;
            case R.id.menu_x14:
                webview.loadUrl("http://amazingit.in/schoolerp/user");
                break;

            case R.id.menu_x21:
                webview.loadUrl("http://amazingit.in/schoolerp/classes");
                break;
            case R.id.menu_x22:
                webview.loadUrl("http://amazingit.in/schoolerp/student");
                break;
            case R.id.menu_x23:
                webview.loadUrl("http://amazingit.in/schoolerp/subject");
                break;
            case R.id.menu_x24:
                webview.loadUrl("http://amazingit.in/schoolerp/syllabus");
                break;
            case R.id.menu_x25:
                webview.loadUrl("http://amazingit.in/schoolerp/assignment");
                break;
            case R.id.menu_x26:
                webview.loadUrl("http://amazingit.in/schoolerp/routine");
                break;

            case R.id.menu_x31:
                webview.loadUrl("http://amazingit.in/schoolerp/sattendance");
                break;
            case R.id.menu_x32:
                webview.loadUrl("http://amazingit.in/schoolerp/tattendance");
                break;
            case R.id.menu_x33:
                webview.loadUrl("http://amazingit.in/schoolerp/uattendance");
                break;

            case R.id.menu_x41:
                webview.loadUrl("http://amazingit.in/schoolerp/exam");
                break;
            case R.id.menu_x42:
                webview.loadUrl("http://amazingit.in/schoolerp/examschedule");
                break;
            case R.id.menu_x43:
                webview.loadUrl("http://amazingit.in/schoolerp/grade");
                break;
            case R.id.menu_x44:
                webview.loadUrl("http://amazingit.in/schoolerp/eattendance");
                break;
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
