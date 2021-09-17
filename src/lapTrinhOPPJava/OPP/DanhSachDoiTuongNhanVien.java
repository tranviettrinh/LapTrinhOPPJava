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

    private String id, name, sex, birthday, address, taxcode, contractdate;

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

    public String toString() {
        return String.format(id + " " + name + " "+sex+" " + birthday + " " + address + " " + taxcode + " " + contractdate);
    }

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = Integer.parseInt(p.nextLine());
        int u = 0;
        List<DanhSachDoiTuongNhanVien> list = new ArrayList<>();
        while (u++ < t) {
            String maNV = String.format("%05d",u);
            String ten = p.nextLine();
            String tennv = new String();
            String[] tachten = ten.split(" ");
            for (int j = 0; j < tachten.length; j++) {
                if (!tachten[j].isEmpty()) {
                    tachten[j] = tachten[j].substring(0, 1).toUpperCase().concat(tachten[j].substring(1).toLowerCase());
                    tennv = tennv.concat(tachten[j].concat(" "));
                }
            }
            tennv = tennv.substring(0, tennv.length()-1);
            String gioitinh = p.nextLine();
            String namsinh = p.nextLine();
        
            String[] tachnamsinh = namsinh.split("/");
            if(tachnamsinh[0].length()==1) tachnamsinh[0] = "0".concat(tachnamsinh[0]);
            if(tachnamsinh[1].length() ==1) tachnamsinh[1] = "0".concat(tachnamsinh[1]);
            String namsinhnv = tachnamsinh[0].concat("/".concat(tachnamsinh[1].concat("/".concat(tachnamsinh[2]))));
            String diachi = p.nextLine();
            String mathue = p.nextLine();
            String ngayky = p.nextLine();
            String[] tachky = ngayky.split("/");
            if(tachky[0].length()==1) tachky[0]="0".concat(tachky[0]);
            if(tachky[1].length() ==1) tachky[1]="0".concat(tachky[1]);
            String ngaykyhd = tachky[0].concat("/".concat(tachky[1].concat("/".concat(tachky[2]))));
            DanhSachDoiTuongNhanVien nv = new DanhSachDoiTuongNhanVien(maNV,tennv,gioitinh,namsinhnv,diachi,mathue,ngaykyhd);
            list.add(nv);

        }
        for (int i = 0; i < t; i++) {
            System.out.println(list.get(i).toString());
        }
    }

}
