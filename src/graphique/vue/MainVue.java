package graphique.vue;

import graphique.GraphiqueMain;
import graphique.controleur.ControleurBoutonAnnee;
import graphique.controleur.ControleurBoutonConstructeur;
import graphique.controleur.ControleurBoutonPilote;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class MainVue extends Vue {
    Label label = new Label("main vue");
    Button buttonPilote = new Button("Les Pilotes");
    Button buttonConstructeur = new Button("Les constructeurs");
    Button buttonAnnee = new Button("Les Années");

    public MainVue() {
        VBox vBox = new VBox();
        vBox.getChildren().addAll(this.label, this.buttonPilote, this.buttonConstructeur, this.buttonAnnee);
        vBox.setSpacing(10);
        vBox.setPadding(new Insets(10, 10, 10, 10));
        vBox.setAlignment(Pos.CENTER);
        this.setCenter(vBox);
    }

    @Override
    public void fixeControlleurs(GraphiqueMain graphiqueMain) {
        this.buttonPilote.setOnAction(e -> new ControleurBoutonPilote(graphiqueMain).handle(e));
        this.buttonConstructeur.setOnAction(e -> new ControleurBoutonConstructeur(graphiqueMain).handle(e));
        this.buttonAnnee.setOnAction(e -> new ControleurBoutonAnnee(graphiqueMain).handle(e));
    }
}
