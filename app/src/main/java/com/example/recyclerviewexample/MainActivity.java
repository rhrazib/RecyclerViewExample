package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerview;
    Adapter adapter;
    Model[] myListData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListItem();
        mRecyclerview = findViewById(R.id.reclyerView);
        adapter = new Adapter(myListData);
        mRecyclerview.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerview.setAdapter(adapter);

    }

    private void addListItem() {
        myListData = new Model[]{
                new Model("Email", android.R.drawable.ic_dialog_email),
                new Model("Info", android.R.drawable.ic_dialog_info),
                new Model("Delete", android.R.drawable.ic_delete),
                new Model("Dialer", android.R.drawable.ic_dialog_dialer),
                new Model("Alert", android.R.drawable.ic_dialog_alert),
                new Model("Map", android.R.drawable.ic_dialog_map),
                new Model("Email", android.R.drawable.ic_dialog_email),
                new Model("Info", android.R.drawable.ic_dialog_info),
                new Model("Delete", android.R.drawable.ic_delete),
                new Model("Dialer", android.R.drawable.ic_dialog_dialer),
                new Model("Alert", android.R.drawable.ic_dialog_alert),
                new Model("Map", android.R.drawable.ic_dialog_map),
                new Model("Email", android.R.drawable.ic_dialog_email),
                new Model("Info", android.R.drawable.ic_dialog_info),
                new Model("Delete", android.R.drawable.ic_delete),
                new Model("Dialer", android.R.drawable.ic_dialog_dialer),
                new Model("Alert", android.R.drawable.ic_dialog_alert),
                new Model("Map", android.R.drawable.ic_dialog_map),
        };

    }
}