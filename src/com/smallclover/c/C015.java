package com.smallclover.c;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ポイントカードの計算
 * @author smallclover
 * @create 2017-11-03
 * @since
 */
public class C015 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer[]> a = new ArrayList<Integer[]>();
        for (int i = 0; i < n; i++) {
            Integer[] b = new Integer[2];
            b[0] = sc.nextInt();
            b[1] = sc.nextInt();
            a.add(b);
        }
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            Integer[] b = a.get(i);
            if (b[0] == 3 || b[0] == 13 || b[0] == 23 || b[0] == 30 || b[0] == 31) {
                sum += Math.floor(0.03 * b[1]);
            }else if (b[0] == 5 || b[0] == 15 || b[0] == 25) {
                sum += Math.floor(0.05 * b[1]);
            }else {
                sum += Math.floor(0.01 * b[1]);
            }
        }
        System.out.println(sum);
    }
}
