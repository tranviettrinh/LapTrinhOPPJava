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
public class SinhVien84 {
    private String id, name, classroom, email;

    public SinhVien84() {
    }

    public SinhVien84(String id, String name, String classroom, String email) {
        this.id = id;
        this.name = name;
        this.classroom = classroom;
        this.email = email;
    }

    public String getClassroom() {
        return classroom;
    }
    
    public String toString() {
        return String.format(id + " " + name + " " + classroom + " " + email);
    }

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int u = Integer.parseInt(p.nextLine());
        int t = 0;
        int b=0;
        List<SinhVien84> list = new ArrayList<>();
        while (t++ < u) {
            String masv = p.nextLine();            
            String ten = p.nextLine();
            String lop = p.nextLine();
            String gmail = p.nextLine();
            SinhVien84 sv = new SinhVien84(masv, ten, lop, gmail);
            list.add(sv);

        }
        int a = Integer.parseInt(p.nextLine());
        while(b++<a){
            String c = p.nextLine();
           
            System.out.println("DANH SACH SINH VIEN KHOA "+c+":");
            c = c.substring(c.length() -2);
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i).getClassroom().substring(1,3).equalsIgnoreCase(c)){
                    System.out.println(list.get(i).toString());
                }
            }
        }
       
        

    }
}
