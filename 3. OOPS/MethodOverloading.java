/**
 *  -Having the same method name with different arguments in a single class is called method overloading
 *  - all these methods are called overloaded methods
 *  - reduces complexity
 * 
 */

 class MethodOverloading{
     public void m1() {
         System.out.println("0-Arguments Method");
     }
     public void m1(int i) {
         System.out.println("Overloaded method with 1 argument");
     }
     public void m1(float f, String s) {
         System.out.println("Overloaded method with 2 arguments");
     }
     public static void main(String[] args) {
         MethodOverloading t = new MethodOverloading();
         t.m1();
         t.m1(10);
         t.m1(10.5f,"Lol");
     }
 }