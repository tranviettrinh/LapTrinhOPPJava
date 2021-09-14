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
public class DanhSachDoiTuongNhanVien {
    private String id, name, sex, birthday, address,taxcode, contractdate;

    public DanhSachDoiTuongNhanVien() {
    }

    public DanhSachDoiTuongNhanVien(String id, String name, String sex, String birthday, String address, String taxcode, String contractdate) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.address = address;
        this.taxcode = taxcode;
        this.contractdate = contractdate;
    }
     public String toString(){
         return String.format(id+" "+name+" "+birthday+" "+address+" "+taxcode+" "+contractdate);
     }
     public static void main(String[] args) {
         Scanner p = new Scanner(System.in);
         int t = Integer.parseInt(p.nextLine());
         int u = 1;
         List<DanhSachDoiTuongNhanVien> list = new ArrayList<>();
         while(u++<t){
             String maNV = new String();
             if(u<10) maNV =" ";
         }
         for(int i =0; i<t;i++){
             System.out.println(list.get(i).toString());
         }
    }
    
}
