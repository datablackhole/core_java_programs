/**     METHOD HIDING
 *  - Similar to Method Overriding
 *  - All methods are declared as static
 *  - Method Resolution will be taken care by compiler.
 *  - It is also known as compile time polymorphism 
 *  -Static methods can not be overridden because they are not part of the 
 object's stat e polymorphism or static polymorphism or early binding
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