class m$BlockTypes
{
  //instance block    -     it is executed at the time of object creation (aka Lazy Loading)
  {
    System.out.println("LAZY LOADING");
    //
    //
    //

  }
  static // static block  -  it is executed at the time of class loading (aka early loading) (before jvm runs main method)
  {
    System.out.println("EARLY LOADING");
    //
    //
    //
    //
  }


	public static void main(String args[]) throws Exception
  {
    System.out.println("Main Block");
    m$BlockTypes sb = new m$BlockTypes();
    {
      System.out.println("Normal Block");
    }
    //Class.forName("m$BlockTypes");    
	}
}
