/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapTrinhOPPJava.OPP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author trinhtv.B17AT191
 */
public class HocBongSV193 {

    private String name, rank;
    float gba;
    int point;

    public HocBongSV193(String name, float gba, int point, String rank) {
        this.name = name;
        this.gba = gba;
        this.point = point;
        this.rank = rank;
    }

    public float getGba() {
        return gba;
    }

    public static String XepHang(float a, int b) {
        if (a >= 3.6 && b >= 90) {
            return "XUATSAC";
        } else if (a >= 3.2 && b >= 80) {
            return "GIOI";
        } else if (a >= 2.5 && b >= 70) {
            return "KHA";
        } else {
            return "KHONG";
        }
    }

    public static float[] getAllRanhks(List<HocBongSV193> a) {
        List<HocBongSV193> b = new ArrayList<>();
        b.addAll(a);
        b.sort((o1, o2) -> o2.getGba() > o1.getGba() ? 1 : -1);

        int n = b.size();
        float[] d = new float[n];
        for (int i = 0; i < n; i++) {
            d[i] = b.get(i).getGba();

        }
        return d;
    }

    @Override
    public String toString() {
        return String.format(name + ": " + rank);
    }

    public String toString1() {
        return String.format(name + ": KHONG");
    }

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        List<HocBongSV193> list = new ArrayList<>();
        int t = p.nextInt();
        int a = p.nextInt();
        p.nextLine();
        int u = 0;
        while (u++ < t) {
            String ten = p.nextLine();
            float diemTL = p.nextFloat();
            int diemRL = p.nextInt();
            p.nextLine();
            String xephang = XepHang(diemTL, diemRL);
            HocBongSV193 sv = new HocBongSV193(ten, diemTL, diemRL, xephang);
            list.add(sv);
        }
        float[] r = getAllRanhks(list);
        int n = list.size();
        for (int i = 0; i < n; i++) {
            if (list.get(i).getGba() >= r[a - 1]) {
                System.out.println(list.get(i).toString());
            } else {
                System.out.println(list.get(i).toString1());
            }

        }

    }
}
