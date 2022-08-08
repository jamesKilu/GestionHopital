module com.formation.gestionhopital {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.formation.gestionhopital to javafx.fxml;
    exports com.formation.gestionhopital;
}