package com.example.project_oop;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class Controller implements EventHandler<ActionEvent> {
    @FXML
    private TextField first_name;
    @FXML
    private TextField last_name;
    @FXML
    private TextField pass;
    @FXML
    private TextField address;
    @FXML
    private TextField phone;
    @FXML
    private TextField email;
    @FXML
    private ComboBox cb;


    ArrayList<User> users = new ArrayList<>();

    @FXML
    @Override
    public void handle(ActionEvent actionEvent) {
        users.add(new User(pass.getText(),cb.getSelectionModel().getSelectedItem().toString(),first_name.getText(),last_name.getText(), address.getText(), phone.getText(), email.getText(),false));

    }
}