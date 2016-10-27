package com.example.anibal.unlpar;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.YourCompanyName.YourProductName.UnityPlayerNativeActivity;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity2 extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.mapa: {
                //Intent maps = new Intent(MainActivity2.this, MapsActivity.class);
                //startActivity(maps);
                Toast.makeText(MainActivity2.this, "mapa", Toast.LENGTH_SHORT).show();
                // Cerramos esta activity
                Intent maps = new Intent(MainActivity2.this, MapsActivity.class);
                startActivity(maps);
                //finish();
                //Toast.makeText(MainActivity2.this, "unity", Toast.LENGTH_SHORT).show();
                //Intent i = new Intent(MainActivity2.this, UnityPlayerNativeActivity.class);
                //startActivity(i);
                return true;
            }
            case R.id.camara: {
                //Toast.makeText(MainActivity2.this, "unity", Toast.LENGTH_SHORT).show();
                // Cerramos esta activity
                //Intent maps = new Intent(MainActivity2.this, MapsActivity.class);
                //Toast.makeText(MainActivity2.this, "mapa", Toast.LENGTH_SHORT).show();
                //startActivity(maps);

                Intent i = new Intent(MainActivity2.this, UnityPlayerNativeActivity.class );
                startActivity(i);
                 return true;
            }
            default:
                //return super.onOptionsItemSelected(item);
                return false;

        }
    }




}
