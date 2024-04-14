package View;

import javax.swing.*;

public class MainFrame extends JFrame{
    public static final int HEIGHT = 550;
    public static final int WIDTH = 650;
    public MainFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(WIDTH, HEIGHT);
        this.setVisible(true);
        MainWindowPanel mainWindow = new MainWindowPanel();
        add(mainWindow);
        SideMenuPanel sideMenu = new SideMenuPanel(mainWindow);
        add(sideMenu);

    }

}
