module com.ledgersystem.ledgersystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;


    opens com.ledgersystem.controllers to javafx.fxml;
    opens com.ledgersystem to javafx.fxml, javafx.graphics;

    exports com.ledgersystem;
    exports com.ledgersystem.controllers;
}