/**      throws statement
 *      - if any checked exception is being raised in our program we can declare throws statement as follows:
 *              public static void main(String[] args)throws InterruptedException
 *                                                    ------
 */

class ThrowsStatement{

    public static void main(String[] args)throws InterruptedException {

        Thread.sleep(3000);
        System.out.println("java");

    }   
}