/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LapTrinhOPPJava;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author trinhtv.B17AT191
 */
public class ChiaTamGiac {
    public static void main(String[] args) {
        DecimalFormat dou = new DecimalFormat("0.000000");
        Scanner p = new Scanner(System.in);
        int t = p.nextInt();
        while(t-->0){
            double a = p.nextDouble();
            double b = p.nextDouble();
            for(int i=1;i<a;i++){
                double x = Math.sqrt((double)i/a);
                double res = x*b;
                System.out.println(dou.format(res));
            }
    }
    }
}
