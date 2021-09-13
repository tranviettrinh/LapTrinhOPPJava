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
public class SinhVien {

    private String msv, hoten, lop, ngaysinh;
    private float gba;

    public SinhVien() {
    }

    public SinhVien(String msv, String hoten, String lop, String ngaysinh, float gba) {
        this.msv = msv;
        this.hoten = hoten;
        this.lop = lop;
        this.ngaysinh = ngaysinh;
        this.gba = gba;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public float getGba() {
        return gba;
    }

    public void setGba(float gba) {
        this.gba = gba;
    }

    public String toString() {
        return String.format(msv + " " + hoten + " " + lop + " " + ngaysinh + " " + String.format("%.2f", gba));
    }

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = Integer.parseInt(p.nextLine());
        int u = 0;
        List<SinhVien> list = new ArrayList<>();
        while (u++ < t) {
            String masinhvien = new String();
            if (u < 10) {
                masinhvien = "B20DCCN00".concat(String.valueOf(u));
            } else {
                masinhvien = "B20DCCN0".concat(String.valueOf(u));

            }
            String ten = p.nextLine();
            String lopcn = p.nextLine();
            String ngaysinhtt = p.nextLine();
            String[] tach = ngaysinhtt.split("/");
            if (tach[0].length() == 1) {
                tach[0] = "0".concat(tach[0]);
            }
            if (tach[1].length() == 1) {
                tach[1] = "0".concat(tach[1]);
            }
            String ngaysinhcn = tach[0].concat("/".concat(tach[1].concat("/".concat(tach[2]))));
            float gbacn = Float.parseFloat(p.nextLine());
            SinhVien sv = new SinhVien(masinhvien, ten, lopcn, ngaysinhcn, gbacn);
            list.add(sv);

        }
        for (int i = 0; i < t; i++) {
            System.out.println(list.get(i).toString());
        }
    }
}
