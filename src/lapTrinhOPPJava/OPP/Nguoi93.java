/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapTrinhOPPJava.OPP;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author trinhtv.B17AT191
 */
public class Nguoi93 {

    private String name;
    private LocalDate birthday;

    public Nguoi93() {
    }

    public Nguoi93(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String toString() {
        return String.format(name);
    }

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = Integer.parseInt(p.nextLine());
        int u = 0;
        List<Nguoi93> list = new ArrayList<>();
        while (u++ < t) {
            String ten = p.next();
            String ngaysinh = p.next();
            p.nextLine();
            String[] tach = ngaysinh.split("/");
            LocalDate ns = LocalDate.of(Integer.parseInt(tach[2]), Integer.parseInt(tach[1]), Integer.parseInt(tach[0]));
            Nguoi93 nguoi = new Nguoi93(ten, ns);
            list.add(nguoi);
        }
        list.sort((o1, o2) -> o2.getBirthday().compareTo(o1.getBirthday()));
        System.out.println(list.get(0).toString());

        System.out.println(list.get(list.size() - 1).toString());
    }

}
