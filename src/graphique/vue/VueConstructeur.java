package graphique.vue;

import graphique.GraphiqueMain;
import graphique.controleur.ControleurBoutonMenu;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class VueConstructeur extends Vue{
    Label label = new Label("Constructeur");
    Button button = new Button("Menu");

    public VueConstructeur() {
        this.setCenter(label);
        this.setBottom(button);
    }

    @Override
    public void fixeControlleurs(GraphiqueMain graphiqueMain) {
        this.button.setOnAction(e -> {new ControleurBoutonMenu(graphiqueMain).handle(e);});
    }
}
