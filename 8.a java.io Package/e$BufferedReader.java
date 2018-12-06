/**
 *     BufferedReader 
 *      ----------
 *      - It is an enhanced reader which is used to read character oriented data from a file
 *      - It does not communicate with the files directly, it will take the support of some reader objects.
 * 
 *      Methods:
 *      --------
 *      1-> read()               it will read nect character from a file. if next character not available then it'll return -1
 *      2-> read(char[] ch)      it will return collection of characters from a file.
 *      3-> close()              it is used to close FileReader object. 
 *      4-> readLine()           it is used to read next line from a file, if next line is not available then it will return null
 * 
 */
import java.io.*;
 class e$BufferedReader{
     public static void main(String[] args) throws IOException{
        /** Constructors
         *     BufferedReader fw = new BufferedReader(Reader r);
         *     FileReader fr = new FileReader(File f);
         *     BufferedReader br = new BufferedReader(FileReader fr);
         *  
         * */       

        // approach 1 
        BufferedReader br = new BufferedReader(new FileReader("e.txt"));
        String line = br.readLine();

        while (line!=null) {
            System.out.println(line);
            line = br.readLine();
        }
        
        br.close();
        
     }
 }