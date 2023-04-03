import java.util.*;

public abstract  class Human implements IHuman{

    private String eyesColor;
    private String hairColor;
    private Double height;
    private Double weight;
    private String name;
    private String gender;
    private Optional<MaleHuman> father;
    private Optional<FemaleHuman> mother;
    private final Set<Human> children = new HashSet<>();

    public Human(Optional<MaleHuman> father,
                 Optional<FemaleHuman> mother,
                 String eyesColor,
                 String hairColor,
                 Double height,
                 Double weight,
                 String gender,
                 String name) {

        this.eyesColor = eyesColor;
        this.hairColor = hairColor;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.name = name;

        this.father = father;
        this.mother = mother;
        if (father.isPresent()) {
            father.get().addChild(this);
        }
        if (mother.isPresent()) {
            mother.get().addChild(this);
        }
    }

    public abstract void sayHello();
    public Optional<MaleHuman> getFather() {
        return father;
    }

    public Optional<FemaleHuman> getMother() {
        return mother;
    }
    public Set<Human> getChildren() {
        return Collections.unmodifiableSet(children);
    }

    public void addChild(Human child) {
        children.add(child);
    }
    public String getEyesColor() {
        return eyesColor;
    }

    public String getHairColor() {
        return hairColor;
    }


    public Double getHeight() {
        return height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Human{" +
                "eyesColor='" + eyesColor + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", father=" + father.orElse(null) +
                ", mother=" + mother.orElse(null) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(eyesColor, human.eyesColor) && Objects.equals(hairColor, human.hairColor) && Objects.equals(height, human.height) && Objects.equals(weight, human.weight) && Objects.equals(name, human.name) && Objects.equals(gender, human.gender) && Objects.equals(father, human.father) && Objects.equals(mother, human.mother);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eyesColor, hairColor, height, weight, name, gender, father, mother);
    }
}
