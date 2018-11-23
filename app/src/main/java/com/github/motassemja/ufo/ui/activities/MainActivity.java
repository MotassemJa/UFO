package com.github.motassemja.ufo.ui.activities;

import android.os.Bundle;
import android.text.TextUtils;

import com.github.motassemja.ufo.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final BottomNavigationView bottomNav = findViewById(R.id.bottom_nav_view);
        bottomNav.setSelectedItemId(R.id.nav_menu_posts);
        final NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);

        final NavGraph graph = navController.getGraph();
        final AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(graph)
                .build();

        appBarConfiguration.getTopLevelDestinations().add(R.id.nav_menu_dashboard);
        appBarConfiguration.getTopLevelDestinations().add(R.id.nav_menu_groups);
        appBarConfiguration.getTopLevelDestinations().add(R.id.nav_menu_posts);

        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(bottomNav, navController);

    }

}
