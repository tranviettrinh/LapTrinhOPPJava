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
public class SoChinhPhuong79 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = Integer.parseInt(p.nextLine());
        int u=0;
        while(u++<t){
            String n = p.nextLine();
            int sqr = (int) Math.sqrt(Integer.parseInt(n));
            if(sqr*sqr == Integer.parseInt(n))
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
