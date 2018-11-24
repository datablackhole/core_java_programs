/*
        Data Hiding - Hiding the data from other programs is known as data hiding 
        - Internal data should not go out directly. Outside programs should not access out data directly.
        - Data hiding is achieved by using 'private' modifier
        - Why ? Security thats why.

*/


public class DataHiding{
    private static double balance=1232321.23;

    public static void main(String[] args) {
    
        System.out.println(DataHiding.balance);
    }
}

class OtherProgram{
    private static double balance=1232321.23;

    public static void main(String[] args) {
    
        System.out.println(DataHiding.balance);
    }
}