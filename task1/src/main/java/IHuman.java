import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public interface IHuman {
    Optional<MaleHuman> getFather();

    Optional<FemaleHuman> getMother();
    Set<Human> getChildren();
    void addChild(Human child);
}
