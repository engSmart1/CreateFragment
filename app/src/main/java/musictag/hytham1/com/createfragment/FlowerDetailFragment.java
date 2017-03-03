package musictag.hytham1.com.createfragment;

import android.app.Fragment;
import android.icu.text.NumberFormat;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import data.Flower;

public class FlowerDetailFragment extends Fragment {
      Flower flower ;

    public FlowerDetailFragment(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle b = getArguments();

        if (b != null && b.containsKey(Flower.FLOWER_NAME)){
            flower = new Flower(b);
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_flower_detail_fragment ,container ,false);

        if (flower != null) {

            TextView tvName = (TextView) view.findViewById(R.id.tvFlowerName);
            tvName.setText(flower.getFlowerName());

            ImageView ivImage = (ImageView) view.findViewById(R.id.ivFlowerImage);
            ivImage.setImageResource(flower.getImageRes());

            TextView tvInstructions = (TextView) view.findViewById(R.id.tvInstructions);
            tvInstructions.setText(flower.getInstructions());

            NumberFormat fmt = NumberFormat.getCurrencyInstance();
            TextView tvPrice = (TextView) view.findViewById(R.id.tvPrice);
            tvPrice.setText(fmt.format(flower.getPrice()));
        }

        return view;
    }
}
