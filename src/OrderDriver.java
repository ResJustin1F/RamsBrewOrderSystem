public class OrderDriver {
    public static void main(String[] args) {

        Order order = new Order();

        Beverage coffee = new BeverageBuilder(new Coffee("Hot"))
                .setSize("Large")
                .setMilk("Skim")
                .setShots(2)
                .setSweetener("Sugar")
                .build();

        Beverage latte = new BeverageBuilder(new Latte("Iced"))
                .setSize("Medium")
                .setMilk("Oat")
                .setShots(1)
                .setSweetener("Honey")
                .build();

        Beverage tea = new BeverageBuilder(new Tea("Hot"))
                .setSize("Small")
                .setMilk("Almond")
                .setSweetener("Stevia")
                .build();

        order.addBeverage(coffee);
        order.addBeverage(latte);
        order.addBeverage(tea);

        order.printOrder();
    }
}