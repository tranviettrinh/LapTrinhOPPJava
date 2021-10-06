/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanhOPP1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author trinhtv.B17AT191
 */
public class GiaoVien {

    private String id, name;
    private long luongcoban;

    public GiaoVien(String id, String name, long luongcoban) {
        this.id = id;
        this.name = name;
        this.luongcoban = luongcoban;
    }

    private  String getId() {
        return id;
    }

    
    private  static long PhuCap(String a){
        switch(a){
            case"HT": return 2000000;
            case"HP": return 900000;
            case"GV": return 500000;
            default: return 0;
        }
    }
    private  static int HeSoBacLuong(String a){
        int b = Integer.parseInt(a);
        return b;
    }
    private  long ThuNhap(String a, String b){
        return luongcoban*HeSoBacLuong(a)+PhuCap(b);
    }
   public String toString() {
        return String.format(id + " " + name);
    }
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = Integer.parseInt(p.nextLine());
        int u = 0;
        List<GiaoVien> list = new ArrayList<>();
        int demHT=0,demHP=0;
        while (u++ < t) {
            String id = p.nextLine();
            String name = p.nextLine();
            long luongcb = Long.parseLong(p.nextLine());
            GiaoVien gv = new GiaoVien(id, name, luongcb);
            boolean them = true;
            if(id.substring(0,2).equalsIgnoreCase("HT")){
                demHT++;
                if(demHT>1){
                    them = false;
                }
            }
            if(id.substring(0,2).equalsIgnoreCase("HP")){
                demHP++;
                if(demHP>2){
                    them = false;
                }
            }         
            
            
            if(them){
                list.add(gv);
            }
        }
        for(int i=0; i<list.size();i++){
            String x = list.get(i).getId().substring(2,4).toUpperCase();
            String y = list.get(i).getId().substring(0,2).toUpperCase();
            System.out.println(list.get(i).toString()+" "+ HeSoBacLuong(x)+" "+PhuCap(y)+" "+list.get(i).ThuNhap(x, y));
        }

    }
}
