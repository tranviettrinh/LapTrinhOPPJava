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
public class DonHang114 {
    private String name,id;
    private int dongia,soluong;

    public DonHang114(String name, String id, int dongia, int soluong) {
        this.name = name;
        this.id = id;
        this.dongia = dongia;
        this.soluong = soluong;
    }

    public DonHang114() {
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getDongia() {
        return dongia;
    }

    public int getSoluong() {
        return soluong;
    }
    public String getSoThuTu(){
        String a = getId().substring(1,4);
        return a;
    }
    public long getGiamGia(){
        String b = getId().substring(4);
        
        long c = getDongia()*getSoluong();
       
        switch(b){
            case"2": return (c*30)/100;
            case"1": return (c*50)/100;
            default: return 0;
        }
    }
    public long getThanhTien(){
        return getDongia()*getSoluong()-getGiamGia();
    }
    public String toString(){
        return String.format(name+" "+id+" "+getSoThuTu()+" "+getGiamGia()+" "+getThanhTien());
    }
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = Integer.parseInt(p.nextLine());
        int u=0;
        List<DonHang114> list = new ArrayList<>();        
        while(u++<t){
            String ten = p.nextLine();
            String ma = p.nextLine();
            int dongia = Integer.parseInt(p.nextLine());
            int soluong = Integer.parseInt(p.nextLine());
            DonHang114 dh = new DonHang114(ten,ma,dongia,soluong);
            list.add(dh);
        }
        list.sort((o1,o2)-> o1.getSoThuTu().compareTo(o2.getSoThuTu()));
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).toString());
        }
    }
}
