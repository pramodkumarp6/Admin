package com.gravitational.consultancy.pramod.admin.dash;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
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
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.gravitational.consultancy.pramod.admin.R;
import com.gravitational.consultancy.pramod.admin.chat.Chat;
import com.gravitational.consultancy.pramod.admin.location.MapsActivity;
import com.gravitational.consultancy.pramod.admin.model.SharedPrefManager;

import de.hdodenhof.circleimageview.CircleImageView;

public class DashBoard extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private NavigationView navigationView;
    private View navHeader;
    // private ImageView imgNavHeaderBg, imgProfile;
    private TextView txtName,username;
    private TextView txtWebsite;
    private EditText txt;
    private Button pro;
    private CircleImageView profileImageView;
    private Button doc;

    private Button chat1;

    private Button location1;

    private Button repo;
    private Button daily_repo;

    private Button postion;

    private Button  interviewDetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("HOME");
        pro = (Button) findViewById(R.id.profile);

        doc = (Button) findViewById(R.id.document);
        chat1 = (Button) findViewById(R.id.chat_b);
        location1 = (Button) findViewById(R.id.locations);

        repo = (Button) findViewById(R.id.report_button);

        daily_repo = (Button) findViewById(R.id.daily_r);
        interviewDetails = (Button) findViewById(R.id.interview);

        postion = (Button) findViewById(R.id.position1);


        postion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent u = new Intent(getApplicationContext(), Users.class);
                startActivity(u);
            }
        });



        pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Profile_Account.class);
                startActivity(i);
            }
        });



        interviewDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), InterView_Schedule.class);
                startActivity(i);
            }
        });






        doc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Documents.class);
                startActivity(i);
            }
        });

        chat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Chat.class);
                startActivity(i);
            }
        });





        location1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                startActivity(i);
            }
        });



        repo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Report.class);
                startActivity(i);
            }
        });



        daily_repo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Daily_Report.class);
                startActivity(i);
            }
        });


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setItemTextAppearance(R.style.MenuTextStyle);
        navigationView.setItemIconTintList(null);
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

        getMenuInflater().inflate(R.menu.dash_board, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        switch(item.getItemId()) {

            case R.id.menuLogout12:
                Intent Notification = new Intent(this,Notification.class);
                startActivity(Notification);
                break;



            case R.id.nav_setting:
                Intent intent1 = new Intent(this,Setting.class);
                startActivity(intent1);
                break;


            case R.id.menuLogout:

                SharedPrefManager.getInstance(getApplicationContext()).logout();
                finish();



                break;

        }

        return super.onOptionsItemSelected(item);
    }


    private void displaySelectedScreen(int itemId) {

       // int id = item.getItemId();
        switch (itemId) {

            case R.id.home:
                Intent account = new Intent(this,Profile_Account.class);
                startActivity(account);
                // fragment = new Home();
                break;



               /* case R.id.password:
                    Intent pass = new Intent(this,Password_change.class);
                    startActivity(pass);
                    // fragment = new Home();
                    break;*/





            case R.id.users:
                Intent u = new Intent(this,Users.class);
                startActivity(u);
                break;

            case R.id.document:
                Intent Documents = new Intent(this,Documents.class);
                startActivity(Documents);
                break;

                    /*case R.id.nav_setting:
                        Intent intent = new Intent(this,Setting.class);
                        startActivity(intent);
                            break;*/

               /* case R.id.nav_notification:
                    Intent i1 = new Intent(this,Notification.class);
                    startActivity(i1);
                    break;*/






            case R.id.nav_feedback:
                Intent feeedback = new Intent(this,FeedbackView.class);
                startActivity(feeedback);
                break;






            case R.id.nav_interView:
                Intent i2 = new Intent(this,InterView_Schedule.class);
                startActivity(i2);
                break;

            case R.id.nav_massage:
                Intent i3 = new Intent(this,Chat.class);
                startActivity(i3);
                break;

            case R.id.nav_location:
                Intent i4 = new Intent(this, MapsActivity.class);
                startActivity(i4);
                break;


            case R.id.nav_share:
                Intent i5 = new Intent(this,About.class);
                startActivity(i5);
                break;


            case R.id.nav_about:
                Intent i6 = new Intent(this,Condition.class);
                startActivity(i6);
                break;
        }



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        displaySelectedScreen(item.getItemId());
        return true;
    }
}
