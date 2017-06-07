package com.example.hp.railwaymanager;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class TrackTrainActivity extends ActionBarActivity {

    TextView txt;
    static int frmStation,toStation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        frmStation=-1;
        toStation =-1;
        setContentView(R.layout.activity_track_train);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_track_train, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void fromStationClicked(View v)
    {
        Intent intent = new Intent(this,FromSelectActivity.class);
        startActivity(intent);
        //frmStation = CustomAdapter.flag;
    }
    public void toStationClicked(View v)
    {
        Intent intent = new Intent(this,ToSelectActivity.class);
        startActivity(intent);
    //    toStation = CustomAdapter3.flag;
    }
    public void searchClicked(View v)
    {
        if(frmStation!= -1 && toStation != -1) {
            Intent intent = new Intent(this, TrainSearchActivity.class);
            startActivity(intent);
        }
    }


}
