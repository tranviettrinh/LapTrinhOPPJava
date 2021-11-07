/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhluong172;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author trinhtv.B17AT191
 */
public class NhanVien172 {
    private String id, name,phongban;
    private int luongcb, songay;
    private long luongthang;

    public NhanVien172() {
    }

    public NhanVien172(String id, String name, String phongban, int luongcb, int songay, long luongthang) {
        this.id = id;
        this.name = name;
        this.phongban = phongban;
        this.luongcb = luongcb;
        this.songay = songay;
        this.luongthang = luongthang;
    }

    public String getId() {
        return id;
    }
    @Override
    public String toString(){
        return String.format(id+" "+name+" "+luongthang);
    }
    public static int HeSoLuong(String a, int b){
        if(b>=16){
            switch(a){
                case"A": return 20;
                case"B": return 16;
                case"C": return 14;
                case"D": return 13;
            }
        }else if(b>=9){
            switch(a){
                case"A": return 14;
                case"B": return 13;
                case"C": return 12;
                case"D": return 11;
            }
        }else if(b>=4){
            switch(a){
                case"A": return 12;
                case"B": return 11;
                case"C": return 10;
                case"D": return 9;
            }
        }else if(b>=1){
            switch(a){
                case"A": return 10;
                case"B": return 10;
                case"C": return 9;
                case"D": return 8;
            }
        }else return 0;
        return 0;
    }
    public static String GetById(List<PhongBan172> list,String a){
        for(int i=0; i<list.size();i++){
            if(list.get(i).getId().equalsIgnoreCase(a)){
                return list.get(i).getName();
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = Integer.parseInt(p.nextLine());
        int u = 0;
        List<PhongBan172> list1 = new ArrayList<>();
        List<NhanVien172> list2 = new ArrayList<>();
        while(u++<t){
            String abc = p.nextLine();
            PhongBan172 phongban = new PhongBan172(abc.substring(0,2),abc.substring(2));
            list1.add(phongban);
        }
        int x = Integer.parseInt(p.nextLine());
        int y = 0;
        while(y++<x){
            String id = p.nextLine();
            String ten = p.nextLine();
            int luongcb = Integer.parseInt(p.nextLine());
            int songaycong = Integer.parseInt(p.nextLine());
            int heso = HeSoLuong(id.substring(0,1), Integer.parseInt(id.substring(1,3)));
           
            long luongthang = luongcb*songaycong*heso*1000;
            String phongban = GetById(list1, id.substring(3,5));
            NhanVien172 nv = new NhanVien172(id,ten,phongban,luongcb,songaycong,luongthang);
            list2.add(nv);
        }
        String maphongban = p.nextLine();
        System.out.println("Bang luong phong"+ GetById(list1, maphongban)+":");
        for(int i=0;i<list2.size();i++){
            if(maphongban.equalsIgnoreCase(list2.get(i).getId().substring(3,5))){
                System.out.println(list2.get(i).toString());
            }
            
        }
        
    }
}
