package data.Unites;

public class F1Constructeur {
    String nom;
    String nationalite;
    // rajouter des infos avec le web scraping de wikipedia

    public F1Constructeur(String nom, String nationalite) {
        this.nom = nom;
        this.nationalite = nationalite;
    }

    @Override
    public String toString() {
        return this.nom + ", " + this.nationalite;
    }
}

