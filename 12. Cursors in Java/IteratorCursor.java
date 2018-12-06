/**         ITERATOR
 *      -> We can use this to get objects one by one from any of the collection objects.
 *      -> We can apply enumeration concept for any collection object & it is a universal cursor.
 *      -> While iterating the objects by Iterator we can perform both read & remove operations.
 *      -> We can get Iterator object by using elements() method of the collection interface.
 *              Iterator itr = c.iterator();       c -> Collection Object
 *      -> Enumeration interface defines the following 3 methods
 *          1) public boolean hasNext();
 *          2) public object next();
 *          3) public void remove();
 * 
 *      LIMITATIONS:  
 *      -> Both Iterator and Enumeration are single dimentional cursors only. i.e. we can move only in forward direction & we can't move in backword direction.
 *      -> While iterating by Iterator we can perform only read & remove operations, but we cannot perform replacement & addition of new objects.
 *      -> To overcome these limitations SUN people introduced ListIterator concept.
 * 
 */

 import java.util.*;
 public class IteratorCursor{
     public static void main(String[] args) {
         ArrayList al = new ArrayList();
         for (int i = 0; i < 10; i++) {
             al.add(i);
         }
         System.out.println(al);

         Iterator itr = al.iterator();
         while (itr.hasNext()) {
             Integer i  = (Integer) itr.next();
             if(i%2 == 0)
                System.out.println(i);
             else 
                itr.remove();
         }
         System.out.println(al);
     }
 }