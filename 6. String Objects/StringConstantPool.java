/**
 *      STRING CONSTANT POOL
 *      - If a string object is created then internally two objects are created. One in heap area and the other in String Constant Pool. (SCP)
 *      - But the string object's reference always points to the heap area.
 *      - Object creation in SCP is always optional.
 *      - when a new string object is created , JVM checks if any object with same content is already created. If so then JVM simply refers to that object.
 *      - In SCP, there is no chance of having duplicate objects as it's taken care by JVM. 
 *      - SCP area objects do not have any reference, even though garbage collector does not access SCP objects. 
 *      - SCP objects will be automatically destroyed when JVM shuts down.
 *      
 * 
 */
import java.io.*; 
import java.util.*; 

class StringConstantPool{
    public static void main(String[] args) {
       String s1 = new String("lowl");
       String s2 = new String("Lowl");
       String s3 = "lowl";
       String s4 = "lowl";
       String s5 = "LOwl";
       
       System.out.println(s1.hashCode());
       System.out.println(s2.hashCode());
       System.out.println(s3.hashCode());
       System.out.println(s4.hashCode());
       System.out.println(s5.hashCode());
       System.out.println();

       String a = new String("bhaskar");
       String b = a.intern();                    // with the help of heap object reference, if we want the corresponding SCP object reference then we need to user intern() method
       String c = "bhaskar";             
       System.out.println(b == c);
       System.out.println(a.hashCode());
       System.out.println(b.hashCode());
       System.out.println(c.hashCode());

    }  
}