package graphique.controleur;

import graphique.GraphiqueMain;
import graphique.vue.VuePilote;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ControleurBoutonPilote implements EventHandler<ActionEvent> {

    GraphiqueMain main;

    public ControleurBoutonPilote(GraphiqueMain main) {
        this.main = main;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        this.main.changeVue(new VuePilote());
    }
}
