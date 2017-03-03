package musictag.hytham1.com.createfragment;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by Hytham on 3/3/2017.
 */

public class MyFrefsFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
}
