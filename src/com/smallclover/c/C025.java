package com.smallclover.c;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ファックスの用紙回収
 * @author smallclover
 * @create 2017-11-10
 * @since
 */
public class C025 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        List<Integer[]> quantities = new ArrayList<Integer[]>();
        for (int i = 0; i < n; i++) {
            Integer[] quantity = new Integer[3];
            quantity[0] = sc.nextInt();
            quantity[1] = sc.nextInt();
            quantity[2] = sc.nextInt();
            quantities.add(quantity);
        }

        int paper = 0;
        int num = 0;
        int time = quantities.get(0)[0];
        int mid_num = 0;
        for (int i = 0; i < quantities.size(); i++) {
            Integer[] quantity = quantities.get(i);
            if (time == quantity[0]) {
                if (quantity[1] <= 59) {
                   paper += quantity[2];
                }
            }else {
                if (paper%m == 0) {
                    mid_num = paper/m;
                }else{
                    mid_num = paper/m + 1;

                }
                num += mid_num;
                paper = 0;
                if (quantity[1] <= 59) {
                    paper += quantity[2];
                }
                mid_num = 0;
                time = quantity[0];
            }
        }
        if (paper%m == 0) {
            mid_num = paper/m;
        }else{
            mid_num = paper/m + 1;

        }
        num += mid_num;
        System.out.println(num);
    }
}
