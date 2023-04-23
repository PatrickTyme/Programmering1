package controller;

import model.Newsflash;
import storage.Storage;

import java.util.ArrayList;

public class Controller {
    private Storage storage;

    public Controller(Storage storage) {
        this.storage = storage;
    }

    public void createNewsflash(String header, String content) {
        Newsflash newsflash = new Newsflash(header, content);
        storage.addNewsflash(newsflash);
    }

    public void deleteNewsflash(Newsflash newsflash) {
        storage.deleteNewsflash(newsflash);
    }

    public void updateNewsflash(Newsflash newsflash) {
        newsflash.setVersion(newsflash.getVersion() + 1);
        storage.updateNewsflash(newsflash);
    }

    public ArrayList<Newsflash> getAllNewsflashes() {
        return storage.getAllNewsflashes();
    }
}
