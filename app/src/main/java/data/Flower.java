package data;

import android.os.Bundle;

/**
 * Created by Hytham on 3/1/2017.
 */

public class Flower {
    public static final String FLOWER_NAME = "flowerName";
    public static final String IMAGE_RES = "imageRes";
    public static final String PRICE = "price";
    public static final String INSTRUCTIONS = "instructions";


    //Create fields
    private String flowerName;
    private int imageRes;
    private double price;
    private String instructions;

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public int getImageRes() {
        return imageRes;
    }

    public void setImageRes(int imageRes) {
        this.imageRes = imageRes;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //Create constructor , Used when creating the data object
    public Flower(String id ,int imageRes , double price , String instructions ){
        this.flowerName = id;
        this.imageRes = imageRes;
        this.price = price;
        this.instructions = instructions;
    }
    // create from a bundle
    public Flower(Bundle b){
        if (b != null){
            this.flowerName = b.getString(FLOWER_NAME);
            this.imageRes = b.getInt(IMAGE_RES);
            this.price = b.getDouble(PRICE);
            this.instructions = b.getString(INSTRUCTIONS);

        }
    }
    //package data for transfer between activities

    public Bundle toBundle(){
        Bundle b = new Bundle();
        b.putString(FLOWER_NAME , this.flowerName);
        b.putInt(IMAGE_RES , this.imageRes);
        b.putDouble(PRICE , this.price);
        b.putString(INSTRUCTIONS , this.instructions);

        return b;
    }
    //output flower data

    @Override
    public String toString() {
        return flowerName;
    }
}


