module com.formation.gestionhopital {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.formation.gestionhopital to javafx.fxml;
    exports com.formation.gestionhopital;
}