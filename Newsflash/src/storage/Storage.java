package storage;

import model.Newsflash;

import java.util.ArrayList;

public class Storage {
    private ArrayList<Newsflash> newsflashes = new ArrayList<>();

    public void addNewsflash(Newsflash newsflash) {
        newsflashes.add(newsflash);
    }

    public void deleteNewsflash(Newsflash newsflash) {
        newsflashes.remove(newsflash);
    }

    public ArrayList<Newsflash> getAllNewsflashes() {
        return new ArrayList<>(newsflashes);
    }

    public void updateNewsflash(Newsflash newsflash) {
        int index = newsflashes.indexOf(newsflash);
        newsflashes.set(index, newsflash);
    }
}
