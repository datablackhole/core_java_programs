/**         ListIterator
 *      -> It is child interface of Iterator
 *      -> By using this ewe can move either to the forward direction (or) to the backward direction that is bi-directional cursor.
 *      -> While iterating the objects by Iterator we can perform both read & remove operations as well as replacement and addition operations.
 *      -> We can get Iterator object by using listIterator() method of the collection interface.
 *              Iterator itr = c.listIterator();       c -> Collection Object
 *      -> Enumeration interface defines the following 3 methods
 *          1) public boolean hasNext();
 *          2) public object next();
 *          3) public int nextIndex(); 
 *          4) public boolean hasPrevious(); 
 *          5) public object previous();
 *          6) public object previousIndex();
 *          7) public void remove();
 *          8) public void set(Object o);
 *          9) public void add(Object new);
 *          
 * 
 *      LIMITATIONS:  
 *      -> Both Iterator and Enumeration are single dimentional cursors only. i.e. we can move only in forward direction & we can't move in backword direction.
 *      -> While iterating by Iterator we can perform only read & remove operations, but we cannot perform replacement & addition of new objects.
 *      -> To overcome these limitations SUN people introduced ListIterator concept.
 * 
 */

 import java.util.*;
 public class ListIteratorCursor{
     public static void main(String[] args) {
         ArrayList al = new ArrayList();
         al.add("Bala");
         al.add("ng");
         al.add("Chiru");
         al.add("Venki");   
         System.out.println(al);

         ListIterator litr = al.listIterator();
         while (litr.hasNext()) {
             String s  = (String) litr.next();
             if(s.equals("Venki"))
                litr.remove();
         }
         System.out.println(al);
     }
 }