package com.example.projetosofrimento;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class TelaHome extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_home);


        // Your existing FAB click handling
        FloatingActionButton fab = findViewById(R.id.cmdOcorrencia);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent to start the new activity
                Intent intent = new Intent(TelaHome.this, NovaOcorrencia1.class);
                startActivity(intent);
            }
        });

        // Handling BottomAppBar menu item clicks
        BottomAppBar bottomAppBar = findViewById(R.id.bottomAppBar);
        bottomAppBar.setOnMenuItemClickListener(new BottomAppBar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (item.getItemId() == R.id.perfil) {
                    // Handle the click for menu item with ID R.id.perfil
                    openPerfilActivity();
                    return true; // Indicate that the click has been handled
                    //  } else if (item.getItemId() == R.id.menu_item2) {
                    // Handle the click for menu item 2
                    // You can open another activity or perform any other action
                    //  return true; // Indicate that the click has been handled
                }
                return false; // Indicate that the click has not been handled
            }

        });
    }

    private void openPerfilActivity() {
        // Intent to start another activity (replace YourAnotherActivity.class with the actual class)
        Intent intent = new Intent(TelaHome.this, TelaUsuario.class);
        startActivity(intent);
    }

}
