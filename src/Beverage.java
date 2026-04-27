public abstract class Beverage {
    protected String name;
    protected String temperature;
    protected String size;
    protected String milk;
    protected int shots;
    protected String sweetener;

    public Beverage(String name, String temperature) {
        this.name = name;
        this.temperature = temperature;
        this.size = "Medium";
        this.milk = "Whole";
        this.shots = 0;
        this.sweetener = "None";
    }

    public String getName() { return name; }
    public String getTemperature() { return temperature; }
    public String getSize() { return size; }
    public String getMilk() { return milk; }
    public int getShots() { return shots; }
    public String getSweetener() { return sweetener; }

    public void setSize(String size) { this.size = size; }
    public void setMilk(String milk) { this.milk = milk; }
    public void setShots(int shots) { this.shots = shots; }
    public void setSweetener(String sweetener) { this.sweetener = sweetener; }

    @Override
    public String toString() {
        return temperature + " " + name + " [" + size + "] | Milk: " + milk + " | Shots: " + shots + " | Sweetener: " + sweetener;
    }
}