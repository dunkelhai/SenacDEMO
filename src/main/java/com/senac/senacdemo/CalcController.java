package com.senac.senacdemo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class CalcController {
    @FXML
    private Label resultado;
    @FXML
    private TextArea numero1;
    @FXML
    private TextArea numero2;



    @FXML
    protected void onHelloButtonClick() {
        resultado.setText("Welcome to JavaFX Application!");
    }
}