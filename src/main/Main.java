package main;

import data.Listes.F1ConstructeursListe;
import data.Listes.F1PilotesListe;
import data.Listes.F1SaisonsListe;

public class Main {
    public static void main(String[] args) {
        F1SaisonsListe saisons = new F1SaisonsListe();
        System.out.println(saisons.get(12));
    }
}
