package musictag.hytham1.com.createfragment;


import android.app.Activity;
import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.List;

import data.Flower;
import data.FlowerArrayAdapter;
import data.FlowerData;

/**
 * Created by Hytham on 3/1/2017.
 */

public class FlowerListFragment extends ListFragment {
    List<Flower> flowers = new FlowerData().getFlowers();
    private Callback activity;

    public FlowerListFragment(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FlowerArrayAdapter adapter = new FlowerArrayAdapter(getActivity()
                , R.layout.flower_listitem , flowers);
        setListAdapter(adapter);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.flower_list_fragment, container , false);

        return rootView;
    }
    public interface Callback {
      public void onItemSelected(Flower flower);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Flower flower = flowers.get(position);
        activity.onItemSelected(flower);

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = (Callback) activity ;
    }
}
