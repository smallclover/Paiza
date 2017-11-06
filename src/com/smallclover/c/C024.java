package com.smallclover.c;

import java.util.Scanner;

/**
 * ミニ・コンピュータ
 * @author smallclover
 * @create 2017-11-06
 * @since
 */
public class C024 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int var_1 = 0;
            int var_2 = 0;
            for (int i = 0; i < n; i++) {
                String operation = sc.next();
                if (operation.equals("SET")) {
                    int var = sc.nextInt();
                    if (var == 1) {
                        var_1 = sc.nextInt();
                    }else {
                        var_2 = sc.nextInt();
                    }
                }else if (operation.equals("SUB")){
                    int a = sc.nextInt();
                    var_2 = var_1 - a;
                }else {
                    int a = sc.nextInt();
                    var_2 = var_1 + a;
                }
            }
            System.out.println(var_1 +" " + var_2);
        }

}
