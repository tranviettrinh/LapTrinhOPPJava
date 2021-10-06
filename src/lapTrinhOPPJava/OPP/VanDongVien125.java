/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapTrinhOPPJava.OPP;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author trinhtv.B17AT191
 */
public class VanDongVien125 {

    private String id, name, ngaysinh, bd, kt, kc1, uutien, kc2;
    private float g;

    public VanDongVien125() {
    }

    public VanDongVien125(int n, String name, String ngaysinh, String bd, String kt, String kc1, String uutien, String kc2, float g) {
        this.id = "VDV".concat(String.format("%02d", n));
        this.name = name;
        this.ngaysinh = ngaysinh;
        this.bd = bd;
        this.kt = kt;
        this.kc1 = kc1;
        this.uutien = uutien;
        this.kc2 = kc2;
        this.g = g;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public String getBd() {
        return bd;
    }

    public String getKt() {
        return kt;
    }

    public String getUutien() {
        return uutien;
    }

    public float getG() {
        return g;
    }

    @Override
    public String toString() {
        return String.format(id + " " + name + " " + kc1 + " " + uutien + " " + kc2);
    }

    public static int UuTien(int a) {
        if (a >= 32) {
            return 3;
        } else if (a >= 25) {
            return 2;
        } else if (a >= 18) {
            return 1;
        } else {
            return 0;
        }
    }

    public static LocalTime ChuanHoaThoiGian(String a) {
        String[] tach = a.split(":");

        LocalTime b = LocalTime.of(Integer.parseInt(tach[0]), Integer.parseInt(tach[1]), Integer.parseInt(tach[2]));
        return b;
    }

    public static LocalDate ChuanHoaNamSinh(String a) {
        String[] tach = a.split("/");

        LocalDate b = LocalDate.of(Integer.parseInt(tach[2]), Integer.parseInt(tach[1]), Integer.parseInt(tach[0]));
        return b;
    }

    public static ArrayList<Float> getAllRanks(List<VanDongVien125> list1) {
        List<VanDongVien125> list = new ArrayList<>();
        list.addAll(list1);
        list.sort((o1, o2) -> o1.getG() > o2.getG() ? 1 : -1);
        ArrayList<Float> ranks = new ArrayList<>();
        int n = list.size();
        for (int i = 0; i < n; i++) {
            ranks.add(list.get(i).getG());
        }
        return ranks;
    }

    public static int getRank(ArrayList<Float> ranks, Float a) {
        int n = ranks.size();
        for (int i = 0; i < n; i++) {
            if (Float.compare(a, ranks.get(i)) == 0) {
                return i + 1;
            }
        }
        return -1;
    }

    public static String KhoangCach(LocalTime start, LocalTime end) {
        Duration khoangcach = Duration.between(start, end);
        String kc = String.format("%02d:%02d:%02d", khoangcach.toHours(), khoangcach.toMinutes(), khoangcach.getSeconds() - khoangcach.toMinutes() * 60);
        return kc;
    }

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = Integer.parseInt(p.nextLine());
        int u = 0;
        List<VanDongVien125> list = new ArrayList<>();
        while (u++ < t) {
            String name = p.nextLine();
            DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate ns = ChuanHoaNamSinh(p.nextLine());
            int tuoi = 2021 - Integer.parseInt(String.valueOf(ns.getYear()));
            int a = UuTien(tuoi);

            String namsinh = ns.format(dtf1);
            DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm:ss");

            LocalTime start1 = ChuanHoaThoiGian(p.nextLine());
            LocalTime start2 = start1.plusSeconds(a);
            LocalTime end = ChuanHoaThoiGian(p.nextLine());
            String batdau = start1.format(dtf2);
            String kethuc = end.format(dtf2);
            String kc1 = KhoangCach(start1, end);
            String kc2 = KhoangCach(start2, end);
            String uutien = KhoangCach(start1, start2);
            float g = Duration.between(start2, end).getSeconds();

            VanDongVien125 vdv = new VanDongVien125(u, name, namsinh, batdau, kethuc, kc1, uutien, kc2, g);
            list.add(vdv);
        }
        list.sort((o1, o2) -> o1.getG() > o2.getG() ? 1 : o1.getG() == o2.getG() ? 0 : -1);
        ArrayList<Float> ranks = getAllRanks(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString() + " " + getRank(ranks, list.get(i).getG()));
        }
    }

}
