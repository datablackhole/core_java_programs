public class e$StaticVariable{        
	
	// scope of static variable is same as scope of .class file.  

	// Value will not vary from object to object

	// variables will be created at the time of class loading & be destroyed during class unloading
	
	// stored in method area 

	// cannot be declared in contructors & methods blocks 
	
	static int i=10,j;   // <------ declaration of an static variable

	void m1(){
	System.out.println("from instance area");
	System.out.println(i);
	}

	public static void main(String args[])
	{  //static area    									 // To access static variable from static area , you need not create an object reference 
		System.out.println("From Static area");
		e$StaticVariable e =new e$StaticVariable();
		System.out.println(i);								// 1 	directly
		System.out.println(e.i);							// 2	using object reference
		System.out.println(e$StaticVariable.i); 			// 3	using class name (identifier)

		System.out.println(e.j);							// JVM initializes default values

		e$StaticVariable.j =15;								// static doesnt mean final
		System.out.println(e$StaticVariable.j);	

		e.m1();

	}
}
