import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 * @ Wenzhuo Fan
 * @ 11/06/2019
 */
public class WiFiTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** Test method for getName and setName. **/
   @Test public void nameTest() {
      WiFi n1 = new WiFi("My Wifi", 450, 40.00, 5.00);
      n1.setName("My");
      Assert.assertEquals("Name Test", "My", n1.getName());
   }
   
   /** Test method for getBandWidth and setBandWidth. **/
   @Test public void bandWidthTest() {
      WiFi n1 = new WiFi("My Wifi", 450, 40.00, 5.00);
      n1.setBandwidth(200);
      Assert.assertEquals("Name Test", 200, n1.getBandwidth(), 0.001);
   }
   
   /** Test method for getMonthlyFixedCost and monthlyFixedCostIn. **/
   @Test public void getMonthlyFixedCostTest() {
      WiFi n1 = new WiFi("My Wifi", 450, 40.00, 5.00);
      n1.setMonthlyFixedCost(200);
      Assert.assertEquals("Name Test", 200, n1.getMonthlyFixedCost(), 0.001);
   }
      
   /** Test method for getModemCost and setModemCost. **/
   @Test public void modemCostTest() {
      WiFi n1 = new WiFi("My Wifi", 450, 40.00, 5.00);
      n1.setModemCost(6.0);
      Assert.assertEquals("GetModemCost Test", 6.00, n1.getModemCost(), 0.001);
   }
  
   
   /** Test method for Count. **/
   @Test public void testCount() {
      WiFi.resetCount();
      WiFi n1 = new WiFi("My Wifi", 450, 40.00, 5.00);
      int expectedResult = 1;
      int actualResult = WiFi.getCount();
      Assert.assertEquals(expectedResult, actualResult);
   }
   

   
   
   /** Test method for monthlyCost. **/
   @Test public void monthlyCostTest() {
      WiFi n1 = new WiFi("My Wifi", 450, 40.00, 5.00); 
      Assert.assertEquals("GetModemCost Test", 45.00, n1.monthlyCost(), 0.001);
   }
   
}
