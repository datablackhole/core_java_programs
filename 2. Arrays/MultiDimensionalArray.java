class MultiDimensionalArray{
         /*  In java multidimensional arrays are implemented by using array of arrays approach but not matrix approach (form).
            The main advantage of this approach is to improve memory utilization.*/
public static void main(String[] args) {
    int[][] i =new int[2][]; 
    i[0] = new int[3];  
    i[1] = new int[2];
    
    System.out.println(i[0][1]);  // arrays are initialized with default values when they are created
    i[0][1]=111;
    System.out.println(i[0][1]); // 111

    int[][][] a= new int[2][][];
    a[0] = new int[3][];
    a[1] = new int[2][2];
    a[0][0] = new int[1];
    a[0][1] = new int[2];
    a[0][2] = new int[3];

    System.out.println(i.length); // length is final variable which is applicable only for arrays 
    
    System.out.println(i[0].length); // note: for strings it has a final method called length() which returns no of characters present in a string
    
    System.out.println(i[1].length);
}
}