/**
 * Derive the class Cellular from WirelessNetwork.
 * @ Wenzhuo Fan
 * @ 11/06/2019
 */
public class Cellular extends WirelessNetwork
{
   protected double time;
   protected double dataLimit;
   /**
    * @param static final double.
    */
   public static final double COST_FACTOR = 1.0;
   
   /** 
    * @param name to String.
    * @param bandwidth to double.
    * @param monthlyFixedCost to double.
    * @param dataLimitIn to replace the old dataLimit.
    * @param timeIn to replaced the old time.
    */
   public Cellular(String name, double bandwidth, 
      double monthlyFixedCost, double timeIn, double dataLimitIn) {
      super(name, bandwidth, monthlyFixedCost);
      setTime(timeIn);
      setDataLimit(dataLimitIn);
   }
   
   /**
    * @return time.
    */
   public double getTime() {
      return time;
   }
   
   /**
    * @param timeIn to replace the old time.
    */
   public void setTime(double timeIn) {
      time = timeIn;
   }
   
   /**
    * @return dataLimit.
    */
   public double getDataLimit() {
      return dataLimit;
   }
   
   /**
    * @param dataLimitIn to replace the old dataLimit.
    */
   public void setDataLimit(double dataLimitIn) {
      dataLimit = dataLimitIn;
   }
   
   /**
    * @return dataUsage.
    */
   public double dataUsage() {
      return bandwidth / 8000 * time;
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
            + (dataUsage() - dataLimit) * Cellular.COST_FACTOR);
      }
   }
   
   /**
    * @return String.
    */
   public String toString() {
      String output = super.toString() + "\n" + "Time: " + time
         + " seconds" + "\n" + "Data Limit: " + dataLimit + " GB"
         + "\n" + "Data Used: " + dataUsage() + " GB";
      return output;
   }
   
}