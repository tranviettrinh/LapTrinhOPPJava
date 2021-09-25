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
public class HangHoa117 {
    private String id, ten, donvitinh;
    private int dongianhap, soluong;

    public HangHoa117() {
    }

    public HangHoa117(String id, String ten, String donvitinh, int dongianhap, int soluong) {
        this.id = id;
        this.ten = ten;
        this.donvitinh = donvitinh;
        this.dongianhap = dongianhap;
        this.soluong = soluong;
    }

    public String getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public String getDonvitinh() {
        return donvitinh;
    }

    public int getDongianhap() {
        return dongianhap;
    }

    public int getSoluong() {
        return soluong;
    }
    public long getPhiVanChuyen(){
        long a = (getDongianhap()*getSoluong()*5+50)/100;
        return a;
    }
    public String getPhiVanChuyen2(){
        return String.valueOf(getPhiVanChuyen());
    }
    public long getThanhTien(){
        long b = getDongianhap()*getSoluong()+getPhiVanChuyen();
        return b;
    }
    public String getThanhTien2(){
        return String.valueOf(getThanhTien());
    }
    public String getGiaBan2(){
        return String.valueOf(getGiaBan());
    }
    public long getGiaBan(){
        long c = (getThanhTien()+ getThanhTien()*2/100)/getSoluong();
        
        long d = (c+100)/100*100;
        
        return d;
    }
    public String toString(){
        return (String.format(id+" "+ten+" "+donvitinh+" "+getPhiVanChuyen2()+" "+getThanhTien2()+" "+getGiaBan2()));
    }
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = Integer.parseInt(p.nextLine());
        int u =0;
        List<HangHoa117> list = new ArrayList<>();
        while(u++<t){
            String id = "MH".concat(String.format("%02d",u));
            String ten = p.nextLine();
            String donvitinh = p.nextLine();
            int dongianhap = Integer.parseInt(p.nextLine());
            int soluong = Integer.parseInt(p.nextLine());
            HangHoa117 hh = new HangHoa117(id,ten,donvitinh,dongianhap,soluong);
            list.add(hh);
        }
        list.sort((o1,o2)-> o1.getGiaBan()>o2.getGiaBan()?-1:o1.getGiaBan()==o2.getGiaBan()?0:1);
        for(int i =0; i<list.size(); i++){
            System.out.println(list.get(i).toString());
        }
    }
}
