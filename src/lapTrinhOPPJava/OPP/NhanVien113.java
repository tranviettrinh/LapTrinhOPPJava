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
public class NhanVien113 {

    private String id, name, position;
    private int payday, days;

    public NhanVien113() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getPayday() {
        return payday;
    }

    public int getDays() {
        return days;
    }

    public int getLuongThang() {
        return payday * days;
    }

    public int getThuong() {
        if (days >= 25) {
            return getLuongThang() * 20 / 100;
        } else if (days >= 22) {
            return getLuongThang() * 10 / 100;
        } else {
            return 0;
        }
    }

    public int getPhuCap() {
        switch(position){
            case"GD": return 250000;
            case"PGD": return 200000;
            case"TP": return 180000;
            default: return 150000;
        }
    }
    public int getThucLinh(){
        return getLuongThang()+getThuong()+getPhuCap();
    }

    public NhanVien113(String id, String name, String position, int payday, int days) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.payday = payday;
        this.days = days;
    }

    public String toString() {
        return String.format(id + " " + name + " "+ getLuongThang()+" "+getThuong()+" "+getPhuCap()+" "+ getThucLinh());
    }
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = Integer.parseInt(p.nextLine());
        int u =0;
        List<NhanVien113> list = new ArrayList<>();
        while(u++<t){
            String id ="NV".concat(String.format("%02d",u));
            String name = p.nextLine();
            int payday = Integer.parseInt(p.nextLine());
            int days = Integer.parseInt(p.nextLine());
            String position = p.nextLine();
            NhanVien113 nv = new NhanVien113(id,name,position,payday,days);
            list.add(nv);
            
        }
        int a = 0;
        for(int i=0; i<list.size();i++){
            
            a = a+ list.get(i).getThucLinh();
            
            System.out.println(list.get(i).toString());
            
        }
       
        System.out.println("Tong chi phi tien luong: "+a);
    }
}
