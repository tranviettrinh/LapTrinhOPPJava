/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapTrinhOPPJava.OPP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author trinhtv.B17AT191
 */
public class XetTuyen136 {

    private String id, name;
    private Date ngaysinh;
    private float diemlythuyet, diemhuchanh;

    public XetTuyen136() {
    }

    public XetTuyen136(String id, String name, String ngaysinh, float diemlythuyet, float diemhuchanh) throws ParseException {
        this.id = id;
        this.name = name;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.diemlythuyet = diemlythuyet;
        this.diemhuchanh = diemhuchanh;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public float getDiemlythuyet() {
        return diemlythuyet;
    }

    public float getDiemhuchanh() {
        return diemhuchanh;
    }

    public String getXepLoai(int a) {
        if (a >= 9) {
            return "Xuat sac";
        } else if (a >= 8) {
            return "Gioi";
        } else if (a >= 7) {
            return "Kha";
        } else if (a >= 5) {
            return "Trung binh";
        } else {
            return "Truot";
        }
    }

    public int Diem() {
        float a = getDiemlythuyet();
        float b = getDiemhuchanh();
        float c = (a + b) / 2;
        if (a == 10 & b == 10) {
            return 10;
        } else if (a >= 8 && b >= 8) {
            return (int) (c + 1 + 0.5);
        } else if (a >= 7.5 && b >= 7.5) {
            return (int) (c + 0.5 + 0.5);
        } else {
            return (int) (c + 0.5);
        }
    }

    public String getDiem(int a) {
       return String.valueOf(a);
    }

    public String getTuoi() {
        LocalDate now = LocalDate.now();
        LocalDate ngaysing = LocalDate.parse(new SimpleDateFormat("yyyy-MM-dd").format(ngaysinh));
        String a = String.valueOf(now.getYear());
        String b = String.valueOf(ngaysing.getYear());
        int c = Integer.parseInt(a) - Integer.parseInt(b);
        return String.valueOf(c);
    }

    public String toString() {
        return String.format(id + " " + name + " " + getTuoi() + " " + getDiem(Diem()) + " " + getXepLoai(Diem()));
    }

    public static void main(String[] args) throws ParseException {
        Scanner p = new Scanner(System.in);
        List<XetTuyen136> list = new ArrayList<>();
        int t = Integer.parseInt(p.nextLine());
        int u = 0;
        while (u++ < t) {
            XetTuyen136 xt = new XetTuyen136("PH".concat(String.format("%02d", u)), p.nextLine(), p.nextLine(), Float.parseFloat(p.nextLine()), Float.parseFloat(p.nextLine()));
            list.add(xt);
        }

//        Comparator<XetTuyen136> sorttrungbinh = (o1,o2)-> o1.Diem()>o2.Diem()?-1:o1.Diem()==o2.Diem()?0:1;
//        Comparator<XetTuyen136> sortid = (o1, o2) -> o1.getId().compareTo(o2.getId());
//        list.sort(sorttrungbinh.thenComparing(sortid));
        for (XetTuyen136 xt : list) {
            System.out.println(xt.toString());
        }

    }

}
