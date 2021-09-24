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
public class KhachHang112 {
    private String id, loai;
    private int chisocu,chisomoi;

    public KhachHang112() {
    }

    public KhachHang112(String id, String loai, int chisocu, int chisomoi) {
        this.id = id;
        this.loai = loai;
        this.chisocu = chisocu;
        this.chisomoi = chisomoi;
    }

    public String getId() {
        return id;
    }

    public String getLoai() {
        return loai;
    }

    public int getChisocu() {
        return chisocu;
    }

    public int getChisomoi() {
        return chisomoi;
    }
    public int getHeSo(){
        String a = getLoai().toUpperCase();
        switch(a){
            case "KD": return 3;
            case "NN": return 5;
            case "TT": return 4;
            case "CN": return 2;
            default:return 0;
        }
    }
    public long getThanhTien(){
        return (getChisomoi()-getChisocu())*getHeSo()*550;
    }
    public long getPhuTroi(){
        long a = getChisomoi()-getChisocu();
        long b = getThanhTien();
       if(a>100) return b;
       else if(a>=50) return (b*35+50)/100;
       else return 0;
    }
    public long getTongTien(){
        long c = getPhuTroi()+getThanhTien();
       
        return c;
    }
    public String toString(){
        return String.format(id+" "+getHeSo()+" "+getThanhTien()+" "+getPhuTroi()+" "+getTongTien());
    }
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = Integer.parseInt(p.nextLine());
        int u=0;
        List<KhachHang112> list = new ArrayList<>();
        
        while(u++<t){
            String id = "KH".concat(String.format("%02d",u));
            String loai = p.nextLine();
            int cu = Integer.parseInt(p.nextLine());
            int moi = Integer.parseInt(p.nextLine());
            KhachHang112 kh = new KhachHang112(id,loai,cu,moi);
            list.add(kh);
        }
        list.sort((o1,o2)-> o1.getTongTien()>o2.getTongTien()?-1:1);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).toString());
        }
    }
}
