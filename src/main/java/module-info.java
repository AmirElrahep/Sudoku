module com.amir {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.jfoenix;

    opens com.amir to javafx.fxml;
    exports com.amir;

    opens com.amir.controller to javafx.fxml;
    exports com.amir.controller;

    opens com.amir.model to javafx.fxml;
    exports com.amir.model;
}
