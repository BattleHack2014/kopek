package battlehack.kopek;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

public class TripsActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trips);
        android.app.ActionBar bar = getActionBar();
        bar.setTitle("Trips");
    }
}
