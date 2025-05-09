package graphique.vue;

import graphique.GraphiqueMain;
import graphique.controleur.ControleurBoutonMenu;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class VueSaison extends Vue {
    Label label = new Label("Saison");
    Label annee = new Label();
    Button btnMenu = new Button("Menu");
    Button btnPrecedent = new Button("Precedent");
    Button btnSuivant = new Button("Suivant");

    public VueSaison() {
        //Top
        this.setTop(new Label("Saison"));
        BorderPane.setAlignment(this.getTop(), Pos.CENTER);

        //Center
        VBox vBox = new VBox(this.annee);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(10);
        this.setCenter(vBox);

        //Bottom
        HBox hBox = new HBox(this.btnPrecedent, this.btnMenu, this.btnSuivant);
        hBox.setAlignment(Pos.CENTER);
        hBox.setSpacing(10);
        this.setBottom(hBox);
    }

    @Override
    public void fixeControlleurs(GraphiqueMain graphiqueMain) {
        this.btnMenu.setOnAction(e -> {new ControleurBoutonMenu(graphiqueMain).handle(e);});
    }

    public void setAnnee(String annee) {
        this.annee.setText(annee);
    }
}
