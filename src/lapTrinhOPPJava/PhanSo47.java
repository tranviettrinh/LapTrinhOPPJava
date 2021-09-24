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
public class PhanSo47 {

    private long t1, m1, t2, m2;

    public PhanSo47(long t1, long m1, long t2, long m2) {
        this.t1 = t1;
        this.m1 = m1;
        this.t2 = t2;
        this.m2 = m2;
    }

    public long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public long getTu() {
         long a =t1 * m2 + t2 * m1;
         long b = m1 * m2;
         long c = gcd(a, b);
        return a/c;
    }

    public long getMau() {
        long a =t1 * m2 + t2 * m1;
         long b = m1 * m2;
         long c = gcd(a, b);
        return b/c;
    }

    public String toString() {
        return String.format(getTu() + "/" + getMau());
    }

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        PhanSo47 ps = new PhanSo47(p.nextLong(), p.nextLong(), p.nextLong(), p.nextLong());
        System.out.println(ps.toString());
    }
}
