package com.smallclover.c;

import java.util.Scanner;

/**
 * 白にするか黒にするか
 * @author smallclover
 * @create 2017-11-01
 * @since
 */
public class C030 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        Integer [][] color = new Integer[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                color[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (color[i][j] >= 128) {
                    if ((w - 1) == j) {
                        System.out.print("1");
                    }else {
                        System.out.print("1" + " ");
                    }
                }else if (color[i][j] <= 127) {
                    if ((w - 1) == j) {
                        System.out.print("0");
                    }else {
                        System.out.print("0" + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}
