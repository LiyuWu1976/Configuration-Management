package at.fhj.msd;

/**
 * Abstract base class for concrete drink classes
 */
public interface Drink {


    /**
     *
     * @param name return the name of the drink
     *
     */
    String getName();

    /**
     * Calculates and returns volume of drink
     *
     * @return the volume of drink in liter
     */
    double getVolume();
    /**
     * Calculates and returns the alcohol percentage
     *
     * @return alcohol volume percent (e.g. 50)
     */
    double getAlcoholPercent();


    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    boolean isAlcoholic();
}
