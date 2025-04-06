package data.Unites;

public class F1Saison{
    String annee;

    public F1Saison(String annee){
        this.annee = annee;
    }

    @Override
    public String toString(){
        return "saison : " + this.annee;
    }
}
