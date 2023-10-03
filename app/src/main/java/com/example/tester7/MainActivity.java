package com.example.tester7;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.SearchView;

import java.util.List;


public class MainActivity extends AppCompatActivity {
    public class MyAdapter extends ArrayAdapter {

        public MyAdapter(Context context, int resource, int textViewResourceId, List objects) {
            super(context, resource, textViewResourceId, objects);
        }

        @Override
        public int getCount() {
            return super.getCount();
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return super.getView(position, convertView, parent);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu, menu);
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView = (SearchView) menu.findItem(R.id.search).getActionView();
        if (searchView != null) {
            searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
            searchView.setOnCloseListener(new SearchView.OnCloseListener() {
                @Override
                public boolean onClose() {
                    //TODO: Reset your views
                    return false;
                }
            });
            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String s) {
                    return false; //do the default
                }

                @Override
                public boolean onQueryTextChange(String s) {
                    //NOTE: doing anything here is optional, onNewIntent is the important bit
                    if (s.length() > 1) { //2 chars or more
                        //TODO: filter/return results
                    } else if (s.length() == 0) {
                        //TODO: reset the displayed data
                    }
                    return false;
                }

            });
        }


        return true;
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);

        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            final String query = intent.getStringExtra(SearchManager.QUERY);
            doMySearch(query);
            //TODO: actually do some filtering / set results
        }
    }

    private void doMySearch(String query) {
    }

    public DrawerLayout drawerLayout;
    public ActionBarDrawerToggle actionBarDrawerToggle;
    ImageButton time_expression_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // drawer layout instance to toggle the menu icon to open
        // drawer and back button to close drawer
        drawerLayout = findViewById(R.id.my_drawer_layout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);

        // pass the Open and Close toggle for the drawer layout listener
        // to toggle the button
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        time_expression_btn = findViewById(R.id.imageButton13);

        // to make the Navigation drawer icon always appear on the action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        time_expression_btn.setOnClickListener
                (new View.OnClickListener() {
                     @Override
                     public void onClick(View v) {
                         Intent intent = new Intent(MainActivity.this, Time_Expression_Activity.class);
                         startActivity(intent);
                     }
                 }
                );
        ;
    }

    public void expBtn(View view) {
        Intent intent = new Intent(this, GreetingActivity.class);
        startActivity(intent);
    }

    public void Fruits(View view) {
        Intent intent = new Intent(this, FruitActivity.class);
        startActivity(intent);
    }

    public void Colors(View view) {
        Intent intent = new Intent(this, ColorActivity.class);
        startActivity(intent);
    }

    public void Family(View view) {
        Intent intent = new Intent(this, FamilyActivity.class);
        startActivity(intent);
    }

    public void Stationary(View view) {
        Intent intent = new Intent(this, SportsActivity.class);
        startActivity(intent);
    }

    public void Health(View view) {
        Intent intent = new Intent(this, PhysicalDescriptionActivity.class);
        startActivity(intent);
    }

    public void Food(View view) {
        Intent intent = new Intent(this, FoodActivity.class);
        startActivity(intent);
    }

    public void Numbers(View view) {
        Intent intent = new Intent(this, NumberActivity.class);
        startActivity(intent);
    }

    public void Directions(View view) {
        Intent intent = new Intent(this, DirectionActivity.class);
        startActivity(intent);
    }

    public void domesticAnimals(View view) {
        Intent intent = new Intent(this, DomesticAnimalActivity.class);
        startActivity(intent);
    }

    public void wildAnimals(View view) {
        Intent intent = new Intent(this, WildAnimalsActivity.class);
        startActivity(intent);
    }

//    public void timeExpressions(View view) {
//        Intent intent = new Intent(this, Time_Expression_Activity.class);
//        startActivity(intent);
//    }

    public void sittingRoom(View view) {
        Intent intent = new Intent(this, FestivalActivity.class);
        startActivity(intent);
    }

    public void Restaurant(View view) {
        Intent intent = new Intent(this, RestaurantActivity.class);
        startActivity(intent);
    }

    public void daysMonth(View view) {
        Intent intent = new Intent(this, DaysMonthActivity.class);
        startActivity(intent);
    }

    // override the onOptionsItemSelected()
    // function to implement
    // the item click listener callback
    // to open and close the navigation
    // drawer when the icon is clicked
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);

        // Navigationview navigationView=findViewById(R.id.navigationView);
        //navigationView.setItemIconsTintList(null);

    }

}

