package com.smallclover.c;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ローソク足
 * @author smallclover
 * @create 2017-11-05
 * @since
 */
public class C022 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer[]> prices = new ArrayList<Integer[]>();

        for (int i = 0; i < n; i++) {
            Integer [] price = new Integer[4];
            price[0] = sc.nextInt();
            price[1] = sc.nextInt();
            price[2] = sc.nextInt();
            price[3] = sc.nextInt();
            prices.add(price);
        }

        System.out.print(prices.get(0)[0] + " " + prices.get(prices.size() - 1)[1] + " ");
        int max = prices.get(0)[2];
        int min = prices.get(0)[3];
        for (int i = 0; i < prices.size(); i++) {
            Integer[] price = prices.get(i);
            if (max < price[2]) {
                max = price[2];
            }else {

            }

            if (min > price[3]) {
                min = price[3];
            }else {

            }
        }
        System.out.println(max + " " + min);
    }
}
