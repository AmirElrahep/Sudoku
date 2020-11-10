module com.amir {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.jfoenix;

    opens com.amir to javafx.fxml;
    exports com.amir;
}