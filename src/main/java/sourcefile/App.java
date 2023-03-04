package sourcefile;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;


public class App extends Application {

    private static Scene scene;


    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("homePage"));
        //scene.setFill(Color.TRANSPARENT);
        // taskbar icon image
        stage.getIcons().add(new Image(getClass().getResourceAsStream("images/taskBarIcon.png")));
        stage.setTitle("FiX up"); // taskbar title
        //stage.initStyle(StageStyle.TRANSPARENT);
        //stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }


    public static void main(String[] args) {
        lunch();
    }
}
