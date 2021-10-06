/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banhang149;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author trinhtv.B17AT191
 */

public class BanHang149 {

    public static String getKhachHangByID(List<KhachHang149> kh, String idkh) {
        for (int i = 0; i < kh.size(); i++) {
            if (kh.get(i).getId().equalsIgnoreCase(idkh)) {
                return kh.get(i).toString();
            }
        }
        return " ";
    }

    public static String getMatHangByID(List<MatHang149> mh, String idmh) {
        for (int i = 0; i < mh.size(); i++) {
            if (mh.get(i).getId().equalsIgnoreCase(idmh)) {
                return mh.get(i).toString();
            }
        }
        return null;
    }
    public static int getGiaBanByID(List<MatHang149> mh, String idmh) {
        for (int i = 0; i < mh.size(); i++) {
            if (mh.get(i).getId().equalsIgnoreCase(idmh)) {
                return mh.get(i).getGiaban();
            }
        }
        return 0;
    }
    public static int getLoiNhuanByID(List<MatHang149> mh, String idmh) {
        for (int i = 0; i < mh.size(); i++) {
            if (mh.get(i).getId().equalsIgnoreCase(idmh)) {
                return mh.get(i).getLoiNhuan();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        List<KhachHang149> listkhachhang = new ArrayList<>();
        List<MatHang149> listmathang = new ArrayList<>();
        List<HoaDon149> listhoadon = new ArrayList<>();
        int t = Integer.parseInt(p.nextLine());
        int u = 0;
        while (u++ < t) {
            KhachHang149 kh = new KhachHang149(u, p.nextLine(), p.nextLine(), p.nextLine(), p.nextLine());
            listkhachhang.add(kh);
        }
        
        int a = Integer.parseInt(p.nextLine());
        int b = 0;
        while (b++ < a) {
            MatHang149 mh = new MatHang149(b, p.nextLine(), p.nextLine(), Integer.parseInt(p.nextLine()), Integer.parseInt(p.nextLine()));
            listmathang.add(mh);
        }
        
        int c = Integer.parseInt(p.nextLine());
        int d = 0;
        while (d++ < c) {
            String makh = p.next();
            String mamh = p.next();
            int sl = p.nextInt();
            p.nextLine();
            int g = getLoiNhuanByID(listmathang, mamh)*sl;
            int h = getGiaBanByID(listmathang, mamh)*sl;
            HoaDon149 hd = new HoaDon149(d, makh, mamh, sl,h,g);
            listhoadon.add(hd);
        }
        listhoadon.sort((g1,g2)-> g1.getLoinhuan()>g2.getLoinhuan()?-1:g1.getLoinhuan()>g2.getLoinhuan()?0:1);
        for (int i = 0; i < listhoadon.size(); i++) {
           String x = listhoadon.get(i).getId();
           String y = getKhachHangByID(listkhachhang, listhoadon.get(i).getIdKH());
           String z = getMatHangByID(listmathang, listhoadon.get(i).getIdMH());
           String m = String.valueOf(listhoadon.get(i).getSoluong());
           String o = String.valueOf(listhoadon.get(i).getThanhtien());
           String s = String.valueOf(listhoadon.get(i).getLoinhuan());
            System.out.println(x+" "+y+" "+z+" "+m+" "+o+" "+s);
        }

    }
}
