/**      FINALLY BLOCK
 * 
 *      - It is a block which contains cleanup code
 *      - its not recommended to maintain clean up code in try block because if any exception arises 
 *          in try block then try block containing clean up code at the end will not be executed.
 *      - its foolish to declare cleanup code in catch block.
 *      
 *       Note: 
 *              final: It is a modifier which prohibits changes. It can be used for variables(no reassignment), methods(no overriding) & classes(no child class).  
 *              finally: block that contains cleanup code. it always executes regardless of an exception being raised or not.
 *              finalized(): It is a method which is called by garbage collector just before destroying an object for cleanup activity. 
 *              
 * 
 */

 import java.io.*;
 import java.sql.*;
class FinallyBlock{
    public static void main(String[] args) {

        try {
            System.out.println(10/0);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        finally{
            // clean up code
            System.out.println("clean up code");
        }

        /**
         * Also Valid 
         */
        try{
            System.out.println(10/0);
        } 
        finally{
            // clean up code
            System.out.println("clean up code");
        }
        
    }   
}