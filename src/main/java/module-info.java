module com.example.project12 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.app.ldtg to javafx.fxml;
    exports com.app.ldtg;
}