import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Store the name of the list and an ArrayList of IceCreamCone objects.
 * @ Wenzhuo Fan
 * @ 10/23/2019
 */
public class IceCreamConeList2
{
   // instance variable
   private String name;
   private IceCreamCone[] iccList;
   private int numberOfIceCreamCone;
   
   /**
    * Store the name of the list and an ArrayList of IceCreamCone objects.
    * @param nameIn to replace the old name
    * @param iccListIn to replace the old iccList.
    * @param numberOfIceCreamConeIn to replace the old numberOfIceCreamCone.
    */
   public IceCreamConeList2(String nameIn, IceCreamCone[] iccListIn, 
      int numberOfIceCreamConeIn) 
   {
      name = nameIn;
      iccList = iccListIn;
      numberOfIceCreamCone = numberOfIceCreamConeIn;
   }
   
   /**
    * @return the name of the list.
    */
   public String getName() 
   {
      return name;
   }
    
   /**
    * @return an int representing the number of objects of list.
    */
   public int numberOfIceCreamCones() 
   {
      return numberOfIceCreamCone;
   }
   
   /**
    * @return a double representing the total surface area.
    */
   public double totalSurfaceArea() 
   {
      double total = 0;
      
      int index = 0;
      while (index < numberOfIceCreamCone) {
         total += iccList[index].surfaceArea();
         index++;
      }
      return total;
   }
   
   /**
    * @return the total volume.
    */
   public double totalVolume() 
   {
      double total = 0;
      
      int index = 0;
      while (index < numberOfIceCreamCone) {
         total += iccList[index].volume();
         index++;
      }
      return total;
   }
   
   /** 
    * @return a double representing the average surface area.
    */
   public double averageSurfaceArea() {
      double average = 0;
      if (numberOfIceCreamCones() == 0) {
         return 0;
      }
      else {
         average = totalSurfaceArea() / numberOfIceCreamCones();
         return average;
      }
   }
   
   /** 
    * @return a double representing the average volume.
    */
   public double averageVolume() {
      double average = 0;
      if (numberOfIceCreamCones() == 0) {
         return 0;
      }
      else {
         average = totalVolume() / numberOfIceCreamCones();
         return average;
      }
   }
   
   /**
    * @return String for name of list
    */
   public String toString() {
      String result = name + "\n";
      int index = 0;
      while (index < numberOfIceCreamCone) {
         result += "\n" + iccList[index] + "\n";
         index++;
      }
      return result;
   }
   
