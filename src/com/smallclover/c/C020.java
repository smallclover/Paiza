package com.smallclover.c;

import java.util.Scanner;

/**
 * 残り物の量
 * @author smallclover
 * @create 2017-11-02
 * @since
 */
public class C020 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();
        double result = (m -  m * (p *0.01)) - (m -  m * (p *0.01))*(q*0.01);
        String str = String.format("%.4f", result);//
        System.out.println(str);
    }
}
