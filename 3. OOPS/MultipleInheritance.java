/*  MULTIPLE INHERITANCE
    - in java multiple inheritance is not supported. ? 
     ambiguity problem arises where the child is trying to figure out which method from parents to be inherited. And the parent here are having fuctionally different methods 
     with the same method name. 
    -  a class in java cannot extend more than one class 
    - but interface can extend more than one interface, so multiple inheritance can be acheived through interfaces.
    

    Note:
     -  if our class does not extend any other class then our class is direct child class of java.lang.Object class
     -  if our class extends another class then our class is indirect child class of java.lang.Object class
     -  Cyclic inheritances are not supported.
    

*/

interface A{

}


interface B{

}

interface C extends A,B{

}

class MultipleInheritance implements C{
    public static void main(String[] args) {
        
    }
}
