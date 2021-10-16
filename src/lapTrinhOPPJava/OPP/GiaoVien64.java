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
public class GiaoVien64 {
    private String id,name,heso,phucap,thunhap;
    private long luongcb;

    public GiaoVien64(String id, String name, String heso, String phucap, String thunhap, long luongcb) {
        this.id = id;
        this.name = name;
        this.heso = heso;
        this.phucap = phucap;
        this.thunhap = thunhap;
        this.luongcb = luongcb;
    }

    public GiaoVien64() {
    }
    @Override
    public String toString(){
        return String.format(id+" "+name+" "+heso+" "+phucap+" "+thunhap);        
    }
    public static long PhuCap(String a){
        switch(a){
            case("HT"): return 2000000;
            case"HP": return 900000;
            case"GV":return 500000;
            default: return 0;
        }
    }
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
//        List<GiaoVien64> list = new ArrayList<>();
        String id = p.nextLine();
        String name = p.nextLine();
        long luongcb = Long.parseLong(p.nextLine());
        int heso = Integer.parseInt(id.substring(2,4));
        
        String phucap = String.valueOf(PhuCap(id.substring(0,2)));
        long thunhap = heso*luongcb+PhuCap(id.substring(0,2));
        GiaoVien64 gv = new GiaoVien64(id,name,String.valueOf(heso),phucap,String.valueOf(thunhap),luongcb);
        
        System.out.println(gv.toString());
    }
}
