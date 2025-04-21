package at.fhj.msd;
import java.util.List;

/**
 * Create a Cocktail class which is made up of multiple {@link Liquid} ingredients. 
 * Implements the {@link Drink} interface.
 */
public class Cocktail implements Drink {
     /** The name of the cocktail */
    private String name;
    
    /** ingredients is a list of liquids in the cocktail */
    private List<Liquid> ingredients;


    /**
     * Constructor for the Cocktail class
     * @param name the name of the cocktail
     * @param ingredients a list of liquids in the cocktail
     */
    public Cocktail(String name, List<Liquid> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    /**
    * Gets the name of the cocktail.
    *
    * @return name of the cocktail
    */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Calculates the total volume of the cocktail by summing up the volumes
     * of all individual liquid ingredients.
     *
     * @return total volume in liters
     */
    @Override
    public double getVolume() {
        return ingredients.stream().mapToDouble(Liquid::getVolume).sum();
    }

    /**
     * Calculates the overall alcohol percentage of the cocktail.
     * It's a volume-weighted average of the alcohol content of its ingredients.
     *
     * @return alcohol percentage (e.g. 12.5 means 12.5%)
     */
    @Override
    public double getAlcoholPercent() {
        double totalVolume = getVolume();
        if (totalVolume == 0) return 0;

        double alcoholVolume = ingredients.stream()
                .mapToDouble(l -> l.getVolume() * l.getAlcoholPercent() / 100)
                .sum();

        return (alcoholVolume / totalVolume) * 100;
    }

    /**
     * Checks if the cocktail contains any alcoholic ingredients.
     *
     * @return true if any ingredient has an alcohol percentage greater than 0, 
     * otherwise false
     */ 
    @Override
    public boolean isAlcoholic() {
        return ingredients.stream()
                .anyMatch(l -> l.getAlcoholPercent() > 0);
    }
}