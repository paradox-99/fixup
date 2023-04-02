module sourcefile {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires javafx.web;

    opens sourcefile to javafx.fxml;
    exports sourcefile;
}
