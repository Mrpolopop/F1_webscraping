package graphique;
import graphique.vue.MainVue;
import graphique.vue.Vue;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GraphiqueMain extends Application {

    Vue vue = new MainVue();
    Scene scene = new Scene(vue);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.vue.fixeControlleurs(this);
        primaryStage.setTitle("Graphique");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void changeVue(Vue vue) {
        this.scene.setRoot(vue);
        vue.fixeControlleurs(this);
    }
}
