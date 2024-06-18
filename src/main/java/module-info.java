module com.senac.senacdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.senac.senacdemo to javafx.fxml;
    exports com.senac.senacdemo;
}