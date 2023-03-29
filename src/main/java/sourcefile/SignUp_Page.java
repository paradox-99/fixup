package sourcefile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class SignUp_Page {

    private static String hostAddress = "jdbc:mysql://localhost:3306/fix_up";
    private static String DB_user = "root";
    private static String DB_password = "";

    private String user_name;
    private String user_password;
    private String user_email;
    private String user_phoneNumber;
    private String user_location;


    @FXML
    private TextField user_Password, user_Email, user_Location, user_Name, user_PhoneNumber;

    @FXML
    void User_SignUP(ActionEvent event) {
        String uploadINFO = null;

        user_name = user_Name.getText();
        user_password = user_Password.getText();
        user_phoneNumber = user_PhoneNumber.getText();
        user_email = user_Email.getText();
        user_location = user_Location.getText();

        try{
        // Registering the driver class
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Connection creation
        Connection connection = DriverManager.getConnection(hostAddress, DB_user, DB_password);

        // Statement creation
        Statement statement = connection.createStatement();

        //Querie executing
        uploadINFO = "INSERT INTO user_information" + "\nVALUES ( NULL,'" +  user_name +"','"+ user_phoneNumber +"','"+ user_email +"','"+ user_location +"','"+ user_password + "')";
        //uploadINFO = "INSERT INTO user_information" + "\nVALUES (2,'nayeem','015646545', 'jfjs@gmail.com','jksjdfs, jff','12345')";

        //System.out.println(uploadINFO);

        statement.executeUpdate(uploadINFO);

        // closing the statement and connection
        statement.close();
        connection.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}