/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanao183;

/**
 *
 * @author trinhtv.B17AT191
 */
public class QuanAo184 {
    private String id, name;
   private int dongia1,dongia2;

    public QuanAo184() {
    }

    public QuanAo184(String id, String name, int dongia1, int dongia2) {
        this.id = id;
        this.name = name;
        this.dongia1 = dongia1;
        this.dongia2 = dongia2;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDongia1() {
        return dongia1;
    }

    public int getDongia2() {
        return dongia2;
    }
    
}
