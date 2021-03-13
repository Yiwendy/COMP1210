/**
 * Derive the class FiveG from class Cellular.
 * @ Wenzhuo Fan
 * @ 11/06/2019
 */
public class FiveG extends Cellular
{  
   /**
    * @param static final double.
    */
   public static final double COST_FACTOR = 5.0;
   
   /** 
    * @param name to String.
    * @param bandwidth to double.
    * @param monthlyFixedCost to double.
    * @param dataLimit to double.
    * @param time to double.
    */
   public FiveG(String name, double bandwidth, 
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
            + (dataUsage() - dataLimit) * FiveG.COST_FACTOR * 3);
      }
   }
}
      