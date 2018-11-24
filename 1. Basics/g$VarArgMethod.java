class g$VarArgMethod                                           //  until 1.4v  it was not possible to declare a method with variable number of arguments. 
                                                               //it was possible from 1.5v onwards
{

    public static void methodOne(int... i){     //   '...'  is replacement for '[]'
        System.out.println("Var Arg Method");
    }
    
    public static void methodTwo(int i,float f,int... j){    // its always declared at the last
        System.out.println("Var Arg Method");
    }
    /*
    public void methodThree(int... i,int... j){   
        Invalid 
    }*/
    public static void main(String args[])
     {
         methodOne(1,2,3,4,5,4);
         methodTwo(1,1.1f,2123,23,2,32,32);


    }
}
