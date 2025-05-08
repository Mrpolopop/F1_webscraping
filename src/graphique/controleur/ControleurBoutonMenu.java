package graphique.controleur;

import graphique.GraphiqueMain;
import graphique.vue.MainVue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ControleurBoutonMenu implements EventHandler<ActionEvent> {

    GraphiqueMain main;

    public ControleurBoutonMenu(GraphiqueMain main) {
        this.main = main;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        main.changeVue(new MainVue());
    }
}
