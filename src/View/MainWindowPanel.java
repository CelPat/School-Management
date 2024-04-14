package View;

import Controllers.SchoolControler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindowPanel extends JPanel implements ActionListener {

    private final int HEIGHT = 550;
    private final int WIDTH = 450;

    private JButton submitBtn;
    private JTextField schoolNameTextField;
    private JTextField schoolAddressTextField;
    private JTextField schoolBalanceTextField;
    public MainWindowPanel(){
        this.setBackground(Color.LIGHT_GRAY);
        this.setLayout(null);
        this.setBounds(200,0,WIDTH,HEIGHT);
    }

    public void addSchoolPanelMenu(){
        final int BTN_WIDTH = 150;
        final int BTN_HEIGHT = 30;

        schoolNameTextField = new JTextField("School name");
        schoolNameTextField.setBounds(215, 60, 250, 40);
        schoolNameTextField.setBackground(Color.WHITE);

        schoolAddressTextField = new JTextField("School Address");
        schoolAddressTextField.setBounds(215, 120, 250, 40);
        schoolAddressTextField.setBackground(Color.WHITE);

        schoolBalanceTextField = new JTextField("School Balance");
        schoolBalanceTextField.setBounds(215, 180, 250, 40);
        schoolBalanceTextField.setBackground(Color.WHITE);

        submitBtn = new JButton("Create");
        submitBtn.setBounds(215, 250, BTN_WIDTH, BTN_HEIGHT);
        submitBtn.addActionListener(this);

        add(schoolNameTextField);
        add(schoolAddressTextField);
        add(schoolBalanceTextField);
        add(submitBtn);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submitBtn){
            String schoolName = schoolNameTextField.getText();
            System.out.println(schoolName);

            String schoolAddress = schoolAddressTextField.getText();
            System.out.println(schoolAddress);

            double schoolBalance = Double.parseDouble(schoolBalanceTextField.getText());
            System.out.println(schoolBalance);

            SchoolControler.createSchool(schoolName, schoolAddress, schoolBalance);
        }

    }
}
