import java.util.Comparator;
/**
 * Stores wireless network data and provides methods to access the data.
 * @ Wenzhuo Fan
 * @ 11/15/2019
 */
public class BandwidthComparator implements Comparator<WirelessNetwork> {
   
   /**
    * @param n1 to WirelessNetwork.
    * @param n2 to WirelessNetwork.
    * @return int.
    */
   public int compare(WirelessNetwork n1, WirelessNetwork n2) {
   
      return (int) (n1.getBandwidth() * 1000 - n2.getBandwidth() * 1000);
   }
}
 