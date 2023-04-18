public class  Research<T extends Human>  {
    private T researchObject;

    public Research(T researchObject) {
        this.researchObject = researchObject;
    }

    public void conductResearch(){

        for (Human child : this.researchObject.getChildren()) {
            System.out.printf("Name: %s \t Gender: %s %n", child.getName(), child.getGender());
        }
    }
}
