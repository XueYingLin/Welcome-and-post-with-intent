package edu.sjsu.android.welcomeandpostwithintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_ID = "edu.sjsu.android.welcomeandpostwithintent.EXTRA_ID";
    public final static String EXTRA_FN = "edu.sjsu.android.welcomeandpostwithintent.EXTRA_FN";
    public final static String EXTRA_LN = "edu.sjsu.android.welcomeandpostwithintent.EXTRA_LN";
    public final static String EXTRA_MAJOR = "edu.sjsu.android.welcomeandpostwithintent.EXTRA_MAJOR";
    public final static String EXTRA_DATE = "edu.sjsu.android.welcomeandpostwithintent.EXTRA_DATE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submitBtn = (Button) findViewById(R.id.submitBtn);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submitForm();
            }
        });
    }

    public void submitForm() {
        EditText idEditText = (EditText) findViewById(R.id.idEditText);
        String id = idEditText.getText().toString();

        EditText fNEditText = (EditText) findViewById(R.id.fNEditText);
        String firstName = fNEditText.getText().toString();

        EditText lNEditText = (EditText) findViewById(R.id.lNEditText);
        String lastName = lNEditText.getText().toString();

        EditText majorEditText = (EditText) findViewById(R.id.majorEditText);
        String major = majorEditText.getText().toString();

        EditText dateEditText = (EditText) findViewById(R.id.dateEditText);
        String date = dateEditText.getText().toString();

        Intent intent = new Intent(this, PostActivity.class);
        intent.putExtra(EXTRA_ID, id);
        intent.putExtra(EXTRA_FN, firstName);
        intent.putExtra(EXTRA_LN, lastName);
        intent.putExtra(EXTRA_MAJOR, major);
        intent.putExtra(EXTRA_DATE, date);

        startActivity(intent);
    }
}