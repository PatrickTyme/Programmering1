
package gui;

import controller.Controller;
import model.Newsflash;
import storage.Storage;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class NewsflashGui extends JFrame {
    private JList<Newsflash> newsflashList;
    private JTextArea contentArea;
    private JButton newButton;
    private JButton deleteButton;
    private JPanel panel;

    private final Controller controller;

    public NewsflashGui(Controller controller) {
        super("Newsflashes");

        this.controller = controller;

        newsflashList = new JList<>();
        contentArea = new JTextArea();
        newButton = new JButton("New");
        deleteButton = new JButton("Delete");
        panel = new JPanel();

        newsflashList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane scrollPane = new JScrollPane(newsflashList);
        scrollPane.setPreferredSize(new Dimension(200, 200));

        panel.setLayout(new BorderLayout());
        panel.add(scrollPane, BorderLayout.WEST);
        panel.add(contentArea, BorderLayout.CENTER);
        panel.add(newButton, BorderLayout.SOUTH);
        panel.add(deleteButton, BorderLayout.EAST);

        add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);

        newButton.addActionListener(e -> {
            String header = JOptionPane.showInputDialog(this, "Header:");
            String content = JOptionPane.showInputDialog(this, "Content:");
            controller.createNewsflash(header, content);
            updateNewsflashList();
        });

        deleteButton.addActionListener(e -> {
            Newsflash selectedNewsflash = newsflashList.getSelectedValue();
            if (selectedNewsflash != null) {
                int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this newsflash?",
                        "Confirm Deletion", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    controller.deleteNewsflash(selectedNewsflash);
                    updateNewsflashList();
                }
            }
        });

        newsflashList.addListSelectionListener(e -> {
            Newsflash selectedNewsflash = newsflashList.getSelectedValue();
            if (selectedNewsflash != null) {
                contentArea.setText(selectedNewsflash.getContent());
            }
        });

        updateNewsflashList();
    }

    private void updateNewsflashList() {
        ArrayList<Newsflash> newsflashes = controller.getAllNewsflashes();
        newsflashList.setListData(newsflashes.toArray(new Newsflash[newsflashes.size()]));
    }
}
