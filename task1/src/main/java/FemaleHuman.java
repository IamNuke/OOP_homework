import java.util.Optional;

public class FemaleHuman extends Human implements Female{

    private Integer bustSize = null;
    private String favoriteSinger = null;

    public FemaleHuman(Optional<MaleHuman> father,
                       Optional<FemaleHuman> mother,
                       String eyesColor,
                       String hairColor,
                       Double height,
                       Double weight,
                       String name,
                       Integer bustSize,
                       String favoriteSinger) {
        super(father, mother, eyesColor, hairColor, height, weight, "female", name);
        this.bustSize = bustSize;
        this.favoriteSinger = favoriteSinger;

    }

    public Integer getBustSize() {
        return bustSize;
    }

    public String getFavoriteSinger() {
        return favoriteSinger;
    }

    public void setBustSize(Integer bustSize) {
        this.bustSize = bustSize;
    }

    public void setFavoriteSinger(String favoriteSinger) {
        this.favoriteSinger = favoriteSinger;
    }

    @Override
    public void buyDress() {
        System.out.println("Buy dress!");
    }

    @Override
    public void sayHello() {
        System.out.println("Good day!");
    }
}
