package Ex1;

import java.util.ArrayList;

public class Person {
    private String name;
    private String cpr;
    private String phone;
    private ArrayList<Dog> dogs = new ArrayList<Dog>();


    public Person(String name, String cpr, String phone) {
        this.name = name;
        this.cpr = cpr;
        this.phone = phone;
    }

    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    public ArrayList<Dog> getDogs() {
        return dogs;
    }

    public String getCpr() {
        return cpr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        if (dogs == null) {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", cpr='" + cpr + '\'' +
                    ", phone='" + phone + '\'' +
                    ", dogs= no dags" +
                    '}';
        } else {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", cpr='" + cpr + '\'' +
                    ", phone='" + phone + '\'' +
                    ", dogs=" + dogs +
                    '}';
        }
    }
}
