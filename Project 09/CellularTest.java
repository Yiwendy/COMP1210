import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 * @ Wenzhuo Fan
 * @ 11/06/2019
 */
public class CellularTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** Test method for getTime and setTime. **/
   @Test public void timeTest() {
      Cellular n2 = new Cellular("My Note", 5.0, 20.00, 1200, 1.0);
      n2.setTime(100);
      Assert.assertEquals("Time Test", 100, n2.getTime(), 0.001);
   }
   
   /** Test method for getdataLimit and setDataLimit.**/
   @Test public void dataLimitTest() {
      Cellular n2 = new Cellular("My Note", 5.0, 20.00, 1200, 1.0);
      n2.setDataLimit(2.0);
      Assert.assertEquals("Time Test", 2.0, n2.getDataLimit(), 0.001);
   }
   
   /** Test method for dataUsage. **/
   @Test public void dataUsageTest() {
      Cellular n2 = new Cellular("My Note", 5.0, 20.00, 1200, 1.0);
      Assert.assertEquals("DataLimit Test", 0.75, n2.dataUsage(), 0.001);
   }
   
   /** Test method for monthlyCost. **/
   @Test public void monthlyCost1() {
      Cellular n2 = new Cellular("My Note", 5.0, 20.00, 1200, 1.0);
      Assert.assertEquals("MonthlyCost Test", 20.0, n2.monthlyCost(), 0.001);
   }
   
   /** Test method for monthlyCost. **/
   @Test public void monthlyCost2() {
      Cellular n2 = new Cellular("My Note", 100, 20.00, 1200, 1.0);
      Assert.assertEquals("MonthlyCost Test", 34.0, n2.monthlyCost(), 0.001);
   }
   
   /** Test method for toString. **/
   @Test public void toStringTest() {
      Cellular n2 = new Cellular("My Note", 5.0, 20.00, 1200, 1.0);
      String result = "My Note (class Cellular) Cost: $20.00" + "\n"
         + "Bandwidth: 5.0 Mbps" + "\n" + "Time: 1200.0 seconds"
         + "\n" + "Data Limit: 1.0 GB" + "\n" + "Data Used: 0.75 GB";
      Assert.assertEquals("ToString Test", result, n2.toString());
   }

}
