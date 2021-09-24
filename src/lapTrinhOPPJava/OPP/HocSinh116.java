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
public class HocSinh116 {

    private String id, name;
    private float sorce;

    public HocSinh116() {
    }

    public HocSinh116(String id, String name, float sorce) {
        this.id = id;
        this.name = name;
        this.sorce = sorce;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getSorce() {
        return sorce;
    }

    public static ArrayList<Float> getAllRanks(List<HocSinh116> list1) {
        List<HocSinh116> list = new ArrayList<>();
        list.addAll(list1);
        list.sort((o1, o2) -> o2.getSorce() > o1.getSorce() ? 1 : -1);
        ArrayList<Float> ranks = new ArrayList<>();
        int n = list.size();
        for (int i = 0; i < n; i++) {
            ranks.add(list.get(i).getSorce());
            System.out.println(list.get(i).getSorce());
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

    public String getXepLoai() {

        float b = getSorce();
        if (b >= 9) {
            return "Gioi";
        } else if (b >= 7) {
            return "Kha";
        } else if (b >= 5) {
            return "Trung Binh";
        } else {
            return "Yeu";
        }
    }

    public String toString() {
        return String.format(id + " " + name + " " + sorce + " " + getXepLoai());
    }

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = Integer.parseInt(p.nextLine());
        int u = 0;
        List<HocSinh116> list = new ArrayList<>();
        while (u++ < t) {
            String id = "HS".concat(String.format("%02d", u));
            String ten = p.nextLine();
            float diem = Float.parseFloat(p.nextLine());
            HocSinh116 hs = new HocSinh116(id, ten, diem);
            list.add(hs);
        }
        ArrayList<Float> ranks = getAllRanks(list);
        int n = list.size();
        for (int i = 0; i < n; i++) {
            System.out.println(list.get(i).toString() + " " + getRank(ranks, list.get(i).getSorce()));
        }
    }
}
