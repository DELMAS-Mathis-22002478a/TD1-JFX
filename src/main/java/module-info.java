module com.example.td1jfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.td1jfx to javafx.fxml;
    exports com.example.td1jfx;
    exports com.example.partie1;


}