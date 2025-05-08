package graphique.controleur;

import graphique.GraphiqueMain;
import graphique.vue.VueAnnee;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ControleurBoutonAnnee implements EventHandler<ActionEvent> {

    GraphiqueMain main;

    public ControleurBoutonAnnee(GraphiqueMain main) {
        this.main = main;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        this.main.changeVue(new VueAnnee());
    }
}
