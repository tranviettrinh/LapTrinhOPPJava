/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapTrinhOPPJava.OPP;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author trinhtv.B17AT191
 */
public class NhanVien99 {

    private String id, name, chucvu;
    private int luongcb, songaycong;

    public NhanVien99() {
    }

    public NhanVien99(String id, String name, String chucvu, int luongcb, int songaycong) {
        this.id = id;
        this.name = name;
        this.chucvu = chucvu;
        this.luongcb = luongcb;
        this.songaycong = songaycong;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getChucvu() {
        return chucvu;
    }

    public int getLuongcb() {
        return luongcb;
    }

    public int getSongaycong() {
        return songaycong;
    }

    public String toString() {
        return String.format(id + " " + name + " " + String.valueOf(getPhuCap()) + " " + String.valueOf(getLuongChinh()) + " " + String.valueOf(getTamUng()) + " " + String.valueOf(getConLai()));
    }

    public int getLuongChinh() {
        return luongcb * songaycong;
    }

    public int getPhuCap() {
        switch (chucvu) {
            case "GD":
                return 500;
            case "PGD":
                return 400;
            case "TP":
                return 300;
            case "KT":
                return 250;
            default:
                return 100;

        }
    }

    public int getConLai() {
        return getLuongChinh() - getTamUng() + getPhuCap();
    }

    public int getTamUng() {
        int a = ((getPhuCap() + getLuongChinh()) * 2 / 3 + 500) / 1000 * 1000;
        if (a < 25000) {
            return a;
        } else {
            return 25000;
        }
    }
public int getThuNhap(){
    return getLuongChinh() + getPhuCap();
}
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = Integer.parseInt(p.nextLine());
        int u = 0;
        List<NhanVien99> list = new ArrayList<>();
        while (u++ < t) {
            String id = "NV".concat(String.format("%02d", u));
            String name = p.nextLine();
            String chucvu = p.nextLine();
            int luongcoban = Integer.parseInt(p.nextLine());
            int songaycong = Integer.parseInt(p.nextLine());

            NhanVien99 nv = new NhanVien99(id, name, chucvu, luongcoban, songaycong);
            list.add(nv);
        }
        Comparator<NhanVien99> sortconlai = (o1, o2) -> o2.getThuNhap() > o1.getThuNhap() ? 1 :o2.getThuNhap() == o1.getThuNhap()?0: -1;
        Comparator<NhanVien99> sortma = (o1, o2) -> o1.getId().compareTo(o2.getId());
        list.sort(sortconlai.thenComparing(sortma));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }

    }
}
