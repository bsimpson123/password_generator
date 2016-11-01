package passwordWindow;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import javax.swing.*;

public class Controller {

    private int passSize = 0;
    private int randIntChar;
    private char alphabet[] = {' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k','l','m','n','o','p','q','r','s','t','u','v','w','x','y', 'z', '0','1','2','3','4','5','6','7','8','9'};
    private String password;
    private String test;
    private ObservableList<String> data = FXCollections.observableArrayList();

    @FXML
    private TextField txtSize;

    @FXML
    private TextField txtPassword;


    @FXML
    private ListView<String> listSave;





    //@FXML
    //private TextField lblPass;

    public void clearPassword(ActionEvent event) {
        txtPassword.setText("");
    }

    public void savePassword(ActionEvent event) {


        data.add(password);
        //txtSave.appendText(password + "\n");
        listSave.setItems(data);
    }

    public void createPassword(ActionEvent event) {
        password = "";



        passSize = Integer.parseInt(txtSize.getText());
        int randomNum;


        for (int i = 0; i < passSize; i++) {

                randomNum = 1 + (int) (Math.random() * 61);

                if (randomNum >= 1 && randomNum <= 26) {
                    password += alphabet[randomNum];
                } else if (randomNum > 26 && randomNum < 53){
                    password += Character.toUpperCase(alphabet[randomNum - 26]);
                } else if (randomNum >= 52 && randomNum < 62){
                    //System.out.println(randomNum);
                    password += alphabet[randomNum - 25];
                } else {
                    System.out.println(randomNum);
                }

        }

        txtPassword.setText(password);

    }
}
