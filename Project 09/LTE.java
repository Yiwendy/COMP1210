/**
 * Derive the class LTE from Cellular.
 * @ Wenzhuo Fan
 * @ 11/06/2019
 */
public class LTE extends Cellular
{
   /**
    * @param static final double.
    */
   public static final double COST_FACTOR = 4.0;
   
   /** 
    * @param name to String.
    * @param bandwidth to double.
    * @param monthlyFixedCost to double.
    * @param dataLimit to double.
    * @param time to double.
    */
   public LTE(String name, double bandwidth, 
      double monthlyFixedCost, double time, double dataLimit) {
      super(name, bandwidth, monthlyFixedCost, time, dataLimit);
   }
   
   /**
    * @return double.
    */
   public double monthlyCost() {
      if (dataUsage() <= dataLimit) {
         return monthlyFixedCost;
      }
      else {
         return (monthlyFixedCost 
            + (dataUsage() - dataLimit) * LTE.COST_FACTOR * 2);
      }
   }
   
}
   
   
      