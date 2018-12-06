
import java.io.*;
 class b$FileWriterJava8{
     public static void main(String[] args) throws IOException{
            
                try (FileWriter f = new FileWriter("b$FileWriter-2.txt")) 
                {
                    f.write(98); //b
                    f.write("haskar \n Solution using try with resources");
                    f.write("\n");
                    char[] c = {'a','b','c','d'};
                    f.write(c);
                    f.flush();

                } catch (IOException ioe) {
                    //TODO: handle exception
                        ioe.printStackTrace();
                }

         
     }
 }