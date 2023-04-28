package Ex3;
import java.util.ArrayList;
public class TestG {

        public static void main(String[] args) {
            // create some persons
            Person john = new Person("John", 30);
            Person mary = new Person("Mary", 25);
            Person jane = new Person("Jane", 40);

            // create some gifts
            Gift gift1 = new Gift("Birthday present", 50, mary);
            Gift gift2 = new Gift("Christmas present", 100, mary);
            Gift gift3 = new Gift("Wedding gift", 200, john);
            Gift gift4 = new Gift("Anniversary present", 75, jane);
            Gift gift5 = new Gift("Graduation gift", 150, john);

            // assign gifts to persons
            john.receiveGift(gift1);
            john.receiveGift(gift2);
            john.receiveGift(gift4);
            mary.receiveGift(gift3);
            jane.receiveGift(gift5);

            // print list of gifts received by each person
            ArrayList<Person> persons = new ArrayList<>();
            persons.add(john);
            persons.add(mary);
            persons.add(jane);
            for (Person person : persons) {
                System.out.println(person.getName() + " has received the following gifts:");
                ArrayList<Gift> giftsReceived = person.getGifts();
                if (giftsReceived.isEmpty()) {
                    System.out.println("- none");
                } else {
                    for (Gift gift : giftsReceived) {
                        System.out.println("- " + gift.getDescription() + " from " + gift.getGiver().getName() + " (worth $" + gift.getPrice() + ")");
                    }
                }
                System.out.println("Total value of gifts received: $" + person.getTotalGiftValue());
                ArrayList<Person> giftGivers = person.getGiftGivers();
                if (giftGivers.isEmpty()) {
                    System.out.println(person.getName() + " has not received any gifts from anyone.");
                } else {
                    System.out.println(person.getName() + " has received gifts from:");
                    for (Person giver : giftGivers) {
                        System.out.println("- " + giver.getName());
                    }
                }
                System.out.println();
            }
        }
    }

