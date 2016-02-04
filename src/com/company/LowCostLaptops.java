package com.company;

/**
 * Created by Max on 01.02.2016.
 */
public class LowCostLaptops extends Laptops {
    public boolean dvd_rom;


    public LowCostLaptops() {}

    public LowCostLaptops(double price, String name, double sum_price, int count, boolean dvd_rom) {
        super(price, name, sum_price, count);
        this.dvd_rom = dvd_rom;
    }

    public LowCostLaptops(double price, String name, boolean dvd_rom) {
        super(price, name, sum_price, count);
        this.dvd_rom = dvd_rom;
    }

    public boolean isDvd_rom() {
        return dvd_rom;
    }

    public void setDvd_rom(boolean dvd_rom) {
        this.dvd_rom = dvd_rom;
    }

    public String check(boolean dvd_rom){
        if(dvd_rom == true) return "DVD-ROM in there";
        else return "DVD-ROM not found";
    }

    public static void average_price()
    {
        double average=0;

    }

    @Override
    public String toString() {
        return "\nLowCostLaptop: " +
                "\nName: " + name +
                "\nPrice: "+ price +
                "\ndvd_rom: " + check(dvd_rom);
    }
}
