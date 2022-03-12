package com.learnoset.updatedialog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.learnoset.material.ui.learnosetnavigationbar.LearnosetNavItem;
import com.learnoset.material.ui.learnosetnavigationbar.LearnosetNavigationBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // showing update dialog
        UpdateDialog updateDialog = new UpdateDialog(MainActivity.this);
        updateDialog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(android.R.color.transparent)));
        updateDialog.setCancelable(false);
        updateDialog.show();

    }
}