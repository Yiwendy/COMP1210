import java.text.DecimalFormat;
/**
 * Stores wireless network data and provides methods to access the data.
 * @ Wenzhuo Fan
 * @ 11/06/2019
 */
public abstract class WirelessNetwork {

   protected String name;
   protected double bandwidth;
   protected double monthlyFixedCost;
   
   protected static int count = 0;
   
   /** 
    * @param nameIn to replace the old name.
    * @param bandwidthIn to replace the old bandwidth.
    * @param monthlyFixedCostIn to replace the old monthlyFixedCost.
    */
   public WirelessNetwork(String nameIn, double bandwidthIn, 
      double monthlyFixedCostIn) {
      setName(nameIn);
      setBandwidth(bandwidthIn);
      setMonthlyFixedCost(monthlyFixedCostIn);
      count++;
   }
   
   /**
    * @return name.
    */   
   public String getName() {
      return name;
   }
   
   /**
    * @param nameIn to replace the old name.
    */
   public void setName(String nameIn) {
      name = nameIn;
   }
   
   /**
    * @return bandwidth.
    */
   public double getBandwidth() {
      return bandwidth;
   }
   
   /** 
    * @param bandwidthIn to replace the old bandwidth.
    */
   public void setBandwidth(double bandwidthIn) {
      bandwidth = bandwidthIn;
   }
   
   /**
    * @return monthlyFixedCost.
    */
   public double getMonthlyFixedCost() {
      return monthlyFixedCost;
   }
   
   /** 
    * @param monthlyFixedCostIn to replace the old monthlyFixedCost.
    */
   public void setMonthlyFixedCost(double monthlyFixedCostIn) {
      monthlyFixedCost = monthlyFixedCostIn;
   }
   
   /**
    * @return count.
    */
   public static int getCount() {
      return count;
   }
   
   /**
    * @param count.
    */
   public static void resetCount() {
      count = 0;
   }
   
   /**
    * @return String.
    */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,#00.00#");
      String result = name + " (" + this.getClass() 
         + ") Cost: $" + df.format(monthlyCost())
         + "\n" + "Bandwidth: " + bandwidth + " Mbps";
      return result;
   }
   
   /**
    * @return abstract double/
    */
   public abstract double monthlyCost();
      
}