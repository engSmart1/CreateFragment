package musictag.hytham1.com.createfragment;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Hytham on 3/3/2017.
 */

public class MyFrefsActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getFragmentManager().beginTransaction().replace(android.R.id.content , new MyFrefsFragment()).commit();
    }
}
