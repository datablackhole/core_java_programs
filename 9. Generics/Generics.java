/**
 *  GENERICS
 * ----------
 *      Arrays:
 *    -> Arrays are typesafe, i.e. we know what type of element is present in an array. (as there can be only one type)
 *    -> If we are required to store multiple string input values then it is recommended to use String array.
 *    -> We can retrieve the data direcly from an array without the need for performing any type of typecasting
 *    
 *     Collections:
 *    -> Collections are not typesafe, we can't provide guarantee of the type elements present in Collections
 *    -> It is not recommended to use ArrayList for a String[] requirement, because sometimes our program will fail. Even if there is no compiletime or runtime error.
 *    -> At the time of receiving the data from the collection, it is necessary to perform typecasting.
 *    
 *    Generics
 *    -> To overcome the limitations, Sun Micro Systems introduced Generics in 1.5v :
 *          -> To make collection as typesafe.
 *          -> To avoid typecasting problem.
 * 
 *    -Generics are used to create generic classes and generic methods which can work with different Types(classes).
 *    - Instead of T, we can use any valid identifier (Q,R ...
 * --------------------------------------------------------------------------------------------------------------------
 *           Arrays                                             Collections
 * --------------------------------------------------------------------------------------------------------------------
 *    -  Fixed in size                                    - growable in size 
 *    -  better, from performce point of view             - Memory point of view collections are better
 *    -  holds only homogenous elements                   - both homo and heterogenus elements
 *    -  No ready made methods. DS are not used           - have many useful methods that implement data structure concepts     
 */
import java.util.*;
class MyListGeneric<T>{
//class MyListGeneric<T extends Number>{   restricting generic types to sub classes
//class MyListGeneric<T super Number>{   restricting generic types to super classes

    private List<T> values=new ArrayList<T>();

    void add(T value) {
        values.add(value);
    }
    
    void remove(T value){
        values.remove(value);
    }

    T get(int index){
        return values.get(index);
    }
    List<T> getArray(){
        return values;
    }
    /* Generic Method */
    static <X extends String> X doSomething(X numberStr){
        X result =numberStr;
        System.out.println(result);
        return result;
    }
}
class Generics{
    public static void main(String[] args) {
        MyListGeneric<String> gsl = new MyListGeneric<String>();
        gsl.add("VALUE 1");
        gsl.add("VALUE 2");
        System.out.println(gsl.getArray());

        MyListGeneric<Integer> gil = new MyListGeneric<Integer>();
        gil.add(1);
        gil.add(2);

        MyListGeneric.doSomething("TWO");
    }
}
