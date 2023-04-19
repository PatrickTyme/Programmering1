package Ex1;

import java.util.ArrayList;

public class Dog {
    private int number;
    private String name;

    private Person owner;


    public Dog(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        if (owner == null) {
            return "Dog{" +
                    "number=" + number +
                    ", name='" + name + '\'' +
                    ", owner= no owner" +
                    '}';
        }
        return "Dog{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", owner=" + owner.getName() +
                '}';
    }
}
