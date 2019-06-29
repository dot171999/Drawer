package com.dot.drawer;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
//import android.support.design.widget.FloatingActionButton;
//import android.support.design.widget.Snackbar;
//import android.support.v4.app.FragmentManager;
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
    static WebView webview;
    FragmentManager fm=getFragmentManager();

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


        FragmentTransaction ft =fm.beginTransaction();
        Fragment fragment=new FragmentMain();
        ft.replace(R.id.frame,fragment);
        ft.commit();

    }

    @Override
    public void onBackPressed() {

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            if (webview.canGoBack()) {
                webview.goBack();
            }else
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

        switch(id){
            case R.id.menu_x231:
                //webview.loadUrl("http://amazingit.in/schoolerp/setting");
                webview.loadUrl("http://www.google.com");
                break;
            case R.id.menu_x232:
                webview.loadUrl("http://amazingit.in/schoolerp/frontend_setting");
                break;
            case R.id.menu_x233:
                webview.loadUrl("http://amazingit.in/schoolerp/paymentsettings");
                break;
            case R.id.menu_x234:
                webview.loadUrl("http://amazingit.in/schoolerp/smssettings");
                break;
            case R.id.menu_x235:
                webview.loadUrl("http://amazingit.in/schoolerp/emailsetting");
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
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

            case R.id.menu_x51:
                webview.loadUrl("http://amazingit.in/schoolerp/mark");
                break;
            case R.id.menu_x52:
                webview.loadUrl("http://amazingit.in/schoolerp/markpercentage");
                break;
            case R.id.menu_x53:
                webview.loadUrl("http://amazingit.in/schoolerp/promotion");
                break;
            case R.id.menu_x54:
                webview.loadUrl("http://amazingit.in/schoolerp/conversation");
                break;

            case R.id.menu_x61:
                webview.loadUrl("http://amazingit.in/schoolerp/media");
                break;
            case R.id.menu_x62:
                webview.loadUrl("http://amazingit.in/schoolerp/mailandsms");
                break;

            case R.id.menu_x71:
                webview.loadUrl("http://amazingit.in/schoolerp/question_group");
                break;
            case R.id.menu_x72:
                webview.loadUrl("http://amazingit.in/schoolerp/question_level");
                break;
            case R.id.menu_x73:
                webview.loadUrl("http://amazingit.in/schoolerp/question_bank");
                break;
            case R.id.menu_x74:
                webview.loadUrl("http://amazingit.in/schoolerp/online_exam");
                break;
            case R.id.menu_x75:
                webview.loadUrl("http://amazingit.in/schoolerp/instruction");
                break;
            case R.id.menu_x76:
                webview.loadUrl("http://amazingit.in/schoolerp/take_exam");
                break;

            case R.id.menu_x81:
                webview.loadUrl("http://amazingit.in/schoolerp/salary_template");
                break;
            case R.id.menu_x82:
                webview.loadUrl("http://amazingit.in/schoolerp/hourly_template");
                break;
            case R.id.menu_x83:
                webview.loadUrl("http://amazingit.in/schoolerp/manage_salary");
                break;
            case R.id.menu_x84:
                webview.loadUrl("http://amazingit.in/schoolerp/make_payment");
                break;

            case R.id.menu_x91:
                webview.loadUrl("http://amazingit.in/schoolerp/vendor");
                break;
            case R.id.menu_x92:
                webview.loadUrl("http://amazingit.in/schoolerp/location");
                break;
            case R.id.menu_x93:
                webview.loadUrl("http://amazingit.in/schoolerp/asset_category");
                break;
            case R.id.menu_x94:
                webview.loadUrl("http://amazingit.in/schoolerp/asset");
                break;
            case R.id.menu_x95:
                webview.loadUrl("http://amazingit.in/schoolerp/asset_assignment");
                break;
            case R.id.menu_x96:
                webview.loadUrl("http://amazingit.in/schoolerp/purchase");
                break;

            case R.id.menu_x101:
                webview.loadUrl("http://amazingit.in/schoolerp/productwarehouse");
                break;
            case R.id.menu_x102:
                webview.loadUrl("http://amazingit.in/schoolerp/productsupplier");
                break;
            case R.id.menu_x103:
                webview.loadUrl("http://amazingit.in/schoolerp/productpurchase");
                break;
            case R.id.menu_x104:
                webview.loadUrl("http://amazingit.in/schoolerp/productsale");
                break;
            case R.id.menu_x105:
                webview.loadUrl("http://amazingit.in/schoolerp/product");
                break;

            case R.id.menu_x111:
                webview.loadUrl("http://amazingit.in/schoolerp/leavecategory");
                break;
            case R.id.menu_x112:
                webview.loadUrl("http://amazingit.in/schoolerp/leaveassign");
                break;
            case R.id.menu_x113:
                webview.loadUrl("http://amazingit.in/schoolerp/leaveapply");
                break;
            case R.id.menu_x114:
                webview.loadUrl("http://amazingit.in/schoolerp/leaveapplication");
                break;

            case R.id.menu_x121:
                webview.loadUrl("http://amazingit.in/schoolerp/activitiescategory");
                break;
            case R.id.menu_x122:
                webview.loadUrl("http://amazingit.in/schoolerp/activities");
                break;
            case R.id.menu_x123:
                webview.loadUrl("http://amazingit.in/schoolerp/childcare");
                break;

            case R.id.menu_x131:
                webview.loadUrl("http://amazingit.in/schoolerp/lmember");
                break;
            case R.id.menu_x132:
                webview.loadUrl("http://amazingit.in/schoolerp/book");
                break;
            case R.id.menu_x133:
                webview.loadUrl("http://amazingit.in/schoolerp/issue");
                break;
            case R.id.menu_x134:
                webview.loadUrl("http://amazingit.in/schoolerp/ebooks");
                break;

            case R.id.menu_x141:
                webview.loadUrl("http://amazingit.in/schoolerp/transport");
                break;
            case R.id.menu_x142:
                webview.loadUrl("http://amazingit.in/schoolerp/tmember");
                break;

            case R.id.menu_x151:
                webview.loadUrl("http://amazingit.in/schoolerp/hostel");
                break;
            case R.id.menu_x152:
                webview.loadUrl("http://amazingit.in/schoolerp/category");
                break;
            case R.id.menu_x153:
                webview.loadUrl("http://amazingit.in/schoolerp/hmember");
                break;

            case R.id.menu_x161:
                webview.loadUrl("http://amazingit.in/schoolerp/feetypes");
                break;
            case R.id.menu_x162:
                webview.loadUrl("http://amazingit.in/schoolerp/invoice");
                break;
            case R.id.menu_x163:
                webview.loadUrl("http://amazingit.in/schoolerp/expense");
                break;
            case R.id.menu_x164:
                webview.loadUrl("http://amazingit.in/schoolerp/paymenthistory");
                break;
            case R.id.menu_x165:
                webview.loadUrl("http://amazingit.in/schoolerp/income");
                break;
            case R.id.menu_x166:
                webview.loadUrl("http://amazingit.in/schoolerp/global_payment");
                break;

            case R.id.menu_x171:
                webview.loadUrl("http://amazingit.in/schoolerp/notice");
                break;
            case R.id.menu_x172:
                webview.loadUrl("http://amazingit.in/schoolerp/event");
                break;
            case R.id.menu_x173:
                webview.loadUrl("http://amazingit.in/schoolerp/holiday");
                break;

            case R.id.menu_x181:
                webview.loadUrl("http://amazingit.in/schoolerp/classesreport");
                break;
            case R.id.menu_x182:
                webview.loadUrl("http://amazingit.in/schoolerp/studentreport");
                break;
            case R.id.menu_x183:
                webview.loadUrl("http://amazingit.in/schoolerp/idcardreport");
                break;
            case R.id.menu_x184:
                webview.loadUrl("http://amazingit.in/schoolerp/admitcardreport");
                break;
            case R.id.menu_x185:
                webview.loadUrl("http://amazingit.in/schoolerp/routinereport");
                break;
            case R.id.menu_x186:
                webview.loadUrl("http://amazingit.in/schoolerp/examschedulereport");
                break;
            case R.id.menu_x187:
                webview.loadUrl("http://amazingit.in/schoolerp/attendancereport");
                break;
            case R.id.menu_x188:
                webview.loadUrl("http://amazingit.in/schoolerp/attendanceoverviewreport");
                break;
            case R.id.menu_x189:
                webview.loadUrl("http://amazingit.in/schoolerp/librarybookissuereport");
                break;
            case R.id.menu_x1810:
                webview.loadUrl("http://amazingit.in/schoolerp/librarybooksreport");
                break;
            case R.id.menu_x1811:
                webview.loadUrl("http://amazingit.in/schoolerp/librarycardreport");
                break;

            case R.id.menu_x191:
                webview.loadUrl("http://amazingit.in/schoolerp/visitorinfo");
                break;

            case R.id.menu_x201:
                webview.loadUrl("http://amazingit.in/schoolerp/schoolyear");
                break;
            case R.id.menu_x202:
                webview.loadUrl("http://amazingit.in/schoolerp/studentgroup");
                break;
            case R.id.menu_x203:
                webview.loadUrl("http://amazingit.in/schoolerp/complain");
                break;
            case R.id.menu_x204:
                webview.loadUrl("http://amazingit.in/schoolerp/certificate_template");
                break;
            case R.id.menu_x205:
                webview.loadUrl("http://amazingit.in/schoolerp/systemadmin");
                break;
            case R.id.menu_x206:
                webview.loadUrl("http://amazingit.in/schoolerp/resetpassword");
                break;
            case R.id.menu_x207:
                webview.loadUrl("http://amazingit.in/schoolerp/bulkimport");
                break;
            case R.id.menu_x208:
                webview.loadUrl("http://amazingit.in/schoolerp/backup");
                break;

            case R.id.menu_x211:
                webview.loadUrl("http://amazingit.in/schoolerp/usertype");
                break;
            case R.id.menu_x212:
                webview.loadUrl("http://amazingit.in/schoolerp/permission");
                break;
            case R.id.menu_x213:
                webview.loadUrl("http://amazingit.in/schoolerp/update");
                break;

            case R.id.menu_x221:
                webview.loadUrl("http://amazingit.in/schoolerp/frontendmenu");
                break;
            case R.id.menu_x222:
                webview.loadUrl("http://amazingit.in/schoolerp/posts_categories");
                break;
            case R.id.menu_x223:
                webview.loadUrl("http://amazingit.in/schoolerp/posts");
                break;
            case R.id.menu_x224:
                webview.loadUrl("http://amazingit.in/schoolerp/pages");
                break;
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
