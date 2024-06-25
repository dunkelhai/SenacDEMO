package com.senac.senacdemo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalcController {
    @FXML
    private Label resultado;
    @FXML
    private TextField numero1;
    @FXML
    private TextField numero2;

    @FXML
    protected void somar() {
        Double n1 = Double.parseDouble(numero1.getText());
        Double n2 = Double.parseDouble(numero2.getText());
        Double soma = n1 + n2;
        resultado.setText("Resultado: " + soma);
    }
}