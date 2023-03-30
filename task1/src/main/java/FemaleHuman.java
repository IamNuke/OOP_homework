import java.util.Optional;

public class FemaleHuman extends Human implements Female{


    public FemaleHuman(Optional<MaleHuman> father, Optional<FemaleHuman> mother, String eyesColor, String hairColor, Double height, Double weight, String name) {
        super(father, mother, eyesColor, hairColor, height, weight, "female", name);
    }
}
