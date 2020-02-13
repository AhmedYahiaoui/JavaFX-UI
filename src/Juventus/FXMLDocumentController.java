/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juventus;

import static Juventus.Juventus.stage;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

/**
 *
 * @author Black hummer
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private AnchorPane parent;
    @FXML
    private Pane parent2;
    private double xOffSet = 0;
    private double yOffSet = 0;
    @FXML
    private ImageView image;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        makeStageDraggable();
    }

    @FXML
    private void close_app(MouseEvent event) {
        System.exit(0);
    }

    @FXML
    private void mini_app(MouseEvent event) {
        stage.setIconified(true);
    }


    private void makeStageDraggable() {

        parent2.setOnMousePressed((event) -> {
            xOffSet = event.getSceneX();
            yOffSet = event.getSceneY();

        });
        parent2.setOnMouseDragged((event) -> {
            stage.setX(event.getScreenX() - xOffSet);
            stage.setY(event.getScreenY() - yOffSet);
            stage.setOpacity(0.8f);

        });

        parent2.setOnDragDone((event) -> {
            stage.setOpacity(1.0f);

        });

        parent2.setOnMouseReleased((event) -> {
            stage.setOpacity(1.0f);

        });

    }

}
