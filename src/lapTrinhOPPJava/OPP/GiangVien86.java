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
public class GiangVien86 {
    private String id,name, branch;

    public GiangVien86() {
    }

    public String getName() {
        String[] tach =this.name.split(" ");
        return tach[tach.length-1];
    }

    public GiangVien86(String id, String name, String branch) {
        this.id = id;
        this.name = name;
        this.branch = branch;
    }
    public String toString(){
        return String.format(id+" "+name+" "+branch);
    }
    public static String XuLyChu(String a){
        String b = new String();
        String[] tach = a.split(" ");
        for(int j=0; j< tach.length;j++){
            tach[j]=tach[j].substring(0,1).toUpperCase();
            b = b.concat(tach[j]);
        }
        return b;
    }
   
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t =Integer.parseInt(p.nextLine());
        int u=0;
        List<GiangVien86> list = new ArrayList<>();
        while(u++<t){
            String mgv = new String();
            if(u<10) mgv ="GV0".concat(String.valueOf(u));
            else mgv = "GV".concat(String.valueOf(u));
            String ten = p.nextLine();
            String nganh = p.nextLine();
            String nganhgv = XuLyChu(nganh);
            GiangVien86 gv = new GiangVien86(mgv,ten,nganhgv);
            list.add(gv);
        }
       list.sort((o1,o2)-> o1.getName().compareTo(o2.getName()));
        for(int i=0; i<list.size();i++){
        System.out.println(list.get(i).toString());
    }
    }
}
