import java.util.*;
import java.util.function.Consumer;

public class OtherRelations <T extends Human> implements IRelations, Iterable<MyEntry<String,ArrayList<Human>>> {
    private T owner;
    private LinkedHashMap<String, ArrayList<Human>> relations;

    public OtherRelations(T owner) {
        this.owner = owner;
        this.relations = new LinkedHashMap<String, ArrayList<Human>>();
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

    @Override
    public Iterator<MyEntry<String,ArrayList<Human>>> iterator() {

        Iterator<MyEntry<String,ArrayList<Human>>>  it = new Iterator<>() {
            private int index = 0;
            @Override
            public boolean hasNext() {

                return index < relations.size();
            }

            @Override
            public MyEntry<String, ArrayList<Human>> next() {
                Set<String> keySet = relations.keySet();
                List<String> listKeys = new ArrayList<>(keySet);
                String key = listKeys.get(index++);
                MyEntry<String,ArrayList<Human>> result= new MyEntry<>(key,relations.get(key));
                return result;
            }
        };

        return it;
    }

    @Override
    public void forEach(Consumer action) {
        Iterable.super.forEach(action);
    }
}
