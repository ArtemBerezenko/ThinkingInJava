package ThinkingInJava.Ch_13_TypeInfo.nullObjects;

import java.util.ArrayList;

/**
 * Created by Home on 14.04.2017.
 */
public class Staff extends ArrayList<Position> {
    public void add(String title, Person person){
        add(new Position(title, person));
    }
    public void add(String... titles) {
        for (String title : titles) {
            add(new Position(title));
        }
    }

    public Staff(String... titles) {
        add(titles);
    }

    public boolean positionAvailable(String title) {
        for (Position position : this) {
            if (position.getTitle().equals(title) &&
                    position.getPerson() == Person.Null)
                return true;
        }
        return false;
    }

    public void fillPosition(String title, Person hire) {
        for (Position position : this) {
            if (position.getTitle().equals(title) &&
                    position.getPerson() == Person.Null) {
                position.setPerson(hire);
                return;
            }
            throw new RuntimeException("Position " + title + " not available");
        }
    }

    public static void main(String[] args) {
        Staff staff = new Staff("President", "CTO", "Marketing Manager",
                "Producer Manager", "Project Lead", "Software Engeneer",
                "Software Engeneer", "Software Engeneer", "Software Engeneer",
                "Test Engeneer", "Technical Writer");
        staff.fillPosition("President", new Person("Me", "Last", "The Top, Lonely At"));
        staff.fillPosition("Project Lead", new Person("Janet", "Palnner", "The Burbs"));
        if (staff.positionAvailable("Software Engineer")) {
            staff.fillPosition("Software Engineer", new Person("Bob", "Coder", "Bright Light City"));
        }
        System.out.println(staff);
    }
}
