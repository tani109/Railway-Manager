package com.example.hp.railwaymanager;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;


public class TrainSearchActivity extends ActionBarActivity {
    ListView list2;
    static int tSA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        tSA = -1;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train_search);
        list2 = (ListView)findViewById(R.id.trainlist);
        ArrayList<String> items = new ArrayList<String>();
        items.add(Integer.toString(TrackTrainActivity.toStation) +" "+ Integer.toString(TrackTrainActivity.frmStation));
        if(TrackTrainActivity.toStation==2 && TrackTrainActivity.frmStation==0)
        {
            items.add("Parabot");
            items.add("Kalni");
            items.add("Joyontica");
            items.add("Upaban");
        }
        if(TrackTrainActivity.toStation==0 && TrackTrainActivity.frmStation==2)
        {
            items.add("Parabot");
            items.add("Kalni");
            items.add("Joyontica");
            items.add("Upaban");
        }
        if(TrackTrainActivity.toStation==1 && TrackTrainActivity.frmStation==2)
        {
            items.add("Udayan");
            items.add("Paharika");

        }
        if(TrackTrainActivity.toStation==1 && TrackTrainActivity.frmStation==0)
        {
            items.add("Mahanagar Provati");
            items.add("Shuborno Express");
            items.add("Mohanagar Godhuli");
            items.add("Turna Nishitha");


        }
        list2.setAdapter(new CustomAdapter2(this, items));

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_train_search, menu);
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
}
