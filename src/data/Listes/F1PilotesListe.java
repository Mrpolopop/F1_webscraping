package data.Listes;

import java.util.ArrayList;

import data.Exceptions.ExceptionJsonVide;
import data.Unites.F1Pilote;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class F1PilotesListe extends F1DataListe{

    public F1PilotesListe() {
        super("http://ergast.com/api/f1/drivers.json");
    }
    
    @Override
    void miseEnFormeData() throws ExceptionJsonVide {

        this.dataJsonObject = (JSONObject) this.dataJsonObject.get("DriverTable");

        if (this.dataJsonObject == null) {
            throw new ExceptionJsonVide("champ DrieverTable manquant");
        }

        ArrayList<JSONObject> dataPilotesJson = (ArrayList<JSONObject>) this.dataJsonObject.get("Drivers");
        for (JSONObject dataPilote : dataPilotesJson) {
            F1Pilote temp = new F1Pilote(
                    dataPilote.get("givenName") + " " + dataPilote.get("familyName"),
                    (String) dataPilote.get("permanentNumber"),
                    (String) dataPilote.get("nationality"),
                    (String) dataPilote.get("dateOfBirth")
            );

            this.data.add(temp);
        }
    }
}
