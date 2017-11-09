package com.smallclover.c;

import java.util.Scanner;

/**
 * 何人前作れる？
 * @author smallclover
 * @create 2017-11-09
 * @since
 */
public class C018 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] bn = new String[n];
        Integer[] bn2 = new Integer[n];
        for (int i = 0; i < n; i++) {
            bn[i] = sc.next();
            bn2[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        String[] mm = new String[m];
        Integer[] mm2 = new Integer[m];
        for (int i = 0; i < m; i++) {
            mm[i] = sc.next();
            mm2[i] = sc.nextInt();
        }
        int p = 0;
        int num = 0;
        int flag = 0;
        if (n <= m){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (bn[i].equals(mm[j])) {
                        if (bn2[i] <= mm2[j]) {
                            int c = mm2[j]/bn2[i];
                            if (i == 0 && flag == 0){
                                p = c;
                            }
                            if (c <= p) {
                                p = c;
                            }
                            num ++;
                            flag++;
                        }else {
                            System.out.println(0);
                            return;
                        }
                    }
                }
            }
            if (num == n){
                System.out.println(p);
            }else {
                System.out.println(0);
            }
        }else {
            System.out.println(0);
        }
    }
}
