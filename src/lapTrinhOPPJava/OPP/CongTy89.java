/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapTrinhOPPJava.OPP;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author trinhtv.B17AT191
 */
public class CongTy89 {

    private String id, name;
    private int quantity;

    public CongTy89(String id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public CongTy89() {
    }

    public String toString() {
        return String.format(id + " " + name + " " + String.valueOf(quantity));
    }

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = Integer.parseInt(p.nextLine());
        int u = 0;
        List<CongTy89> list = new ArrayList<>();
        while (u++ < t) {
            String ma = p.nextLine();
            String tenct = p.nextLine();
            int soluong = Integer.parseInt(p.nextLine());

            CongTy89 ct = new CongTy89(ma, tenct, soluong);
            list.add(ct);
        }
        int a = Integer.parseInt(p.nextLine());
        int b = 0;
        Comparator<CongTy89> sortsoluong = (o1, o2) -> o2.getQuantity() > o1.getQuantity() ? 1 : o2.getQuantity() == o1.getQuantity() ? 0 : -1;
        Comparator<CongTy89> sortma = (o3, o4) -> o3.getId().compareTo(o4.getId());
        list.sort(sortsoluong.thenComparing(sortma));

        while (b++ < a) {

            int c = Integer.parseInt(p.next());
            int d = Integer.parseInt(p.next());
            p.nextLine();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + c + " DEN " + d + " SINH VIEN:");
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getQuantity() >= c && list.get(i).getQuantity() <= d) {
                    System.out.println(list.get(i).toString());
                }

            }
        }
    }
}
