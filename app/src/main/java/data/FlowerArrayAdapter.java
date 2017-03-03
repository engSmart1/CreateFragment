package data;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

;import musictag.hytham1.com.createfragment.R;

/**
 * Created by Hytham on 3/1/2017.
 */

public class FlowerArrayAdapter extends ArrayAdapter<Flower> {

    private Context context;
    private List<Flower> objects;
    public FlowerArrayAdapter(Context context, int resource, List<Flower> objects) {

        super(context, resource, objects);

        this.context = context;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
          Flower flower = objects.get(position);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.flower_listitem ,null);

        TextView textView = (TextView) view.findViewById(R.id.tvShow);
        textView.setText(flower.getFlowerName());

        ImageView imageView = (ImageView)view.findViewById(R.id.ivIcon);
        imageView.setImageResource(flower.getImageRes());

        return view;
    }
}
