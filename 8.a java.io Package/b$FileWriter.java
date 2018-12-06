/**
 *      FileWriter 
 *      ----------
 *      - It is used to insert character oriented data into a file
 *      - If file does not exist then the FileWriter object will create a file
 * 
 *      Methods:
 *      --------
 *      1-> write(int ch)         it will insert single character into a file.
 *      2-> write(char[] ch)      it will insert collection of characters into a file.
 *      3-> write(String s)       it will insert String into a file.  
 *      4-> flush()               it gives guarantee that the last character of a file is also inserted  
 *      5-> close()               it is used to close FileWriter object. 
 * 
 * 
 */
import java.io.*;
 class b$FileWriter{
     public static void main(String[] args) throws IOException{
        /** Constructors
         *     FileWriter fw = new FileWriter(String s);
         *     FileWriter fw = new FileWriter(File f);
         *      FileWriter fw = new FileWriter(new File(dir, str));
         * */       

        // 1 
        FileWriter fw1 = new FileWriter("b$FileWriter-1.txt");

        // 2
        FileWriter fw2 = new FileWriter(new File("b$FileWriter-2.txt"));

        // insert characters into file using FileWriter fw1
        fw1.write(98); //b
        fw1.write("haskar \n Solution");
        fw1.write("\n");
        char[] ch = {'a','b','c','d'};
        fw1.write(ch);
        fw1.flush();
        fw1.close();
        fw2.close();
        System.out.println("See file contents");    

        // Industry Standard Code
                FileWriter fw = null;
                try {
                    fw = new FileWriter("b$FileWriter-2.txt");
                    fw.write(98); //b
                    fw.write("haskar \n Solution");
                    fw.write("\n");
                    char[] c = {'a','b','c','d'};
                    fw.write(c);
                    fw.flush();

                } catch (IOException ioe) {
                    //TODO: handle exception
                        ioe.printStackTrace();
                }
                finally{
                    try {
                        fw.close();
                        System.out.println("See file contents");   
                            
                    } catch (IOException ioe) {
                        //TODO: handle exception
                        ioe.printStackTrace();
                    }
                }
         
     }
 }