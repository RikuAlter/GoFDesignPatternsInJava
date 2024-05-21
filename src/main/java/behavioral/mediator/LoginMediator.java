package behavioral.mediator;

import lombok.Setter;

import javax.swing.*;
import java.awt.event.ActionEvent;

@Setter
public class LoginMediator implements Mediator{
    private JTextField userField = new JTextField();
    private JTextField passwordField = new JTextField();
    private LoginButton loginButton;

    @Override
    public void login() {
        String user = userField.getText();
        String password = passwordField.getText();
        System.out.println("Validated user!");
    }

    public void enterUserName(String name){
        userField.setText(name);
    }

    public void enterPassword(String password){
        passwordField.setText(password);
    }

    public void simulateLogin(){
        loginButton.fireActionPerformed(new ActionEvent(this, 0, "login"));
    }
}
