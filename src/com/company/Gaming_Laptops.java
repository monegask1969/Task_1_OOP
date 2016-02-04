package com.company;

/**
 * Created by Max on 01.02.2016.
 */
public class Gaming_Laptops extends Laptops {
    private double screen_diagonal;
    private int RAM;

    public Gaming_Laptops() {}

    public Gaming_Laptops(double price, String name, double sum_price, int count, double screen_diagonal, int RAM) {
        super(price, name, sum_price, count);
        this.screen_diagonal = screen_diagonal;
        this.RAM = RAM;
    }

    public Gaming_Laptops(double price, String name, double screen_diagonal, int RAM) {
        super(price, name, sum_price, count);
        this.screen_diagonal = screen_diagonal;
        this.RAM = RAM;
    }

    public double getScreen_diagonal() {
        return screen_diagonal;
    }

    public void setScreen_diagonal(double screen_diagonal) {
        this.screen_diagonal = screen_diagonal;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    @Override
    public String toString() {
        return "\nGaming_Laptop:" +
                "\n Name: " + name +
                "\n Price: " + price +
                "\n screen_diagonal: " + screen_diagonal +
                "\n RAM: " + RAM;
    }
}
