package storage;

import controller.Controller;
import model.Newsflash;

import java.util.ArrayList;

public abstract class Storage {
    private static final ArrayList<Newsflash> newsflashes = new ArrayList<>();

    public static void addNewsflash(Newsflash newsflash) {
        newsflashes.add(newsflash);
    }

    public static void deleteNewsflash(Newsflash newsflash) {
        newsflashes.remove(newsflash);
    }

    public static ArrayList<Newsflash> getAllNewsflashes() {
        return new ArrayList<>(newsflashes);
    }

    public static void updateNewsflash(Newsflash newsflash) {
        int index = newsflashes.indexOf(newsflash);
        newsflashes.set(index, newsflash);
    }
}
