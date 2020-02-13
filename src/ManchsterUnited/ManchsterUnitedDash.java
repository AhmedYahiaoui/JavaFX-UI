/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManchsterUnited;

import liverpooldash.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Black hummer
 */
public class ManchsterUnitedDash extends Application {

    public static Stage stage = null;

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLManchsterUnited.fxml"));

        Scene scene = new Scene(root, Color.TRANSPARENT);

        //Scene scene = new Scene(root);
        stage.initStyle(StageStyle.TRANSPARENT);

        // stage.setOpacity(0.2);
        stage.setScene(scene);
        this.stage = stage;

        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
