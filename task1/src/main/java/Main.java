import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        MaleHuman myFather = new MaleHuman(
                Optional.empty(),
                Optional.empty(),
                "blue",
                "black",
                180.0,
                70.0,
                "Петр Семенович Иванов");
        FemaleHuman myMother = new FemaleHuman(Optional.empty(),
                Optional.empty(),
                "green",
                "blond",
                165.0,
                55.5,
                "Ольга Альбертовна Иванова");

        MaleHuman me = new MaleHuman(
                Optional.of(myFather),
                Optional.of(myMother),
                "green",
                "blond",
                165.0,
                60.0,
                "Иван Петрович Иванов");

        FemaleHuman myWife = new FemaleHuman(
                Optional.empty(),
                Optional.empty(),
                "brown",
                "blond",
                172.0,
                52.5,
                "Анна Владимировна Иванова");

        MaleHuman mySon = new MaleHuman(
                Optional.of(me),
                Optional.of(myWife),
                "brown",
                "blond",
                123.0,
                15.5,
                "Сергей Иванович Иванов");

        System.out.println(mySon);

        Research rs = new Research(me);
        rs.сonductResearch();

        OtherRelations rl = new OtherRelations(me);
        MaleHuman myBrother = new MaleHuman(
                Optional.of(myFather),
                Optional.of(myMother),
                "blue",
                "blond",
                175.0,
                72.0,
                "Денис Петрович Иванов");

        rl.addRelation("brother", myBrother);
        System.out.println(rl);

    }
}