import java.util.Optional;

public class MaleHuman extends Human implements Male{

    private Double footSize;
    private String favoriteSport;
    public MaleHuman(Optional<MaleHuman> father,
                     Optional<FemaleHuman> mother,
                     String eyesColor,
                     String hairColor,
                     Double height,
                     Double weight,
                     String name,
                     Double footSize,
                     String favoriteSport) {
        super(father, mother, eyesColor, hairColor, height, weight, "male", name);
        this.footSize = footSize;
        this.favoriteSport = favoriteSport;
    }

    public Double getFootSize() {
        return footSize;
    }

    public void setFootSize(Double footSize) {
        this.footSize = footSize;
    }

    public String getFavoriteSport() {
        return favoriteSport;
    }

    public void setFavoriteSport(String favoriteSport) {
        this.favoriteSport = favoriteSport;
    }

    @Override
    public void drinkBeer() {
        System.out.println("Drink!");
    }

    @Override
    public void sayHello() {
        System.out.println("Hi!");
    }
}
