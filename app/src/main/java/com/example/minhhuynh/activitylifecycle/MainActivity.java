package com.example.minhhuynh.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnIntent, btnIntentArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("AAA", "onCreate");

        btnIntent = findViewById(R.id.button);
        btnIntent = findViewById(R.id.buttonIntentArray);

        btnIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("str",0);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        Log.d("AAA", "onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("AAA", "onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d("AAA", "onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("AAA", "onStop");
        super.onStop();
    }


    @Override
    protected void onRestart() {
        Log.d("AAA", "onRestart");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Log.d("AAA", "onDestroy");
        super.onDestroy();
    }
}
