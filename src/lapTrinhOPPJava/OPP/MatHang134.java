/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapTrinhOPPJava.OPP;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author trinhtv.B17AT191
 */
public class MatHang134 {
    private String id,name,team;
    private float giamua, giaban;

    public MatHang134() {
    }

    public MatHang134(String id, String name, String team, float giamua, float giaban) {
        this.id = id;
        this.name = name;
        this.team = team;
        this.giamua = giamua;
        this.giaban = giaban;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public float getGiamua() {
        return giamua;
    }

    public float getGiaban() {
        return giaban;
    }
    public float LoiNhuan(){        
        float a = (getGiaban()-getGiamua());
        return a;
    }
    public String getLoiNhuan(){
        DecimalFormat df = new DecimalFormat("0.00");
        return String.valueOf(df.format(LoiNhuan()));
    }
    public String toString(){
        return String.format(id+" "+name+" "+team+" "+getLoiNhuan());
    }
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = Integer.parseInt(p.nextLine());
        int u =0;
        List<MatHang134> list = new ArrayList<>();
        while(u++<t){            
            String ten = p.nextLine();
            String nhom = p.nextLine();
            float mua = Float.parseFloat(p.nextLine());
            float ban = Float.parseFloat(p.nextLine());
            MatHang134 mh = new MatHang134(String.valueOf(u),ten,nhom,mua,ban);
            list.add(mh);
        }
        list.sort((o1,o2)-> o1.LoiNhuan()>o2.LoiNhuan()?-1:1);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).toString());
        }
    }
}
