class Creation{
public static void main(String[] args) {
    int[] i = new int[5];                           //every array is an object in java, hence the 'new' keyword

    // RULES TO CONTRUCT OR CREATE ARRAY
    //#1   
    // At the time of array creation, it is compulsary to specify array size otherwise we'll get c.t.e
    int[] a = new int[3];
    // int[] a = new int[];              C.T.E
    
    
    //#2   
    //  it is legal to have array size with zero elements
    int[] b = new int[0];
    System.out.println(b);
    System.out.println(b.length);

    //#3   
    //  No -ve numbers as an array size. 
    //  int[] b = new int[-4];             If -ve number is declared as array size then we will get runtime exception called NegativeArraySizeException 
    
    //#4   
    // Only byte, short, int , long datatypes can be allowed as array size
    //  int[] b = new int[10.5f]; //c.r.e possible loss of precision

    
    //#5   
    //  Max length
    int[] arr= new int[214748364];
                        
}
}