import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Store the name of the list and an ArrayList of IceCreamCone objects.
 * @ Wenzhuo Fan
 * @ 10/10/2019
 */
public class IceCreamConeList
{
   // instance variable
   private String name;
   private ArrayList<IceCreamCone> iccList;
   
   /**
    * Store the name of the list and an ArrayList of IceCreamCone objects.
    * @param nameIn to replace the old name
    * @param iccListIn to replace the old iccList.
    */
   
   public IceCreamConeList(String nameIn, ArrayList<IceCreamCone> iccListIn) 
   {
      name = nameIn;
      iccList = iccListIn;
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
      return iccList.size();
   }
   
   /**
    * @return a double representing the total surface area.
    */
   public double totalSurfaceArea() 
   {
      double total = 0;
      
      int index = 0;
      while (index < iccList.size()) {
         total += iccList.get(index).surfaceArea();
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
      while (index < iccList.size()) {
         total += iccList.get(index).volume();
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
      while (index < iccList.size()) {
         result += "\n" + iccList.get(index) + "\n";
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
   public ArrayList<IceCreamCone> getList() {
      return iccList;
   }
   
   /**
    * @param fileName to read
    * @return IceCreamConeList
    * @throws FileNotFoundException if the file cannot be opened
    */
   public IceCreamConeList readFile(String fileName) 
      throws FileNotFoundException
   {
      ArrayList<IceCreamCone> myList = new ArrayList<IceCreamCone>();
      String iccListName = "";
      String label = "";
      double height = 0, radius = 0;
      
      Scanner fileReader = new Scanner(new File(fileName));
      name = fileReader.nextLine();
      
      while (fileReader.hasNextLine()) {
         label = fileReader.nextLine();
         radius = Double.parseDouble(fileReader.nextLine());
         height = Double.parseDouble(fileReader.nextLine());
         
         IceCreamCone i = new IceCreamCone(label, radius, height);
         myList.add(i);
      }
      
      IceCreamConeList iL = new IceCreamConeList(name, myList);
      
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
          
      iccList.add(icc);
   }
       
       /** 
        * @return the object.
        * @param label string.
        */
   public IceCreamCone findIceCreamCone(String label) {
      for (IceCreamCone c : iccList) {
         if (c.getLabel().equalsIgnoreCase(label)) {
            return c;
         }
      }
      return null;
   }
    
    /** 
     * @param labelIn to repalce the old label.
     * @return true if deleted else return false
     */   
   public IceCreamCone deleteIceCreamCone(String labelIn) {
      IceCreamCone result = null;
      for (IceCreamCone item : iccList) {
         if (item.getLabel().equalsIgnoreCase(labelIn)) {
            result = item;
            break;
         }
      }
      if (result != null) {
         iccList.remove(result);
      }
      return result;
   }       
    /** 
     * @return the object.
     * @param label to String
     * @param radius to double.
     * @param height to double
     */  
   public boolean editIceCreamCone(String label, double radius, double height) 
   {
      if (findIceCreamCone(label) != null) 
      { 
         findIceCreamCone(label).setRadius(radius);
         findIceCreamCone(label).setHeight(height);
         return true;
      }
      return false;
   }
                
}
   
      
     
      
    
   

