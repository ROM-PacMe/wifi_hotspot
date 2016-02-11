package com.diewland.wi_fihotspot;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {
            Toast.makeText(this, "Toggling Wi-Fi hotspot", Toast.LENGTH_SHORT).show();
            ApManager.configApState(MainActivity.this);
        }
        catch(Exception e){
            // if not work, jump to hotspot setting
            Intent intent = new Intent();
            intent.setClassName("com.android.settings", "com.android.settings.TetherSettings");
            startActivity(intent);
        }

        finish();
    }

}
