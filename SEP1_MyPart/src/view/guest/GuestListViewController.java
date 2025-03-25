package view.guest;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Region;
import model.Guest;
import model.Model;

import java.util.ArrayList;

public class GuestListViewController
{

//shift f6 renames variables names in all locations


    @FXML
    public TextArea guestTextArea;
    private ViewHandler viewHandler;
    private Model model;
    private Region root;

    public void init(ViewHandler viewHandler, Model model, Region root)

    {
        this.viewHandler = viewHandler;
        this.model = model;
        this.root = root;
        reset();
    }

    public Region getRoot()//it's needed for GUI
    {
        return root;

    }

    @FXML
    private void back()//always delete action events unless you want to use it , eg if button is pressed or on hold
    //check if phone is int

    {//call a method on a viewhdler
        viewHandler.openView("GuestView.fxml");


    }




    public void reset()
    {
        ArrayList<Guest> guest = new ArrayList<>();
        guest = model.getGuestsFromFile();//we are method getGuestFromt the File from the fileManager and delagating to Model
        //guestTextArea.setText(guest.toString());
        // a for loop put all of the guests in one string use this one string to set.Text
        String s = "";
        for (int i = 0; i < guest.size(); i++)
        {//if we would have only = we would be overidding the previos stuff all the time
            s += guest.get(i);
        }
        guestTextArea.setText(s);



}

}