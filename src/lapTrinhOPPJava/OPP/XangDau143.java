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
public class XangDau143 {

    private String id, name, dongia, thue;
    private double tongtien;
    private int soluong;

    public XangDau143() {
    }

    public XangDau143(String id, String name, String dongia, String thue, double tongtien, int soluong) {
        this.id = id;
        this.name = name;
        this.dongia = dongia;
        this.thue = thue;
        this.tongtien = tongtien;
        this.soluong = soluong;
    }

    public double getTongtien() {
        return tongtien;
    }

    @Override
    public String toString() {
        return String.format(id + " " + name + " " + dongia + " " + thue + " " + String.format("%.0f",tongtien));
    }

    public static String TenHang(String a) {
        switch (a) {
            case "BP":
                return "British Petro";
            case "ES":
                return "Esso";
            case "SH":
                return "Shell";
            case "CA":
                return "Castrol";
            case "MO":
                return "Mobil";
            case "TN":
                return "Trong Nuoc";
            default:
                return null;

        }
    }


private static double Thue(int soluong, String c, String d) {
        if (d.equalsIgnoreCase("TN")) {
            return 0;
        } else {
            switch (c) {
                case "X":
                    return (soluong * 128000 * 3 / 100);

                case "D":

                    return (soluong * 11200 * 35 / 1000);

                case "N":

                    return (soluong * 9700 * 2 / 100);

                default:
                    return 0;

            }

        }
    }
    public static long DonGia(String c) {
        switch (c) {
            case "X":
                return 128000;
            case "D":
                return 11200;
            case "N":
                return 9700;
            default:
                return 0;
        }
    }

    public static void main(String[] args){
        Scanner p = new Scanner(System.in);
        int t = Integer.parseInt(p.nextLine());
        int u = 0;
        List<XangDau143> list = new ArrayList<>();
        while (u++ < t) {
            String id = p.next();
            int m = id.length();
            int soluong = Integer.parseInt(p.next());
            p.nextLine();
            String name = TenHang(id.substring(3, 5));
            String dongia = String.valueOf(DonGia(id.substring(0, 1)));

            String thue = String.format("%.0f",Thue(soluong, id.substring(0, 1),id.substring(m-2)));           
           
            double tongtien = (Thue(soluong, id.substring(0, 1),id.substring(m-2)) + DonGia(id.substring(0, 1)) * soluong);
            XangDau143 xd = new XangDau143(id, name, dongia, thue, tongtien, soluong);
            list.add(xd);

        }
//        list.sort((o1,o2)-> o1.getTongtien()>o2.getTongtien()?-1:o1.getTongtien()==o2.getTongtien()?0:1);
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i).toString());
        }
    }
}
