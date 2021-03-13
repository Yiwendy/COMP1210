/**
 * Derive the class WiFi.java from WirelessNetwork.
 * @ Wenzhuo Fan
 * @ 11/06/2019
 */
public class WiFi extends WirelessNetwork
{
   private double modemCost;
   
   /** 
    * @param name to String.
    * @param bandwidth to double.
    * @param monthlyFixedCost to double.
    * @param modemCostIn to replace the old modemCost.
    */
   public WiFi(String name, double bandwidth, 
      double monthlyFixedCost, double modemCostIn) {
      super(name, bandwidth, monthlyFixedCost);
      setModemCost(modemCostIn);
   }
   
   /**
    * @return modemCost.
    */
   public double getModemCost() {
      return modemCost;
   }
   
   /**
    * @param modemCostIn to replace the old modemCostIn.
    */
   
   public void setModemCost(double modemCostIn) {
      modemCost = modemCostIn;
   }
   
   /**
    * @return monthlyCost.
    */
   public double monthlyCost() {
      double monthlyCost = monthlyFixedCost + modemCost;
      return monthlyCost;
   }
   
}