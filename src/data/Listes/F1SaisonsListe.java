package data.Listes;

import java.util.ArrayList;

import data.Exceptions.ExceptionJsonVide;
import data.Unites.F1Saison;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class F1SaisonsListe extends F1DataListe{
    public F1SaisonsListe() {
        super("http://ergast.com/api/f1/seasons.json");
    }

    @Override
    void miseEnFormeData() throws ExceptionJsonVide {
        this.dataJsonObject = (JSONObject) this.dataJsonObject.get("SeasonTable");

        if (this.dataJsonObject == null) {
            throw new ExceptionJsonVide("champ SeasonTable manquant");
        }

        ArrayList<JSONObject> dataSaisonsJson = (ArrayList<JSONObject>) this.dataJsonObject.get("Seasons");

        for (JSONObject dataSaison : dataSaisonsJson) {
            F1Saison temp = new F1Saison((String)dataSaison.get("season"));
            this.data.add(temp);
        }
    }
}
