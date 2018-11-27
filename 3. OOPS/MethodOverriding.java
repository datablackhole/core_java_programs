/**     METHOD OVERRIDING
 *  - Having the same method name with same arguments in a two different classes is called method overriding
 *  - methods in parent class that are overriden in child class are called overridden methods
 *  - methods which are present in child class are called overriding methods
 *  - Method overriding aka runtime polymorphism,dynamic polymorphism,late binding
 *  - Method resolution will be taken care by JVM
 *  - All methods are non-static
 */
class Parent{
    public void property() {
        System.out.println("Cash"+"Gold"+"Land");
    }
    public void marry() {
        System.out.println("XYZ");    
    }
}

class Child extends Parent{
    @Override
    public void marry() { 
        System.out.println("ABC");    
    }
}

 class MethodOverriding{
     public static void main(String[] args) {
         Parent p = new Parent();
         p.property();
         p.marry();
         
         Child c = new Child();
         c.property();
         c.marry();
     }
 }