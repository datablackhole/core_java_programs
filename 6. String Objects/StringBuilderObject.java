/**
 *      STRING BUILDER (Introduced in 1.5v)
 *          
 *          - Every method present in StringBuilder is declared as synchronzied, hence at a time only one thread is allowed to operate on the StringBuffer object.
 *          - Due to synchronzation the waiting time of threads will be increase & this effects performance of the application using many StringBuffer objects.
 *          -               StringBuffer                                  Vs                   StringBuilder            
 *             ----------------------------------------------------------------------------------------------------------------------------------------
 *             -> every method present in StringBuffer is synchronized.         -no method here is synchronized          
 *             -> only one thread is allowed to operate on StringBuffer         -multiple thread is allowed to operate on StringBuilder         
 *                  objects. Therefore it is thread safe                          objects. Therefore it is not thread safe    
 *             -> It increases waiting time of the thread.(low performance)     -Threads are not required to wait & hence relatively high performance
 *             -> Introduced in 1.0v                                            -introoduced in 1.5v
 *          
 */
class StringBuilderObject
{
    public static void main(String[] args) {
        
    }
}