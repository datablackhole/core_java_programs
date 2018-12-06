/**
 * Exceptions which are created by the user, based on application requirement are called  customized exceptions
 * 
 */

 class TooYoungException extends RuntimeException{

        TooYoungException(String s){
            super(s);
        }
 }
 class TooOldException extends RuntimeException{
        TooOldException(String s){
            super(s);
        }
 }

 class UserDefinedExceptions{
     public static void main(String[] args) {
         String value = args[0];
         //Converting string input value to int
         int age = Integer.parseInt(value);
         if(age<18)
            throw new TooYoungException("Cant Vote");
        else 
            throw new TooOldException("can vote");
     }
 }