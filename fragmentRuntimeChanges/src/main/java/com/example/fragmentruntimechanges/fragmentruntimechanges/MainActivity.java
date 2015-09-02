package com.example.fragmentruntimechanges.fragmentruntimechanges;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("Activity", "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction().add(R.id.container, new MainFragment())
                    .commit();
        }
    }

    @Override
    protected void onStart() {
        Log.d("Activity", "onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("Activity", "onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d("Activity", "onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("Activity", "onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("Activity", "onDestroy");
        super.onDestroy();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
