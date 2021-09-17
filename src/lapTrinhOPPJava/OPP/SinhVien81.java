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
public class SinhVien81 {
    private String classroom, name, id, email;

    public SinhVien81() {
    }

    public String getClassroom() {
        return classroom;
    }

    public String getId() {
        return id;
    }

    public SinhVien81(String classroom, String name, String id, String email) {
        this.classroom = classroom;
        this.name = name;
        this.id = id;
        this.email = email;
    }
    public String toString(){
        return String.format(id +" "+name+" "+classroom+" "+email);
    }
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = Integer.parseInt(p.nextLine());
        int u=0;
        List<SinhVien81> list = new ArrayList<>();
        while(u++<t){
            String masv = p.nextLine();
            String ten = p.nextLine();
            String lop = p.nextLine();
            String gmail = p.nextLine();
            SinhVien81 sv = new SinhVien81(lop,ten,masv,gmail);
            list.add(sv);
        }
        Comparator<SinhVien81> sortlop = (o1,o2)-> o1.getClassroom().compareTo(o2.getClassroom());
        Comparator<SinhVien81> sortid = (o1,o2)-> o1.getId().compareTo(o2.getId());
        list.sort(sortlop.thenComparing(sortid));
        for(int i =0; i<t;i++){
            System.out.println(list.get(i).toString());
        }
    }
}
