/**
 *      BufferedWriter 
 *      ----------
 *      - It is used to insert character oriented data into a file
 *      - It does not communicate with the files directly, it will take the support of some writer objects.
 *      - if physical file is not available then BufferedWriter object will create a new file.
 * 
 *      Methods:
 *      --------
 *      1-> write(int ch)         it will insert single character into a file.
 *      2-> write(char[] ch)      it will insert collection of characters into a file.
 *      3-> write(String s)       it will insert String into a file.  
 *      4-> flush()               it gives guarantee that the last character of a file is also inserted  
 *      5-> close()               it is used to close FileWriter object. 
 *      6-> newLine()             it is used to insert new line into a file.
 * 
 * 
 */
import java.io.*;
 class d$BufferedWriter{
     public static void main(String[] args) throws IOException{
        /** Constructors
         *     BufferedWriter fw = new BufferedWriter(new FileWriter(new File("abc.txt"));
         *     BufferedWriter fw = new BufferedWriter(FileWriter fw);
         *  
         * */       

        // appraoch 1 
        FileWriter fw = new FileWriter("d.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        // approach 2
        BufferedWriter bw1 = new BufferedWriter(new FileWriter("d.txt"));

        // insert characters into file using FileWriter fw1
        bw1.write(98); //b
        bw1.write("haskar \n Solution");
        bw1.write("\n");
        char[] ch = {'a','b','c','d'};
        bw1.write(ch);
        bw1.newLine();
        bw1.newLine();
        bw1.newLine();
        bw1.newLine();
        bw1.write("Naidu");
        bw1.flush();
        bw1.close();

        System.out.println("See file contents");    
         
     }
 }