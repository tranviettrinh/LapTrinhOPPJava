/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapTrinhOPPJava.OPP;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author trinhtv.B17AT191
 */
public class TnhGio {
    private String id,name;
    private Duration hour;

    public TnhGio(String id, String name, Duration hour) {
        this.id = id;
        this.name = name;
        this.hour = hour;
    }

    public TnhGio() {
    }

    public Duration getHour() {
        return hour;
    }
    public String toString(){
        return String.format(id+" "+name+" "+ hour.toMinutes()/60 +" gio "+hour.toMinutes()%60+" phut");
    }
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = Integer.parseInt(p.nextLine());
        int u=0;
        List<TnhGio> list = new ArrayList<>();
        while(u++<t){
            String ma = p.nextLine();
            String ten = p.nextLine();
            String batdau = p.nextLine();
            String ketthuc = p.nextLine();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("H:mm");
            LocalTime bd = LocalTime.parse(batdau,dtf);
            LocalTime kt = LocalTime.parse(ketthuc,dtf);
            Duration khoangtg = Duration.between(bd, kt);
            TnhGio tinhgio = new TnhGio(ma,ten,khoangtg);
            list.add(tinhgio);
        }
        list.sort((o1,o2)-> o2.getHour().compareTo(o1.getHour()));
        for(int i=0; i<t;i++){
            System.out.println(list.get(i).toString());
        }
    }
}
