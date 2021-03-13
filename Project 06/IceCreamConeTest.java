import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
 * Test methods for IceCreamCone.
 * @ Wenzhuo Fan
 * @ 10/23/2019
 */

public class IceCreamConeTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
 

   /** Test method for setlabel.**/
   @Test public void testsetLabel1() {
      IceCreamCone icc = new IceCreamCone("", 1.0, 1.0);
      boolean expectedResult = true;
      boolean actualResult = icc.setLabel("Ex 1");
      Assert.assertEquals(expectedResult, actualResult);
   }
   /** Test method for setLabel. **/
   @Test public void testsetLabel2() {
      IceCreamCone icc = new IceCreamCone("", 1.0, 1.0);
      boolean expectedResult = false;
      boolean actualResult = icc.setLabel(null);
      Assert.assertEquals(expectedResult, actualResult);
   } 
   /** Test method for getLabel. **/
   @Test public void testGetLabel() {
      IceCreamCone icc = new IceCreamCone("Ex 1", 1.0, 1.0);
      String expectedResult = "Ex 1";
      String actualResult = icc.getLabel();
      Assert.assertEquals(expectedResult, actualResult);
   }
   
   /** Test method for setRadius. **/
   @Test public void testSetRadius1() {
      IceCreamCone icc = new IceCreamCone("Ex 1", 0, 1.0);
      boolean expectedResult = true;
      boolean actualResult = icc.setRadius(1.0);
      Assert.assertEquals(expectedResult, actualResult);
   }
   /** Test method for setRadius. **/
   @Test public void testSetRadius2() {
      IceCreamCone icc = new IceCreamCone("Ex 1", 0, 1.0);
      boolean expectedResult = false;
      boolean actualResult = icc.setRadius(-1);
      Assert.assertEquals(expectedResult, actualResult);
   }
   /** Test method for getRadius. **/
   @Test public void testGetRadius() {
      IceCreamCone icc = new IceCreamCone("Ex 1", 1.0, 1.0);
      double expectedResult = 1.0;
      double actualResult = icc.getRadius();
      Assert.assertEquals(expectedResult, actualResult, 0.0001);
   }
   
   /** Test method for setHeight. **/
   @Test public void testSetHeight1() {
      IceCreamCone icc = new IceCreamCone("Ex 1", 1.0, 0);
      boolean expectedResult = true;
      boolean actualResult = icc.setHeight(1.0);
      Assert.assertEquals(expectedResult, actualResult);
   }
   /** Test method for setHeight. **/
   @Test public void testSetHeight2() {
      IceCreamCone icc = new IceCreamCone("Ex 1", 1.0, 0);
      boolean expectedResult = false;
      boolean actualResult = icc.setHeight(-1);
      Assert.assertEquals(expectedResult, actualResult);
   }
   /** Test method for getHeight. **/ 
   @Test public void testGetHeight() {
      IceCreamCone icc = new IceCreamCone("Ex 1", 1.0, 1.0);
      double expectedResult = 1.0;
      double actualResult = icc.getHeight();
      Assert.assertEquals(expectedResult, actualResult, 0.0001);
   }
   
   /** Test method for volume. **/
   @Test public void testVolume() {
      IceCreamCone icc = new IceCreamCone("Ex 1", 1.0, 2.0);
      double expectedResult = 4.1887902;
      double actualResult = icc.volume();
      Assert.assertEquals(expectedResult, actualResult, 0.0001);
   }
   
   /** Test method for surfaceArea. **/
   @Test public void testSurfaceArea() {
      IceCreamCone icc = new IceCreamCone("Ex 1", 1.0, 2.0);
      double expectedResult = 13.308;
      double actualResult = icc.surfaceArea();
      Assert.assertEquals(expectedResult, actualResult, 0.0001);
   }
   
   /** Test method for toString. **/
   @Test public void testToString() {
      IceCreamCone icc = new IceCreamCone("Ex 2", 12.3, 25.5);
      String expectedResult = "IceCreamCone \"Ex 2\" with radius = 12.3"
         + " and height = 25.5 units has:" + "\n" 
         + "\tsurface area = 2,044.5837657 square units" + "\n"
         + "\tvolume = 7,937.3689278 cubic units";
      String actualResult = icc.toString();
      Assert.assertEquals(expectedResult, actualResult);
   } 
   
   /** Test method for Count. **/
   @Test public void testCount() {
      IceCreamCone.resetCount();
      IceCreamCone c = new IceCreamCone("", 2.0, 2.0);
      int expectedResult = 1;
      int actualResult = IceCreamCone.getCount();
      Assert.assertEquals(expectedResult, actualResult);
   }
   
   /** Test method for resetCount. **/
   @Test public void testResetCount() {
      int expectedResult = 1;
      IceCreamCone c = new IceCreamCone("Ex 1", 1.0, 2.0);
      IceCreamCone.resetCount();
      IceCreamCone i = new IceCreamCone("Ex 1", 1.0, 1.0);
      int actualResult = IceCreamCone.getCount();
      Assert.assertEquals(expectedResult, actualResult);
   }
   
   /** Test method for equals boolean. **/
   @Test public void testequalsf() {
      IceCreamCone i = new IceCreamCone("Ex 1", 1.0, 2.0);
      int o = 0;
      boolean expectedResult = false;
      boolean actualResult = i.equals(o);
      Assert.assertEquals(expectedResult, actualResult);
   }
   
   /** Test method for equals Label. **/
   @Test public void testequalsfE() {
      IceCreamCone i = new IceCreamCone("Ex 1", 1.0, 2.0);
      IceCreamCone b = new IceCreamCone("Ex 2", 1.0, 2.0);
      boolean expectedResult = false;
      boolean actualResult = i.equals(b);
      Assert.assertEquals(expectedResult, actualResult);
   }

   /** Test method for equals Radius. **/
   @Test public void testequalsR() {
      IceCreamCone i = new IceCreamCone("Ex 1", 1.0, 2.0);
      IceCreamCone b = new IceCreamCone("Ex 1", 2.0, 2.0);
      boolean expectedResult = false;
      boolean actualResult = i.equals(b);
      Assert.assertEquals(expectedResult, actualResult);
   } 
   
   /** Test method for equals Height. **/
   @Test public void testequalstH() {
      IceCreamCone i = new IceCreamCone("Ex 1", 1.0, 2.0);
      IceCreamCone b = new IceCreamCone("Ex 1", 1.0, 1.0);
      boolean expectedResult = false;
      boolean actualResult = i.equals(b);
      Assert.assertEquals(expectedResult, actualResult);
   } 
   
   /** Test method for equals boolean. **/
   @Test public void testequalstt() {
      IceCreamCone i = new IceCreamCone("Ex 1", 1.0, 2.0);
      IceCreamCone b = new IceCreamCone("Ex 1", 1.0, 2.0);
      boolean expectedResult = true;
      boolean actualResult = i.equals(b);
      Assert.assertEquals(expectedResult, actualResult);
   } 
   /** Test method for hashcode. **/
   @Test public void testhashCode() {
      IceCreamCone i = new IceCreamCone("Ex 1", 1.0, 2.0);
      int expectedResult = 0;
      int actualResult = i.hashCode();
      Assert.assertEquals(expectedResult, actualResult);
   }
      
        
}

