/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xangDau;

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


public static double Thue(int soluong, String c, String d) {
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

    
}
