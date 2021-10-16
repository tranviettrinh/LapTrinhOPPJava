/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diemdanh167;

/**
 *
 * @author trinhtv.B17AT191
 */
public class SinhVien167 {
    private String id,name,classroom;

    public SinhVien167(String id, String name, String classroom) {
        this.id = id;
        this.name = name;
        this.classroom = classroom;
    }

    public SinhVien167() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClassroom() {
        return classroom;
    }
    public String toString(){
        return String.format(id+" "+name+" "+classroom);
    }
}
