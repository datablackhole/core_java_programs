/**
 *      'this' java keyword is used to refer to current class object reference
 *      
 *      using 'this' we can refer to the current class:
 *      -variables                      this.i
 *      -methods                        this.m1()
 *      -current class constructors     this()
 */

 class ThisKeyword{
    int i=10;
    int j=20;
    

    public ThisKeyword() {
        this(100,200);
        System.out.println("zero-arg constructor");
        
    }

    public ThisKeyword(int i,int j) {
        this(123.213f);
        System.out.println(this.i+" "+this.j);
        System.out.println(i+" "+j);
        this.m1();
        
    }
    public ThisKeyword(float f) {
        System.out.println("Float " + f);
    }

    public void m1() {
        System.out.println("From m1");
        this.m2();
    }

    public void m2() {
        System.out.println("From m2");
    }

    public static void main(String[] args) {
        ThisKeyword tk1= new ThisKeyword();


    }
}