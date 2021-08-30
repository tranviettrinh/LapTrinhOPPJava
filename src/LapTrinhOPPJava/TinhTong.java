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
public class TinhTong {
    public static void main(String[] args) {
     Scanner p = new Scanner(System.in);
     int t = p.nextInt();
     while(t-->0){
            long n = p.nextLong();
            long sum =0;
            sum = (n+1)*n/2;
            
            System.out.println(sum);
    }
    }
}
