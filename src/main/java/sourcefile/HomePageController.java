package sourcefile;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class HomePageController {

    
    @FXML
    void switchToServicePage(ActionEvent event) throws IOException {
        App.setRoot("servicePage");
    }
   
}
