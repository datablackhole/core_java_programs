/**
 *      'super' java keyword is used to refer super class(parent) class object reference
 *      
 *      using 'super' we can refer to the super class's(parent):
 *      -variables                      super.i
 *      -methods                        super.m1()
 *      -current class constructors     super()
 */

class A{
    int i = 1;
    int j = 2;
    A(){
        this(2,3,4,4,5);
        this.m1();
        System.out.println("Super zero arg constructor");
    }
    A(int... i){
        System.out.println("Super Parameterized constructor");
    }
    static void m1(){ 
        System.out.println("Super Method 1");
    }
}

class B extends A{
    int i =10;
    int j = 20;

    B(int i, int j){
        super();
        System.out.println(this.i+" "+this.j);
        System.out.println(i+" "+j);
        System.out.println(super.i+" "+super.j);
        this.m1();
    }
    static void m1(){
        System.out.println("Child Method 1");

    }
}



 class SuperKeyword{
    public static void main(String[] args) {
        B b= new B(23,24);


    }
}