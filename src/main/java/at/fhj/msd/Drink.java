package at.fhj.msd;

/**
 * Abstract base class for concrete drink classes, providing common properties and methods for drinks.
 */
public abstract class Drink {
    /**
     * The name of the drink.
     */
    protected String name;

    /**
     * Creates a Drink object with the specified name.
     *
     * @param name the name of the drink
     */
    public Drink(String name){
        this.name=name;
    }
    
    
    /**
     * Gets the name of the drink.
     *
     * @return the name of the drink
     */
   public String getName(){
    return name;
   }

    /**
     * Calculates and returns volume of drink
     *
     * @return the volume of drink in liter
     */
    public abstract double getVolume();
    /**
     * Calculates and returns the alcohol percentage
     *
     * @return alcohol volume percent (e.g. 50)
     */
    public abstract double getAlcoholPercent();


    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    public abstract  boolean isAlcoholic();

     /**
     * Sets the name of the drink.
     *
     * @param name the new name of the drink
     */
    public void setName(String name) {
        this.name = name;
    }
}
