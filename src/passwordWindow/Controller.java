package passwordWindow;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import javax.swing.*;

public class Controller {

    int passSize = 0;
    int randIntChar;
    char alphabet[] = {' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k','l','m','n','o','p','q','r','s','t','u','v','w','x','y', 'z', '0','1','2','3','4','5','6','7','8','9'};
    String password;
    String test;

    @FXML
    private TextField txtSize;

    @FXML
    private TextField txtPassword;





    //@FXML
    //private TextField lblPass;

    public void clearPassword(ActionEvent event) {
        txtPassword.setText("");
        /*System.out.println(alphabet.length);
        System.out.println(alphabet[36]);
        test = "";
        for (int i = 1; i <= 26; i++) {
            test += alphabet[i];
        }
        for (int j = 27; j < 53; j++) {
            test += Character.toUpperCase(alphabet[j - 26]);
        }
        for (int k = 52; k < 62; k++) {
            test += alphabet[k - 25];
        }
        txtPassword.setText(test);*/
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

        //for (int j = 27; j <= 52; j++) {
            //if (j == 52) {
            //    test += alphabet[j - 27];
            //} else {
            //    test += alphabet[j - 26];
            //}
        //}

        txtPassword.setText(password);
        //txtTest.setText(test);
    }
}
