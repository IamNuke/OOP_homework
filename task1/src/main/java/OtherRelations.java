import javax.net.ssl.HttpsURLConnection;
import java.util.*;
import java.util.function.Consumer;

public class OtherRelations implements IRelations {
    private Human owner;
    private HashMap<String, ArrayList<Human>> relations;

    public OtherRelations(Human owner) {
        this.owner = owner;
        this.relations = new HashMap<String, ArrayList<Human>>();
    }
    public void addRelation(String typeOfRelation, Human source){
        ArrayList<Human> currentRelationMembers = this.relations.get(typeOfRelation);
        if (currentRelationMembers == null){
            ArrayList<Human> members = new ArrayList<>();
            members.add(source);
            this.relations.put(typeOfRelation, members);
        }
        else{
            ArrayList<Human> members = this.relations.get(typeOfRelation);
            if (!members.contains(source)) {
                members.add(source);
            }

        }
    }

    @Override
    public String toString() {
        return "OtherRelations{" +
                "owner=" + owner +
                ", relations=" + relations +
                '}';
    }
}
