module sourcefile {
    requires javafx.controls;
    requires javafx.fxml;

    opens sourcefile to javafx.fxml;
    exports sourcefile;
}
