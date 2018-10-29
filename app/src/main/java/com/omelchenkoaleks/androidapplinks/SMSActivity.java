package com.omelchenkoaleks.androidapplinks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SMSActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);

        final Intent intent = getIntent();
        final String action = intent.getAction();
        final String data = intent.getDataString();

        if (Intent.ACTION_VIEW.equals(action) && data != null) {
            final String omelchenkoaleks = data.substring(data.lastIndexOf("/") + 1);

            Toast.makeText(this, "здесь: " + omelchenkoaleks,
                    Toast.LENGTH_SHORT)
                    .show();

//            loadJobDetails(jobId);
        }
    }

    public void start(View view) {
        Intent intent = new Intent(SMSActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
