import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Arrays;
/**
 * Provides methods for reading in the data file and generating reports.
 * @ Wenzhuo Fan
 * @ 11/13/2019
 */
public class WirelessNetworkList {
   private WirelessNetwork[] wirelessNetworksArray;
   private String[] invalidRecordsArray;
   
   /**
    * @param.
    */
   public WirelessNetworkList() {
      wirelessNetworksArray = new WirelessNetwork[0];
      invalidRecordsArray = new String[0];
   }
   
   /**
    * @return WirelessNetwork[].
    */
   public WirelessNetwork[] getWirelessNetworksArray() {
   
      return wirelessNetworksArray;
   }
   
   /**
    * @return String[].
    */
   public String[] getInvalidRecordsArray() {
      return invalidRecordsArray;
   }
   
   /**
    * @param wn to WirelessNetwork.
    */
   public void addWirelessNetwork(WirelessNetwork wn) {
      wirelessNetworksArray = Arrays.copyOf(wirelessNetworksArray, 
         wirelessNetworksArray.length + 1);
      wirelessNetworksArray[wirelessNetworksArray.length - 1] = wn;
      
   }
   
   /**
    * @param ir to String.
    */
   public void addInvalidRecord(String ir) {
      invalidRecordsArray = Arrays.copyOf(invalidRecordsArray, 
         invalidRecordsArray.length + 1);
      invalidRecordsArray[invalidRecordsArray.length - 1] = ir;
   }
   
   /**
    * @param fileNameIn to replace the old fileName.
    * @throws FileNotFoundException if the file cannot be opened
    */
   public void readFile(String fileNameIn)
      throws FileNotFoundException
   {
      Scanner scanFile = new Scanner(new File(fileNameIn));
      while (scanFile.hasNext()) { 
         String iRecords = scanFile.nextLine();
         
         try {
            Scanner output = new Scanner(iRecords); 
            output.useDelimiter(",");
         
            char category = output.next().charAt(0);
            String name = output.next();
            double bandwidth = Double.parseDouble(output.next());
            double monthlyFixedCost = 
               Double.parseDouble(output.next());  
            double time;
            double dataLimit;       
         
            switch(category) {
               case 'W': 
                  double modemCost = Double.parseDouble(output.next());
                  WiFi myWifi = new WiFi(name, bandwidth, 
                     monthlyFixedCost, modemCost);
                  this.addWirelessNetwork(myWifi);
                  break;
               case 'C':
                  time = Double.parseDouble(output.next());
                  dataLimit = Double.parseDouble(output.next());
                  Cellular myCellular = new Cellular(name, 
                     bandwidth, monthlyFixedCost, time, dataLimit);
                  this.addWirelessNetwork(myCellular);
                  break;
               case 'L':
                  time = Double.parseDouble(output.next());
                  dataLimit = Double.parseDouble(output.next());
                  LTE myLte = new LTE(name, bandwidth, 
                     monthlyFixedCost, time, dataLimit);
                  this.addWirelessNetwork(myLte);
                  break;
               case 'F':
                  time = Double.parseDouble(output.next());
                  dataLimit = Double.parseDouble(output.next());
                  FiveG myFiveG = new FiveG(name, bandwidth, 
                     monthlyFixedCost, time, dataLimit);
                  this.addWirelessNetwork(myFiveG);
                  break;
               default:
                  throw new InvalidCategoryException(category + "");
            }
         }
         catch (InvalidCategoryException i) {
            String output = iRecords + "\n" + i;
            addInvalidRecord(output);
         }
         catch (NumberFormatException i) {
            String output = iRecords + "\n" + i;
            addInvalidRecord(output);
         }
         catch (NoSuchElementException i) {
            String output = iRecords + "\n" + i + ": For missing input data";
            addInvalidRecord(output);
         }
      }
   }
   
   /** 
    * @return a String.
    */ 
   public String generateReport() {
      String report = "-------------------------------" + "\n"
         + "Monthly Wireless Network Report" + "\n"
         + "-------------------------------" + "\n";
      for (WirelessNetwork net : wirelessNetworksArray) {
         report += net.toString() + "\n\n";
      }
      return report;
   }
   /** 
    * @return a String.
    */
   public String generateReportByName() {
      String report = "-----------------------------------------" + "\n"
         + "Monthly Wireless Network Report (by Name)" + "\n"
         + "-----------------------------------------" + "\n";
      WirelessNetwork[] nameArray = Arrays.copyOf(wirelessNetworksArray, 
         wirelessNetworksArray.length);
      Arrays.sort(nameArray);
      for (WirelessNetwork net : nameArray) {
         report += net.toString() + "\n\n";
      } 
      return report;
         
   }
   
   /** 
    * @return a String.
    */
   public String generateReportByBandwidth() {
      String report = "----------------------------------------------" + "\n"
         + "Monthly Wireless Network Report (by Bandwidth)" + "\n"
         + "----------------------------------------------" + "\n";
      WirelessNetwork[] nameArray = Arrays.copyOf(wirelessNetworksArray, 
         wirelessNetworksArray.length);
      Arrays.sort(nameArray, new BandwidthComparator());     
      for (WirelessNetwork net : nameArray) {
         report += net.toString() + "\n\n";
      } 
      return report;
   }        

   /** 
    * @return a String.
    */
   public String generateReportByMonthlyCost() {
      String report = "-------------------------------------------------" + "\n"
         + "Monthly Wireless Network Report (by Monthly Cost)" + "\n"
         + "-------------------------------------------------" + "\n";
      WirelessNetwork[] nameArray = Arrays.copyOf(wirelessNetworksArray, 
         wirelessNetworksArray.length);
      Arrays.sort(nameArray, new MonthlyCostComparator());
      for (WirelessNetwork net : nameArray) {
         report += net.toString() + "\n\n";
      } 
      
      return report;
   }
   
   /** 
    * @return a String.
    */
   public String generateInvalidRecordsReport() {
      String report = "----------------------" + "\n"
         + "Invalid Records Report" + "\n"
         + "----------------------------" + "\n";
      for (String record : getInvalidRecordsArray()) {
         report += record + "\n\n";
      } 
      
      return report; 
   }
       
   
}