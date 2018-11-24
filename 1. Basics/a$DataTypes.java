class a$DataTypes{
	public static void main(String args[]){
		byte b;
		short s;
		int i;
		long l;
		float f;
		double d;
		boolean bn=false;
		char c;
		System.out.println("RANGES: ");
		System.out.println("BYTE: " + (b=-128) +" to "+ (b=127));
		System.out.println("SHORT: "+ (s=-32768) +" to "+ (s=32767));
		System.out.println("INT: "+ (i=-2147483648) +" to "+ (i=2147483647));
		System.out.println("LONG: "+ Long.MIN_VALUE +" to "+ Long.MAX_VALUE);
		System.out.println("FLOAT: "+ Float.MIN_VALUE +" to "+ Float.MAX_VALUE);
		System.out.println("DOUBLE: "+ Double.MIN_VALUE +" to "+ Double.MIN_VALUE);
		System.out.println("BOOLEAN: "+ bn);
		System.out.println("CHAR: "+ (c = 0) +" "+ (c=65535));

 }
}
