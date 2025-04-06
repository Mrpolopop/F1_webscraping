package data.Listes;

import java.util.ArrayList;

import data.Exceptions.ExceptionJsonVide;
import data.Unites.F1Constructeur;
import org.json.simple.JSONObject;

public class F1ConstructeursListe extends F1DataListe{
    
    public F1ConstructeursListe() {
        super("http://ergast.com/api/f1/constructors.json");
    }

    @Override
    void miseEnFormeData() throws ExceptionJsonVide {

        this.dataJsonObject = (JSONObject) this.dataJsonObject.get("ConstructorTable");

        if (this.dataJsonObject == null) {
            throw new ExceptionJsonVide("champ ConstructorTable manquant");
        }

        ArrayList<JSONObject> dataConstructeursJson = (ArrayList<JSONObject>) this.dataJsonObject.get("Constructors");

        for (JSONObject dataJsonObject : dataConstructeursJson) {
            F1Constructeur temp = new F1Constructeur(
                    (String) dataJsonObject.get("name"),
                    (String) dataJsonObject.get("nationality"));

            this.data.add(temp);
        }
    }
}
