

//Carla Velarde, Angelica Joy COyoca, Judy Ann Diaga, John Crisvell Punay

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List ol = new List();
        
       
       
       
        System.out.print("NAME : ");
        String fname = scan.nextLine();
        ol.setName(fname);

        System.out.print("FOOD : ");
        String fd = scan.nextLine();
        ol.setFood(fd);

        System.out.print("DRINKS : ");
        String dk = scan.nextLine();
        ol.setDrinks(dk);

        // Display the order details
       
//        System.out.print("Order Details");
        System.out.print("Name: " + ol.getName());
        System.out.print("Food: " + ol.getFood());
        System.out.print("Drinks: " + ol.getDrinks());
    }
}
