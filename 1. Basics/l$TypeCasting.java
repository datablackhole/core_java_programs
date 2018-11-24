class l$TypeCasting{								//The process of converting from one datatype to another is called TypeCasting. (Done by compiler)
	public static void main(String args[]){        // byte--->short--->int--->long--->float--->double
													//                char ---> int  

		//    Implicit Type Casting or widening or upcasting or no loss of precision
		char ch = 'a';
		int i =ch;
		System.out.println(i);

		int i0 = 10;
		float f=i0;
		System.out.println(f);

		//   Explicit Type Casting or narrowing or downcadting or loss of precision

		int i1 = 130;
		byte b = (byte)i1;
		System.out.println(b);

		float f2 =10.5f;
		int i2 = (int) f2;
		System.out.println(i2);

		int i3= 65;
		char ch2 = (char)i3;
		System.out.println(ch2);
	}
}
