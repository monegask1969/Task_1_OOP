package com.company;

import java.util.Scanner;

/**
 * Created by Max on 03.02.2016.
 */
public class Add_element {
    public static Laptops add_element(Laptops[] container, int n)
    {
        System.out.println("Please choose Your type of laptop:\n" +
                           "1. Gaming Laptop.\n" +
                           "2. Low Cost Laptop.\n");
        Scanner scanner = new Scanner(System.in);
        int laptop = scanner.nextInt();
        if(laptop == 1)
        {
            n++;
            System.out.println("Please enter the name of laptop");
            String name = scanner.nextLine();
            System.out.println("Please enter price of laptop: ");
            double price = scanner.nextDouble();
            System.out.println("Enter screen diagonal: ");
            double screen_diagonal = scanner.nextDouble();
            System.out.println("Enter quantity of RAM: ");
            int RAM = scanner.nextInt();
            container[n] = new Gaming_Laptops(price,name,screen_diagonal,RAM);
        }
        if(laptop == 2)
        {
            n++;
            System.out.println("Please enter the name of laptop");
            String name = scanner.nextLine();
            System.out.println("Please enter price of laptop: ");
            double price = scanner.nextDouble();
            System.out.println("Enter the availability of DVD-ROM: ");
            boolean dvd_rom = scanner.hasNext();
            container[n] = new LowCostLaptops(price,name,dvd_rom);
        }

        else
        {
            System.out.println("You wrote incorrect type!");
        }

        return container[n];

    }
}
