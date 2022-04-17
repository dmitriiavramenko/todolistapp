package com.example.settingsmodule;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.view.View;


public class SettingsActivity extends AppCompatActivity {
    SwitchCompat themeswitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
            setTheme(R.style.Theme_Dark);
        }
        else {
            setTheme(R.style.Theme_Light);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        themeswitch = findViewById(R.id.themeswitch);
        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
            themeswitch.setChecked(true);
        }
        themeswitch.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            }
        });
    }
    public void showAuthors(View v) {
        AlertDialog.Builder buildDialog = new AlertDialog.Builder(this);
        buildDialog.setTitle("Authors")
                .setCancelable(false)
                .setMessage("Main: Nikita Korolkov                             Navigation: Gaurav Saini                        Settings: Dmitrii Avramenko")
                .setPositiveButton("Close", (dialogInterface, i) -> dialogInterface.cancel());
        AlertDialog dialog = buildDialog.create();
        dialog.show();
    }
}