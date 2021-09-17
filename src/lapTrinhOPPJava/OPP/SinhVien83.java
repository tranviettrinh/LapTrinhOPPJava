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
public class SinhVien83 {

    private String id, name, classroom, email;

    public SinhVien83() {
    }

    public String getId() {
        return id;
    }

    public String getClassroom() {
        return classroom;
    }

    public SinhVien83(String id, String name, String classroom, String email) {
        this.id = id;
        this.name = name;
        this.classroom = classroom;
        this.email = email;
    }

    public String toString() {
        return String.format(id + " " + name + " " + classroom + " " + email);
    }

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int u = Integer.parseInt(p.nextLine());
        int t = 0;
        int b=0;
        List<SinhVien83> list = new ArrayList<>();
        while (t++ < u) {
            String masv = p.nextLine();            
            String ten = p.nextLine();
            String lop = p.nextLine();
            String gmail = p.nextLine();
            SinhVien83 sv = new SinhVien83(masv, ten, lop, gmail);
            list.add(sv);

        }
        int a = Integer.parseInt(p.nextLine());
        while(b++<a){
            String c = p.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP "+c+":");
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i).getClassroom().equalsIgnoreCase(c)){
                    System.out.println(list.get(i).toString());
                }
            }
        }
       
        

    }
}
