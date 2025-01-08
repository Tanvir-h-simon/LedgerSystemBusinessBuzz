module com.ledgersystem.ledgersystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.ledgersystem to javafx.fxml;
    exports com.ledgersystem;
}