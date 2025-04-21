package at.fhj.msd;
/**
 * Represents a single liquid ingredient used in drinks or cocktails.
 */
public class Liquid {
     /** Name of the liquid, e.g. "Wiskey", "Coca Cola" */
    private String name;

     /** Volume in liters (e.g. 0.05 means 50ml) */
    private double volume;

    /** Alcohol content in percent (e.g. 42.0 means 42%) */
    private double alcoholPercent;

    /**
     * Constructor of a Liquid.
     *
     * @param name the name of the liquid
     * @param volume the volume of the liquid in liters
     * @param alcoholPercent the alcohol percentage of the liquid (0–100)
     */
    public Liquid(String name, double volume, double alcoholPercent) {
        this.name = name;
        this.volume = volume;
        this.alcoholPercent = alcoholPercent;
    }

    /**
     * Gets the name of the liquid.
     * @return the name of the liquid
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the liquid.
     * @param name the new name of the liquid
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the volume of the liquid.
     * @return the volume of the liquid in liters
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Sets the volume of the liquid.
     * @param volume the new volume of the liquid in liters
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * Gets the alcohol percentage of the liquid.
     * @return the alcohol percentage of the liquid (0–100)
     */
    public double getAlcoholPercent() {
        return alcoholPercent;
    }
 
    /**
     * Sets the alcohol percentage of the liquid.
     * @param alcoholPercent the new alcohol percentage of the liquid (0–100)
     */
    public void setAlcoholPercent(double alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }
}
