/**
 *          Same constructor name with different arguments
 */

 class OverloadingTheConstructor{
     OverloadingTheConstructor(){
        System.out.println("1");
     }
     String OverloadingTheConstructor(int i){  // useless to declare returntype
        System.out.println("2");
        return "Method??";
     }
     OverloadingTheConstructor(float f){
        System.out.println("3");
     }
     public OverloadingTheConstructor(double d, int... j){
        System.out.println("4");
     }
     private OverloadingTheConstructor(int... j){
        System.out.println("5");
     }
     protected OverloadingTheConstructor(String s){
        System.out.println("6");
     }
     public static void main(String[] args) {
         OverloadingTheConstructor t1 = new OverloadingTheConstructor();
         OverloadingTheConstructor t2 = new OverloadingTheConstructor(1);
         System.out.println(t2.OverloadingTheConstructor(1));
         OverloadingTheConstructor t3 = new OverloadingTheConstructor(1.1f);
         OverloadingTheConstructor t4 = new OverloadingTheConstructor(4.5d,4,5,6,4,5);
         OverloadingTheConstructor t5 = new OverloadingTheConstructor(4,2,3,2,3,2);
         OverloadingTheConstructor t6 = new OverloadingTheConstructor("Lol");
     }
 }