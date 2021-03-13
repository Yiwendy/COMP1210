import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
 * Test.
 * @ Wenzhuo Fan
 * @ 11/20/2019
 */
public class MonthlyCostComparatorTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

    
    /** Test the method for compare. */
   @Test public void compareTest() {
      MonthlyCostComparator a = new MonthlyCostComparator();
      WirelessNetwork n1 = new WiFi("a", 450, 40.00, 5.00);
      WirelessNetwork n2 = new WiFi("b", 450, 20.00, 3.00);
      Assert.assertEquals(a.compare(n1, n2), a.compare(n1, n2));
      Assert.assertEquals(a.compare(n1, n1), a.compare(n1, n1));
      Assert.assertEquals(a.compare(n2, n1), a.compare(n2, n1));
   }
     
   
}
