/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bongda164;

/**
 *
 * @author trinhtv.B17AT191
 */
public class CLB164 {
    private String id, name;
    private int giave;

    public CLB164(String id, String name, int giave) {
        this.id = id;
        this.name = name;
        this.giave = giave;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGiave() {
        return giave;
    }
    @Override
    public String toString(){
        return null;
    }
}
