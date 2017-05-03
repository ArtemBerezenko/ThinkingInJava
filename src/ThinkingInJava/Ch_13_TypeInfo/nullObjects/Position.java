package ThinkingInJava.Ch_13_TypeInfo.nullObjects;

/**
 * Created by Home on 14.04.2017.
 */
class Position {
    private String title;
    private Person person;

    public Position(String jobTitle, Person employee) {
        this.title = jobTitle;
        this.person = employee;
        if (person == null) {
            person = Person.Null;
        }
    }

    public Position(String jobTitle) {
        this.title = jobTitle;
        person = Person.Null;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
        if (person == null) {
            person = Person.Null;
        }
    }

    @Override
    public String toString() {
        return "Position{" +
                "title='" + title + '\'' +
                ", person=" + person +
                '}';
    }
}

