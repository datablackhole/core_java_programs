/**
 *      Comparable(I): An interface that is present in java.lang package & it contains only two methods
 * 
 *          public int compare(Object 1,Object 2);
 *          public boolean equals(Object obj);
 *      
 *      Returns +ve , if Obj1 comes before Obj2.
 *      Returns -ve , if Obj1 comes after Obj2.
 *      Returns 0 , if both objects are equal.
 *      
 *      
 *      -> When we are implementing comparator interface, we have to write implementation for compare method only.
 *      -> Writing method for equals method is optional because this method is available by default to java program through inheritance.
 * 
 *      If we are not satisfied with default natural sorting order (or) if default natural sorting
 *      order is not available then we can define our own customized sorting by Comparator object.
 * 
 *      When we depend upon customzied sorting order then we need to use comparator interface.
 * 
 */

 import java.util.*;

 public class ComparatorInterface implements Comparator{

    public int compare(Object o1, Object o2){
        Integer i1 = (Integer)o1;
        Integer i2 = (Integer)o2;
        if(i1< i2)
        return 1;
        else if(i1>i2)
        return -1;
        else return 0;
    }

     public static void main(String[] args) {
         System.out.println("A".compareTo("Z"));
         System.out.println("C".compareTo("A"));
         System.out.println("A".compareTo("A"));
         //System.out.println();
     }
 }