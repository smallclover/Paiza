package com.smallclover.c;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 安息の地を求めて
 * @author smallclover
 * @create 2017-11-06
 * @since
 */
public class C010 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();
        List<Integer[]> coordinates = new ArrayList<Integer[]>();
        for (int i = 0; i < n; i++) {
            Integer[] coordinate = new Integer[2];
            coordinate[0] = sc.nextInt();
            coordinate[1] = sc.nextInt();
            coordinates.add(coordinate);
        }

        for (int i = 0; i < coordinates.size(); i++) {
            Integer[] coordinate = coordinates.get(i);
            int x = coordinate[0];
            int y = coordinate[1];
            if (Math.pow((x - a), 2) + Math.pow((y - b), 2) >= Math.pow(r, 2)) {
                System.out.println("silent");
            }else {
                System.out.println("noisy");
            }
        }
    }
}
