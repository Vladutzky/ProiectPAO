package Catalog;

public class Materie_Persoana  {
    private String materie;

    String ceva = "ceva";
    private Elev pers = new Elev(ceva);
    public Materie_Persoana() {
        materie="";
        pers = new Elev(ceva);
    }

    public Materie_Persoana(String materie, Elev pers) {
        this.materie = materie;
        this.pers.nume = pers.nume;
        this.pers.prenume = pers.prenume;
        this.pers.CNP = pers.CNP;
        this.pers.telefon = pers.telefon;
    }

    public String getMaterie() {
        return materie;
    }

    public void setMaterie(String materie) {
        this.materie = materie;
    }

    public String getPersoana() {
        return pers.NumePrenume();
    }

    public void setPers(Elev pers) {
        this.pers = pers;
    }
}