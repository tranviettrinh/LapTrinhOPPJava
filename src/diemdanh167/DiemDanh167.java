/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diemdanh167;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author trinhtv.B17AT191
 */
public class DiemDanh167 {

    private String id, name, lop;
    private int diemcc;

    public int getDiemcc() {
        return diemcc;
    }

    public String getId() {
        return id;
    }

    public DiemDanh167() {
    }

    public DiemDanh167(String id, String name, String lop, int diemcc) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.diemcc = diemcc;

    }

    public static String GetNameSinhVienByID(List<SinhVien167> list, String a) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equalsIgnoreCase(a)) {
                return list.get(i).getName();
            }

        }
        return null;

    }

    public static String GetClassSinhVienByID(List<SinhVien167> list, String a) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equalsIgnoreCase(a)) {
                return list.get(i).getClassroom();
            }

        }
        return null;

    }

    public static int DiemCC(String a) {
        int n = a.length();
        int vang = 0;
        int muon = 0;
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) == 'v') {
                vang = vang + 2;
            }
        }
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) == 'm') {
                muon++;
            }
        }
        int diemcc = 10 - vang - muon;
        if (diemcc <= 0) {
            return 0;
        } else {
            return diemcc;
        }
    }

    @Override
    public String toString() {
        return String.format(id + " " + name + " " + lop + " " + diemcc);
    }

    public static int getDiemCCByID(List<DiemDanh167> list1, String a) {
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).getId().equalsIgnoreCase(a)) {
                return list1.get(i).getDiemcc();
            }

        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = Integer.parseInt(p.nextLine());
        int u = 0;
        List<SinhVien167> list = new ArrayList<>();
        List<DiemDanh167> list1 = new ArrayList<>();
        while (u++ < t) {
            SinhVien167 sv = new SinhVien167(p.nextLine(), p.nextLine(), p.nextLine());
            list.add(sv);
            //System.out.println(sv.toString());
        }
        int a = 0;
        while (a++ < t) {
            String id2 = p.next();
            String diemdanh = p.next();
            p.nextLine();
            String ten2 = GetNameSinhVienByID(list, id2);

            String lop2 = GetClassSinhVienByID(list, id2);

            int diemcc = DiemCC(diemdanh);

            DiemDanh167 dd = new DiemDanh167(id2, ten2, lop2, diemcc);
            list1.add(dd);

        }
        String b = p.nextLine();
//        list1.sort((o1, o2) -> o2.getId().compareTo(o1.getId()));
        for (int i = 0; i < list.size(); i++) {
            int z = getDiemCCByID(list1, list.get(i).getId());
            if (b.equalsIgnoreCase(list.get(i).getClassroom())) {
                if (z <= 0) {
                    System.out.println(list.get(i).toString() + " " + z + " KDDK");
                } else {
                    System.out.println(list.get(i).toString() + " " + z);
                }
            }
        }

    }

}
