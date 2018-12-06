/**
 *      FileReader 
 *      ----------
 *      - It is used to read character oriented data from a file
 * 
 *      Methods:
 *      --------
 *      1-> read()               it will read nect character from a file. if next character not available then it'll return -1
 *      2-> read(char[] ch)      it will return collection of characters from a file.
 *      5-> close()              it is used to close FileReader object. 
 * 
 *      Limitations with FileReader & FileWriter
 *      ----------------------------------------
 *      - while writing the data using FileWriter, we need to use line seperators (\n) which is not convenient.
 *      - while reading the data by using FileReader, we need to read character by character.
 *      
 *      - TO OVERCOME THeSe LIMITATIONS SUN MICRO SYSTEMS INTRODUCED BufferedWriter & BufferedReader.
 * 
 */
import java.io.*;
 class c$FileReader{
     public static void main(String[] args) throws IOException{
        /** Constructors
         *     FileReader fw = new FileReader(String s);
         *     FileReader fw = new FileReader(File f);
         *  
         * */       

        // approach 1 
            FileReader fr = new FileReader("b$FileWriter-1.txt");

            int i =fr.read();

            while(i!= -1){
                System.out.print((char)i);
                i=fr.read();
            }

        System.out.println();

        // approach 2
            File f = new File("b$FileWriter-1.txt");
            fr = new FileReader(f);
            char[] ch = new char[(int)f.length()];

            // reading the data from file into char[] array
            fr.read(ch);

            for(char ch1:ch){
                System.out.print(ch1);
            }
            
            fr.close();

        
     }
 }