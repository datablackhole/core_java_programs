/*
*   ENCAPSULATION
* 
*   -The process of grouping variables and its coresponding methods in a single entity is called a class
*   -A class is said to be encapsulated if it supports Data Hiding and Abstraction
*                                                      -----------     -----------
*   -Getter and Setter methods should be present for every variable that is decalared for it be declared as an encapsulated class
* 
*   Advantages:
*   - Security
*   - Easy enchancement
*   - flexibility to enduser
*   - improves application's maintainability
*   Main Disadvantage:= Increases length of our code & slows down the execution process
*
*   
*  POJO class is the best example of fully encapsulated class
*/

// POJO Plain Old Java Object
class Encapsulation{

    private boolean isAbstract;
    private boolean dataIsHid;

    public boolean isAbstract() {
		return isAbstract;
	}



	public void setAbstract(boolean isAbstract) {
		this.isAbstract = isAbstract;
	}



	public boolean dataIsHid() {
		return dataIsHid;
	}



	public void setDataHid(boolean dataIsHid) {
		this.dataIsHid = dataIsHid;
	}

    public static void main(String[] args) {
        Encapsulation en = new Encapsulation();
        en.setAbstract(true);
        en.setDataHid(true);

        System.out.println(en.isAbstract());
        System.out.println(en.dataIsHid());
    }
}