   /**
    * @return String for summary of the list.
    */
   public String summaryInfo() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String result = "----- Summary for " + getName() + " -----";
      result += "\nNumber of IceCreamCone Objects: " + numberOfIceCreamCones();
      result += "\nTotal Surface Area: " + df.format(totalSurfaceArea());
      result += "\nTotal Volume: " + df.format(totalVolume());
      result += "\nAverage Surface Area: " + df.format(averageSurfaceArea());
      result += "\nAverage Volume: " + df.format(averageVolume());
      return result;
   }
   
   /**
    * @return the ArrayList of IceCreamCone objects
    */
   public IceCreamCone[] getList() {
      return iccList;
   }
   
   /**
    * @param fileNameIn to read
    * @return IceCreamConeList
    * @throws FileNotFoundException if the file cannot be opened
    */
   public IceCreamConeList2 readFile(String fileNameIn) 
      throws FileNotFoundException
   {
      IceCreamCone[] myList = new IceCreamCone[100];
      String iccListName = "";
      String label = "";
      int numIceCreamCone = 0;
      double height = 0, radius = 0;
      
      Scanner scanFile = new Scanner(new File(fileNameIn));
      name = scanFile.nextLine();
      
      while (scanFile.hasNextLine()) {
         label = scanFile.nextLine();
         radius = Double.parseDouble(scanFile.nextLine());
         height = Double.parseDouble(scanFile.nextLine());
         
         IceCreamCone i = new IceCreamCone(label, radius, height);
         myList[numIceCreamCone] = i;
         numIceCreamCone++;
      }
      
      IceCreamConeList2 iL = new IceCreamConeList2(name, myList,
         numIceCreamCone);
      
      return iL;
   }
      /**
       * Add a IceCreamCone object to the list.
       * @param radius to double.
       * @param height to double.
       * @param label to String.
       * 
       */
   public void addIceCreamCone(String label, double radius, double height) {
          
      IceCreamCone icc = new IceCreamCone(label, radius, height);
          
      iccList[numberOfIceCreamCone] = icc;
      numberOfIceCreamCone++;  
   }
       
       /** 
        * @return the object.
        * @param labelIn string.
        */
   public IceCreamCone findIceCreamCone(String labelIn) {
      IceCreamCone index = null;
      for (IceCreamCone c : iccList) {
         if (c != null) {
            if (c.getLabel().equalsIgnoreCase(labelIn)) {
               index = c;
               break;
            }
         }
      }
      return index;
   }
    
    /** 
     * @param labelIn to replace the old label.
     * @return true if deleted else return false
     */   
   public IceCreamCone deleteIceCreamCone(String labelIn) {
      IceCreamCone result = null;
      int index = -1;
      for (int i = 0; i < numberOfIceCreamCone; i++) {
         if (iccList[i].getLabel().equalsIgnoreCase(labelIn)) {
            result = iccList[i];
            index = i;
            break;    
         }
      }
      if (result != null) {
         
         for (int j = index; j < numberOfIceCreamCone - 1; j++) {
            iccList [j] = iccList[j + 1];
         }
         iccList[numberOfIceCreamCone - 1] = null;
         numberOfIceCreamCone--;
      }
      return result;
   }       
    /** 
     * @return the object.
     * @param labelIn to String
     * @param radius to double.
     * @param height to double
     */  
   public boolean editIceCreamCone(String labelIn, double radius, 
      double height) 
   {
      if (findIceCreamCone(labelIn) != null) 
      { 
         findIceCreamCone(labelIn).setRadius(radius);
         findIceCreamCone(labelIn).setHeight(height);
         return true;
      }
      return false;
   }
   
   /** 
    * @return result to IceCreamCone.
    */
   public IceCreamCone findIceCreamConeWithShortestRadius() {
      if (numberOfIceCreamCone <= 0) {
         return null;
      }
      else {
         IceCreamCone result = iccList[0];
         for (int i = 1; i < numberOfIceCreamCone; i++) {
            if (iccList[i].getRadius() < result.getRadius()) {
               result = iccList[i];
            }
         }
         return result;
      }
   }
   /** 
    * @return result to IceCreamCone.
    */
   public IceCreamCone findIceCreamConeWithLongestRadius() {
      if (numberOfIceCreamCone <= 0) {
         return null;
      }
      else { 
         IceCreamCone result = iccList[0];
         for (int i = 1; i < numberOfIceCreamCone; i++) {
            if (iccList[i].getRadius() > result.getRadius()) {
               result = iccList[i];
            }
         }
         return result;
      }
   }
   /** 
    * @return result to IceCreamCone.
    */
   public IceCreamCone findIceCreamConeWithSmallestVolume() {
      if (numberOfIceCreamCone <= 0) {
         return null;
      }
      else {
         IceCreamCone result = iccList [0];
         for (int i = 1; i < numberOfIceCreamCone; i++) {
            if (iccList[i].volume() < result.volume()) {
               result = iccList[i];
            }
         }
         return result;
      }
   }
   /** 
    * @return result to IceCreamCone.
    */
   public IceCreamCone findIceCreamConeWithLargestVolume() {
      if (numberOfIceCreamCone <= 0) {
         return null;
      }
      else {
         IceCreamCone result = iccList[0];
         for (int i = 1; i < numberOfIceCreamCone; i++) {
            if (iccList[i].volume() > result.volume()) {
               result = iccList[i];
            }
         }
         return result;
      }
   }
             
}
   
      
