import model.Model;
import view.guest.ViewHandler;
import javafx.application.Application;
import javafx.stage.Stage;

public class MyApplication extends Application
{

    public void start(Stage primaryStage)
    {
        Model model = new Model();

        ViewHandler view =  new ViewHandler(model);
        view.start(primaryStage);




    }
}

