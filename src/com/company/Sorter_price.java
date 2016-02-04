package com.company;

/**
 * Created by Max on 02.02.2016.
 */
public class Sorter_price {
    public static void quickSort(Laptops[] container) {
        int startIndex = 0;
        int endIndex = container.length - 1;
        doSort(startIndex, endIndex,container);
    }

    private static void doSort(int start, int end, Laptops[] container) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (container[i].price <= container[cur].price)) {
                i++;
            }
            while (j > cur && (container[cur].price <= container[j].price)) {
                j--;
            }
            if (i < j) {
                double temp = container[i].price;
                container[i].price = container[j].price;
                container[j].price = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSort(start, cur, container);
        doSort(cur+1, end, container);

        System.out.println("Laptops were sorted by price.");

        for (int k = 0; k < container.length; k++) {
            container[i].toString();
        }
    }


}
