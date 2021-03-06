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
public class SinhVien2 {

    private String id, name, birthday, classroom;
    private float gba;

    public SinhVien2(String id, String name, String classroom, String birthday, float gba) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.classroom = classroom;
        this.gba = gba;
    }

    public SinhVien2() {
    }

    public String toString() {
        return String.format(id + " " + name + " " + classroom + " " + birthday + " " + String.format("%.2f", gba));
    }

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = Integer.parseInt(p.nextLine());
        int u = 0;
        List<SinhVien2> list = new ArrayList<>();
        while (u++ < t) {
            String masv = new String();
            if (u < 10) {
                masv = "B20DCCN00".concat(String.valueOf(u));
            } else {
                masv = "B20DCCN0".concat(String.valueOf(u));
            }
            String ten = p.nextLine();
           
            String tencn = new String();
            String[] tachten = ten.split(" ");
            for (int j = 0; j < tachten.length; j++) {

                if (!tachten[j].isEmpty()) {
                    tachten[j] = tachten[j].substring(0, 1).toUpperCase().concat(tachten[j].substring(1).toLowerCase());
                    tencn = tencn.concat(tachten[j].concat(" "));
                   
                }

            }
            tencn = tencn.substring(0, tencn.length() - 1);
            String lop = p.nextLine();
            String ngaysinh = p.nextLine();
            String[] tach = ngaysinh.split("/");
            if (tach[0].length() == 1) {
                tach[0] = "0".concat(tach[0]);
            }
            if (tach[1].length() == 1) {
                tach[1] = "0".concat(tach[1]);
            }
            String ngaysinhcn = tach[0].concat("/".concat(tach[1].concat("/".concat(tach[2]))));
            float gbacn = Float.parseFloat(p.nextLine());
            SinhVien2 sv = new SinhVien2(masv, tencn, lop , ngaysinhcn, gbacn);
            list.add(sv);
        }
        for (int i = 0; i < t; i++) {
            System.out.println(list.get(i).toString());
        }
    }
}
