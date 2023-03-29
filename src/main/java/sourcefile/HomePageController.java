package sourcefile;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class HomePageController {

    @FXML
    void switchToLogin_Page(ActionEvent event) throws IOException {
        App.setRoot("loginPage");
    }
    
    @FXML
    void switchToService_page(ActionEvent event) throws IOException {
        App.setRoot("servicePage"); 
    }
   
}
