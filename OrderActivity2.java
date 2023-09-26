public class Order {

   
    private String name;
    private String food;
    private String drinks;

    
    
   
    protected Order(String name, String food, String drinks){
    
    this.name = "Name";
    this.food = "Food";
    this.drinks = "Drinks";
    }
    protected Order () {
        // System.out.println("Order list");
    }   
   
    protected void setName(String name){
        this.name = name;
    }
    protected String getName (){
        return this.name;
    }
    protected void setFood(String food){
        this.food = food;
    }
    protected String getFood(){
        return this.food;
    }
    protected void  setDrinks (String drinks){
        this.drinks = drinks;
    }
    protected String getDrinks (){
        return this.drinks;
    }
 public void display() {
           
            System.out.println("Name: " + this.name);
            System.out.println("Food: " + this.food);
            System.out.println("Drinks: " + this.drinks + "\n");
    }
}
