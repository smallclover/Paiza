package com.smallclover.c;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ハイスコアランキング
 * @author smallclover
 * @create 2017-11-09
 * @since
 */
public class C006 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        Double [] ci = new Double[n];
        for (int i = 0; i < ci.length; i++) {
            ci[i] = sc.nextDouble();
        }
        List<Integer []> userScores = new ArrayList<Integer[]>();
        for (int i = 0; i < m; i++) {
            Integer [] userScore = new Integer[n];
            for (int j = 0; j < n; j++) {
                userScore[j] = sc.nextInt();
            }
            userScores.add(userScore);
        }
        Long[] result = new Long[m];
        for (int i = 0; i < m; i++) {
            Integer[] userScore = userScores.get(i);
            Double cache = 0.0;
            for (int j = 0; j < userScore.length; j++) {
                 cache += userScore[j]*ci[j];
            }
            result[i] = Math.round(cache);
        }

        bubbleSort(result);
        for (int i = 0; i < k; i++) {
            System.out.println(result[i]);
        }
    }

    public  static void bubbleSort(Long[]a){
        Long temp = 0L;
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]<a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
}
