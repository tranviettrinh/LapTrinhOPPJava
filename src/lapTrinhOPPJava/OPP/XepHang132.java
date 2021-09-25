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
public class XepHang132 {

    private String name;
    private int c, d;

    public XepHang132() {
    }

    public String getName() {
        return name;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public XepHang132(String name, int c, int d) {
        this.name = ChuanHoa(name);
        this.c = c;
        this.d = d;
    }

    public String ChuanHoa(String a) {
        String[] tach = a.split(" ");
        String b = new String();
        for (int j = 0; j < tach.length; j++) {
            tach[j] = tach[j].substring(0,1).toUpperCase().concat(tach[j].substring(1).toLowerCase());
            b = b.concat(tach[j]+" ");
        }
        return b = b.substring(0,b.length()-1);
    }
    public String toString(){
        return String.format(name+" "+c+" "+d);
    }
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = Integer.parseInt(p.nextLine());
        int u =0;
        List<XepHang132> list = new ArrayList<>();
        while(u++<t){
            String name = p.nextLine();
            int c = Integer.parseInt(p.next());
            int d = Integer.parseInt(p.next());
            p.nextLine();
            XepHang132 xh = new XepHang132(name,c,d);
            list.add(xh);            
        }
        Comparator<XepHang132> sortc = (o1,o2)-> o1.getC()>o2.getC()?-1:o1.getC()==o2.getC()?0:1;
        Comparator<XepHang132> sortd = (o1,o2)-> o2.getD()>o1.getD()?-1:o2.getD()==o1.getD()?0:1;
        Comparator<XepHang132> sortname = (o1,o2)-> o1.getName().compareTo(o2.getName());
        list.sort(sortc.thenComparing(sortd.thenComparing(sortname)));
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i).toString());
        }
    }
}
