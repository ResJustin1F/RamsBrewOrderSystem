public class BeverageBuilder {
    private Beverage beverage;

    public BeverageBuilder(Beverage beverage) {
        this.beverage = beverage;
    }

    public BeverageBuilder setSize(String size) {
        beverage.setSize(size);
        return this;
    }

    public BeverageBuilder setMilk(String milk) {
        beverage.setMilk(milk);
        return this;
    }

    public BeverageBuilder setShots(int shots) {
        beverage.setShots(shots);
        return this;
    }

    public BeverageBuilder setSweetener(String sweetener) {
        beverage.setSweetener(sweetener);
        return this;
    }

    public Beverage build() {
        return beverage;
    }
}
