package com.smallclover.c;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 暴風域にいますか？
 * @author smallclover
 * @create 2017-11-03
 * @since
 */
public class C021 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int xc = sc.nextInt();
        int yc = sc.nextInt();
        int r_1 = sc.nextInt();
        int r_2 = sc.nextInt();
        int n = sc.nextInt();
        List<Integer[]> places = new ArrayList<Integer[]>();
        for (int i = 0; i < n; i++) {
            Integer[] place = new Integer[2];
            place[0] = sc.nextInt();
            place[1] = sc.nextInt();
            places.add(place);
        }
        int r_r_1 = (int)Math.pow(r_1, 2);
        int r_r_2 = (int)Math.pow(r_2, 2);
        for (int i = 0; i < places.size(); i++) {
            Integer [] place = places.get(i);
            int x = place[0];
            int y = place[1];
            int mid = (int)(Math.pow(x - xc, 2) + Math.pow(y - yc, 2));
            if (mid >= r_r_1 && mid <= r_r_2){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }
    }
}
