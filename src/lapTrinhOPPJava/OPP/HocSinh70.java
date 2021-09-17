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
public class HocSinh70 {
    private String id,name,rating;
    private double medium;

    public HocSinh70() {
    }

    public HocSinh70(String id, String name,  double medium,String rating) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.medium = medium;
    }

    public double getMedium() {
        return medium;
    }
    
    
    public String toString(){
        return String.format(id+" "+name+" "+String.valueOf(medium)+" "+rating);
    }
//    public static String ChuanHoaTen(String a){
//        String b = new String();
//        String[] tachten = a.split(" ");
//        for(int j=0;j<tachten.length;j++){
//            if(!tachten[j].isEmpty()){
//                tachten[j] = tachten[j].substring(0,1).concat(tachten[j].substring(1));
//                b = b.concat(tachten[j].concat(" "));
//            }
//        }
//        b = b.substring(0, b.length()-1);
//        return b;
//        
//    }
    public static String XepLoai(double a){
              
        if(a>=9) return "XUAT SAC";
        if(a>=8) return "GIOI";
        if(a>=7) return "KHA";
        if(a>=5) return "TB";
        return "YEU";
        
    }
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = Integer.parseInt(p.nextLine());
        int u =0;
        List<HocSinh70> list = new ArrayList<>();
        while(u++<t){
            String ms = new String();
            if(u<10) ms = "HS0".concat(String.valueOf(u));
            else ms ="HS".concat(String.valueOf(u));
            String ten = p.nextLine();
//            String tenhs = ChuanHoaTen(ten);    
           
            double mot = Double.parseDouble(p.next());
            double  hai = Double.parseDouble(p.next());
            double ba = Double.parseDouble(p.next());
            double bon = Double.parseDouble(p.next());
            double nam = Double.parseDouble(p.next());
            double sau = Double.parseDouble(p.next());
            double bay = Double.parseDouble(p.next());
            double tam = Double.parseDouble(p.next());
            double chin = Double.parseDouble(p.next());
            double muoi = Double.parseDouble(p.next());
            p.nextLine();
            
            double trungbinh = (mot*2+hai*2+ba+bon+nam+sau+bay+tam+chin+muoi)/12;
            trungbinh= (double)Math.round(trungbinh * 10) / 10;
            String xeploai = XepLoai(trungbinh);
            
            
            HocSinh70 hs = new HocSinh70(ms,ten,trungbinh,xeploai);
            list.add(hs);
        }
        list.sort((o1,o2)-> o2.getMedium()>=o1.getMedium()? 1:-1);
        for(int i=0;i<t;i++){
            System.out.println(list.get(i).toString());
        }
    }
}
