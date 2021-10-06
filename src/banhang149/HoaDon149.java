/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banhang149;

/**
 *
 * @author trinhtv.B17AT191
 */
public class HoaDon149 {
    private String id, idKH,idMH;
    private int soluong;
    private int loinhuan,thanhtien;

    public HoaDon149() {
    }

    public HoaDon149(int n, String idKH, String idMH, int soluong,int thanhtien,int loinhuan) {
        this.id = "HD".concat(String.format("%03d",n));
        this.idKH = idKH;
        this.idMH = idMH;
        this.soluong = soluong;
        this.loinhuan = loinhuan;
        this.thanhtien = thanhtien;
    }

    public String getId() {
        return id;
    }

    public String getIdKH() {
        return idKH;
    }

    public String getIdMH() {
        return idMH;
    }

    public int getSoluong() {
        return soluong;
    }

    public int getLoinhuan() {
        return loinhuan;
    }

    public int getThanhtien() {
        return thanhtien;
    }
    
    @Override
    public String toString(){
        return String.format(id);
    }
}
