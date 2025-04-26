package at.fhj.msd;

import java.util.Arrays;
import java.util.List;

/**
 * Main class to demonstrate the functionality of the drink and queue classes.
 */
public class Main {
    /**
     * Main method to run the demonstration.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create Liquids
        Liquid water = new Liquid("Water", 0.5, 0.0);
        Liquid vodka = new Liquid("Vodka", 0.05, 40.0);
        Liquid soda = new Liquid("Soda", 0.15, 0.0);

        // Create SimpleDrink
        SimpleDrink waterDrink = new SimpleDrink("Water Drink", water);
        System.out.println("SimpleDrink: " + waterDrink.getName());
        System.out.println("Volume: " + waterDrink.getVolume() + " liters");
        System.out.println("Alcohol Percent: " + waterDrink.getAlcoholPercent() + "%");
        System.out.println("Is Alcoholic: " + waterDrink.isAlcoholic());

        // Create Cocktail
        List<Liquid> cocktailLiquids = Arrays.asList(vodka, soda);
        Cocktail mojito = new Cocktail("Mojito", cocktailLiquids);
        System.out.println("\nCocktail: " + mojito.getName());
        System.out.println("Volume: " + mojito.getVolume() + " liters");
        System.out.println("Alcohol Percent: " + mojito.getAlcoholPercent() + "%");
        System.out.println("Is Alcoholic: " + mojito.isAlcoholic());

        // Create DrinkQueue
        DrinkQueue queue = new DrinkQueue(3);
        System.out.println("\nDrinkQueue Operations:");
        System.out.println("Offer Water Drink: " + queue.offer(waterDrink));
        System.out.println("Offer Mojito: " + queue.offer(mojito));
        System.out.println("Peek: " + queue.peek().getName());
        System.out.println("Poll: " + queue.poll().getName());
        System.out.println("Poll: " + (queue.poll() != null ? queue.poll().getName() : "null"));
        System.out.println("Poll (empty): " + queue.poll());
    }
}