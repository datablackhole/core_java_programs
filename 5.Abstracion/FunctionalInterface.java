/**     Functional Interface:
 *          a functional interface has exactly one abstract method.
 */


interface addition{
    int sum(int i, int j);
}

class FunctonalImplementation implements addition{
    public int sum(int i, int k){
        return i+k;
    }
}
class FunctionalInterface{
    public static void main(String[] args) {
        FunctonalImplementation c =new FunctonalImplementation();
       System.out.println(c.sum(200,300));

    }
}