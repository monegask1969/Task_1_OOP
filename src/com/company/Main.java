package com.company;

import java.util.Scanner;

import static com.company.Add_element.add_element;
import static com.company.Printer.printer;
import static com.company.Sorter_price.quickSort;

/**
 * Created by Max on 02.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter quantity of laptops: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Laptops[] container = new Laptops[n];

        System.out.println("Please, enter the number of action:");
        System.out.println("0. Exit.\n" +
                "1. Add new element.\n" +
                "2. Sort the array by price.\n" +
                "3. Print the array.\n");

        int chooser=scanner.nextInt();

        for (int i = chooser; i != 0; i++) {
            System.out.println("Please, enter the number of action:");
            System.out.println("0. Exit.\n" +
                    "1. Add new element.\n" +
                    "2. Sort the array by price.\n" +
                    "3. Print the array.\n");

            chooser = scanner.nextInt();

            switch (chooser){
                case 0: System.exit(0);
                case 1: add_element(container,n);
                case 2: quickSort(container);
                case 3: printer(container);
            }
        }


    }



    public void Print(Laptops[] container)
    {
        for (int i = 0; i < container.length; i++) {
            container[i].toString();
        }
    }

}
