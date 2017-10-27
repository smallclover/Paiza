package com.smallclover.c;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * メダルランキングの作成
 * @author smallclover
 * @create 2017-10-27
 * @since
 */
public class C041 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer[]> list = new ArrayList<Integer[]>();

        for (int i = 0; i < n; i++) {
            Integer[] num = new Integer[3];
            num[0] = sc.nextInt();
            num[1] = sc.nextInt();
            num[2] = sc.nextInt();
            list.add(num);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j ++){
                if (list.get(j - 1)[0] > list.get(j)[0]) {

                }else if (list.get(j - 1)[0] < list.get(j)[0]){
                    Integer[] data = list.get(j - 1);
                    list.set(j - 1, list.get(j));
                    list.set(j, data);
                }else {
                    if (list.get(j - 1)[1] > list.get(j)[1]) {

                    }else if (list.get(j - 1)[1] < list.get(j)[1]){
                        Integer[] data = list.get(j - 1);
                        list.set(j - 1, list.get(j));
                        list.set(j, data);
                    }else {
                        if (list.get(j - 1)[2] > list.get(j)[2]) {

                        }else if (list.get(j - 1)[2] < list.get(j)[2]){
                            Integer[] data = list.get(j - 1);
                            list.set(j - 1, list.get(j));
                            list.set(j, data);
                        }else {

                        }
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(list.get(i)[0] + " ");
            System.out.print(list.get(i)[1] + " ");
            System.out.println(list.get(i)[2]);
        }

    }
}
