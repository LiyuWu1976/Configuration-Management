package at.fhj.msd;
import java.util.List;
public class Cocktail implements Drink {
    private String name;
    
    // ingredients is a list of liquids
    private List<Liquid> ingredients;


    public Cocktail(String name, List<Liquid> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getVolume() {
        return ingredients.stream().mapToDouble(Liquid::getVolume).sum();
    }

    @Override
    public double getAlcoholPercent() {
        double totalVolume = getVolume();
        if (totalVolume == 0) return 0;

        double alcoholVolume = ingredients.stream()
                .mapToDouble(l -> l.getVolume() * l.getAlcoholPercent() / 100)
                .sum();

        return (alcoholVolume / totalVolume) * 100;
    }

    @Override
    public boolean isAlcoholic() {
        return ingredients.stream()
                .anyMatch(l -> l.getAlcoholPercent() > 0);
    }
}