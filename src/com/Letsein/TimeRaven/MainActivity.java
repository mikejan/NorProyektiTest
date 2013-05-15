package com.Letsein.TimeRaven;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        int x = Color.rgb(255, 0, 0);
    }

    public void onBtnClick(View v)
    {
        Intent newActivity = new Intent(this, NewActivity.class);
        startActivity(newActivity);
    }
}
