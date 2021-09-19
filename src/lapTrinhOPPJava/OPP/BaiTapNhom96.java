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
public class BaiTapNhom96 {

    private String id, name, phone, team;

    public BaiTapNhom96() {
    }

    public BaiTapNhom96(String id, String name, String phone, String team) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    public String toString() {
        return String.format(id + " " + name + " " + phone+" "+team);
    }

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int a = Integer.parseInt(p.next());
        int b = Integer.parseInt(p.next());
        p.nextLine();
        int u = 0;
        List<BaiTapNhom96> list = new ArrayList<>();

        while (u++ < a) {
            String id = p.nextLine();
            String name = p.nextLine();
            String phone = p.nextLine();
            String team = p.nextLine();
            BaiTapNhom96 sv = new BaiTapNhom96(id, name, phone, team);
            list.add(sv);
        }
        String[] c = new String[b];
        for (int j = 0; j < b; j++) {
            c[j] = p.nextLine();
        }
        int d = Integer.parseInt(p.nextLine());
        int v = 0;
        while (v++ < d) {
            String e = p.nextLine();
           
            System.out.println("DANH SACH NHOM " + e + ":");
            for (int z = 0; z < list.size(); z++) {
                if (list.get(z).getTeam().equalsIgnoreCase(e)) {
                    System.out.println(list.get(z).toString());
                }

            }
            System.out.println("Bai tap dang ky: " + c[Integer.parseInt(e)-1]);
        }
    }
}
