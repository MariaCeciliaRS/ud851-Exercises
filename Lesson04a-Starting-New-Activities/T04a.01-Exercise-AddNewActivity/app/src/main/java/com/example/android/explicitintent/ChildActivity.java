package com.example.android.explicitintent;
// COMPLETED (1) Use Android Studio's Activity wizard to create a new Activity called ChildActivity

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
// Do steps 6 & 7 in ChildActivity.java
// COMPLETED (6) Create a TextView field to display your message
// COMPLETED (7) Get a reference to your TextView in Java
public class ChildActivity extends AppCompatActivity {
    private TextView mDisplayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
        mDisplayText = (TextView) findViewById(R.id.tv_display);
    }
}