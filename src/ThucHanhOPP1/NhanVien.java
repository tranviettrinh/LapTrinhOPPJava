/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanhOPP1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author trinhtv.B17AT191
 */
public class NhanVien {

    private final String id, name, chucvu;
    private final int hieuso, bacluong;

    public NhanVien(String id, String name, String chucvu, int hieuso, int bacluong) {
        this.id = id;
        this.name = name;
        this.chucvu = chucvu;
        this.hieuso = hieuso;
        this.bacluong = bacluong;
    }

    public String getChucvu() {
        return chucvu;
    }

    public int getHieuso() {
        return hieuso;
    }

    public int getBacluong() {
        return bacluong;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format(name + " " + chucvu + " " + String.format("%03d", hieuso) + " " + String.format("%02d", bacluong));
    }

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = Integer.parseInt(p.nextLine());
        int u = 0;
        int demGD = 0, demTP = 0, demPP = 0;
        List<NhanVien> list = new ArrayList<>();
        while (u++ < t) {
            String a = p.next();
            String b = p.nextLine();
            
            int d = Integer.parseInt(a.substring(4, 7));
            int f = Integer.parseInt(a.substring(2, 4));

            if (a.substring(0, 2).equalsIgnoreCase("GD")) {
                demGD++;
                if (demGD > 1) {
                    String m1 = a.substring(2);
                    String a1 = "NV".concat(m1);
                    String c = a1.substring(0, 2).toUpperCase();
                    NhanVien nv = new NhanVien(a1, b, c, d, f);
                    list.add(nv);

                }else {
                    String c = a.substring(0, 2).toUpperCase();
                    NhanVien nv = new NhanVien(a, b, c, d, f);
                    
                    list.add(nv);
                }
                
            } else if (a.substring(0, 2).equalsIgnoreCase("TP")) {
                demTP++;
                if (demTP > 3) {
                    String m2 = a.substring(2);
                    String a1 = "NV".concat(m2);
                    String c = a1.substring(0, 2).toUpperCase();
                    NhanVien nv = new NhanVien(a1, b, c, d, f);
                    list.add(nv);

                }else {
                    String c = a.substring(0, 2).toUpperCase();
                    NhanVien nv = new NhanVien(a, b, c, d, f);
                    list.add(nv);
                }
            } else if (a.substring(0, 2).equalsIgnoreCase("PP")) {
                demPP++;
                if (demPP > 3) {
                    String m3 = a.substring(2);
                    String a1 = "NV".concat(m3);
                    String c = a1.substring(0, 2).toUpperCase();
                    NhanVien nv = new NhanVien(a1, b, c, d, f);
                    list.add(nv);

                }else {
                    String c = a.substring(0, 2).toUpperCase();
                    NhanVien nv = new NhanVien(a, b, c, d, f);
                    list.add(nv);
                }

            } else {
                
                String c = a.substring(0, 2).toUpperCase();
                NhanVien nv = new NhanVien(a, b, c, d, f);
                list.add(nv);
            }

        }
        Comparator<NhanVien> sortbacluong = (o1, o2) -> o1.getBacluong() > o2.getBacluong() ? -1 : o1.getBacluong() == o2.getBacluong() ? 0 : 1;
        Comparator<NhanVien> sortsohieu = (o1, o2) -> o2.getHieuso() > o1.getHieuso() ? -1 : o2.getHieuso() == o1.getHieuso() ? 0 : 1;
        list.sort(sortbacluong.thenComparing(sortsohieu));
//        for(int i=0; i<list.size();i++){
//            System.out.println(list.get(i).toString());
//    }

        int g = Integer.parseInt(p.nextLine());
        int h = 0;
        while (h++ < g) {
            String k = p.nextLine().toUpperCase();
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).getName().toUpperCase().contains(k)) {
                    System.out.println(list.get(j).toString());
                }
            }
            System.out.println();
        }
    }

}
