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
    
    public int compareSet(Set b){
        if(this.isInfinite && b.isInfinite){
            return 2;
        }
        if(this.isInfinite){
            return 1;
        }
        if(b.isInfinite){
            return -1;
        }
        if(this.getValues().length == 0 || b.getValues().length == 0){
            return 2;
        }
        
        
        int aCounter = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < b.getValues().length; j++) {
                if(values[i] == b.getValues()[j]){
                    aCounter++;
                }
            }
        }
        
        int bCounter = 0;
        for (int i = 0; i < b.getValues().length; i++) {
            for (int j = 0; j < values.length; j++) {
                if(values[j] == b.getValues()[i]){
                    bCounter++;
                }
            }
        }
        if(aCounter == values.length && bCounter == b.getValues().length){
            return 0;
        }
        if(aCounter == values.length){
            return -1;
        }
        if(bCounter == b.getValues().length){
            return 1;
        }

        return -2;
    }
}
