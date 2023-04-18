public class Research {
    private Human researchObject;

    public Research(Human researchObject) {
        this.researchObject = researchObject;
    }

    public void conductResearch(){

        for (Human child : this.researchObject.getChildren()) {
            System.out.printf("Name: %s \t Gender: %s %n", child.getName(), child.getGender());
        }
    }
}
