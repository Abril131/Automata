module com.example.automatamatricula {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.automatamatricula to javafx.fxml;
    exports com.example.automatamatricula;
}