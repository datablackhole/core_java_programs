/**
 *  ABSTRACT CLASSES
 *      - It is a collection of 0 or more concrete methods & 0 or more abstract methods.
 *      - 'abstract' keyword is applicable for methods and classes but not for variables.
 *      - An object cannot be created for an abstract class.
 *      - In this case we will take sub classes(child classes) and we will write all the implementation i.e. abstract methods of an abstract class.
 *      - These classes contain only instance variables
 *      - by default every abstract method is public & abstract.
 */

 abstract class Plan{
     protected double rate;
     public abstract void getRate();
     public void calculateBillAmt(int units) {
         System.out.println("Total Units = "+units);
         System.out.println("Total Bill = "+ rate*units);
     }
 }

 class DomesticPlan extends Plan{
     public void getRate() {
         rate = 2.5d;
     }
 }

 class CommercialPlan extends Plan{
     public void getRate() {
         rate = 5.0d;
     }
 }

 class AbstractClasses{
     public static void main(String[] args) {
         DomesticPlan dp = new DomesticPlan();
         dp.getRate();
         dp.calculateBillAmt(250);
         CommercialPlan cp = new CommercialPlan();
         cp.getRate();
         cp.calculateBillAmt(250);
     }
 }