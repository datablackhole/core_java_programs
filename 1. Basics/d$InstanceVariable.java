public class d$InstanceVariable{        
	
	//scope of instance variable is same as scope of an object

	// Value varies from object to object

	// created at time of object creation & destroyed at object destruction
	
	// stored in heap as a part of a object

	// cannot be declared in contructors & methods blocks 
	
	int i,j;   // <------ declaration of an instance variable
	
	d$InstanceVariable(int i){
		this.i=i;
		System.out.println(i);
	}

	public static void main(String args[])
	{  //static area    									 // To access instance variable from static area , you need to create an object reference 
		d$InstanceVariable d = new d$InstanceVariable(5);    // here d is an object reference 
		d$InstanceVariable e = new d$InstanceVariable(3); 	//	here e is an object reference

		System.out.println(d.j); 							// JVM automatically initializes default values
															
	}
}
