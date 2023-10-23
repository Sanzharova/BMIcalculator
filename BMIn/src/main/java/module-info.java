module com.example.bmin {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bmin to javafx.fxml;
    exports com.example.bmin;
}