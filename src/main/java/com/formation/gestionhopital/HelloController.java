package com.formation.gestionhopital;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        try{
            String query = "Select * from medecin;";
            Connection cn = ClassConnection.connectb();
            PreparedStatement pst = cn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            while (rs.next()){
                System.out.println(rs.getString("nom"));
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}