package com.example.a19480161_nguyenthanhnam;

public class Goods {
    private String name;
    private String ship;
    private int imageBackGround;
    private int imageBicycle;
    private String priceAfter;
    private String priceBefore;

    public Goods(String name, String ship, int imageBackGround, int imageBicycle, String priceAfter, String priceBefore) {
        this.name = name;
        this.ship = ship;
        this.imageBackGround = imageBackGround;
        this.imageBicycle = imageBicycle;
        this.priceAfter = priceAfter;
        this.priceBefore = priceBefore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShip() {
        return ship;
    }

    public void setShip(String ship) {
        this.ship = ship;
    }

    public int getImageBackGround() {
        return imageBackGround;
    }

    public void setImageBackGround(int imageBackGround) {
        this.imageBackGround = imageBackGround;
    }

    public int getImageBicycle() {
        return imageBicycle;
    }

    public void setImageBicycle(int imageBicycle) {
        this.imageBicycle = imageBicycle;
    }

    public String getPriceAfter() {
        return priceAfter;
    }

    public void setPriceAfter(String priceAfter) {
        this.priceAfter = priceAfter;
    }

    public String getPriceBefore() {
        return priceBefore;
    }

    public void setPriceBefore(String priceBefore) {
        this.priceBefore = priceBefore;
    }
}
