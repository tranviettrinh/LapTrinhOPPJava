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
public class ThucTapSinh94 {

    private String stt, id, name, classroom, email, business;

    public String toString() {
        return String.format(stt + " " + id + " " + name + " " + classroom + " " + email + " " + business);
    }

    public String getBusiness() {
        return business;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public ThucTapSinh94() {
    }

    public ThucTapSinh94(String stt, String id, String name, String classroom, String email, String business) {
        this.stt = stt;
        this.id = id;
        this.name = name;
        this.classroom = classroom;
        this.email = email;
        this.business = business;
    }

    public static String XuLyTen(String a) {
        String b = new String();
        String[] tach = a.split(" ");
        for (int j = 0; j < tach.length; j++) {
            if (!tach[j].isEmpty()) {             
                b = b.concat(tach[j].concat(" "));
            }

        }
        b = b.substring(0, b.length()-1);
        return b;
    }

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = Integer.parseInt(p.nextLine());
        int u = 0;
        List<ThucTapSinh94> list = new ArrayList<>();
        while (u++ < t) {
            String stt = String.valueOf(u);
            String id = XuLyTen(p.nextLine());
            String name = XuLyTen(p.nextLine());
            
            String classroom = XuLyTen(p.nextLine());
            String email = p.nextLine();
            String business = p.nextLine();
            ThucTapSinh94 thuctap = new ThucTapSinh94(stt, id, name, classroom, email, business);
            list.add(thuctap);

        }
        int a = Integer.parseInt(p.nextLine());
        int b = 0;
        
//        list.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        list.sort((o1, o2) -> o1.getId().compareTo(o2.getId()));
        while (b++ < a) {
            String c = p.nextLine();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getBusiness().equalsIgnoreCase(c)) {
                    System.out.println(list.get(i).toString());
                }
            }
        }
    }
}
