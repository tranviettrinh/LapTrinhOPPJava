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
public class HocSinh91 {

    private String stt, id, name, classroom, d1, d2, d3;

    public HocSinh91(String stt, String id, String name, String classroom, String d1, String d2, String d3) {
        this.stt = stt;
        this.id = id;
        this.name = name;
        this.classroom = classroom;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public HocSinh91(String id, String name, String classroom, String d1, String d2, String d3) {
        this.id = id;
        this.name = name;
        this.classroom = classroom;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public HocSinh91() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

   

    public String toString() {
        return String.format( id + " " + name + " " + classroom + " " + d1 + " " + d2 + " " + d3);
    }

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = Integer.parseInt(p.nextLine());
        int u = 0;
        List<HocSinh91> list = new ArrayList<>();
        while (u++ < t) {            
            String masv = p.nextLine();
            String name = p.nextLine();
            String lop = p.nextLine();
            String d1 = p.next();
            String d2 = p.next();
            String d3 = p.next();
            p.nextLine();
            HocSinh91 hs = new HocSinh91(masv, name, lop, d1, d2, d3);
            list.add(hs);
        }
        //list.sort((o1,o2)-> o1.getId().compareTo(o2.getId()) );
        list.sort((o1,o2)-> o1.getName().compareTo(o2.getName()));
        for (int i = 0; i < list.size(); i++) {
            
            System.out.println(String.valueOf(i+1)+" "+list.get(i).toString());
        }
    }
}
