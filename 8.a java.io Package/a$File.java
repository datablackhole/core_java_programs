/**
 *      File Class
 *      ----------
 *      > File f = new File("abc.txt");
 *      - Above line stmt will check if a file named 'abc.txt' exists or not.
 *      - If file does not exist then the File object cannot create any physical file.
 *      - If file exists then the object reference 'f' simply points to that file. 
 *      - Using the File object we can create new file by calling the method:
 *           createNewFile()
 *      - Using the File object we can create a directory by calling mkdir() method.
 * 
 */
import java.io.*;
 class a$File{
     public static void main(String[] args) throws IOException{

        System.out.println(System.getProperty("user.dir")); //current directory
        // Adding files to the current directory
         File f0 = new File("a.txt");
         System.out.println(f0.exists());
         f0.createNewFile();
         System.out.println(f0.exists());

        // Creating a directory named 'Files' in our current directory
         File dir = new File("Files/a");
         System.out.println(dir.exists());
         dir.mkdir();
         System.out.println(dir.exists());

         // Adding files to the above created directory
         File f = new File("Files/a","a.txt");
         System.out.println(f.exists());
         f.createNewFile();
         System.out.println(f.exists());

         
     }
 }