package com.cyberthieves.trialapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class Grades extends ListActivity  {

//        hello h = new hello();

   // private  class hello extends AppCompatActivity  implements NavigationView.OnNavigationItemSelectedListener{
String entrynumber="";

        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);








            // Create a new Adapter containing a list of colors
            // Set the adapter on this ListActivity's built-in ListView





//            setContentView(R.layout.activity_main);
//            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//            setSupportActionBar(toolbar);
//            Intent start = getIntent();
//            final String entryNum = start.getStringExtra("Entry_Number");
//            final TextView en = (TextView) findViewById(R.id.currentUser);
//
//
//
//            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//            ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
//                    this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
//            drawer.setDrawerListener(toggle);
//            toggle.syncState();
//
//            NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
//            navigationView.setNavigationItemSelectedListener(this);
//
//            View en1=navigationView.getHeaderView(0);
//            TextView text = (TextView) en1.findViewById(R.id.currentUser);
//            text.setText(entryNum);
//
//
//            String name= getIntent().getExtras().getString("firstname")+" "+getIntent().getExtras().getString("lastname");
//            // TextView use=(TextView)(findViewById(R.id.currentUser));
//            text.setText(name);
//
//
//
            entrynumber=getIntent().getExtras().getString("entry");
            TextView te=(TextView)findViewById(R.id.entry_n);
            te.setText(entrynumber);
            /*setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item, R.id.textView3,
                    getResources().getStringArray(R.array.names)));

            ListView lv = getListView();

            // Enable filtering when the user types in the virtual keyboard
            lv.setTextFilterEnabled(true);

            // Set an setOnItemClickListener on the ListView
            lv.setOnItemClickListener(new OnItemClickListener() {
                public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id) {

                    // Display a Toast message indicting the selected item
                    Toast.makeText(getApplicationContext(),
                            ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
                }
            });
*/



        }



//        public void onBackPressed() {
//            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//            if (drawer.isDrawerOpen(GravityCompat.START)) {
//                drawer.closeDrawer(GravityCompat.START);
//            } else {
//                super.onBackPressed();
//            }
//        }
//
//        @Override
//        public boolean onCreateOptionsMenu(Menu menu) {
//            // Inflate the menu; this adds items to the action bar if it is present.
//            getMenuInflater().inflate(R.menu.main, menu);
//            return true;
//        }
//
//        @Override
//        public boolean onOptionsItemSelected(MenuItem item) {
//            // Handle action bar item clicks here. The action bar will
//            // automatically handle clicks on the Home/Up button, so long
//            // as you specify a parent activity in AndroidManifest.xml.
//            int id = item.getItemId();
//
//            //noinspection SimplifiableIfStatement
//            if (id == R.id.action_settings) {
//                return true;
//            }
//
//            return super.onOptionsItemSelected(item);
//        }
//
//        @SuppressWarnings("StatementWithEmptyBody")
//        @Override
//        public boolean onNavigationItemSelected(MenuItem item) {
//            // Handle navigation view item clicks here.
//            int id = item.getItemId();
//            if (id == R.id.nav_gallery) {
//                startActivity(new Intent(this, MainActivity.class));
//            }
//             else if (id == R.id.nav_slideshow) {
//                startActivity(new Intent(this, Threads.class));
//            }
//
//            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//            drawer.closeDrawer(GravityCompat.START);
//            return true;
//        }
//
//
//
//

    //}

}