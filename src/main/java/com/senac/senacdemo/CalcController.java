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
    protected void somar() {
        double n1 = Double.parseDouble(numero1.toString());
        double n2 = Double.parseDouble(numero2.toString());
        double soma = n1 + n2;
        resultado.setText("Resultado: " + soma);
    }
}