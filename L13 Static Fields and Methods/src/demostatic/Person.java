package demostatic;

public class Person {
    private static int nextId = 100;

    private int id;
    private String firstName;

    public Person(String firstName) {
        this.id = nextId;
        nextId++;
        this.firstName = firstName;
    }
    @Override
    public String toString() {
        return String.format("Person(%d, %s)", id ,firstName);
    }

    public static int getNextId() {
        return nextId;
    }
}
