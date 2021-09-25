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
public class ThuKhoa133 {

    private String id, name, birthday;
    private float mon1, mon2, mon3;

    public ThuKhoa133(String id, String name, String birthday, float mon1, float mon2, float mon3) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
    }

    public ThuKhoa133() {
    }
    public String getTongDiem2(){
        return String.valueOf(getTongDiem());
    }
    public float getTongDiem(){
        float a = mon1+mon2+mon3;
        return a;
    }
    public String toString(){
        return String.format(id+" "+name+" "+birthday+" "+ getTongDiem2());
    }
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = Integer.parseInt(p.nextLine());
        int u =0;
        List<ThuKhoa133> list = new ArrayList<>();
        while(u++<t){
            
            String name = p.nextLine();
            String birthday = p.nextLine();
            float mon1 = Float.parseFloat(p.nextLine());
            float mon2 = Float.parseFloat(p.nextLine());
            float mon3 = Float.parseFloat(p.nextLine());
            ThuKhoa133 thukhoa = new ThuKhoa133(String.valueOf(u),name,birthday,mon1,mon2,mon3);
            list.add(thukhoa);
            
        }
        list.sort((o1,o2)-> o1.getTongDiem()>o2.getTongDiem()?-1:o1.getTongDiem()==o2.getTongDiem()?0:1);
        float a = list.get(0).getTongDiem();
        for(int i=0; i<list.size();i++){
            if(list.get(i).getTongDiem()==a)
            System.out.println(list.get(i).toString());
        }
    }
}
