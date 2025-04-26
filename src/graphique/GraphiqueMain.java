package graphique;
import javafx.application.Application;
import javafx.stage.Stage;

public class GraphiqueMain extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Graphique");
        primaryStage.show();
    }
}
