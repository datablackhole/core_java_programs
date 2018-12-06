/**     CHECKED EXCEPTIONS are the exceptions that are checked at compile time. 
 * 
 *  -FULLY CHECKED Exception: A checked exception is said to be fully checked if and only if all its child classes are also checked.
 *          Eg: IOException, InteruptedException              
 * 
 *  -Partitally CHECKED Exception: A checked exception is said to be partially checked if and only if some of its child classes are unchecked.
 *          Eg: Exception, Throwable    
 *   
 *  Try Catch Block 
 * -------------------
 *      - Whenever CheckedException occurs in our program then we should handle the error using try & catch block
 *      
 *      TRY
 *      ---
 *          - It is a block which contains risky code.                            
 *          - try block is associated with catch block.
 *          - try block is used to throw the exception to catch blcok.
 *          - If any exception arises in the try block then try block will stop being executed.
 *
 *      CATCH
 *      -----
 *          - It is a block which contains error handling code.
 *          - Catch block is used to catch the exception, which is thrown by try block.
 *          - It's always associated with try block.
 *          - If there is no exception then catch block is never executed. 
 *          - It takes in exception class name as a parameter, this name should match with exception class name.
 * 
 *      TRY WITH MULTIPLE CATCH BLOCKS
 *      ------------------------------
 *      - the order of catch block is important.
 *      - It should be from child to parent, or else c.t.e "Exception XXX already been caught"
 *      Note: From 1.8v , multiple exceptions can be handled using '|' Pipe symbol.
 * 
 */

 import java.io.*;
 import java.sql.*;
class CheckedExceptions{
    public static void main(String[] args) {

        try {
            System.out.println("stmt1");
            System.out.println(10/0);
            System.out.println("stmt2");
        } catch (Exception e) {
            System.out.println("from catch block");
        }
        PrintStream out = System.out; 

        try {
            System.out.println(10/0);
        } catch (ArithmeticException ae) {
            System.out.println("from ae");
        } catch (RuntimeException ioe) {
            System.out.println("from re");
        } catch (Exception e) {
            System.out.println("from e");
        }

        try {
            System.out.println(10/0);
        } catch(ArithmeticException | ClassCastException ex){
            System.out.println("");
        }
        
    }   
}