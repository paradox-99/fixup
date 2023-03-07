package sourcefile;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ServicePageController {

    @FXML
    void switchToHomePage(ActionEvent event) throws IOException {
        App.setRoot("homePage");
    }
}