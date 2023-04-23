package Ex3;

public class Gift {
    private String description;
    private int price;
    private Person giver;

    public Gift(String description, int price, Person giver) {
        this.description = description;
        this.price = price;
        this.giver = giver;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Person getGiver() {
        return giver;
    }

    public void setGiver(Person giver) {
        this.giver = giver;
    }
}
