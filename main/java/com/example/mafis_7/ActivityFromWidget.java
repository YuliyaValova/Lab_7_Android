package com.example.mafis_7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.os.Bundle;

public class ActivityFromWidget extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.from_widget);
        String[] perms = {android.Manifest.permission.READ_CONTACTS, android.Manifest.permission.WRITE_CONTACTS,
                android.Manifest.permission.READ_SMS, android.Manifest.permission.READ_EXTERNAL_STORAGE};
        ActivityCompat.requestPermissions(this, perms, 68);
    }

}