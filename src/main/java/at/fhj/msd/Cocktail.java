package at.fhj.msd;
import java.util.List;
/**
 * Represents a cocktail composed of multiple liquids.

 * Create a Cocktail class which is made up of multiple {@link Liquid} ingredients. 
 * Implements the {@link Drink} interface.
 */
public class Cocktail extends Drink {
     /**
     * The list of liquids in the cocktail.
     */
    private List<Liquid> ingredients;


    /**
     * Constructor for the Cocktail class
     * @param name the name of the cocktail
     * @param ingredients a list of liquids in the cocktail
     */
    public Cocktail(String name, List<Liquid> ingredients) {
        super(name);
        this.ingredients = ingredients;
    }
    /**
     * Calculates the total volume of the cocktail by summing up the volumes
     * of all individual liquid ingredients.
     *
     * @return total volume in liters
     */
    @Override
    public double getVolume() {
       // return ingredients.stream().mapToDouble(Liquid::getVolume).sum();
       //Ich glaube diese code ist besser für Verständnis
       double totalVolume = 0.0;
       for (Liquid liquid : ingredients) {
           totalVolume += liquid.getVolume();
       }
       return totalVolume;
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
        /* 
        //Ich glaube diese code ist besser für Verständnis: 
        if (ingredients.isEmpty() || getVolume() == 0) {
            return 0.0;
        }
        double totalAlcoholVolume = 0.0;
        for (Liquid liquid : ingredients) {
            totalAlcoholVolume += liquid.getVolume() * (liquid.getAlcoholPercent() / 100.0);
        }
        return (totalAlcoholVolume / getVolume()) * 100.0;
    }*/
    }

    /**
     * Checks if the cocktail contains any alcoholic ingredients.
     *
     * @return true if any ingredient has an alcohol percentage greater than 0, 
     * otherwise false
     */ 
    @Override
    public boolean isAlcoholic() {
        // return ingredients.stream()
        //         .anyMatch(l -> l.getAlcoholPercent() > 0);

    //wir können diese Code benutzen ,ich glaube ist besser Verständniss
    for (Liquid liquid : ingredients) {
        if (liquid.getAlcoholPercent() > 0) {
            return true;
        }
    }
    return false;
    }
}