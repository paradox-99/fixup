package sourcefile;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginPage_Controller {
    @FXML
    private Label login_warning_message;

    @FXML
    private TextField take_UserName, take_UserPassword;

    @FXML
    void User_Login(ActionEvent event) {

    }

    @FXML
    void User_Sign_up(ActionEvent event) throws IOException {
        App.setRoot("signUpPage");
    }
}
