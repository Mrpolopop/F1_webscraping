package main;

import data.Listes.F1ConstructeursListe;
import data.Listes.F1PilotesListe;
import data.Listes.F1SaisonsListe;

public class Main {
    public static void main(String[] args) {
        F1SaisonsListe saisons = new F1SaisonsListe();
        F1PilotesListe pilotes = new F1PilotesListe();
        F1ConstructeursListe construct = new F1ConstructeursListe();
        System.out.println("nombre de saisons : " + saisons.size());
        System.out.println("nombre de pilotes : " + pilotes.size());
        System.out.println("nombre de constructeurs : " + construct.size());
    }
}
