/**
 *      Error
 *      -----
 *      - Error is a problem for which we cannot provide the solution programmatically.
 *      - Most of the cases errors are not caused by our program these are due to lack of system resources and these are non recoverable.
 *          Eg. AssertionError<-(OutOfMemoryError,StackOverFlowError),LinkageError<-VerifyError
 *       
 *      Smooth Termination or graceful termination: 
 *          If an application excecutes without any interruption and finishes its execution smoothly. Then its called gracefully termination. 
 *     
 *      Abnormal Termination:
 *          During an application execution, if the application gets interrupted and terminates in the middle, then such type of termination is called abnormal termination.
 * 
 *      Exception
 *      ---------
 *      - An unwanted unexpected event that disturbs normal flow of the program is called exception.
 *      - It is a problem for which we can rectify or provide a fix programmatically and these are recoverable.
 *      - Exception will occur due to syntax errors .
 *      - Eg:- ArrayIndexOutOfBounds,ArithmeticException,FileNotFound
 * 
 *      Handling Exceptions: 
 *          - Whenever an exception is raised in our program then we must & should handle that exception, otherwise our program will terminate abnormally.
 *          - Here exception will display name of the exception, description of the exception & line number of the exception.
 *          - Exceptions are raised at runtime only. So they are known as runtime events.
 *          - Handling exception provides graceful termination.
 *      
 *      Types of Exeptions: 
 *          1] Predefined Exceptions (given by JDK s/w that are built-in)
 *                  A] Checked Exceptions 
 *                          a] Fully checked exceptions
 *                          b] Partially Checked Exceptions
 *                  B] Unchecked Exceptions
 *          2] User Defined Exceptions (given by the user)
 *      
 *      
 */


class ExceptionVsError{
    public static void main(String[] args) {
        try {
            //statements that may cause an exception
        }
        catch (…)‏ {
            //error handling code
        }
        finally {
            //statements to be executed
        }
    }
}