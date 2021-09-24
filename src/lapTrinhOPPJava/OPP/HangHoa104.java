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
public class HangHoa104 {

    private String id;
    private int soluong;

    public HangHoa104() {
    }

    public HangHoa104(String id, int soluong) {
        this.id = id;
        this.soluong = soluong;
    }

    public String getId() {
        return id;
    }

    public int getSoluong() {
        return soluong;
    }

    public int getDonGia() {
        String a = getId().substring(4).toUpperCase();
        switch (a) {
            case "Y":
                return 110000;
            case "N":
                return 135000;
            default:
                return 0;
        }

    }

    public int getXuat() {
        switch (getId().substring(0, 1).toUpperCase()) {
            case "A":
                return (soluong * 60+50) / 100;
            case "B":
                return (soluong * 70 +50) / 100;
            default:
                return 0;
        }
    }

    public long getTien() {
        return (getXuat() * getDonGia());
    }

    public long getThue() {
        String a = getId().substring(0, 1).toUpperCase();
        String b = getId().substring(4,5).toUpperCase();
        long c = getTien();
        if (a.equalsIgnoreCase("A") && b.equalsIgnoreCase("Y")) {
            c = c*8/100;
            
            return  c ;
        } else if (a.equalsIgnoreCase("A") && b.equalsIgnoreCase("N")) {
            c= c*11/100;
            
            return c ;
        } else if (a.equalsIgnoreCase("B") && b.equalsIgnoreCase("Y")) {
            c = (c*17/100);
            
            return c;
        } else if (a.equalsIgnoreCase("B") && b.equalsIgnoreCase("N")) {
            c = (c*22/100);
            
            return c;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.format(id + " " + soluong + " " + getXuat() + " " + getDonGia() + " " + getTien() + " " + getThue());
    }

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = Integer.parseInt(p.nextLine());
        int u = 0;
        List<HangHoa104> list = new ArrayList<>();
        while (u++ < t) {
            String id = p.nextLine();
            int soluong = Integer.parseInt(p.nextLine());
           
            HangHoa104 hh = new HangHoa104(id, soluong);
            list.add(hh);

        }
        list.sort((o1,o2)-> o2.getThue()>o1.getThue()?1:-1);
        String d = p.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().substring(0, 1).equalsIgnoreCase(d))
            System.out.println(list.get(i).toString());
        }
    }
}
