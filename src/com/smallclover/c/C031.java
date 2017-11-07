package com.smallclover.c;

import java.util.Scanner;

/**
 * 時差を求めたい
 * @author smallclover
 * @create 2017-11-07
 * @since
 */
public class C031 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            Integer[] time = new Integer[n];
            String[] city = new String[n];
            int key = 0;
            for (int i = 0; i < n; i++) {
                city[i] = sc.next();
                time[i] = sc.nextInt();
            }
            String str1 = sc.next();
            String str2 = sc.next();

            for (int i = 0; i < city.length; i++) {
                if (city[i].equals(str1)) {
                    key = i;
                }
            }
            String minute = str2.split(":")[1];
            String hour = str2.split(":")[0];
            for (int i = 0; i < time.length; i++) {
                if (i == key){
                    System.out.println(str2);
                }else {
                    int value = time[i] - time[key];
                    int h = value + Integer.valueOf(hour);
                    if (h < 0){
                        int h1 = h +  24;
                        System.out.println(h1 >= 10 ? (h1+":"+minute):("0"+h1+":"+minute));
                    }else {
                        if (h >= 24){
                            int h1 = h - 24;
                            System.out.println(h1 >= 10 ? (h1+":"+minute):("0"+h1+":"+minute));
                        }else {
                            System.out.println(h >= 10 ? (h+":"+minute):("0"+h+":"+minute));
                        }
                    }
                }
            }
        }
}
