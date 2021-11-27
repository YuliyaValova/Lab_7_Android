package com.example.mafis_7;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class ActivityFromNotification extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.from_notification);
        String[] perms = {android.Manifest.permission.READ_CONTACTS, android.Manifest.permission.WRITE_CONTACTS,
                android.Manifest.permission.READ_SMS, android.Manifest.permission.READ_EXTERNAL_STORAGE};
        ActivityCompat.requestPermissions(this, perms, 65);
    }

}