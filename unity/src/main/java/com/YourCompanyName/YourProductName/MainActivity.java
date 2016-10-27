package com.YourCompanyName.YourProductName;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click (View view){
        Intent unity =  new Intent(MainActivity.this,UnityPlayerNativeActivity.class);
        startActivity(unity);
    }

}
