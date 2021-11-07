/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lopPair173;

/**
 *
 * @author trinhtv.B17AT191
 * @param <T>
 */
public class Pair <T,S>{
    private T first;
    private S second;

    public Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }
    @Override
    public String toString(){
     return first+" "+second;   
    }
    private boolean check(Integer n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i == 0) return false;
        return true;
    }
    public boolean isPrime(){
        return check((Integer) first) && check((Integer)second);
    }
}
