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
public class TuyenSinh127 {

    private String id, name;
    private float math, phy, chem;

    public TuyenSinh127() {
    }

    public TuyenSinh127(String id, String name, float math, float phy, float chem) {
        this.id = id;
        this.name = name;
        this.math = math;
        this.phy = phy;
        this.chem = chem;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getMath() {
        return math;
    }

    public float getPhy() {
        return phy;
    }

    public float getChem() {
        return chem;
    }

    public float getTongDiem() {
        float d = getMath() * 2 + getChem() + getPhy();
        float e = Float.parseFloat(getDiemUuTien());
        return d + e;
    }

    public String getDiem() {
        float a = getMath() * 2 + getChem() + getPhy();
        float e = Float.parseFloat(getDiemUuTien());
        float d = a+e;
        if (d == (int) d) {
            return String.valueOf((int) d);
        } else {
            return String.valueOf(d);
        }

    }

    public String getDiemUuTien() {
        String a = getId().substring(0, 3).toUpperCase();
        switch (a) {
            case "KV1":
                return "0.5";
            case "KV2":
                return "1";
            case "KV3":
                return "2.5";
            default:
                return null;
        }
    }

    public String getTrangThai(float e) {
        float c = getTongDiem();
        if (c >= e) {
            return "TRUNG TUYEN";
        } else {
            return "TRUOT";
        }
    }

    public String toString(float a) {
        return String.format(id + " " + name + " " + getDiemUuTien() + " " + getDiem()+" "+getTrangThai(a));
    }

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        List<TuyenSinh127> list = new ArrayList<>();
        int t = Integer.parseInt(p.nextLine());
        int u = 0;
        while (u++ < t) {
            String id = p.nextLine();
            String name = p.nextLine();
            float toan = Float.parseFloat(p.nextLine());
            float ly = Float.parseFloat(p.nextLine());
            float hoa = Float.parseFloat(p.nextLine());
            TuyenSinh127 sv = new TuyenSinh127(id, name, toan, ly, hoa);
            list.add(sv);
        }
        Comparator<TuyenSinh127> sorttongdiem = (o1,o2)-> o1.getTongDiem()>o2.getTongDiem()?-1:o1.getTongDiem()>o2.getTongDiem()?0:1;
        Comparator<TuyenSinh127> sortma = (o1,o2)-> o1.getId().compareTo(o2.getId());
        list.sort(sorttongdiem.thenComparing(sortma));
        int d = Integer.parseInt(p.nextLine());
        float f = list.get(d-1).getTongDiem();
        System.out.println(f);
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i).toString(f));
        }

    }
}
