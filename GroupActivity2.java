import java.util.Scanner;

public class Group {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
      
    
   
      int loop, temp  ;
      
      
      
     
     
      

      
      System.out.print("Number of Customer: ");
      int or = Integer.parseInt(scan.nextLine());
      Order[] order = new Order[or];
      System.out.println();

      for (loop = 0; loop < order.length; loop++) {
      order[loop] = new Order();
      }
      for (loop = 0; loop < order.length; loop++) {
      temp = loop + 1;
      System.out.println("Order no." + temp );   
      System.out.print("Name: ");
      order[loop].setName(scan.nextLine());
      System.out.print("Food: ");
      order[loop].setFood(scan.nextLine());
      System.out.print("Drinks: ");
      order[loop].setDrinks(scan.nextLine());
      System.out.println();
      
      }
      

        
        // Order list1 = new Order();
        // list1.setName("Judy Diaga");
        // list1.setFood("Adobo");
        // list1.setDrinks("Coke Zero");
       
        // Order list2 = new Order();
        // list2.setName("Carla Velarde");
        // list2.setFood("Empanada");
        // list2.setDrinks("Iced coffee");

        // Order list3 = new Order();
        // list3.setName("John Punay");
        // list3.setFood("Lechon");
        // list3.setDrinks("Water");

        // System.out.println("Order lists");
        // System.out.println("\nCustomer: " +list1.getName ());
        // System.out.println("Food: " +list1.getFood());
        // System.out.println("Drinks: " +list1.getDrinks());
        // System.out.println("\nCustomer: " +list2.getName ());
        // System.out.println("Food: " +list2.getFood());
        // System.out.println("Drinks: " +list2.getDrinks());
        // System.out.println("\nCustomer: " +list3.getName ());
        // System.out.println("Food: " +list3.getFood());
        // System.out.println("Drinks: " +list3.getDrinks());


    


    }
  }
