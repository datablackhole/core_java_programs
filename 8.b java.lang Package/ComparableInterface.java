/**
 *      Comparable(I): An interface that is present in java.lang package & it contains only one method
 * 
 *          Obj1.compareTo(Obj2);
 *      
 *      Returns -ve , if Obj1 comes before Obj2.
 *      Returns +ve , if Obj1 comes after Obj2.
 *      Returns 0 , if both objects are equal.
 *      
 *      
 *      TreeSet internally uses compareTo method.
 * 
 *      If we are not satisfied with default natural sorting order (or) if default natural sorting
 *      order is not available then we can define our own customized sorting by Comparator object.
 *  
 */

 import java.util.*;

 public class ComparableInterface{
     public static void main(String[] args) {
         System.out.println("A".compareTo("Z"));
         System.out.println("C".compareTo("A"));
         System.out.println("A".compareTo("A"));
         //System.out.println();
     }
 }