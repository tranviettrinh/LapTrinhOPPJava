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
public class HoaDon144 {
    private String id, name;
    private int chisodau, chisocuoi;

    public HoaDon144() {
    }

    public HoaDon144(String id, String name, int chisodau, int chisocuoi) {
        this.id = id;
        this.name = name;
        this.chisodau = chisodau;
        this.chisocuoi = chisocuoi;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getChisodau() {
        return chisodau;
    }

    public int getChisocuoi() {
        return chisocuoi;
    }
    public String getTongTien(){
        return String.valueOf(getThanhTien());
    }
    public long getThanhTien(){
        int a = chisocuoi-chisodau;
        long c = ((50*100+50*150+ (a-100)*200)*105+50)/100;
        long e = ((50*100+ (a-50)*150)*103+50)/100;
        long f = (a*100*102+50)/100;
        if(a>100) return c;
        else if(a>50) return e;
        else return f;
    }
    public String toString(){
        return String.format(id+" "+name+" "+getTongTien());
    }
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = Integer.parseInt(p.nextLine());
        int u=0;
        List<HoaDon144> list = new ArrayList<>();
        while(u++<t){
            String id = "KH".concat(String.format("%02d",u));
            String name = p.nextLine();
            int cu = Integer.parseInt(p.nextLine());
            int moi = Integer.parseInt(p.nextLine());
            HoaDon144 hd = new HoaDon144(id,name,cu,moi);
            list.add(hd);          
        }
        list.sort((o1,o2)-> o1.getThanhTien()>o2.getThanhTien()?-1:o1.getThanhTien()==o2.getThanhTien()?0:1);
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i).toString());
        }
    }
}
