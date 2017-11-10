package com.smallclover.c;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ウサギと人参
 * @author smallclover
 * @create 2017-11-10
 * @since
 */
public class C026 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int p = sc.nextInt();
        Integer [] result = new Integer[n];
        List<Integer[]> a = new ArrayList<Integer[]>();
        for (int i = 0; i < n; i++) {
            Integer[] b = new Integer[2];
            b[0] = sc.nextInt();
            b[1] = sc.nextInt();
            a.add(b);
        }
        int weight = 0;
        boolean flag_1 = false;
        int flag_2 = 0;
        for (int i = 0; i < a.size(); i++) {
            Integer[] d = a.get(i);
            if (d[1] >= (s - p) && d[1] <= (s + p)) {
                if (flag_2 == 0){
                    weight = d[0];
                }
                flag_2 = 1;
                if (d[0] < weight) {
                    continue;
                }else{
                    result[i] = d[0];
                    flag_1 = true;
                }
            }
        }
        int mid_result = 0;
        int mid_i = 0;
        int flag = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] != null) {
                if (flag == 0){
                    mid_result = result[i];
                    mid_i = i;
                }
                flag = 1;
                if (result[i] > mid_result) {
                    mid_result = result[i];
                    mid_i = i;
                }
            }
        }
        if (flag_1) {
            System.out.println(mid_i + 1);
        }else {
            System.out.println("not found");
        }
    }
}
