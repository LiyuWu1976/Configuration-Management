package at.fhj.msd;

// put into drinkss
public class Liquid {
    //name of the liquid
    private String name;

    // volume in ml
    // 1 l = 1000 ml     
    private double volume;

    // alcohol percent (e.g., 42.0 means 42%)
    private double alcoholPercent;

    public Liquid(String name, double volume, double alcoholPercent) {
        this.name = name;
        this.volume = volume;
        this.alcoholPercent = alcoholPercent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getAlcoholPercent() {
        return alcoholPercent;
    }
 
    public void setAlcoholPercent(double alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }
}
