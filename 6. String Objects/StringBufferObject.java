/**
 *  STRINGBUFFER (Mutable)
 *      - If out string content changes frequently , then for every change a new object will be created internally.
 *      - The main advantage of StringBuffer over String is that all changes made to StringBuffer will be made to an existing object, a new object is not created.
 *      - if StringBuffer reaches its max capacity, a new StringBuffer object will be created with
 *                      new capacity = (current capacity + 1) x 2
 *      - 
 */
class StringBufferObject{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        sb.append("abcdefghijklmnop");
        System.out.println(sb.capacity());

        sb.append("qr");

        System.out.println(sb.capacity());

        StringBuffer sb2 = new StringBuffer(20);  // StringBuffer object with specified capacity
        System.out.println(sb2.capacity());

        StringBuffer sb3 = new StringBuffer("bhaskar");  // StringBuffer object with string's length (7) + (16)=23 as the capacity
        System.out.println(sb3.capacity());

        
    }
}