package graphique.controleur;

import graphique.GraphiqueMain;
import graphique.vue.VueSaison;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ControleurBoutonSaison implements EventHandler<ActionEvent> {

    GraphiqueMain main;

    public ControleurBoutonSaison(GraphiqueMain main) {
        this.main = main;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        this.main.changeVue(new VueSaison());
    }
}
