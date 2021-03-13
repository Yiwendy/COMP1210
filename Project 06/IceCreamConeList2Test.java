import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/**
 * Defines IceCreamCone object.
 * @ Wenzhuo Fan
 * @ 10/30/2019
 */
public class IceCreamConeList2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** Test method for getName. **/
   @Test public void testGetName() {
      IceCreamCone[] iccArray = new IceCreamCone[100];
      iccArray[0] = new IceCreamCone("Ex 1", 1, 2);
      iccArray[1] = new IceCreamCone("Ex 2", 12.3, 25.5);
      iccArray[2] = new IceCreamCone("Ex 3", 123.4, 900);
      
      IceCreamConeList2 iList = new IceCreamConeList2("Test List", iccArray, 3);
      
      Assert.assertEquals("getName Test", "Test List", iList.getName());
   }
   
   /** Test method for numberOfIceCreamCone. **/
   @Test public void testnumberOfIceCreamCones() {
      IceCreamCone[] iccArray = new IceCreamCone[100];
      iccArray[0] = new IceCreamCone("Ex 1", 1, 2);
      iccArray[1] = new IceCreamCone("Ex 2", 12.3, 25.5);
      iccArray[2] = new IceCreamCone("Ex 3", 123.4, 900);
      
      IceCreamConeList2 iList = new IceCreamConeList2("Test List", iccArray, 3);
      
      Assert.assertEquals("numberOfIceCreamCones Test", 3, 
         iList.numberOfIceCreamCones());
   }
   
   /** Test method for totalSurfaceArea. **/
   @Test public void testtotalSurfaceArea() {
      IceCreamCone[] iccArray = new IceCreamCone[100];
      iccArray[0] = new IceCreamCone("Ex 1", 1, 2);
      iccArray[1] = new IceCreamCone("Ex 2", 12.3, 25.5);
      iccArray[2] = new IceCreamCone("Ex 3", 123.4, 900);
      
      IceCreamConeList2 iList = new IceCreamConeList2("Test List", iccArray, 3);
      
      Assert.assertEquals("totalSurfaceArea Test", 449905.097, 
         iList.totalSurfaceArea(), 0.001);
   }
   
   /** Test method for totalVolume. **/
   @Test public void testTotalVolume() {
      IceCreamCone[] iccArray = new IceCreamCone[100];
      iccArray[0] = new IceCreamCone("Ex 1", 1, 2);
      iccArray[1] = new IceCreamCone("Ex 2", 12.3, 25.5);
      iccArray[2] = new IceCreamCone("Ex 3", 123.4, 900);
      
      IceCreamConeList2 iList = new IceCreamConeList2("Test List", iccArray, 3);
      
      Assert.assertEquals("totalVolume", 18295116.588, 
         iList.totalVolume(), 0.001);
      
   }
   
   /** Test method for averageSurfaceArea. **/
   @Test public void testaverageSurfaceArea() {
      IceCreamCone[] iccArray = new IceCreamCone[100];
      iccArray[0] = new IceCreamCone("Ex 1", 1, 2);
      iccArray[1] = new IceCreamCone("Ex 2", 12.3, 25.5);
      iccArray[2] = new IceCreamCone("Ex 3", 123.4, 900);
      
      IceCreamConeList2 iList = new IceCreamConeList2("Test List", iccArray, 3);
      
      Assert.assertEquals("AverageSurfaceArea Test", 149968.366, 
         iList.averageSurfaceArea(), 0.001);
      iccArray = new IceCreamCone[100];
      iList = new IceCreamConeList2("Test List", iccArray, 0);
      Assert.assertEquals("averageSurfaceArea", 0, 
         iList.averageSurfaceArea(), 0.001);
   }
   
   /** Test method for averageVolume. **/
   @Test public void testAverageVolume() {
      IceCreamCone[] iccArray = new IceCreamCone[100];
      iccArray[0] = new IceCreamCone("Ex 1", 1, 2);
      iccArray[1] = new IceCreamCone("Ex 2", 12.3, 25.5);
      iccArray[2] = new IceCreamCone("Ex 3", 123.4, 900);
      
      IceCreamConeList2 iList = new IceCreamConeList2("Test List", iccArray, 3);
      
      Assert.assertEquals("AverageVolume Test", 6098372.196, 
         iList.averageVolume(), 0.001);
      iccArray = new IceCreamCone[100];
      iList = new IceCreamConeList2("Test List", iccArray, 0);
      Assert.assertEquals("averageVolume", 0, 
         iList.averageVolume(), 0.001);
   }
   
   /** Test method fot ToString. **/
   @Test public void testtoString() {
      IceCreamCone[] iccArray = new IceCreamCone[100];
      iccArray[0] = new IceCreamCone("Ex 1", 1, 2);
      iccArray[1] = new IceCreamCone("Ex 2", 12.3, 25.5);
      iccArray[2] = new IceCreamCone("Ex 3", 123.4, 900);
      
      IceCreamConeList2 iList = new IceCreamConeList2("Test List", iccArray, 3);
      
      String result = iList.toString();
      Assert.assertEquals("ToString Test", result, iList.toString());
   }
   
   /** Test method for summary of the list.**/
   @Test public void testsummaryInfo() {
      IceCreamCone[] iccArray = new IceCreamCone[100];
      iccArray[0] = new IceCreamCone("Ex 1", 1, 2);
      iccArray[1] = new IceCreamCone("Ex 2", 12.3, 25.5);
      iccArray[2] = new IceCreamCone("Ex 3", 123.4, 900);
      
      IceCreamConeList2 iList = new IceCreamConeList2(
         "IceCreamCone_data_1.txt", iccArray, 3);
      String result = "----- Summary for IceCreamCone_data_1.txt -----" 
         + "\n" 
         + "Number of IceCreamCone Objects: 3" + "\n"
         + "Total Surface Area: 449,905.097" + "\n"
         + "Total Volume: 18,295,116.588" + "\n"
         + "Average Surface Area: 149,968.366" + "\n"
         + "Average Volume: 6,098,372.196";
      Assert.assertEquals("SummaryInfo Test", result, iList.summaryInfo());
   }

      
   /** Test method for getList. **/
   @Test public void testGetList() {
      IceCreamCone[] iccArray = new IceCreamCone[100];
      iccArray[0] = new IceCreamCone("Ex 1", 1, 2);
      iccArray[1] = new IceCreamCone("Ex 2", 12.3, 25.5);
      iccArray[2] = new IceCreamCone("Ex 3", 123.4, 900);
      
      IceCreamConeList2 iList = new IceCreamConeList2("Te List", iccArray, 3);
      Assert.assertArrayEquals("GetList Test", iccArray, iList.getList());
   }
   
   /** Test method for readfile.
    * @throws FileNotFoundException for reading a file.
    **/
   @Test public void testReadFile() throws FileNotFoundException {
      IceCreamCone[] iccArray = new IceCreamCone[100];
      iccArray[0] = new IceCreamCone("Ex 1", 1, 2);
      iccArray[1] = new IceCreamCone("Ex 2", 12.3, 25.5);
      iccArray[2] = new IceCreamCone("Ex 3", 123.4, 900);
      
      IceCreamConeList2 iList = new IceCreamConeList2("Test List", iccArray, 3);
      iList.readFile("IceCreamCone_data_1.txt");
      Assert.assertArrayEquals("ReadFile Test", iccArray, iList.getList());
   }
      
      
   /** Test method for addIceCreamCone. **/
   @Test public void testaddIceCreamCone() {
      IceCreamCone[] iccArray = new IceCreamCone[100];
      iccArray[0] = new IceCreamCone("Ex 1", 1, 2);
      iccArray[1] = new IceCreamCone("Ex 2", 12.3, 25.5);
      iccArray[2] = new IceCreamCone("Ex 3", 123.4, 900);
      
      IceCreamConeList2 iList = new IceCreamConeList2("Test List", iccArray, 3);
      IceCreamCone i = new IceCreamCone("Ex 1", 1.0, 1.0);
      iList.addIceCreamCone("Ex 1", 1.0, 1.0);
      IceCreamCone[] iA = iList.getList();
      
      Assert.assertEquals("addIceCreamCone Test", i, iA[3]);
     
   }
   
   /** Test method for findIceCreamCone. **/
   @Test public void testFindIceCreamCone1() {
      IceCreamCone[] iccArray = new IceCreamCone[100];
      IceCreamConeList2 iList = new IceCreamConeList2("Test List", iccArray, 0);
      Assert.assertEquals("FindIceCreamCone Test", null, 
         iList.findIceCreamCone("Ex 1"));
   }
 
   /** Test method for findIceCreamCone. **/
   @Test public void testFindIceCreamCone2() {
      IceCreamCone[] iccArray = new IceCreamCone[100];
      iccArray[0] = new IceCreamCone("Ex 1", 1, 2);
      iccArray[1] = new IceCreamCone("Ex 2", 12.3, 25.5);
      iccArray[2] = new IceCreamCone("Ex 3", 123.4, 900);
      
      IceCreamConeList2 iList = new IceCreamConeList2("Test List", iccArray, 3);
      IceCreamCone[] iA = iList.getList();
      Assert.assertEquals("FindIceCreamCone Test", iA[1], 
         iList.findIceCreamCone("Ex 2")); 
   }
   
   /** Test method for DeleteIceCreamCone. **/
   @Test public void testDeleteIceCreamCone1() {
      IceCreamCone[] iccArray = new IceCreamCone[100];
      IceCreamConeList2 iList = new IceCreamConeList2("Test List", iccArray, 0);
      Assert.assertEquals("DeleteIceCreamCone Test", null, 
         iList.deleteIceCreamCone("Ex 1"));
   }
   
   /** Test method for DeleteIceCreamCone. **/
   @Test public void testDeleteIceCreamCone2() {
      IceCreamCone[] iccArray = new IceCreamCone[100];
      iccArray[0] = new IceCreamCone("Ex 1", 1, 2);
      iccArray[1] = new IceCreamCone("Ex 2", 12.3, 25.5);
      iccArray[2] = new IceCreamCone("Ex 3", 123.4, 900);
      
      IceCreamConeList2 iList = new IceCreamConeList2("Test List", iccArray, 3);
      IceCreamCone[] iA = iList.getList();
      Assert.assertEquals("DeleteIceCreamCone Test", iA[1], 
         iList.deleteIceCreamCone("Ex 2")); 
   }
   
   /** Test method for editIceCreamCone. **/
   @Test public void testEditIceCreamCone1() {
      IceCreamCone[] iccArray = new IceCreamCone[100];
      IceCreamConeList2 iList = new IceCreamConeList2("Test List", iccArray, 0);
      Assert.assertFalse("EditIceCreamCone False Test", 
         iList.editIceCreamCone("Ex 1", 1.0, 2.0));
   }
   
   /** Test method for editIceCreamCone. **/
   @Test public void testEditIceCreamCone2() {
      IceCreamCone[] iccArray = new IceCreamCone[100];
      iccArray[0] = new IceCreamCone("Ex 1", 1, 2);
      iccArray[1] = new IceCreamCone("Ex 2", 12.3, 25.5);
      iccArray[2] = new IceCreamCone("Ex 3", 123.4, 900);
   
      IceCreamConeList2 iList = new IceCreamConeList2("Test List", iccArray, 3);
      Assert.assertTrue("EditIceCreamCone Ture Test", 
         iList.editIceCreamCone("Ex 1", 1.0, 2.0));
   }
   
   /** Test method for findIceCreamConeWithShortestRadius. **/
   @Test public void findIceCreamConeWithShortestRadius1() {
      IceCreamCone[] iccArray = new IceCreamCone[100];
      IceCreamConeList2 iList = new IceCreamConeList2("Test List", iccArray, 0);
      Assert.assertEquals("FindIceCreamConeWithShortestRadius Test", null, 
         iList.findIceCreamConeWithShortestRadius());
   }
   
   /** Test method for findIceCreamConeWithShortestRadius. **/
   @Test public void findIceCreamConeWithShortestRadius2() {
      IceCreamCone[] iccArray = new IceCreamCone[100];
      iccArray[0] = new IceCreamCone("Ex 1", 1, 2);
      iccArray[2] = new IceCreamCone("Ex 2", 12.3, 25.5);
      iccArray[1] = new IceCreamCone("Ex 3", 123.4, 900);
      
      IceCreamConeList2 iList = new IceCreamConeList2("Test List", iccArray, 3);
      IceCreamCone[] iA = iList.getList();
      Assert.assertEquals("FindIceCreamConeWithShortestRadius Test", iA[0], 
         iList.findIceCreamConeWithShortestRadius());
   }
   
   /** Test method for findIceCreamConeWithShortestRadius. **/
   @Test public void findIceCreamConeWithShortestRadius3() {
      IceCreamCone[] iccArray = new IceCreamCone[100];
      iccArray[1] = new IceCreamCone("Ex 1", 1, 2);
      iccArray[2] = new IceCreamCone("Ex 2", 12.3, 25.5);
      iccArray[0] = new IceCreamCone("Ex 3", 123.4, 900);
      
      IceCreamConeList2 iList = new IceCreamConeList2("Test List", iccArray, 3);
      IceCreamCone[] iA = iList.getList();
      Assert.assertEquals("FindIceCreamConeWithShortestRadius Test", iA[1], 
         iList.findIceCreamConeWithShortestRadius());
   }
   
   /** Test method for findIceCreamConeWithLongestRadius. **/
   @Test public void findIceCreamConeWithLongestRadius1() {
      IceCreamCone[] iccArray = new IceCreamCone[100];
      IceCreamConeList2 iList = new IceCreamConeList2("Test List", iccArray, 0);
      Assert.assertEquals("FindIceCreamConeWithLongestRadius Test", null, 
         iList.findIceCreamConeWithLongestRadius());
   }
   
   /** Test method for findIceCreamConeWithLongestRadius. **/
   @Test public void findIceCreamConeWithLongestRadius2() {
      IceCreamCone[] iccArray = new IceCreamCone[100];
      iccArray[0] = new IceCreamCone("Ex 1", 1, 2);
      iccArray[2] = new IceCreamCone("Ex 2", 12.3, 25.5);
      iccArray[1] = new IceCreamCone("Ex 3", 123.4, 900);
      
      IceCreamConeList2 iList = new IceCreamConeList2("Test List", iccArray, 3);
      IceCreamCone[] iA = iList.getList();
      Assert.assertEquals("FindIceCreamConeWithLongestRadius Test", iA[1], 
         iList.findIceCreamConeWithLongestRadius());
   }
   
   /** Test method for findIceCreamConeWithLongestRadius. **/
   @Test public void findIceCreamConeWithLongestRadius3() {
      IceCreamCone[] iccArray = new IceCreamCone[100];
      iccArray[1] = new IceCreamCone("Ex 1", 1, 2);
      iccArray[2] = new IceCreamCone("Ex 2", 12.3, 25.5);
      iccArray[0] = new IceCreamCone("Ex 3", 123.4, 900);
      
      IceCreamConeList2 iList = new IceCreamConeList2("Test List", iccArray, 3);
      IceCreamCone[] iA = iList.getList();
      Assert.assertEquals("FindIceCreamConeWithLongestRadius Test", iA[0], 
         iList.findIceCreamConeWithLongestRadius());
   }
   
   /** Test method for findIceCreamConeWithSmallestVolume. **/
   @Test public void findIceCreamConeWithSmallestVolume1() {
      IceCreamCone[] iccArray = new IceCreamCone[100];
      IceCreamConeList2 iList = new IceCreamConeList2("Test List", iccArray, 0);
      Assert.assertEquals("FindIceCreamConeWithSmallestVolume Test", null, 
         iList.findIceCreamConeWithSmallestVolume());
   }
   
   /** Test method for findIceCreamConeWithSmallestVolume. **/
   @Test public void findIceCreamConeWithSmallestVolume2() {
      IceCreamCone[] iccArray = new IceCreamCone[100];
      iccArray[0] = new IceCreamCone("Ex 1", 1, 2);
      iccArray[2] = new IceCreamCone("Ex 2", 12.3, 25.5);
      iccArray[1] = new IceCreamCone("Ex 3", 123.4, 900);
      
      IceCreamConeList2 iList = new IceCreamConeList2("Test List", iccArray, 3);
      IceCreamCone[] iA = iList.getList();
      Assert.assertEquals("FindIceCreamConeWithSmallestVolume Test", iA[0], 
         iList.findIceCreamConeWithSmallestVolume());
   }
   
   /** Test method for findIceCreamConeWithSmallestVolume. **/
   @Test public void findIceCreamConeWithSmallestVolume3() {
      IceCreamCone[] iccArray = new IceCreamCone[100];
      iccArray[1] = new IceCreamCone("Ex 1", 1, 2);
      iccArray[2] = new IceCreamCone("Ex 2", 12.3, 25.5);
      iccArray[0] = new IceCreamCone("Ex 3", 123.4, 900);
      
      IceCreamConeList2 iList = new IceCreamConeList2("Test List", iccArray, 3);
      IceCreamCone[] iA = iList.getList();
      Assert.assertEquals("FindIceCreamConeWithSmallestVolume Test", iA[1], 
         iList.findIceCreamConeWithSmallestVolume());
   }
   
   /** Test method for findIceCreamConeWithLargestVolume. **/
   @Test public void findIceCreamConeWithLargestVolume1() {
      IceCreamCone[] iccArray = new IceCreamCone[100];
      IceCreamConeList2 iList = new IceCreamConeList2("Test List", iccArray, 0);
      Assert.assertEquals("FindIceCreamConeWithLargestVolume Test", null, 
         iList.findIceCreamConeWithLargestVolume());
   }
   
   /** Test method for findIceCreamConeWithLargestVolume. **/
   @Test public void findIceCreamConeWithLargestVolume2() {
      IceCreamCone[] iccArray = new IceCreamCone[100];
      iccArray[0] = new IceCreamCone("Ex 1", 1, 2);
      iccArray[2] = new IceCreamCone("Ex 2", 12.3, 25.5);
      iccArray[1] = new IceCreamCone("Ex 3", 123.4, 900);
      
      IceCreamConeList2 iList = new IceCreamConeList2("Test List", iccArray, 3);
      IceCreamCone[] iA = iList.getList();
      Assert.assertEquals("FindIceCreamConeWithLargestVolume Test", iA[1], 
         iList.findIceCreamConeWithLargestVolume());
   } 
   /** Test method for findIceCreamConeWithLargestVolume. **/
   @Test public void findIceCreamConeWithLargestVolume3() {
      IceCreamCone[] iccArray = new IceCreamCone[100];
      iccArray[1] = new IceCreamCone("Ex 1", 1, 2);
      iccArray[2] = new IceCreamCone("Ex 2", 12.3, 25.5);
      iccArray[0] = new IceCreamCone("Ex 3", 123.4, 900);
      
      IceCreamConeList2 iList = new IceCreamConeList2("Test List", iccArray, 3);
      IceCreamCone[] iA = iList.getList();
      Assert.assertEquals("FindIceCreamConeWithLargestVolume Test", iA[0], 
         iList.findIceCreamConeWithLargestVolume());
   }           
}
  

