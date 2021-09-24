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
public class TongGiaiThua61 {
    public static long GiaiThua(int n){
        long sum =0;
        long t=1;
        for(int i=1;i<n+1;i++){
            t=t*i;
            sum = sum +t;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        long a = GiaiThua(p.nextInt());
        System.out.println(a);
    }
}
