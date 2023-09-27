/*
Author(s):
Carla Velarde
Angelica Joy Coyoca
Judy Ann Diaga
John Crisvell Punay
*/



public class Group {

    public static void main(String[] args) {
        
        Order list1 = new Order();
        list1.setName("Judy Diaga");
        list1.setFood("Adobo");
        list1.setDrinks("Coke Zero");
       
        Order list2 = new Order();
        list2.setName("Carla Velarde");
        list2.setFood("Empanada");
        list2.setDrinks("Iced coffee");

        Order list3 = new Order();
        list3.setName("John Punay");
        list3.setFood("Lechon");
        list3.setDrinks("Water");

        System.out.println("Order lists");
        System.out.println("\nCustomer: " +list1.getName ());
        System.out.println("Food: " +list1.getFood());
        System.out.println("Drinks: " +list1.getDrinks());
        System.out.println("\nCustomer: " +list2.getName ());
        System.out.println("Food: " +list2.getFood());
        System.out.println("Drinks: " +list2.getDrinks());
        System.out.println("\nCustomer: " +list3.getName ());
        System.out.println("Food: " +list3.getFood());
        System.out.println("Drinks: " +list3.getDrinks());


    }
}
