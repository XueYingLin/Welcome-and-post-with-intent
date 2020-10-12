package edu.sjsu.android.welcomeandpostwithintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

        Intent intent = getIntent();
        String ID = intent.getStringExtra(MainActivity.EXTRA_ID);
        String firstName = intent.getStringExtra(MainActivity.EXTRA_FN);
        String lastName = intent.getStringExtra(MainActivity.EXTRA_LN);
        String major = intent.getStringExtra(MainActivity.EXTRA_MAJOR);
        String date = intent.getStringExtra(MainActivity.EXTRA_DATE);

        TextView idTextView = (TextView) findViewById(R.id.idTextView);
        TextView fNTextView = (TextView) findViewById(R.id.fNTextView);
        TextView lNTextView = (TextView) findViewById(R.id.lNTextView);
        TextView majorTextView = (TextView) findViewById(R.id.majorTextView);
        TextView dateTextView = (TextView) findViewById(R.id.majorTextView);

        idTextView.setText("ID: " + ID);
        fNTextView.setText("First Name: " + firstName);
        lNTextView.setText("Last Name: " + lastName);
        majorTextView.setText("Major: " + major);
        dateTextView.setText("Date: " + date);


    }
}