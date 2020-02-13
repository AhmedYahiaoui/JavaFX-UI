/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liverpooldash;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import static liverpooldash.LiverPoolDash.stage;

/**
 *
 * @author Black hummer
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Pane parent;
        private double xOffSet = 0;
    private double yOffSet = 0;

    
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

        parent.setOnMousePressed((event) -> {
            xOffSet = event.getSceneX();
            yOffSet = event.getSceneY();

        });
        parent.setOnMouseDragged((event) -> {
            stage.setX(event.getScreenX() - xOffSet);
            stage.setY(event.getScreenY() - yOffSet);
            stage.setOpacity(0.8f);

        });

        parent.setOnDragDone((event) -> {
            stage.setOpacity(1.0f);

        });

        parent.setOnMouseReleased((event) -> {
            stage.setOpacity(1.0f);

        });

    }
}
