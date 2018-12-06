import java.io.*;
import java.util.*;
class g$WaysToInputFromConsole                              
{
    public static void main(String args[]) throws IOException // Input values are not provided during compile time, as they are provided during runtime
     {

        /** 1
         * Using Commanline Arguments
         */
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);            //  $>java i$CommandLineArguments 12 323 4233 423 234 2
        }

        /** 2
         * Using BufferedReader class 
         *              - present in io package,it will take InputStreamReader object as parameter which is embedded with 'System.in'    
         */
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        System.out.println("Welcome ="+name);


        /** 3
         * Using Console class
         *              - present in java.io package
         *              - Console class object can be creared by using static console() method system class.
         *              - to read values from console, we need to use readLine() method
         */
        Console c = System.console();
        String s0 = c.readLine();
        System.out.println("Welcome"+s0);

        /** 4
         * Using Scanner class
         *              - present in java.util package
         *              - next() method reads string
         *              - nextXxx() methods read Xxx where Xxxx  is nextInt(),nextFloat(),nextDouble(), etc
         */
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        String s =sc.next();
        System.out.println(no+s);
        //etc


    }
}
