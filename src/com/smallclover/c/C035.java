package com.smallclover.c;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 試験の合格判定
 * @author smallclover
 * @create 2017-11-11
 * @since
 */
public class C035 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] type = new String[n];
        List<Integer[]> score = new ArrayList<Integer[]>();
        for (int i = 0; i < n; i++) {
            type[i] = sc.next();
            Integer[] s = new Integer[5];
            for (int j = 0; j < 5; j++) {
                s[j] = sc.nextInt();
            }
            score.add(s);
        }

        int pass = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            Integer [] a = score.get(i);
            String h = type[i];
            if (h.equals("s")) {
                for (int j = 0; j < a.length; j++) {
                    sum += a[j];
                }
                if (sum >= 350){
                    if (a[1] + a[2] >= 160) {
                        pass++;
                    }else {

                    }
                }else {

                }
            }else {
                for (int j = 0; j < a.length; j++) {
                    sum += a[j];
                }
                if (sum >= 350){
                    if (a[3] + a[4] >= 160) {
                        pass++;
                    }else {

                    }
                }else {

                }
            }
        }
        System.out.println(pass);
    }
}
