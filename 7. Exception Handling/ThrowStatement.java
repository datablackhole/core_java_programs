/**      throw statement
 *      - Sometimes we will create exception object explicitly & handover to JVM manually by using throw statement.
 *      - The throw keyword in Java is used to explicitly throw an exception from a method or any block of code. 
 * 
 */

class ThrowStatement{
    int[] array;

    public  void createArray(int size) {
        if (size < 0)
            throw new IllegalArgumentException("Size must be non-negative " + size);
        this.array = new int[size];
    }

    public static void main(String[] args) {

    ThrowStatement foo = new ThrowStatement();
    foo.createArray(-5);
    }   
}