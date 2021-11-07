/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapTrinhOPPJava;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author trinhtv.B17AT191
 */
public class ChiaHet77 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = Integer.parseInt(p.nextLine());
        int u=0;
        while(u++<t){
        String a = p.next();
        String b = p.next();
        BigInteger x = new BigInteger(a);
        BigInteger y = new BigInteger(b);
            p.nextLine();
        
        BigInteger du1 = x.mod(y);
        String du3 = String.valueOf(du1);
           
        BigInteger du2  = y.mod(x);
        String du4 = String.valueOf(du2);

        if(du3.equalsIgnoreCase("0")|| du4.equalsIgnoreCase("0")) System.out.println("YES");
        else System.out.println("NO");
        }
    }
}
