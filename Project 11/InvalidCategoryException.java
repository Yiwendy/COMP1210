/**
 * Defines a new subclass of the Exceptionclass.
 * @ Wenzhuo Fan
 * @ 12/04/2019
 */
public class InvalidCategoryException extends Exception {
   /**
    * @param categoryIn to replace the old category.
    */
   public InvalidCategoryException(String categoryIn) {
      super("For category: " + categoryIn);
   }
}
   