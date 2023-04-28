package controller;

import model.Newsflash;
import storage.Storage;

import java.util.ArrayList;

public abstract class Controller {

    public static void createNewsflash(String header, String content) {
        Newsflash newsflash = new Newsflash(header, content);
        Storage.addNewsflash(newsflash);
    }

    public static void deleteNewsflash(Newsflash newsflash) {
        Storage.deleteNewsflash(newsflash);
    }

    public static void updateNewsflash(Newsflash newsflash) {
        newsflash.setVersion(newsflash.getVersion() + 1);
        Storage.updateNewsflash(newsflash);
    }

    public ArrayList<Newsflash> getAllNewsflashes() {
        return Storage.getAllNewsflashes();
    }
}
