/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapTrinhOPPJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author trinhtv.B17AT191
 */
public class PhanSo154 {

    private String c, d;

    public PhanSo154(String c, String d) {
        this.c = c;
        this.d = d;
    }

    public static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static String getSoC(long a1, long a2, long b1, long b2) {
        long c1 = a1 * b2 + a2 * b1;
        long c2 = a2 * b2;
        long gcd1 = gcd(c1 * c1, c2 * c2);
        long tu = c1 * c1 / gcd1;
        long mau = c2 * c2 / gcd1;
        return String.format(tu + "/" + mau);
    }

    public static String getSoD(long a1, long a2, long b1, long b2, long c1, long c2) {
        long d1 = a1 * b1 * c1;
        long d2 = a2 * b2 * c2;
        long gcd2 = gcd(d1, d2);
        long tu = d1 / gcd2;
        long mau = d2 / gcd2;
        return String.format(tu + "/" + mau);
    }

    public String toString() {
        return String.format(c + " " + d);
    }

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = Integer.parseInt(p.nextLine());
        int u = 0;
        List<PhanSo154> list = new ArrayList<>();
        while (u++ < t) {
            int a1 = p.nextInt();
            int a2 = p.nextInt();
            int b1 = p.nextInt();
            int b2 = p.nextInt();
            p.nextLine();
            String c = getSoC(a1, a2, b1, b2);
            String[] tach = c.split("/");
            long c1 = Long.parseLong(tach[0]);
            long c2 = Long.parseLong(tach[1]);
            String d = getSoD(a1, a2, b1, b2, c1, c2);
            PhanSo154 ps = new PhanSo154(c, d);
            list.add(ps);

        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }
}
