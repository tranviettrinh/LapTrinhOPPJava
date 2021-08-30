/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LapTrinhOPPJava;

import java.util.Scanner;

/**
 *
 * @author trinhtv.B17AT191
 */
public class BCNN_UCLN {
    public static void main(String[] args) {
     Scanner p = new Scanner(System.in);
     int t = p.nextInt();
     while(t>0 && t<=100){
            long n = p.nextLong();
            long m = p.nextLong();
            if(n>=1 && m<=100000000){
                long x = USCLN(n,m);
                long y = BSCNN(n,m);
                System.out.println(y+" "+x);
                t--; 
            }            
    }
    }
    
    public static long USCLN(long a, long b) {
        long t1 = a;
        long t2 = b;
        while (t1 != t2) {
            if (t1 > t2) {
                t1 -= t2;
            } else {
                t2 -= t1;
            }
        }       
        return t1;
    }
    public static long BSCNN(long a, long b) {
        return (a * b) / USCLN(a, b);
    }
}
