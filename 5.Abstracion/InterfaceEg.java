/**
 *   INTERFACES
 *      - They contain abstract methods which are incomplete methods because it ends with ';' & does not have a method body.
 *      - Objects cannot be created for interfaces
 *      - Abstract methods of an interface are implemented in seperate classes called implementation classes
 *      - Objects can be create for implementation classes.
 *      - variables declared in an interface are static and final by default
 *      - interface can extends more than one interface, therefore multiple inheritance can be acheived through interfaces. Not possible with classes
 *      - A class can implement more  than one interface
 */


interface Father{
float ht=185.5f;
void height();
}
interface Mother{
float ht=170.5f;
void height();    
}
interface A{
    void show();
}
interface B{
    void display();
}
interface C extends A,B{
    void see();
}
class Child implements Father,Mother,C{
    public void height(){
     float ht = (Father.ht + Mother.ht)/2 ;
     System.out.println("Probable height of the child="+ht);  
    }

    public void show(){
        System.out.println("show");
    }
    public void display(){
        System.out.println("display");
    }
    public void see(){
        System.out.println("see");
    }


}
class InterfaceEg{
    public static void main(String[] args) {
        Child c =new Child();
        c.height();
        c.show();
        c.display();
        c.see();
        
    }
}