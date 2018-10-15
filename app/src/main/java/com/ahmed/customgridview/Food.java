package com.ahmed.customgridview;

public class Food {

    private String title;
    private  String price;
    private  int imageId;

    public Food(String title, String price, int imageId) {
        this.title = title;
        this.price = price;
        this.imageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    public String getPrice() {
        return price;
    }

    public int getImageId() {
        return imageId;
    }
}
