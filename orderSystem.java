
import java.util.Scanner;

public class orderSystem {
// ENCAPSULATION
// SETTERS AND GETTERS
    public Scanner scan = new Scanner(System.in);
    public int choose;
    public int quantity = 0;
    private double total = 0;
    private double pay;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }
    
//ABSTRACTION
//SUPERCLASS
    
    public abstract class MenuItem {

        private String itemName;
        private double itemPrice;
        
// PARAMETERIZE CONSTRUCTOR
        
        public MenuItem(String itemName, double itemPrice) {
            this.itemName = itemName;
            this.itemPrice = itemPrice;
        }

        public String getItemName() {
            return itemName;
        }

        public double getItemPrice() {
            return itemPrice;
        }

        public abstract void select1();

        public void select(){
             System.out.println("\nYou chose " + getItemName());

            System.out.println("How many orders of " + getItemName() + " do you want?");
            System.out.print("Enter number: ");
            quantity = scan.nextInt();
            setTotal(getTotal() + (quantity * getItemPrice()));

            purchaseAgain();
        }
    }

// MENU METHOD - IT SHOW ALL THE MENU  
    
    public static void menu(){
		System.out.println("\t--------------------------------------------");
		System.out.println("\t\t\tTAPSINAN MENU");
		System.out.println("\n\t\t1.TAPSILOG         Php. 45.00");
		System.out.println("\t\t2.TOCILOG          Php. 50.00");
		System.out.println("\t\t3.LONGSILOG        Php. 55.00");
		System.out.println("\t\t4.CANCEL");
		System.out.println("\t--------------------------------------------");
		}
	
//POLYMORPHISM
    public class Tapsilog extends MenuItem {
        
// INHERITANCE
// THE SUBCLASS INHERITS THE CONSTRUCTOR OF THE SUPERCLASS       
        
        public Tapsilog() {
            super("Tapsilog", 45.00);   //super: calls the super class
        }
// ASK THE USER IF HOW MANY ORDERS THAT HE/SHE WANT.
        
        public void select1() {
            System.out.println("\nYou chose " + getItemName());
            System.out.println("How many orders of " + getItemName() + " do you want?");
            System.out.print("Enter number: ");
            quantity = scan.nextInt();
            setTotal(getTotal() + (quantity * getItemPrice()));

            purchaseAgain();
        }
    }

    public class Tocilog extends MenuItem {

        public Tocilog() {
            super("Tocilog", 50.00);
        }
// ASK THE USER IF HOW MANY ORDERS THAT HE/SHE WANT.
        
        public void select1() {
            System.out.println("\nYou chose " + getItemName());

            System.out.println("How many orders of " + getItemName() + " do you want?");
            System.out.print("Enter number: ");
            quantity = scan.nextInt();
            
            setTotal(getTotal() + (quantity * getItemPrice()));

            purchaseAgain();
        }
    }

    public class Longsilog extends MenuItem {

        public Longsilog() {
            super("Longsilog", 55.00);
        }
        
// ASK THE USER IF HOW MANY ORDERS THAT HE/SHE WANT.
        
        public void select1() {
            System.out.println("\nYou chose " + getItemName());

            System.out.println("How many orders of " + getItemName() + " do you want?");
            System.out.print("Enter number: ");
            quantity = scan.nextInt();
            setTotal(getTotal() + (quantity * getItemPrice()));

            purchaseAgain();
        }
    }
    
// ASK THE USER IF HE/SHE WILL PURCHASE AGAIN 
// CALCULATE THE TOTAL PAYMENT.    
    
    public void purchaseAgain() {
        System.out.println("\nDo you want to purchase again?");
        System.out.println("[Press Y for YES AND N for NO] ");
        System.out.print("Enter choice: ");
        String again = scan.next();

        if (again.equalsIgnoreCase("Y")) {
            run();
        } else {
            System.out.println("TOTAL PURCHASE IS Php. " + getTotal());

            System.out.print("Enter Payment :");
            setPay(scan.nextDouble());

            if (getPay() < getTotal()) {
                System.out.println("Not enough payment ");
                run();
            } else {
                double change = getPay() - getTotal();
                System.out.println("CHANGE: Php. " + change);
            }
        }
    }

// METHOD THAT ASK THE USER TO CHOOSE HIS/HER FOOD.    
    
    public void run() {
        
        System.out.println("\n[Press 1 for TAPSILOG, Press 2 for TOCILOG, Press 3 for LONGSILOG, Press 4 to CANCEL] ");
        System.out.print("Enter number: ");
        choose = scan.nextInt();

        switch (choose) {
            case 1:
                Tapsilog tapsilog = new Tapsilog();
                tapsilog.select();
                break;
            case 2:
                Tocilog tocilog = new Tocilog();
                tocilog.select();
                break;
            case 3:
                Longsilog longsilog = new Longsilog();
                longsilog.select();
                break;
        }
    }

    public static void main(String[] args) {
 
//METHOD/FUNCTION CALL

        menu();
        orderSystem orderSystem = new orderSystem();
        orderSystem.run();
    }
}
