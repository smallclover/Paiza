package com.smallclover.c;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * お得な買い物
 * @author smallclover
 * @create 2017-11-06
 * @since
 */
public class C032 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            List<Integer[]> points = new ArrayList<Integer[]>();
            for (int i = 0; i < n; i++) {
                Integer[] point = new Integer[4];
                int type = sc.nextInt();
                int price = sc.nextInt();
                switch (type){
                    case 0:{
                        point[0] = price;
                        break;
                    }
                    case 1:{
                        point[1] = price;
                        break;
                    }
                    case 2:{
                        point[2] = price;
                        break;
                    }
                    case 3:{
                        point[3] = price;
                        break;
                    }
                    default:
                }
                points.add(point);
            }

            Integer[] calc = new Integer[]{0, 0, 0, 0};

            int sumPoint = 0;
            for (int i = 0; i < points.size(); i++) {
                Integer[] point = points.get(i);
                if (point[0] == null || point[0] == 0){

                }else {
                    calc[0] += point[0];
                    continue;
                }

                if (point[1] == null || point[1] == 0){

                }else {
                    calc[1] += point[1];
                    continue;
                }

                if (point[2] == null || point[2] == 0){

                }else {
                    calc[2] += point[2];
                    continue;
                }

                if (point[3] == null || point[3] == 0){

                }else {
                    calc[3] += point[3];
                    continue;
                }
            }
            sumPoint = calc[0]/100*5 + calc[1]/100*3 + calc[2]/100*2 + calc[3]/100*1;
            System.out.println(sumPoint);
        }
}
