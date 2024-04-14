package View;

import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SideMenuPanel extends JPanel implements ActionListener {

    private final int HEIGHT = 550;
    private final int WIDTH = 200;
    private JButton createSchoolBtn;
    private JButton addTeacherBtn;
    private JButton addStudentBtn;
    private MainWindowPanel mainWindowPanel;

    public SideMenuPanel(MainWindowPanel mainWindowPanel){
        this.mainWindowPanel = mainWindowPanel;
        this.setBackground(Color.DARK_GRAY);
        this.setLayout(null);
        this.setBounds(0,0,WIDTH,HEIGHT);
        setButtons();

    }
    public void setButtons() {

        final int BTN_WIDTH = 150;
        final int BTN_HEIGHT = 30;

        JButton createSchoolBtn = new JButton("Create school.");
        createSchoolBtn.setBounds(15, 60, BTN_WIDTH, BTN_HEIGHT);
        createSchoolBtn.addActionListener(e -> mainWindowPanel.addSchoolPanelMenu());
        createSchoolBtn.setFocusable(false);
        add(createSchoolBtn);


        JButton addTeacherBtn = new JButton("Add teacher.");
        addTeacherBtn.setBounds(15, 120, BTN_WIDTH, BTN_HEIGHT);
        addTeacherBtn.addActionListener(e -> System.out.println("teacher poo"));
        addTeacherBtn.setFocusable(false);
        add(addTeacherBtn);

        JButton addStudentBtn = new JButton("Add student.");
        addStudentBtn.setBounds(15, 180, BTN_WIDTH, BTN_HEIGHT);
        addStudentBtn.addActionListener(e -> System.out.println("Student poo"));
        addStudentBtn.setFocusable(false);
        add(addStudentBtn);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
