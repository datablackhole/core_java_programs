public class f$LocalVariable{        
	
	// THEY MEET A TEMPORARY REQUIREMENT.  

	// THEY CAN BE DECLARED IN METHODS, BLOCKS AND CONTRUCTORS

	// THEIR SCOPE IS SAME AS SCOPE OF THE EXECUTION BLOCK WHERE ITS DECLARED. THEREFORE ITS CREATED AND DESTROYED ACCORDINGLY 
	
	// Compared to other types of variables, they can only accept one modifier
	static void m1(){ 
		int i=1110;	// scope of i starts here
		//
		//
		//
		System.out.println(i);
	}				//Scope of i ends here



	public static void main(String args[])
	{  
		final int i=10;			// if you assign any value after this declaration in your code then you will get compile time error   // scope of i starts here
		//i =20; 					// C T E
		System.out.println(i);
		m1();

		float f; 					// throws cte when f is used without initializing
		//System.out.println(f);     // C T E


	}   // scope of i ends here
}
