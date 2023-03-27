package Opgaver2.ex3;

public class Persona {
    private String name;
    private String title;
    private boolean senior;

    public Persona(String name, String title, boolean senior) {
        this.name = name;
        this.title = title;
        this.senior = senior;
    }

    public String toString() {
        String s = title + " " + name;
        if (senior) {
            s += " (senior)";
        }
        return s;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public boolean isSenior() {
        return senior;
    }
}
