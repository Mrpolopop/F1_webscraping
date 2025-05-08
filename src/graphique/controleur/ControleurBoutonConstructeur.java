package graphique.controleur;

import graphique.GraphiqueMain;
import graphique.vue.VueConstructeur;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ControleurBoutonConstructeur implements EventHandler<ActionEvent> {

    GraphiqueMain main;

    public ControleurBoutonConstructeur(GraphiqueMain main) {
        this.main = main;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        this.main.changeVue(new VueConstructeur());
    }
}
