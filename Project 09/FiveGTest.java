import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 * @ Wenzhuo Fan
 * @ 11/06/2019
 */
public class FiveGTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** Test method for monthlyCost. **/
   @Test public void monthlyCost1() {
      FiveG n2 = new FiveG("My Note", 5.0, 20.00, 1200, 1.0);
      Assert.assertEquals("MonthlyCost Test", 20.0, n2.monthlyCost(), 0.001);
   }
   
   /** Test method for monthlyCost. **/
   @Test public void monthlyCost2() {
      FiveG n2 = new FiveG("My Note", 100, 20.00, 1200, 1.0);
      Assert.assertEquals("MonthlyCost Test", 230.0, n2.monthlyCost(), 0.001);
   }
}
