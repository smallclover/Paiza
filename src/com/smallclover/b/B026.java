package com.smallclover.b;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 自動販売機
 * @author smallclover
 * @create 2017-11-13
 * @since
 */
public class B026 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int v_500 = sc.nextInt();
        int v_100 = sc.nextInt();
        int v_50 = sc.nextInt();
        int v_10 = sc.nextInt();
        int n = sc.nextInt();//人数
        List<Integer[]> x_x = new ArrayList<Integer[]>();
        Integer[] price = new Integer[n];//货物价格
        int r_500 = 500 * v_500;
        int r_100 = 100 * v_100;
        int r_50 = 50 * v_50;
        int r_10 = 10 * v_10;
        int r_r = r_500+r_100+r_50+r_10;
        for (int i = 0; i < n; i++) {
            Integer[] x = new Integer[4];
            price[i] = sc.nextInt();
            x[0] = sc.nextInt();//500
            x[1] = sc.nextInt();//100
            x[2] = sc.nextInt();//50
            x[3] = sc.nextInt();//10
            x_x.add(x);
        }

        for (int i = 0; i < n; i++) {
            Integer[] y = x_x.get(i);
            int money = y[0]*500 + y[1]*100 + y[2]*50 + y[3]*10;
            int give_money = money - price[i];
            if (give_money > r_r) {
                System.out.println("impossible");
            }else {
                int required_500 = give_money/500;
                int required_100 = give_money%500/100;
                int required_50 = give_money%500%100/50;
                int required_10 = give_money%500%100%50/10;
                if (v_500 == required_500){
                    System.out.println(required_500 + " 0 0 0");
                    r_r = r_r - r_500;
                    v_500 = 0;
                    r_500 = 0;
                }else if (v_500 > required_500){

                }
            }
        }
    }
}
