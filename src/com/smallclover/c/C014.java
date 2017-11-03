package com.smallclover.c;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ボールが入る箱
 * @author smallclover
 * @create 2017-11-03
 * @since
 */
public class C014 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        List<Integer[]> boxs = new ArrayList<Integer[]>();
        for (int i = 0; i < n; i++) {
            Integer[] box = new Integer[3];
            box[0] = sc.nextInt();
            box[1] = sc.nextInt();
            box[2] = sc.nextInt();
            boxs.add(box);
        }

        for (int i = 0; i < boxs.size(); i++) {
            Integer[] box = boxs.get(i);

            if (box[0] >= 2*r && box[1] >= 2*r && box[2] >= 2*r){
                System.out.println(i + 1);
            }else {
                continue;
            }
        }
    }
}
