package Ex3;

import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    private ArrayList<Gift> gifts = new ArrayList<>();

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public ArrayList<Gift> getGifts() {
        return gifts;
    }
    public void receiveGift(Gift gift) {
        gifts.add(gift);
    }


    public int getTotalGiftValue() {
        int totalValue = 0;
        for (Gift gift : gifts) {
            totalValue += gift.getPrice();
        }
        return totalValue;
    }
    public ArrayList<Person> getGiftGivers() {
        ArrayList<Person> giftGivers = new ArrayList<Person>();
        for (Gift gift : gifts) {
            Person giver = gift.getGiver();
            if (giver != null && !giftGivers.contains(giver)) {
                giftGivers.add(giver);
            }
        }
        return giftGivers;
    }

}
