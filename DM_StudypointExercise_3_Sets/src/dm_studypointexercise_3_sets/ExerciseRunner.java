/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm_studypointexercise_3_sets;

/**
 *
 * @author Frederik
 */
public class ExerciseRunner {

    public static void main(String[] args) {
        //A is a set of 4 elements
        Set<Integer> A = new Set<>(new Integer[]{1, 2, 3, 4});
        //B is a set of 3 elements
        Set<Integer> B = new Set<>(new Integer[]{3, 4, 5});
        //C is ℝ
        Set<Integer> C = new Set<>(true);
        //D is an empty set
        Set<Integer> D = new Set<>(new Integer[0]);

        System.out.println("Set A = {1,2,3,4}");
        System.out.println("Set B = {3,4,5}");
        System.out.println("Set C = ℝ");
        System.out.println("Set D = {}");
        System.out.println("");

        System.out.println("---Intersection---");
        Set s13 = SetTheory.Intersection(A, B);
        System.out.print("A∩B = ");
        printSet(s13);
        Set s14 = SetTheory.Intersection(B, A);
        System.out.print("B∩A = ");
        printSet(s14);
        Set s15 = SetTheory.Intersection(A, C);
        System.out.print("A∩C = ");
        printSet(s15);
        Set s16 = SetTheory.Intersection(C, A);
        System.out.print("C∩A = ");
        printSet(s16);
        Set s17 = SetTheory.Intersection(A, D);
        System.out.print("A∩D = ");
        printSet(s17);
        Set s18 = SetTheory.Intersection(D, A);
        System.out.print("D∩A = ");
        printSet(s18);
        
        System.out.println("");
        System.out.println("---Union---");
        
        Set s7 = SetTheory.Union(A, B);
        System.out.print("A∪B = ");
        printSet(s7);
        Set s8 = SetTheory.Union(B, A);
        System.out.print("B∪A = ");
        printSet(s8);
        Set s9 = SetTheory.Union(A, C);
        System.out.print("A∪C = ");
        printSet(s9);
        Set s10 = SetTheory.Union(C, A);
        System.out.print("C∪A = ");
        printSet(s10);
        Set s11 = SetTheory.Union(A, D);
        System.out.print("A∪D = ");
        printSet(s11);
        Set s12 = SetTheory.Union(D, A);
        System.out.print("D∪A = ");
        printSet(s12);
        
        System.out.println("");
        System.out.println("---Difference---");

        Set s1 = SetTheory.Difference(A, B);
        System.out.print("A-B = ");
        printSet(s1);
        Set s2 = SetTheory.Difference(B, A);
        System.out.print("B-A = ");
        printSet(s2);
        Set s3 = SetTheory.Difference(A, C);
        System.out.print("A-C = ");
        printSet(s3);
        Set s4 = SetTheory.Difference(C, A);
        System.out.print("C-A = ");
        printSet(s4);
        Set s5 = SetTheory.Difference(A, D);
        System.out.print("A-D = ");
        printSet(s5);
        Set s6 = SetTheory.Difference(D, A);
        System.out.print("D-A = ");
        printSet(s6);

        System.out.println("");
        System.out.println("---Membership---");
        
        boolean b1 = SetTheory.membership(1, A);
        System.out.println("1∈A = " + b1);
        boolean b2 = SetTheory.membership(1, B);
        System.out.println("1∈B = " + b2);
        boolean b3 = SetTheory.membership(1, C);
        System.out.println("1∈C = " + b3);
        boolean b4 = SetTheory.membership(1, D);
        System.out.println("1∈D = " + b4);

        System.out.println("");
        System.out.println("---Complement---");
        System.out.println("??????");
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("---Subsets & Equality---");
        Set E = new Set(new Integer[]{1,2});
        Set F = new Set(new Integer[]{1,2,3,4});
        Set G = new Set(new Integer[]{3,4});
        Set H = new Set(true);
        Set I = new Set(true);
        Set J = new Set(new Integer[]{1,2});
        
        System.out.println("Set E = {1,2}");
        System.out.println("Set F = {1,2,3,4}");
        System.out.println("Set G = {3,4}");
        System.out.println("Set H = ℝ");
        System.out.println("Set I = ℝ");
        System.out.println("Set J = {1,2}");
        System.out.println("");
        
        int i1 = E.compareSet(F);
        System.out.println("E⊂F = " + i1);
        int i2 = F.compareSet(E);
        System.out.println("F⊂E = " + i2);
        int i3 = E.compareSet(H);
        System.out.println("E⊂H = " + i3);
        int i5 = E.compareSet(J);
        System.out.println("E=J = " + i5);
        int i4 = H.compareSet(I);
        System.out.println("H compared to I? = " + i4);
        int i6 = E.compareSet(G);
        System.out.println("E compared to G = " + i6);
        int i7 = H.compareSet(E);
        System.out.println("H compared to E = " + i7);
        
        
    }

    public static void printSet(Set s) {
        if (s.isInfinite) {
            System.out.println("ℝ");
        } else if (s.getValues().length == 0) {
            System.out.println("{}");
        } else {
            System.out.print("{" + s.getValues()[0]);
            for (int i = 1; i < s.getValues().length; i++) {
                System.out.print("," + s.getValues()[i]);
            }
            System.out.print("}");
            System.out.println("");
        }
    }

}
