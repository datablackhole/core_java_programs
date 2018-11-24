/*  AKA   INHERITANCE
    - It is also known as inheritance
    - Its objective is to provide reusability
    - Using 'extends' keyword we can implement is-A relationship
    - Child class will inherit all properties of parent class but not the other way as the child may have properties not belonging to the parent
    - Parent reference can hold child object but not vice-versa 
*/


class IsARelationship{
    public static void main(String[] args) {
        A a =new A();
        a.m1();
        //a.m2(); //C.t.e
        B b = new B();
        b.m2();
        b.m1();

        A a1 = new B();
        a1.m1();
    }
}

class A{
    public void m1() {
        System.out.println("From Class A");
    }
}


class B extends A{
    public void m2() {
        System.out.println("From Class B");
    }
}