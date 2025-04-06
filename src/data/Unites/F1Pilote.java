package data.Unites;

public class F1Pilote{
    String prenomNom;
    String numeroPermanent;
    String nationalite;
    String dateNaissance; // format : AAAA-MM-JJ

    public F1Pilote(String prenomNom, String numeroPermanent, String nationalite, String dateNaissance) {
        this.prenomNom = prenomNom;
        this.numeroPermanent = numeroPermanent;
        this.nationalite = nationalite;
        this.dateNaissance = dateNaissance;
    }

    @Override
    public String toString() {
        return this.prenomNom + ", n°" + this.numeroPermanent + ", " + this.nationalite + " né le " + this.dateNaissance;
    }
}
