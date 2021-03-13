import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;
/**
 * Provides methods for reading in the data file and generating reports.
 * @ Wenzhuo Fan
 * @ 11/20/2019
 */

public class WirelessNetworkListTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   

   /** Test the method for WirelessNetwork.**/
   @Test public void testWirelessNetwork() {
      WirelessNetworkList wList = new WirelessNetworkList();
      WiFi a = new WiFi("aaa", 2.0, 3.0, 4.0);
      wList.addWirelessNetwork(a);
      WirelessNetwork[] wnArray = new WirelessNetwork[1];
      wnArray[0] = a;
      
      Assert.assertArrayEquals(wnArray, wList.getWirelessNetworksArray());
      Assert.assertEquals(a, wnArray[0]);
   }
   
   /** Test the method for InvalidRecord. **/
   @Test public void testInvalidRecord() {
      WirelessNetworkList wList = new WirelessNetworkList();
      String a = new String("asdfgh");
      wList.addInvalidRecord(a);
      String[] iArray = new String[1];
      iArray[0] = a;
      Assert.assertArrayEquals(iArray, wList.getInvalidRecordsArray());
      Assert.assertEquals(a, iArray[0]);
   }
   
   
   
   /** Test the method for generateReport. **/
   /** 
    * @throws FileNotFoundException if the file cannot be opened
    */
   @Test public void testgenerateReport() throws FileNotFoundException {
      WirelessNetworkList wList = new WirelessNetworkList();
      wList.readFile("wireless_network_data1.csv");
      String actualResult = wList.generateReport();
      Assert.assertEquals(actualResult, wList.generateReport());
   }
   
   /** Test the method for generateReportByName. **/
   /** 
    * @throws FileNotFoundException if the file cannot be opened
    */
   @Test public void testgenerateReportByName() throws FileNotFoundException {
      WirelessNetworkList wList = new WirelessNetworkList();
      wList.readFile("wireless_network_data1.csv");
      String actualResult = wList.generateReportByName();   
      Assert.assertEquals(actualResult, wList.generateReportByName());
   }

 
   
   /** Test the method for generateReportByBandwidth. **/
  /** 
   * @throws FileNotFoundException if the file cannot be opened
   */
   @Test public void testgenerateReportByBandwidth() 
      throws FileNotFoundException {
      WirelessNetworkList wList = new WirelessNetworkList();
      wList.readFile("wireless_network_data1.csv");
      String actualResult = wList.generateReportByBandwidth();   
      Assert.assertEquals(actualResult, wList.generateReportByBandwidth());
   }
   
   /** Test the method for generateReportByMonthtlyCost. **/
   /** 
    * @throws FileNotFoundException if the file cannot be opened
    */
   @Test public void testgenerateReportByMonthlyCost() 
      throws FileNotFoundException {
      WirelessNetworkList wList = new WirelessNetworkList();
      wList.readFile("wireless_network_data2.exceptions.csv");
      String actualResult = wList.generateReportByMonthlyCost();   
      Assert.assertEquals(actualResult, 
         wList.generateReportByMonthlyCost());   
   }
   
   /** Test the method for generateReportByMonthtlyCost. **/
   /** 
    * @throws FileNotFoundException if the file cannot be opened
    */
   @Test public void testgenerateInvalidRecordsReport() 
      throws FileNotFoundException {
      WirelessNetworkList wList = new WirelessNetworkList();
      wList.readFile("wireless_network_data2.exceptions.csv");
      String actualResult = wList.generateInvalidRecordsReport();   
      Assert.assertEquals(actualResult, 
         wList.generateInvalidRecordsReport());   
   }
}
