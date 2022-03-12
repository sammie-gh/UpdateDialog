package com.learnoset.updatedialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class UpdateDialog extends Dialog {

    private final List<String> updateDetailsLists = new ArrayList<>();

    public UpdateDialog(@NonNull Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.update_dialog_layout);

        final RecyclerView updateDetails = findViewById(R.id.updateDetailsRecyclerView);
        final AppCompatButton updateNowBtn = findViewById(R.id.updateNowBtn);
        final TextView versionName = findViewById(R.id.updateVersionName);

        // setting update version to the TextView
        versionName.setText("V2.10");

        // configure recyclerview
        updateDetails.setHasFixedSize(true);
        updateDetails.setLayoutManager(new LinearLayoutManager(getContext()));

        // add your own update details one by one
        updateDetailsLists.add("1. Bugs Fixed");
        updateDetailsLists.add("2. Design Improvements");
        updateDetailsLists.add("3. New Functionalities");
        updateDetailsLists.add("4. Fast Loading Speed");

        // set adapter to RecyclerView
        updateDetails.setAdapter(new UpdateDetailsAdapter(updateDetailsLists));

        updateNowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Your code goes here...
            }
        });
    }
}
