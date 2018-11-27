/**     
 *          Possible from Java 8 onwards
 */

interface addition{
    default int sum(int i, int j) 
    {
        return(i+j);
    }
    String addString(String s1,String s2);
}

class FunctonalImplementation implements addition{
    public String addString(String a,String b){
        return a+" "+b;
    }
}
class DefaultMethodinInterface{
    public static void main(String[] args) {
        FunctonalImplementation c =new FunctonalImplementation();
       System.out.println(c.sum(200,300));
       System.out.println(c.addString("Hello","There"));

    }
}