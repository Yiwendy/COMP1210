import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 * Create an IceCreamConeListMenuApp class with a main method that presents
 * the user with a menu with eight options.
 * @ Wenzhuo Fan
 * @ 10/10/2019
 */

public class IceCreamConeList2MenuApp
{
/**
 * Create an IceCreamConeListMenuApp class with a main method that presents
 * the user with a menu with eight options.
 * @param args - is not used.
 * @throws FileNotFoundException if the file cannot be opened.
 */
   public static void main(String[] args) throws FileNotFoundException
   {
      String listName = "";
      IceCreamCone[] myList = new IceCreamCone[100];
      IceCreamConeList2 myIccList = new IceCreamConeList2(listName, myList, 0);
      
      Scanner userInput = new Scanner(System.in);
      
      System.out.println("IceCreamCone List System Menu\n"
         + "R - Read File and Create IceCreamCone List\n"
         + "P - Print IceCreamCone List\n"
         + "S - Print Summary\n"
         + "A - Add IceCreamCone\n"
         + "D - Delete IceCreamCone\n"
         + "F - Find IceCreamCone\n"
         + "E - Edit IceCreamCone\n"
         + "Q - Quit");
      char choice;
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         choice = userInput.nextLine().toUpperCase().charAt(0);
         switch(choice) {
            case 'R' :
               System.out.print("\tFile Name: ");
               String fileName = userInput.nextLine();
               myIccList = myIccList.readFile(fileName);
               System.out.println("\tFile read in and IceCreamCone List" 
                  + " created\n");
               break;
         
            case 'P' :
               System.out.print(myIccList.toString() + "\n");
               break;
         
            case 'S' :
               System.out.println("\n" + myIccList.summaryInfo() + "\n");
               break;
         
            case 'A' :
               String label1 = "";
               double radius1 = 0.0;
               double height1 = 0.0;
            
               System.out.print("\tLabel: ");
               label1 = userInput.nextLine();
               System.out.print("\tRadius: ");
               radius1 = Double.parseDouble(userInput.nextLine());
               System.out.print("\tHeight: ");
               height1 = Double.parseDouble(userInput.nextLine());
               
               myIccList.addIceCreamCone(label1, radius1, height1);
               System.out.println("\t*** IceCreamCone added ***\n");
               break;
         
            case 'D' : 
               System.out.print("\tLabel: ");
               String label =  userInput.nextLine();
               IceCreamCone deleteName = myIccList.deleteIceCreamCone(label);
               if (deleteName != null) {
                  System.out.println("\t\""
                      + deleteName.getLabel() + "\"" + " deleted\n"); 
       
               }
               else {
                  System.out.println("\t\"" + label + "\""
                     + " not found\n");

               }
               break;
               
            case 'F' :
               System.out.print("\tLabel: ");
               label = userInput.nextLine();
               IceCreamCone findName = myIccList.findIceCreamCone(label);
               if (findName != null) {
                  System.out.println(findName + "\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
               
                        
            case 'E' : 
               String label2 = "";
               double radius2 = 0.0;
               double height2 = 0.0;
               System.out.print("\tLabel: ");
               label2 = userInput.nextLine();
               if (myIccList.findIceCreamCone(label2) != null) {
                  System.out.print("\tRadius: ");
                  double editRadius2 = Double.parseDouble(userInput.nextLine());
                  System.out.print("\tHeight: ");
                  double editHeight2 = Double.parseDouble(userInput.nextLine());
                  myIccList.editIceCreamCone(label2, editRadius2, editHeight2);
                  System.out.println("\t\"" + label2 
                     + "\" successfully edited\n");
               }
               else {
                  System.out.print("\tRadius: ");
                  double editRadius2 = Double.parseDouble(userInput.nextLine());
                  System.out.print("\tHeight: ");
                  double editHeight2 = Double.parseDouble(userInput.nextLine());
                  System.out.println("\t\"" + label2 + "\" not found\n");
               }
               break;
            case 'Q' : 
               break;
            default: 
               System.out.println("\t*** invalid code ***\n");
         
         }
      } while (choice != 'Q');
   }
}
      
            
               
               
            
