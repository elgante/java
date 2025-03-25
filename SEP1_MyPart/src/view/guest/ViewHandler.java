package view.guest;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Stage;
import model.Model;

public class ViewHandler
{
    private Model model;
    private GuestViewController guestViewController;
    private final Scene currentScene;
    private Stage primaryStage;
    private GuestListViewController guestListViewController;

    public ViewHandler(Model model)
    {
        this.currentScene = new Scene(new Region());
        this.model = model;
    }

    public void start(Stage primaryStage)
    {
        this.primaryStage = primaryStage;
        openView("GuestView.fxml");
    }

    public void openView(String file)//loads a specific view
    {
        Region root = null;
        switch (file)
        {//for each view we would need seperate case eg 4 stages then 4 cases
            case "GuestView.fxml":
                root = loadGuestView(file);
                break;

            case "GuestListView.fxml":
                 root = loadGuestDisplay(file);
        }

        currentScene.setRoot(root);
        String title = "";

        primaryStage.setTitle(title);
        primaryStage.setScene(currentScene);
        primaryStage.setWidth(root.getPrefWidth());
        primaryStage.setHeight(root.getPrefHeight());
        primaryStage.show();
    }

    private Region loadGuestView(String fxmlFile)//returns the region which is needed for setting of the stage
    {
        if (guestViewController == null)
        {
            try
            {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource(fxmlFile));

                Region root = loader.load();
                guestViewController = loader.getController();
                guestViewController.init(this, model, root);
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        } else
        {
            guestViewController.reset();
        }
        return guestViewController.getRoot();


    }

    private Region loadGuestDisplay(String fxmlFile)//for each view we need to add another load e.g loadRoomDetailsView
    {
        if (guestListViewController == null)
        {
            try
            {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource(fxmlFile));

                Region root = loader.load();
                guestListViewController = loader.getController();
                guestListViewController.init(this, model, root);
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        } else
        {
            guestListViewController.reset();
        }
        return guestListViewController.getRoot();


    }
}