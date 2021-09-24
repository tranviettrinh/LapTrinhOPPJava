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
public class MatHang102 {

    private String id, name;
    private int quantity, price;

    public MatHang102(String id, String name, int quantity, int price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public MatHang102() {
    }

    public int getTienChietKhau() {

        if (quantity > 10) {
            return price * quantity * 5 / 100;
        } else if (quantity >= 8) {
            return price * quantity * 2 / 100;
        } else if (quantity >= 5) {
            return price * quantity * 1 / 100;
        } else {
            return 0;
        }
    }

    public int getThanhTien() {
        return price * quantity - getTienChietKhau();
    }

    public String toString() {
        return String.format(id + " " + name + " " + getTienChietKhau() + " " + getThanhTien());
    }

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = Integer.parseInt(p.nextLine());
        int u = 0;
        List<MatHang102> list = new ArrayList<>();
        ArrayList <String> a = new ArrayList<>();
        ArrayList <Integer> b = new ArrayList<Integer>();
        
        while (u++ < (t)) {
            String mathang = p.nextLine();
            String[] tach = mathang.split(" ");
            String tat = tach[0].substring(0, 1).toUpperCase().concat(tach[1].substring(0,1).toUpperCase());
            int n =a.size();
            int k =-1;
            for(int j=0; j<n;j++){
                
                if(tat.equalsIgnoreCase(a.get(j))){
                    int r = b.get(j) +1;
                    b.set(j, r);
                    k = b.get(j);
                }
            }
            if(k==-1){
                a.add(tat);
                b.add(1);
                k=1;
            }
            String id = tat.concat(String.format("%02d",k));
            int soluong = Integer.parseInt(p.nextLine());
            int dongia = Integer.parseInt(p.nextLine());
            MatHang102 mt = new MatHang102(id,mathang,soluong,dongia);
            list.add(mt);

        }
        list.sort((o1,o2)-> o2.getTienChietKhau()>o1.getTienChietKhau()?1:-1);
        for (int i = 0; i < list.size(); i++) {
            
            System.out.println(list.get(i).toString());
        }
        
    }
}
