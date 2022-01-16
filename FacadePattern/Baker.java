public class Baker {

    String description;
    String pizzatype1,pizzatype2,pizzatype3,pizzatype4;
    String kitchenTool;
    int temp, time;

    public Baker(String description, String pizzatype1, String pizzatype2, String pizzatype3, String kitchenTool,
                 String pizzatype4, int temp, int time)
    {
        this.description = description;
        this.pizzatype1 = pizzatype1;
        this.pizzatype2 = pizzatype2;
        this.pizzatype3 = pizzatype3;
        this.kitchenTool = kitchenTool;
        this.pizzatype4 = pizzatype4;
        this.temp = temp;
        this.time = time;
    }

    public void napPizza()
    {
        System.out.println(description + pizzatype1 + " in " + kitchenTool + " for temprature " + temp +  " ,time " + time + " minutes");
    }

    public void margheritaPizza()
    {
        System.out.println(description + pizzatype2 + " in " + kitchenTool + " for temprature " + temp + " ,time " + time +
                " munites");
    }

    public void marPizza()
    {
        System.out.println(description + pizzatype3 + " in " + kitchenTool + " for temprature " + temp + " ,time " + time +
                " munites");
    }

    public void chiPizza()
    {
        System.out.println(description + pizzatype4 + " in " + kitchenTool + " for temprature " + temp + " ,time " + time +
                " munites");
    }




}
