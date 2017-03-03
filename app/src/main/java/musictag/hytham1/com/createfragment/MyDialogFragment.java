package musictag.hytham1.com.createfragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/**
 * Created by Hytham on 3/3/2017.
 */

public class MyDialogFragment extends DialogFragment {

    public MyDialogFragment(){

    }

    @Override
    public Dialog onCreateDialog (Bundle savedInstanceState) {
        Bundle b = getArguments();

         AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Result").setMessage(b.getString("message"))
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                     getDialog().dismiss();
                    }
                });

         return builder.create();
    }

}
