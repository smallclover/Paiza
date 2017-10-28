package com.smallclover.c;

import java.util.Scanner;

/**
 * ロジサマコラボ問題
 * @author smallclover
 * @create 2017-10-28
 * @since
 */
public class C040 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Double[] le = new Double[n];
        Double[] ge = new Double[n];
        for (int i = 0; i < n; i++) {
            le[i] = 0.0;
            ge[i] = 0.0;
        }
        for (int i = 0; i < n; i++) {
            String type = sc.next();
            if (type.equals("le")) {
                le[i] = sc.nextDouble();
            }else {
                ge[i] = sc.nextDouble();
            }
        }

        Double max = 0.0;
        Double min = 200.0;

        for (int i = 0; i < n; i ++){

            if (ge[i] == 0){
                continue;
            }

            if (ge[i] < max){

            }else if(ge[i] >= max){
                max = ge[i];
            }
        }

        for (int i = 0; i < n; i ++){
            if (le[i] == 0) {
                continue;
            }

            if (le[i] > min){

            }else if(le[i] <= min){
                min = le[i];
            }
        }
        System.out.println(max + " " + min);
    }
}
