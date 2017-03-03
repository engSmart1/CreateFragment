package data;

import java.util.ArrayList;
import java.util.List;

import musictag.hytham1.com.createfragment.R;

/**
 * Created by Hytham on 3/2/2017.
 */

public class FlowerData {
    private List<Flower> flowers = new ArrayList<>();
    public List<Flower> getFlowers(){
        return flowers;
    }
    public FlowerData(){
        flowers.add(new Flower("Azalea" , R.drawable.rose1 , 15.95 , "Large double . Good grower , heavy bloomer " +
                ", Early to mid session , acid loving plants ,"));
        flowers.add(new Flower("TibouChina semidecanda" , R.drawable.rose2 ,30.43 ,"Beautiful large loyal purple" +
                "flowers adorn , attractive satiny green leaves   " ));
        flowers.add(new Flower("Hibiscus " ,R.drawable.rose3 , 76.78 , "Blooms in summer , 20-30 inch high , fertilize regularly" +
                "for best result"));
    }
}
