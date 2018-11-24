/*
    Class - it is a collection of data members & behaviours in a single unit called a class
                                ------------   ----------
    -Data members -> they are variables, properties & fields
    -behaviours -> actions or methods

    In general, a class is a collection of variables and methods 

    class declaration syntax: 
    <access_modifier> class <class_name> extends <parent_class_name> implements <interface_name>

    */


class Subject{

}

class Class{
    
    static void feymann(){
        System.out.println("ELi5");
    }

    static void  spaced_repetition(){
        System.out.println("Revise just after studying,then after 3 days,then 5 days ,then 8 days,then 13 days....");
    }

    public String toString(){
        feymann();
        spaced_repetition();

        return "This is a custom toString method";
    }
    
    public static void main(String[] args) {


/*
    Object - it is an instance of a class.         Objects - they are multiple instances of any class 
                    --------
    instance means allocating memory for our data members

    In general, a thing which exists in this world is an object

    Memory is allocated when object is created.
    Syntax: <class_name> ref_var = new <Constructor>();
                                    --class name--                                
*/
        Class c1 = new Class();
        Class c2 = new Class();
        Class c3 = new Class();
       
        System.out.println(c1.hashCode());   
        // hashCode() is a method present in java.lang.Object it return hash value of an object(which is unique for every new object)in a collection
                                             
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());

        System.out.println(c1.toString());  // also present in java.lang.Object, its the string representation of the object 
        System.out.println(c1);  // if we printing an object using its reference then toSring() method is automatically invoked inernally by java compiler
      
        System.out.println(c3.toString());  // So overriding the toString() method, returns the desired output, it can be the state of an object etc. depends on your implementation.


          
    }
}