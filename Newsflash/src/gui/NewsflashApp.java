package gui;
import controller.Controller;
import model.Newsflash;
import storage.Storage;

import java.awt.*;

public class NewsflashApp {
    public static void main(String[] args) {


        // Add some initial newsflashes to the storage
        Newsflash newsflash1 = new Newsflash("Breaking news 1", "This is the first breaking news");
        Controller.createNewsflash(newsflash1.getHeader(), newsflash1.getContent());

        Newsflash newsflash2 = new Newsflash("Breaking news 2", "This is the second breaking news");
        Controller.createNewsflash(newsflash2.getHeader(), newsflash2.getContent());

        Newsflash newsflash3 = new Newsflash("Breaking news 3", "This is the third breaking news");
        Controller.createNewsflash(newsflash3.getHeader(), newsflash3.getContent());

        // Start the GUI
    }
}
