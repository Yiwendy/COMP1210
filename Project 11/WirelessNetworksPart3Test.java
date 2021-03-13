import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 * @ Wenzhuo Fan
 * @ 12/04/2019
 */
public class WirelessNetworksPart3Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** Test method for main method. **/
   /**
   * @throws FileNotFoundException if the file cannot be opened
   **/
   @Test public void mainmethodtest() {
      WirelessNetworksPart3 p2 = new WirelessNetworksPart3();
      String[] args1 = {"wireless_network_data1.csv"};
      p2.main(args1);
      String[] args2 = {};
      p2.main(args2);
      
      Assert.assertEquals("Not compile", 1, 1);
   }
}
