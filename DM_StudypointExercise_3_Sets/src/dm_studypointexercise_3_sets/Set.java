/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm_studypointexercise_3_sets;

import java.util.Collection;

/**
 *
 * @author Frederik
 */
public class Set<T extends Comparable<T>> {
    T[] values;
    boolean isInfinite = false;
    
    public Set(){
        values = (T[])new Comparable[0];
    }
    
    public Set(boolean isInfinite){
        this.isInfinite = isInfinite;
    }
    
    public Set(T[] values){
        this.values = values;
    }
    
    public void setValues(T[] values){
        this.values = values;
    }
    
    public T[] getValues(){
        return values;
    }
}
