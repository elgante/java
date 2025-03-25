package view.guest;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;
import model.Model;

public class GuestViewController//controlling the views and interect with view handler and model
//shift f6 renames variables names in all locations
{
    @FXML
    public Label errorLabel;
    @FXML
    public TextField phoneNumberField;
    @FXML
    public TextField guestIDField;
    @FXML
    private TextField firstNameField;
    @FXML
    private TextField lastNameField;
    @FXML
    private TextField emailField;

    private ViewHandler viewHandler;
    private Model model;
    private Region root;

    public void init(ViewHandler viewHandler, Model model, Region root)

    {
        this.viewHandler = viewHandler;
        this.model = model;
        this.root = root;
    }
    public Region getRoot()//it's needed for GUI
    {
        return root;

    }

    @FXML private void addNewGuest()//always delete action events unless you want to use it , eg if button is pressed or on hold
    //check if phone is int

    {
        try
        {
            String firstNameInput = firstNameField.getText();
            String lastNameInput = lastNameField.getText();
            int phoneInput = Integer.parseInt(phoneNumberField.getText());
            String emailInput = emailField.getText();
            model.addGuest(firstNameInput, lastNameInput, phoneInput, emailInput);
            reset();
        } catch (NumberFormatException e)
        {
            errorLabel.setText("you tried to insert a string in phone field");
            e.printStackTrace();
        }


    }

    public void reset()//extract method ctrl+alt+m to make code clean
    // after we press the button we want everything to be clear
    {
        errorLabel.setText("");
        firstNameField.setText("");
        lastNameField.setText("");
        emailField.setText("");
        phoneNumberField.setText("");
    }


    @FXML
    private void onButtonShowGuestList()

    {//call a method on a viewhdler
        viewHandler.openView("GuestListView.fxml");


    }


}