package Ex1;

import javax.sound.midi.Soundbank;

public class Test {
    public static void main(String[] args) {


        Person p1 = new Person("John", "2509", "3131");
        Person p2 = new Person("Ivan", "0925", "6963");
        Dog d1 = new Dog(1, "Hanne");
        Dog d2 = new Dog(2, "Sirius");
        d1.setOwner(p1);
        p1.addDog(d1);
        p2.addDog(d2);
        d2.setOwner(p2);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(d1);
        System.out.println(d2);


    }
}
