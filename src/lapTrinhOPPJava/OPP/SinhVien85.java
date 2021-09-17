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
public class SinhVien85 {

    private String id, name, classroom, email;

    public SinhVien85() {
    }

    public SinhVien85(String id, String name, String classroom, String email) {
        this.id = id;
        this.name = name;
        this.classroom = classroom;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getClassroom() {
        return classroom;
    }

    public String toString() {
        return String.format(id + " " + name + " " + classroom + " " + email);
    }

    public static String XuLyNganh(String a) {
        a.toLowerCase();
        switch (a) {
            case "ke toan":
                return "DCKT";
            case "cong nghe thong tin":
                return "DCCN";
            case "an toan thong tin":
                return "DCAT";
            case "vien thong":
                return "DCVT";
            case "dien tu":
                return "DCDT";
        }
        return " ";
    }

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int u = Integer.parseInt(p.nextLine());
        int t = 0;
        int b = 0;
        List<SinhVien85> list = new ArrayList<>();
        while (t++ < u) {
            String masv = p.nextLine();
            String ten = p.nextLine();
            String lop = p.nextLine();
            String gmail = p.nextLine();
            SinhVien85 sv = new SinhVien85(masv, ten, lop, gmail);
            list.add(sv);

        }
        int a = Integer.parseInt(p.nextLine());
        while (b++ < a) {
            String c = p.nextLine();
            String d = XuLyNganh(c);
            System.out.println("DANH SACH SINH VIEN NGANH " + c.toUpperCase() + ":");

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getId().substring(3, 7).equalsIgnoreCase(d)&& !list.get(i).getId().subSequence(0, 1).equals("E")) {
                    System.out.println(list.get(i).toString());
                }
            }
        }

    }
}
