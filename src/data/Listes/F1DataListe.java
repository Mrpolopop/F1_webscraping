package data.Listes;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import data.Exceptions.ExceptionJsonVide;
import data.Exceptions.ExceptionMauvaisCode;

abstract class F1DataListe {
    private final String urlString;
    protected ArrayList data =  new ArrayList();
    protected JSONObject dataJsonObject;

    protected F1DataListe(String urlString) {
        this.urlString = urlString;
        this.getDataJsonObject();
        try {
            this.miseEnFormeData();
        } catch (ExceptionJsonVide e) {
            System.out.println(e);
        }
    }

    private void getDataJsonObject() {
        try{
            // recuperation du json sur internet
            URL url = new URI(this.urlString + "?limit=150").toURL();
            HttpURLConnection con = (HttpURLConnection)url.openConnection();

            con.setRequestMethod("GET");
            con.connect();

            int responseCode = con.getResponseCode();

            if (responseCode != 200) {
                throw new ExceptionMauvaisCode(responseCode);
            }

            Scanner scanner = new Scanner(url.openStream());
            String dataJsonStr = "";

            while (scanner.hasNext()) {
                dataJsonStr += scanner.nextLine();
            }

            scanner.close();
            con.disconnect();

            // mise en forme du Json recupere
            JSONParser parser = new JSONParser();
            this.dataJsonObject = (JSONObject) parser.parse(dataJsonStr);

            if (this.dataJsonObject == null) {
                throw new ExceptionJsonVide("l'url ne mène pas vers un Json");
            }

            this.dataJsonObject = (JSONObject) this.dataJsonObject.get("MRData");

            if (this.dataJsonObject == null) {
                throw new ExceptionJsonVide("le Json n'est pas compatible");
            }
        }catch(Exception e){
            e.printStackTrace();
        };
    }

    abstract void miseEnFormeData() throws ExceptionJsonVide;

    public Object get(int index) {
        return this.data.get(index);
    };

    public int size() {
        return this.data.size();
    };

}
