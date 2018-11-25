package com.example.amirreza.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

public class MainActivity extends Activity {
    /*
       The first method to sound the page,
       info location activity and introducer activity
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
     As soon as the onCreate method is called,
      the method is called Start
     */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("showactivity","onStart");
    }

    /*
    The Resume method starts after the start method,
     and when the new page opens and returns to the previous file,
       the Resume method is called.
     */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("showactivity","onResume");
    }
/*
  As soon as the activity goes off, the method is called
*/
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("showactivity","onPause");
    }
    /*
    activity stopper
     */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("showactivity","onStop");
    }


    /*
    When the full screen is destroyed
    , what we say is done
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("showactivity","onDestroy");
    }
}
