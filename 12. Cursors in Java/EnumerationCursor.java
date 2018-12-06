/**         ENUMERATION
 *      -> We can use this to get objects one by one from the legacy collection objects
 *      -> We can create Enumeration object by using elements() method.
 *              Enumeration e = v.elements();       v -> Vector Object
 *      -> Enumeration interface defines the following two methods
 *          1) public boolean hasMoreElements();
 *          2) public object nextElement()
 * 
 *      LIMITATIONS: 
 *      -> We can apply enumeration concept only for legacy classes & it is not a universal cursor. 
 *      -> By using Enumeration we can get only read access & we can't perform remove operations.
 *      -> To overcome these limitations Sun people introduced iterator concept in 1.2v.
 * 
 */

 import java.util.*;
 public class EnumerationCursor{
     public static void main(String[] args) {
         Vector v = new Vector();
         for (int i = 0; i < 10; i++) {
             v.addElement(i);
         }
         System.out.println(v);

         Enumeration e = v.elements();
         while (e.hasMoreElements()) {
             Integer i  = (Integer) e.nextElement();
             System.out.println(i);
         }
     }
 }