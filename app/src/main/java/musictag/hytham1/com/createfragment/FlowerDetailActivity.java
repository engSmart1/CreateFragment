package musictag.hytham1.com.createfragment;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Hytham on 3/2/2017.
 */

public class FlowerDetailActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower_detail);

       //getActionBar().setDisplayHomeAsUpEnabled(true);


        if (savedInstanceState == null){
            FlowerDetailFragment fragment = new FlowerDetailFragment();

            Bundle b = getIntent().getBundleExtra(MainActivity.FLOWER_BUNDLE);
            fragment.setArguments(b);

            getFragmentManager().beginTransaction().add(R.id.detailContainer , fragment).commit();


        }

    }
}
