import java.io.FileNotFoundException;
/**
 * Contains the main method for running the program. 
 * @ Wenzhuo Fan
 * @ 12/04/2019
 */
public class WirelessNetworksPart3 {
  /**
   * Contains the main method for running the program. 
   * @param args - not used
   */
   public static void main(String[] args)
   {
      if (args.length == 0) {
         System.out.println("File name expected as command line argument. ");
         System.out.println("Program ending.");
      }
      else {
      
         WirelessNetworkList wnList = new WirelessNetworkList();
         try {
            wnList.readFile(args[0]);
            System.out.print(wnList.generateReport()); 
            System.out.print(wnList.generateReportByName());
            System.out.print(wnList.generateReportByBandwidth()); 
            System.out.print(wnList.generateReportByMonthlyCost());
            System.out.print(wnList.generateInvalidRecordsReport());
         } catch (FileNotFoundException e) {
            System.out.print("*** Attempted to read file: "
               + args[0] + " (No such file or directory)");
         }
         
      }
   }
}
