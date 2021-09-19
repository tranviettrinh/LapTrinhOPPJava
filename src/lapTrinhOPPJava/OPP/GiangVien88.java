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
public class GiangVien88 {
    private String id, name, branch;

    public GiangVien88() {
    }

    public String getName() {
        String b = this.name.toUpperCase();
        return b;
    }

    public GiangVien88(String id, String name, String branch) {
        this.id = id;
        this.name = name;
        this.branch = branch;
    }
    public String toString() {
        return String.format(id + " " + name + " " + branch);
    }
    public static String XuLyChu(String a){
        String b = new String();
        String[] tach = a.split(" ");
        for(int j=0; j< tach.length;j++){
            tach[j]=tach[j].substring(0,1).toUpperCase();
            b = b.concat(tach[j]);
        }
        return b;
    }
     public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = Integer.parseInt(p.nextLine());
        int u = 0;
        List<GiangVien88> list = new ArrayList<>();
        while (u++ < t) {
            String mgv = "GV".concat(String.format("%02d", u));
            String ten = p.nextLine();
            String nganh = p.nextLine();
            String nganhgv = XuLyChu(nganh);
            GiangVien88 gv = new GiangVien88(mgv, ten, nganhgv);
            list.add(gv);
        }
        int a = Integer.parseInt(p.nextLine());
        int b = 0;
        while (b++ < a) {
            String c = p.nextLine();
            String d = c.toUpperCase();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + c + ":");
            for (int i = 0; i < list.size(); i++) {

                if (list.get(i).getName().contains(d)) {
                    System.out.println(list.get(i).toString());
                }

            }
        }

    }
}
