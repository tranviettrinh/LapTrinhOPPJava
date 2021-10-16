/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanao183;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author trinhtv.B17AT191
 */
public class HoaDon {

    private String ma, ten;
    private long giam, tra;

    public HoaDon(String ma, String ten, long giam, long tra) {
        this.ma = ma;
        this.ten = ten;
        this.giam = giam;
        this.tra = tra;
    }

    public HoaDon() {
    }

    public long getGiam() {
        return giam;
    }

    public long getTra() {
        return tra;
    }

    @Override
    public String toString() {
        return String.format(ma + " " + ten + " " + giam + " " + tra);
    }

    public static long BangTinh(int a,long b) {
        if (a >= 150) {
            return (long) (b * 50 / 100);
        } else if (a >= 100) {
            return (long) (b * 30 / 100);
        } else if (a >= 50) {
            return (long) (b * 15 / 100);
        } else {
            return b;
        }
    }

    public static String getNamebyID(List<QuanAo184> list1, String a) {
        for (int i = 0; i < list1.size(); i++) {
            if (a.equalsIgnoreCase(list1.get(i).getId())) {
                return list1.get(i).getName();
            }
        }
        return null;
    }

    public static long getDonGiaByID(List<QuanAo184> list1, String a, int b) {
        for (int i = 0; i < list1.size(); i++) {
            if (a.equalsIgnoreCase(list1.get(i).getId()) && (b == 1)) {
                return list1.get(i).getDongia1();
            }
            if (a.equalsIgnoreCase(list1.get(i).getId()) && (b == 2)) {
                return list1.get(i).getDongia2();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = Integer.parseInt(p.nextLine());
        int u = 0;
        List<QuanAo184> list1 = new ArrayList<>();
        while (u++ < t) {
            String id = p.nextLine();
            String name = p.nextLine();
            int dongia1 = Integer.parseInt(p.nextLine());
            int dongia2 = Integer.parseInt(p.nextLine());
            QuanAo184 qa = new QuanAo184(id, name, dongia1, dongia2);
            list1.add(qa);
        }
        int x = Integer.parseInt(p.nextLine());
        int y = 0;
        List<HoaDon> list2 = new ArrayList<>();
        while (y++ < x) {
            String maId = p.next();
            int soluong = p.nextInt();
            p.nextLine();
            
            String ma = maId.concat("-".concat(String.format("%03d", y)));
            String ten = getNamebyID(list1, maId.substring(0, 2));
            long dongia = getDonGiaByID(list1, maId.substring(0, 2), Integer.parseInt(maId.substring(2)));
            long giamgia = (long) (BangTinh(soluong,(long)soluong*dongia));
            long tragia = (long) ((long)soluong * dongia - giamgia);
            HoaDon hd = new HoaDon(ma, ten, giamgia, tragia);
            list2.add(hd);
        }
        list2.sort((o1,o2)-> o1.getTra()>o2.getTra()?-1:1);
        for(int j=0; j<list2.size();j++){
            System.out.println(list2.get(j).toString());
        }
    }
}
