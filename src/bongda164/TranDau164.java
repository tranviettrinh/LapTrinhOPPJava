/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bongda164;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author trinhtv.B17AT191
 */
public class TranDau164 {

    private String id, name;
    private long doanhthu;

    public TranDau164() {
    }

    public TranDau164(String id, String name, long doanhthu) {
        this.id = id;
        this.name = name;
        this.doanhthu = doanhthu;
    }

    public long getDoanhthu() {
        return doanhthu;
    }

    @Override
    public String toString() {
        return String.format(id + " " + name + " " + doanhthu);
    }

    public static String TenCLB(List<CLB164> list1, String a) {
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).getId().equalsIgnoreCase(a)) {
                return list1.get(i).getName();
            }
        }
        return null;
    }

    public static int GiaveCLB(List<CLB164> list1, String a) {
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).getId().equalsIgnoreCase(a)) {
                return list1.get(i).getGiave();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = Integer.parseInt(p.nextLine());
        int u = 0;
        List<CLB164> list1 = new ArrayList<>();
        while (u++ < t) {
            String id1 = p.nextLine();
            String ten1 = p.nextLine();
            int gia1 = Integer.parseInt(p.nextLine());
            CLB164 clb = new CLB164(id1, ten1, gia1);
            list1.add(clb);
        }
        int x = Integer.parseInt(p.nextLine());
        int y = 0;
        List<TranDau164> list2 = new ArrayList<>();
        while (y++ < x) {
            String id2 = p.next();
            long soluong = p.nextLong();
            p.nextLine();
            String ten2 = TenCLB(list1, id2.substring(1, 3));
            long doanhthu = GiaveCLB(list1, id2.substring(1, 3)) * soluong;
            TranDau164 td = new TranDau164(id2, ten2, doanhthu);
            list2.add(td);
        }
        list2.sort((o1,o2)-> o1.getDoanhthu()>o2.getDoanhthu()?-1:1);
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i).toString());
        }
    }
}
