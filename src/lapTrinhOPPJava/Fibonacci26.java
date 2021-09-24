/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapTrinhOPPJava;

import java.util.Scanner;

/**
 *
 * @author trinhtv.B17AT191
 */
public class Fibonacci26 {
    public static long fibonacci(int n) {
        long f0 = 0;
        long f1 = 1;
        long fn = 1;
 
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }
    public static String getYesNo(long a){
        for(int i=0; fibonacci(i)<=a;i++){
            if(fibonacci(i)==a) return "YES";            
        }
        return "NO";
    }
    public static void main(String[] args) {
        Scanner p =new Scanner(System.in);
        int t = Integer.parseInt(p.nextLine());
        int u=0;
        while(u++<t){
            System.out.println(getYesNo(p.nextLong()));
        }
    }
        
}
