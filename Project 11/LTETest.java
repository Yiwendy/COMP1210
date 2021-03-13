import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 * @ Wenzhuo Fan
 * @ 11/06/2019
 */
public class LTETest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** Test method for monthlyCost. **/
   @Test public void monthlyCost1() {
      LTE n2 = new LTE("My Note", 5.0, 20.00, 1200, 1.0);
      Assert.assertEquals("MonthlyCost Test", 20.0, n2.monthlyCost(), 0.001);
   }
   
   /** Test method for monthlyCost. **/
   @Test public void monthlyCost2() {
      LTE n2 = new LTE("My Note", 100, 20.00, 1200, 1.0);
      Assert.assertEquals("MonthlyCost Test", 132.0, n2.monthlyCost(), 0.001);
   }
}
