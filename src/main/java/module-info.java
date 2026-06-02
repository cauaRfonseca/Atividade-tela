module com.lunaltas.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.lunaltas.demo to javafx.fxml;
    exports com.lunaltas.demo;
}