/**   POlYMORPHISM
 *  - greek word
 *  - ability to represent in different forms
 *  - it's objective is to provide flexibility
 * 
 *  - Its of two types:
 *    1] Compile time polymorphism
 *      it exhibits at compile time
 *      Eg. method overloading, method hiding
 * 
 *    2] Run time polymorphism
 *      it exhibits at runtime
 *      Eg. Method overriding
 *  
 */
class Super
{
  public static void foo(){
      System.out.println("I am foo in Super");
    }
  public void bar(){
      System.out.println("I am bar in Super");
    }
}
class Child extends Super
{
  public static void foo(){
      System.out.println("I am foo in Child");
    }//Hiding
  public void bar(){
      System.out.println("I am bar in Child");
    }//Overriding
  
}
class MethodHiding{
public static void main(String[] args)
  {
     Super sup = new Child();//Child object is reference by the variable of type Super
     Child child = new Child();//Child object is referenced by the variable of type Child
     sup.foo();//It will call the method of Super.
     child.foo();//It will call the method of Child.

     sup.bar();//It will call the method of Child.
     child.bar();//It will call the method of Child again.
  }
 }