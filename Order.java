class Order {
    
    protected int forder;

    public Order() {
        this.forder = 0;
    }

    public void setForder(int forder) {
        this.forder = forder;
    }

    public int getForder() {
        return this.forder;
    }
}

class List extends Order {
    private String name;
    private String food;
    private String drinks;              

    public List() {
        this.name = "";
        this.food = "";
        this.drinks = "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getFood() {
        return this.food;
    }

    public void setDrinks(String drinks) {
        this.drinks = drinks;
    }

    public String getDrinks() {
        return this.drinks;
    }
}
