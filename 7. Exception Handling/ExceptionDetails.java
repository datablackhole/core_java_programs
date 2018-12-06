/**     
 *       Methods to display exception details
 *      -------------------------------------
 *      -printStackTrace() :
 *          It will display name of the exception, description of the exception & line number of the exception.         
 * 
 *      -toString() :
 *          It will display name of the exception, description of the exception.
 * 
 *      -getMessage() :
 *          It will display description of the exception.
 */

 import java.io.*;
 import java.sql.*;
class ExceptionDetails{
    public static void main(String[] args) {

        try {
            System.out.println(10/0);
        } 
        catch (Exception e) 
        {
            System.out.println(e.toString());
            System.out.println("----------------------------------------------------");
            e.printStackTrace();
            System.out.println("----------------------------------------------------");
            System.out.println(e.getMessage());        
        }
        
    }   
}