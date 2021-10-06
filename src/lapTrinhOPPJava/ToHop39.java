/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapTrinhOPPJava;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author trinhtv.B17AT191
 */
public class ToHop39 {

    public static void Res(int k, int[] a) {

        for (int i = 1; i <= k; i++) {
            System.out.print(a[i]);

        }
        System.out.println(" ");
    }

    public static void Try(int i, int n, int k, int[] a) {
        
        for (int j = a[i - 1] + 1; j <= n - k + i; j++) {
            a[i] = j;
            if (i == k) {
                Res(k, a);
               
            } else {
                Try(i + 1, n, k, a);
            }
        }
        
    }

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int[] a = new int[100];
        int n = Integer.parseInt(p.next());
        int k = Integer.parseInt(p.next());
        p.nextLine();
        int dem=0;
        for (int i = 1; i <= k; i++) {
            a[i] = i;
            dem++;
        }
       int b = dem;
        Try(1, n, k, a);
        System.out.println("Tong cong co "+b+" to hop");

    }
}
