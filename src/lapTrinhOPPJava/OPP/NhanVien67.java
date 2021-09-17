/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapTrinhOPPJava.OPP;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author trinhtv.B17AT191
 */
public class NhanVien67 {
    private String id,name, address, taxcode,sex;
    private LocalDate birthday,datesign;

    public NhanVien67(String id, String name,String sex,  LocalDate birthday, String address,String taxcode, LocalDate datesign) {
        this.id = id;
        this.sex = sex;
        this.name = name;
        this.address = address;
        this.taxcode = taxcode;
        this.birthday = birthday;
        this.datesign = datesign;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    

    public NhanVien67() {
    }
    public String toString(){
        return String.format(id+" "+name+" "+sex+" "+InNgay(birthday)+" "+address+" "+taxcode+" "+InNgay(datesign));
    }
    public static String ChuanHoaTen(String a){
        String b = new String();
        String[] tach = a.split(" ");
        for(int j =0; j< tach.length;j++){
            if(!tach[j].isEmpty()){
                tach[j] = tach[j].substring(0,1).toUpperCase().concat(tach[j].substring(1).toLowerCase());
                b = b.concat(tach[j].concat(" "));
            }
         
        }
        b = b.substring(0, b.length()-1);
        return b;
    }
    public static LocalDate ChuanHoaNgay(String a){
        
        String[] tachngay = a.split("/");
       
        LocalDate ns = LocalDate.of(Integer.parseInt(tachngay[2]),Integer.parseInt(tachngay[1]), Integer.parseInt(tachngay[0]));
        
        return ns;
    }
    public static String InNgay(LocalDate a){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String b = a.format(dtf);
        return b;
    }
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = Integer.parseInt(p.nextLine());
        int u=0;
        List<NhanVien67> list = new ArrayList<>();
        while(u++<t){
            String manv = String.format("%05d",u);
            String ten = p.nextLine();
            String tennv = ChuanHoaTen(ten);
            String gioitinh = p.nextLine();
            String ngaysinh = p.nextLine();
            LocalDate ngaysinhnv = ChuanHoaNgay(ngaysinh);
            String diachi = p.nextLine();
            String mathue = p.nextLine();
            String ngayky = p.nextLine();
            LocalDate ngaykynv = ChuanHoaNgay(ngayky);
            NhanVien67 nv = new NhanVien67(manv,tennv,gioitinh,ngaysinhnv,diachi,mathue,ngaykynv);
           
            list.add(nv);
        }
        list.sort((o1,o2)-> o1.getBirthday().compareTo(o2.getBirthday()));
        for(int i=0; i<t;i++){
            System.out.println(list.get(i).toString());
        }
    }
}
