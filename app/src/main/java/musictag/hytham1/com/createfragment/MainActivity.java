package musictag.hytham1.com.createfragment;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import data.Flower;
import utils.ScreenUtility;

public class MainActivity extends AppCompatActivity implements FlowerListFragment.Callback {

    public static final String FLOWER_BUNDLE = "FLOWER_BUNDLE";

    public static final int REQUEST_CODE = 1001;
    private boolean isTwoPane = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setLogo(R.drawable.flower_logo);
        setSupportActionBar(toolbar);*/
        if (findViewById(R.id.detailContainer) != null){
            isTwoPane = true;
        }



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu , menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings){
           /* ScreenUtility utility = new ScreenUtility(this);
            String output = " Width: " + utility.getWidth() + "," + " Height: " +
                    utility.getHeight();

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage(output)
                    .setTitle("Dimensions").create()
            .show();*/

            Intent intent = new Intent();
            intent.setClass(this , MyFrefsActivity.class);
            startActivityForResult( intent , 1002);

            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemSelected(Flower flower) {
        Bundle b = flower.toBundle();
        if (isTwoPane){
            FlowerDetailFragment fragment = new FlowerDetailFragment();
            fragment.setArguments(b);
            getFragmentManager().beginTransaction().replace(R.id.detailContainer , fragment).commit();

        }else
        {

            Intent intent = new Intent(this, FlowerDetailActivity.class);
            intent.putExtra(FLOWER_BUNDLE, b);
            startActivityForResult(intent, REQUEST_CODE);
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1002){
            SharedPreferences myPrefs = PreferenceManager.getDefaultSharedPreferences(this);
            boolean myPref1 = myPrefs.getBoolean("pref1" , false);
           // Toast.makeText(MainActivity.this , " Preference: " + myPref1 , Toast.LENGTH_LONG).show();

            MyDialogFragment dialogFragment = new MyDialogFragment();
            Bundle b = new Bundle();
            b.putString("message" , " Preference: " + myPref1  );
            dialogFragment.setArguments(b);

            dialogFragment.show(getFragmentManager() , "myDialog");
        }
    }
}
