package utils;

import android.app.Activity;
import android.text.BoringLayout;
import android.util.DisplayMetrics;
import android.view.Display;

/**
 * Created by Hytham on 3/2/2017.
 */

public class ScreenUtility {

    private Activity activity;
    private float dpWidth;
    private float dpHeight;

    public ScreenUtility(Activity activity){
        this.activity = activity;

        Display display = activity.getWindowManager().getDefaultDisplay();
        DisplayMetrics outMetrics = new DisplayMetrics();
        display.getMetrics(outMetrics);

        float density = activity.getResources().getDisplayMetrics().density;
        dpHeight = outMetrics.heightPixels / density;
        dpWidth = outMetrics.widthPixels / density;
    }

    public float getHeight() {
        return dpHeight;
    }

    public float getWidth() {
        return dpWidth;
    }
}
