package com.example.project_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GroupMenu extends AppCompatActivity {
    Button gSettingsButton;
    Button eSettingsButton;
    Button eActivityButton;
    Button cancelTaskButton;
    Button viewEventActivityButton;
    private String AdditionalGroupName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_menu);

        if(savedInstanceState == null) {
            if (getIntent().getExtras()== null)
            {
                AdditionalGroupName = "";
            }
            else
            {
                AdditionalGroupName = getIntent().getExtras().getString("GroupName");
            }
        }
        else
        {
            AdditionalGroupName = (String)savedInstanceState.getSerializable("GroupName");
        }

        gSettingsButton = findViewById(R.id.newGroupSetting);
        gSettingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newInt = new Intent(GroupMenu.this, GroupSettings.class);
                newInt.putExtra("GroupName", AdditionalGroupName);
                startActivity(newInt);
            }
        });

        eSettingsButton = findViewById(R.id.createNewEvent);
        eSettingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(GroupMenu.this, EventCreation.class);
                i4.putExtra("GroupName", AdditionalGroupName);
                startActivity(i4);
            }
        });

        eActivityButton = findViewById(R.id.viewEventActivity);
        eActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6 = new Intent(GroupMenu.this, SearchEvent.class);
                i6.putExtra("GroupName", AdditionalGroupName);
                startActivity(i6);
            }
        });

        cancelTaskButton = findViewById(R.id.cancelGroupView);
        cancelTaskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(GroupMenu.this, Chat.class);
                i3.putExtra("GroupName",AdditionalGroupName);
                startActivity(i3);
            }
        });
    }


}