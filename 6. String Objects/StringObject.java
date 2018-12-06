/**
 *      STRING  (Imutable)
 *          - After a string object is created, if we perform any modifications or changes to that object then
 *              a new object will be created for every change. This is called immutability of an object. 
 * 
 *          '=='
 *          ------
 *          - '==' is an equality operator which returns boolean values.  
 *          - It is an operator applicable for both primitives and object references.
 *          - '==' if there is no relationship between argument types then we will get compile time error saying incompatible types. 
 *   
 *          .equals()
 *          ---------         
 *          -  .equals() is used for address comparision or reference comparision, its case-sensitive. 
 *          -  It is a method applicable only for object references but not for primitives.
 *          -  If there is no relationship between argument types then .equals() method simply returns false and we won’t get any compile time error and runtime error.
 *   
 *          Note: in general we can use == (double equal operator) for reference compression whereas .equals() method for content comparision.
 */
import java.io.*; 
import java.util.*; 

class StringObject{
    public static void main(String[] args) {
        // Checking equality of Strings 
        String s1 = "Geeks"; 
        String s2 = "forGeeks"; 
        System.out.println(s1 == "Geeks");
        System.out.println(s1 == s2);

        Boolean out = "Geeks".equals("geeks"); 
        System.out.println("Checking Equality  " + out); 
        out = "Geeks".equals("Geeks"); 
        System.out.println("Checking Equality  " + out); 
  
        out = "Geeks".equalsIgnoreCase("gEeks "); 
        System.out.println("Checking Equality" + out); 
  
        int out1 = s1.compareTo(s2); 
        System.out.println("If s1 = s2" + out); 


        /** String Operations from geeksforgeeks.com */
        String s= "GeeksforGeeks"; 
        // or String s= new String ("GeeksforGeeks"); 
  
        // Returns the number of characters in the String. 
        System.out.println("String length = " + s.length()); 
  
        // Returns the character at ith index. 
        System.out.println("Character at 3rd position = "
                           + s.charAt(3)); 
  
        // Return the substring from the ith  index character 
        // to end of string 
        System.out.println("Substring " + s.substring(3)); 
  
        // Returns the substring from i to j-1 index. 
        System.out.println("Substring  = " + s.substring(2,5)); 
  
        // Concatenates string2 to the end of string1. 
        s1 = "Geeks"; 
        s2 = "forGeeks"; 
        System.out.println("Concatenated string  = " + 
                            s1.concat(s2)); 
  
        // Returns the index within the string 
        // of the first occurrence of the specified string. 
        String s4 = "Learn Share Learn"; 
        System.out.println("Index of Share " +  
                           s4.indexOf("Share")); 
  
        // Returns the index within the string of the 
        // first occurrence of the specified string, 
        // starting at the specified index. 
        System.out.println("Index of a  = " +  
                           s4.indexOf('a',3)); 
  
        // Converting cases 
        String word1 = "GeeKyMe"; 
        System.out.println("Changing to lower Case " + 
                            word1.toLowerCase()); 
  
        // Converting cases 
        String word2 = "GeekyME"; 
        System.out.println("Changing to UPPER Case " +  
                            word1.toUpperCase()); 
  
        // Trimming the word 
        String word4 = " Learn Share Learn "; 
        System.out.println("Trim the word " + word4.trim()); 
  
        // Replacing characters 
        String str1 = "feeksforfeeks"; 
        System.out.println("Original String " + str1); 
        String str2 = "feeksforfeeks".replace('f' ,'g') ; 
        System.out.println("Replaced f with g -> " + str2); 
    }  
}