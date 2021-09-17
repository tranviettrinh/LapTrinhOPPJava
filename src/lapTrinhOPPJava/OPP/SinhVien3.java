/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapTrinhOPPJava.OPP;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author trinhtv.B17AT191
 */
public class SinhVien3 {

    private String id, name, classroom, birthday;
    private float gba;

    public SinhVien3() {
    }

    public SinhVien3(String id, String name, String classroom, String birthday, float gba) {
        this.id = id;
        this.name = name;
        this.classroom = classroom;
        this.birthday = birthday;
        this.gba = gba;
    }

    public float getGba() {
        return gba;
    }
    

    public String toString() {
        return String.format(id + " " + name + " " + classroom + " " + birthday + " " + String.format("%.2f", gba));
    }

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = Integer.parseInt(p.nextLine());
        int u = 0;
        List<SinhVien3> list = new ArrayList<>();
        while (u++ < t) {
            String msv = new String();
            if (u < 10) {
                msv = "B20DCCN00".concat(String.valueOf(u));
            } else {
                msv = "B20DCCN0".concat(String.valueOf(u));
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
            String ngaysinhtt = p.nextLine();
            String[] tach = ngaysinhtt.split("/");
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate nsinh = LocalDate.of(Integer.parseInt(tach[2]), Integer.parseInt(tach[1]), Integer.parseInt(tach[0]));
            String ngaysinhcn = nsinh.format(dtf);

            float gbacn = Float.parseFloat(p.nextLine());
            SinhVien3 sv = new SinhVien3(msv, tencn, lop, ngaysinhcn, gbacn);
            list.add(sv);
        }
        list.sort((o1,o2)-> o2.getGba()> o1.getGba()? 1:-1);
        for (int i = 0; i < t; i++) {
            System.out.println(list.get(i).toString());
        }
    }
}
