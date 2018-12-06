/**
 *      PrintWriter 
 *      ----------
 *      - It is an enhanced writer which is used to write character oriented data from a file
 *      - It can communicate with the files directly, or it will take the support of some writer objects.
 *      - The main advantage of this over BufferedWriter and FileWriter is that we can insert any type of data.
 *      - Whenever we want to insert primitive values then it is always recommended to use PrintWriter object.
 * 
 *      Methods:
 *      --------
 *      1-> write(int ch)         it will insert single character into a file.
 *      2-> write(char[] ch)      it will insert collection of characters into a file.
 *      3-> write(String s)       it will insert String into a file.  
 *      4-> flush()               it gives guarantee that the last character of a file is also inserted  
 *      5-> close()               it is used to close FileWriter object. 
 *         print(int i)        simillarly for println()       
 *         print(char c)        simillarly for println()        
 *         print(boolean b)        simillarly for println()
 *         print(long l)        simillarly for println()
 *         print(float f)        simillarly for println()
 *         print(String s)        simillarly for println()
 *         print(double d)        simillarly for println()
 *         
 * 
 */
import java.io.*;
 class f$PrintWriter{
     public static void main(String[] args) throws IOException{
        /** Constructors
         *     PrintWriter fw = new PrintWriter(new FileWriter(new File("abc.txt"));
         *     PrintWriter fw = new PrintWriter(FileWriter fw);
         *     PrintWriter fw = new PrintWriter(File f);
         *     PrintWriter fw = new PrintWriter(String s);
         * */       

        PrintWriter pw = new PrintWriter("f.txt");
        pw.write(100);//d
        pw.print(100);//100
        pw.println(true);
        pw.println('a');
        pw.println("PRINTERWRTIER");
        pw.println(10.5f);
        pw.flush();
        pw.close();

        System.out.println("See file contents");    
         
     }
 }