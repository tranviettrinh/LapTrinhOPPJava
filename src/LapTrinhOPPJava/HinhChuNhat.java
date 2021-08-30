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
public class HinhChuNhat {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner p = new Scanner(System.in);
        int a = p.nextInt();
        int b = p.nextInt();
        if(a<=0||b<=0){
            System.out.println(0);
        }else{
            int c=(a+b)*2;
            int d=a*b;
            System.out.println(c +" "+d);
        }
        

    }
}
