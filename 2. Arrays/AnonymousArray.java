class AnonymousArray{
public static void main(String[] args) {
    // array is declared without reference name
    // such arrays are nameless, hence anonymous

    // purpose of anonymous arrays are for instance use
    System.out.println("Sum of array element is="
                        +
                        sum(new int[]{10,20,30}
                        //(new int[][]{{1,2,3},{5,8}})
                        ));



}
public static int sum(int[] i){
    int t=0;
    for (int i1 : i) {
        t=t+ i1;        
    }
    return t;
}
}