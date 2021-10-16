/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xangDau;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static xangDau.XangDau143.DonGia;
import static xangDau.XangDau143.TenHang;
import static xangDau.XangDau143.Thue;

/**
 *
 * @author trinhtv.B17AT191
 */
public class Main {
    public static void main(String[] args){
        Scanner p = new Scanner(System.in);
        int t = Integer.parseInt(p.nextLine());
        int u = 0;
        List<XangDau143> list = new ArrayList<>();
        while (u++ < t) {
            String id = p.next();
            int m = id.length();
            int soluong = Integer.parseInt(p.next());
            p.nextLine();
            String name = TenHang(id.substring(3, 5));
            String dongia = String.valueOf(DonGia(id.substring(0, 1)));

            String thue = String.format("%.0f",Thue(soluong, id.substring(0, 1),id.substring(m-2)));           
           
            double tongtien = (Thue(soluong, id.substring(0, 1),id.substring(m-2)) + DonGia(id.substring(0, 1)) * soluong);
            XangDau143 xd = new XangDau143(id, name, dongia, thue, tongtien, soluong);
            list.add(xd);

        }
//        list.sort((o1,o2)-> o1.getTongtien()>o2.getTongtien()?-1:o1.getTongtien()==o2.getTongtien()?0:1);
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i).toString());
        }
    }
}
