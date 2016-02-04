package com.company;

/**
 * Created by Max on 01.02.2016.
 */
public abstract class Laptops {
    protected double price;
    protected String name;
    protected static double sum_price;
    protected static int count;

    public Laptops() { }

    public Laptops(double price, String name, double sum_price, int count) {
        this.price = price;
        this.name = name;
        this.sum_price = sum_price;
        this.count = count;
        count++;
        sum_price +=price;
    }

    static public double getAverageSum()
    {
        return sum_price/count;
    }

}
