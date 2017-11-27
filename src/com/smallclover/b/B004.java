package com.smallclover.b;

import java.util.Scanner;


/**
 * ログファイルの抽出
 * @author smallclover
 * @create 2017-11-27
 * @since
 */
public class B004 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ips = sc.nextLine();
        int n = Integer.valueOf(sc.nextLine());
        String[] log = new String[n];
        String [] subIp = ips.split("\\.");
        String s = subIp[2];
        String e = subIp[3];
        for (int i = 0; i < log.length; i++) {
            log[i] = sc.nextLine();
        }
        for (int i = 0; i < log.length; i++) {
            String[] show = log[i].split("\\s+");
            //1判断ip形式为x.x.x.x
            if (s.indexOf('[') < 0 && s.indexOf('*') < 0 && e.indexOf('[') < 0 && e.indexOf('*') < 0){
                if (ips.equals(show[0])){
                    System.out.print(ips+" "+show[3].substring(show[3].indexOf('[')+1)+" "+show[6]);
                    System.out.println();
                }
            }
            String[] accessIp = show[0].split("\\.");
            //2判断ip形式为x.x.x.[n-m]
            if (s.indexOf('[') < 0 && s.indexOf('*') < 0 && e.indexOf('[') >= 0){
                String[] e1 = e.split("-");
                if (subIp[0].equals(accessIp[0]) && subIp[1].equals(accessIp[1]) && subIp[2].equals(accessIp[2]) &&
                        Integer.valueOf(accessIp[3]) >= Integer.valueOf(e1[0].substring(e1[0].indexOf('[')+1)) &&
                        Integer.valueOf(accessIp[3]) <= Integer.valueOf(e1[1].substring(0, e1[1].indexOf(']')))){
                    System.out.print(show[0]+" "+show[3].substring(show[3].indexOf('[')+1)+" "+show[6]);
                    System.out.println();
                }
            }
            //3判断ip形式为x.x.x.*
            if (s.indexOf('[') < 0 && s.indexOf('*') < 0 && e.indexOf('*') >= 0){
                if (subIp[0].equals(accessIp[0]) && subIp[1].equals(accessIp[1]) && subIp[2].equals(accessIp[2]) &&
                        Integer.valueOf(accessIp[3]) >= 0 && Integer.valueOf(accessIp[3]) <= 255){
                    System.out.print(show[0]+" "+show[3].substring(show[3].indexOf('[')+1)+" "+show[6]);
                    System.out.println();
                }
            }
            //4判断ip形式为x.x.[n-m].x
            if (s.indexOf('[') >= 0 && e.indexOf('[') < 0 && e.indexOf('*') < 0){
                String[] s1 = s.split("-");
                if (subIp[0].equals(accessIp[0]) && subIp[1].equals(accessIp[1]) && subIp[3].equals(accessIp[3]) &&
                        Integer.valueOf(accessIp[2]) >= Integer.valueOf(s1[0].substring(s1[0].indexOf('[')+1)) &&
                        Integer.valueOf(accessIp[2]) <= Integer.valueOf(s1[1].substring(0, s1[1].indexOf(']')))){
                    System.out.print(show[0]+" "+show[3].substring(show[3].indexOf('[')+1)+" "+show[6]);
                    System.out.println();
                }
            }
            //5判断ip形式为x.x.[n-m].[n-m]
            if (s.indexOf('[') >= 0 && e.indexOf('[') >= 0){
                String[] s1 = s.split("-");
                String[] e1 = e.split("-");
                if (subIp[0].equals(accessIp[0]) && subIp[1].equals(accessIp[1]) &&
                        Integer.valueOf(accessIp[2]) >= Integer.valueOf(s1[0].substring(s1[0].indexOf('[')+1)) &&
                        Integer.valueOf(accessIp[2]) <= Integer.valueOf(s1[1].substring(0, s1[1].indexOf(']')))&&
                        Integer.valueOf(accessIp[3]) >= Integer.valueOf(e1[0].substring(e1[0].indexOf('[')+1)) &&
                        Integer.valueOf(accessIp[3]) <= Integer.valueOf(e1[1].substring(0, e1[1].indexOf(']')))){
                    System.out.print(show[0]+" "+show[3].substring(show[3].indexOf('[')+1)+" "+show[6]);
                    System.out.println();
                }
            }
            //6判断ip形式为x.x.[n-m].*
            if (s.indexOf('[') >= 0 && e.indexOf('*') >= 0){
                String[] s1 = s.split("-");
                if (subIp[0].equals(accessIp[0]) && subIp[1].equals(accessIp[1]) &&
                        Integer.valueOf(accessIp[2]) >= Integer.valueOf(s1[0].substring(s1[0].indexOf('[')+1)) &&
                        Integer.valueOf(accessIp[2]) <= Integer.valueOf(s1[1].substring(0, s1[1].indexOf(']')))&&
                        Integer.valueOf(accessIp[3]) >= 0 &&
                        Integer.valueOf(accessIp[3]) <= 255){
                    System.out.print(show[0]+" "+show[3].substring(show[3].indexOf('[')+1)+" "+show[6]);
                    System.out.println();
                }
            }
            //7判断ip形式为x.x.*.*
            if (s.indexOf('*') >= 0 && e.indexOf('*') >= 0){
                if (subIp[0].equals(accessIp[0]) && subIp[1].equals(accessIp[1]) &&
                        Integer.valueOf(accessIp[2]) >= 0 &&
                        Integer.valueOf(accessIp[2]) <= 255 &&
                        Integer.valueOf(accessIp[3]) >= 0 &&
                        Integer.valueOf(accessIp[3]) <= 255){
                    System.out.print(show[0]+" "+show[3].substring(show[3].indexOf('[')+1)+" "+show[6]);
                    System.out.println();
                }
            }
            //8判断ip形式为x.x.*.x
            if (s.indexOf('*') >= 0 && e.indexOf('[') < 0 && e.indexOf('*') < 0){
                if (subIp[0].equals(accessIp[0]) && subIp[1].equals(accessIp[1]) && subIp[3].equals(accessIp[3]) &&
                        Integer.valueOf(accessIp[2]) >= 0 && Integer.valueOf(accessIp[2]) <= 255){
                    System.out.print(show[0]+" "+show[3].substring(show[3].indexOf('[')+1)+" "+show[6]);
                    System.out.println();
                }
            }
            //9判断ip形式为x.x.*.[n-m]
            if (s.indexOf('*') >= 0 && e.indexOf('[') >= 0){
                String[] e1 = e.split("-");
                if (subIp[0].equals(accessIp[0]) && subIp[1].equals(accessIp[1]) &&
                        Integer.valueOf(accessIp[3]) >= Integer.valueOf(e1[0].substring(e1[0].indexOf('[')+1)) &&
                        Integer.valueOf(accessIp[3]) <= Integer.valueOf(e1[1].substring(0, e1[1].indexOf(']')))&&
                        Integer.valueOf(accessIp[2]) >= 0 &&
                        Integer.valueOf(accessIp[2]) <= 255){
                    System.out.print(show[0]+" "+show[3].substring(show[3].indexOf('[')+1)+" "+show[6]);
                    System.out.println();
                }
            }
        }
    }
}
