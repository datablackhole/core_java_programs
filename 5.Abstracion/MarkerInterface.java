/**     Marker Interface:
 *          An Interface with no fields
 */


interface Marker0{

}
interface Marker1{

}
class MarkerImplementation implements Marker0,Marker1{
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
class MarkerInterface{
    public static void main(String[] args) {
        MarkerImplementation c =new MarkerImplementation();
        c.height();
        c.show();
        c.display();
        c.see();
        
    }
}