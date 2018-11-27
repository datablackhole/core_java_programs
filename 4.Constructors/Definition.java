/**
 * Constructors (Lazy Loading) (executes at the time of object creation)
 * - It is a java feature which is used to create an object.
 * - It is also used to initialize the object
 * - it should have the same name as class name
 * - Modifiers for a contructor are: default, public, private, protected (<- Note that classes and interfaces dont have a 'protected' or 'private' access specifer)
 * - they do not have any return types.  If returntype is declared then you won't get compiletime or runtime  error.
 *   Types of constructors
 *      1]default
 *      2]zero-arg
 *      3]parameterized (at least one arg)
 * 
 * - */
class Definition{

    // If no constructor is declared then compiler will generate one automatically during the compilation time <- this constructor is called the default constructor 


    Definition(){       //zero argument

    }

    
    Definition(int n, float f){  //parameterized
    }


    public static void main(String[] args) {
        
    }

}