public class Main {

    public static void main(String[] args)
    {

        //Normal Waffle

        Waffle waffle1 = new NormalWaffle();
        System.out.println(waffle1.getDescription() + waffle1.getPrice() + " $ ");


        //Adding decorators

        waffle1 = new DarkChocolate(waffle1);
        System.out.println(waffle1.getDescription() + waffle1.getPrice() + " $ ");

        waffle1 = new BananaFruit(waffle1);
        System.out.println(waffle1.getDescription() + waffle1.getPrice() + " $ ");

        waffle1 = new CaramelSauce(waffle1);
        System.out.println(waffle1.getDescription() + waffle1.getPrice() + " $ ");

        waffle1 = new HazelNut(waffle1);
        System.out.println(waffle1.getDescription() + waffle1.getPrice() + " $ ");


        System.out.println();


        //Normal Waffle

        Waffle waffle2 = new BelgianWaffle();
        System.out.println(waffle2.getDescription() + waffle2.getPrice() + " $ ");


        //Adding decorators

        waffle2 = new DarkChocolate(waffle2);
        System.out.println(waffle2.getDescription() + waffle2.getPrice() + " $ ");

        waffle2 = new BananaFruit(waffle2);
        System.out.println(waffle2.getDescription() + waffle2.getPrice() + " $ ");

        waffle2 = new CaramelSauce(waffle2);
        System.out.println(waffle2.getDescription() + waffle2.getPrice() + " $ ");

        waffle2 = new HazelNut(waffle2);
        System.out.println(waffle2.getDescription() + waffle2.getPrice() + " $ ");


    }
}
