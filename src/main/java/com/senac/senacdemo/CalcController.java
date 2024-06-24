package com.senac.senacdemo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CalcController {
    @FXML
    private Label welcomeText;

// teste
    //teste

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}