module com.example.td1jfx {
    requires javafx.controls;
    requires javafx.fxml;



    opens com.example.td1jfx to javafx.fxml;
    exports com.example.td1jfx;
    exports com.example.partie1;
    exports com.example.partie2;
    exports exercice1;
    exports com.example.javafxdemo.partie2.exercice5;
    opens com.example.partie3 to javafx.fxml;
    exports com.example.partie3;





}