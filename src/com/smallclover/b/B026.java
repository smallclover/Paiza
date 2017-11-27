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
            int required_500 = give_money/500;
            int required_100 = give_money%500/100;
            int required_50 = give_money%500%100/50;
            int required_10 = give_money%500%100%50/10;

            if (v_500 * 500 + v_100 * 100 + v_50 * 50 + v_10 * 10 >= give_money){

                if (v_500 >= required_500){
                    v_500 -= required_500;
                }else {
                    if (required_500 != 0){
                        required_100 += Math.abs(v_500-required_500)*500/100;
                        required_500 = v_500;
                        v_500 = 0;
                    }
                }

                if (v_100 >= required_100){
                    v_100 -= required_100;
                }else {
                    if (required_100 != 0){
                        required_50 += Math.abs(v_100-required_100)*100/50;
                        required_100 = v_100;
                        v_100 = 0;
                    }
                }

                if (required_50 >= 3){
                    System.out.println("impossible");
                    continue;
                }

                if (v_50 >= required_50){
                    if (required_50 == 2){
                        System.out.println("impossible");
                        continue;
                    }
                    v_50 -= required_50;

                }else {
                    if (required_50 != 0){
                        required_10 += Math.abs(v_50 - required_50)*50/10;
                        required_50 = v_50;
                        v_50 = 0;
                    }
                }
                if (required_10 >= 10){
                    System.out.println("impossible");
                    continue;
                }

                if (v_10 >= required_10){
                    v_10 -= required_10;
                }else {
                    System.out.println("impossible");
                    continue;
                }
                v_500 += y[0];
                v_100 += y[1];
                v_50 += y[2];
                v_10 += y[3];
                System.out.println(required_500+" "+required_100+" "+required_50+" "+required_10);
            }else {
                System.out.println("impossible");
                continue;
            }
        }
    }
}
