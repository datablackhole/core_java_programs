/*  AKA
         COMPOSITION 
         - strong association between conatiner obj and contained object 
         - without existing container object, there is no chance of contained object

         AGGREGATION 
         - loose association between conatiner obj and contained object
         - without existing container objects, there is a chance of having conatined objects

    - No specific keyword to implement this type of relationship.
    -  We mostly use 'new' operator.
    - Main objective is to provide reusability and to increase dependency between the two components. 
*/


class HasARelationship{
    public static void main(String[] args) {
        A a =new A();
        a.m1();
        
    }
}

class A{
    public void m1() {
        
    }
    public void m2() {
        
    }
}




class Engine{
// Engine Specific Functionality
}


class Car{
    Engine e=  new Engine();

}