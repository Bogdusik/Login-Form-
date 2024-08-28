package gui;

import constants.CommanConstants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI extends JFrame {
    public LoginGUI(){
        super(CommanConstants.APP_NAME);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(CommanConstants.FRAME_SIZE[0], CommanConstants.FRAME_SIZE[1]);
        setLocationRelativeTo(null);

        addGUIComponents();
    }

    public void addGUIComponents(){
        SpringLayout springLayout = new SpringLayout();
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(springLayout);

        // username
        JLabel usernameLabel = new JLabel("Username: ");
        usernameLabel.setFont(new Font("Dialog", Font.PLAIN, 10));

        JTextField usernameField = new JTextField(CommanConstants.TEXTFIELD_SIZE);
        usernameField.setFont(new Font("Dialog", Font.PLAIN, 10));

        springLayout.putConstraint(SpringLayout.WEST, usernameLabel, 35, springLayout.WEST, loginPanel);
        springLayout.putConstraint(SpringLayout.NORTH, usernameLabel, 85, springLayout.NORTH, loginPanel);
        springLayout.putConstraint(SpringLayout.WEST, usernameField, 135, springLayout.WEST, loginPanel);
        springLayout.putConstraint(SpringLayout.NORTH, usernameField, 85, springLayout.NORTH, loginPanel);

        loginPanel.add(usernameLabel);
        loginPanel.add(usernameField);

        //password
        JLabel passwordLabel = new JLabel("Password: ");
        passwordLabel.setFont(new Font("Dialog", Font.PLAIN, 10));

        JPasswordField passwordField = new JPasswordField(CommanConstants.TEXTFIELD_SIZE);
        passwordField.setFont(new Font("Dialog", Font.PLAIN, 10));

        springLayout.putConstraint(SpringLayout.WEST, passwordLabel, 35, SpringLayout.WEST, loginPanel);
        springLayout.putConstraint(SpringLayout.NORTH, passwordLabel, 135, SpringLayout.NORTH, loginPanel);
        springLayout.putConstraint(SpringLayout.WEST, passwordField, 135, SpringLayout.WEST, loginPanel);
        springLayout.putConstraint(SpringLayout.NORTH, passwordField, 135, SpringLayout.NORTH, loginPanel);

        loginPanel.add(passwordLabel);
        loginPanel.add(passwordField);


        // login button
        JButton loginButton = new JButton("Login");
        loginButton.setFont(new Font("Dialog",Font.BOLD, 10));

        springLayout.putConstraint(SpringLayout.WEST, loginButton, 150, SpringLayout.WEST, loginPanel);
        springLayout.putConstraint(SpringLayout.NORTH, loginButton, 250, SpringLayout.NORTH, loginPanel);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = passwordField.getText();

                if(username.equals("username") && password.equals("password")){
                    System.out.println("LOGIN SUCCESSFUL!");
                }else{
                    System.out.println("LOGIN FAILED...");
                }
            }
        });


        loginPanel.add(loginButton);


        this.getContentPane().add(loginPanel);
    }
}