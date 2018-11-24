class i$CommandLineArgument                   // arguments passed through command prompt or console is known as c.l.a.                    
{
    public static void main(String args[])      // Input values are not provided during compile time, as they are provided during runtime
     {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);            //  $>java i$CommandLineArguments 12 323 4233 423 234 2
        }

    }
}
