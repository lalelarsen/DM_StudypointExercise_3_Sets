/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm_studypointexercise_3_sets;

import java.util.ArrayList;

/**
 *
 * @author Frederik
 */
public class SetTheory {
    
    public static Set Difference(Set a, Set b){
        if(a.isInfinite || a.isInfinite && b.isInfinite){
            return new Set(true);
        }
        if(b.isInfinite){
            return new Set();
        }
        ArrayList<Comparable> tmpArrayList = new ArrayList();
        
        for (int i = 0; i < a.getValues().length; i++) {
            boolean check = true;
            for (int j = 0; j < b.getValues().length; j++) {
                if(a.getValues()[i] == b.getValues()[j]){
                    check = false;
                }
            }
            if(check){
                tmpArrayList.add(a.getValues()[i]);
            }
        }
        
        Comparable[] result = new Comparable[tmpArrayList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = tmpArrayList.get(i);
        }

        return new Set(result);
    }
    
    public static Set Union(Set a, Set b){
        if(a.isInfinite || b.isInfinite){
            return new Set(true);
        }
        
        ArrayList<Comparable> tmpArrayList = new ArrayList();
        for (int i = 0; i < a.getValues().length; i++) {
            tmpArrayList.add(a.getValues()[i]);
        }
        
        for (int i = 0; i < b.getValues().length; i++) {
            boolean check = true;
            for (int j = 0; j < tmpArrayList.size(); j++) {
                if(tmpArrayList.get(j) == b.getValues()[i]){
                    check = false;
                    
                }
            }
            if(check){
                tmpArrayList.add(b.getValues()[i]);
            }
        }
        
        Comparable[] result = new Comparable[tmpArrayList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = tmpArrayList.get(i);
        }
        
        return new Set(result);
    }
    
    public static Set Intersection(Set a, Set b){
        if(a.isInfinite && b.isInfinite){
            return new Set(true);
        }
        if(a.isInfinite){
            return b;
        }
        if(b.isInfinite){
            return a;
        }
        if(a.getValues().length == 0 || b.getValues().length == 0){
            return new Set();
        }
        
        ArrayList<Comparable> tmpArrayList = new ArrayList<>();
        
        for (int i = 0; i < a.getValues().length; i++) {
            boolean check = false;
            for (int j = 0; j < b.getValues().length; j++) {
                if(a.getValues()[i] == b.getValues()[j]){
                    check = true;
                }
            }
            if(check){
                tmpArrayList.add(a.getValues()[i]);
            }
        }
        
        Comparable[] result = new Comparable[tmpArrayList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = tmpArrayList.get(i);
        }
        
        return new Set(result);
        
    }

    public static boolean membership(Comparable c, Set a){
        if(a.isInfinite){
            return true;
        }
        if(a.getValues().length == 0){
            return false;
        }
        
        for (int i = 0; i < a.getValues().length; i++) {
            if(c == a.getValues()[i]){
                return true;
            }
        }
        return false;
    }
    
}
