import java.util.Optional;

public class MaleHuman extends Human implements Male{


    public MaleHuman(Optional<MaleHuman> father, Optional<FemaleHuman> mother, String eyesColor, String hairColor, Double height, Double weight, String name) {
        super(father, mother, eyesColor, hairColor, height, weight, "male", name);
    }
}
