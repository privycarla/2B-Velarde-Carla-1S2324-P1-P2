public class Order {
   
    private String name;
    private String food ;
    private String drinks;

    protected Order(String name, String food, String drinks){
    this.name = name;
    this.food = food;
    this.drinks = drinks;
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
}
