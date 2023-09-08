module com.example.csc_311_fxml_demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.csc_311_fxml_demo to javafx.fxml;
    exports com.example.csc_311_fxml_demo;
}