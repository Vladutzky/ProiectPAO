package Catalog;
import Utilitati.Adresa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Persoana {
    protected String nume;
    protected String prenume;
    protected String CNP;
    protected Adresa add;
    protected String telefon;




    public Persoana() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numele: ");
        this.nume = scanner.nextLine();
        System.out.print("Introduceti prenumele: ");
        this.prenume = scanner.nextLine();
        this.add = new Adresa();

//        System.out.print("Introduceti CNP: ");
//        String cnp = scanner.nextLine();
//        while (!isValidCNP(cnp)) {
//            System.out.println("CNP INVALID! ");
//            System.out.print("Introduceti CNP: ");
//            cnp = scanner.nextLine();
//        }
//        this.CNP = cnp;

    }

    public Persoana (String nume, String prenume, String cnp){
        Scanner scanner = new Scanner(System.in);
        this.nume  = nume;
        this.prenume = prenume;
        while (!isValidCNP(cnp)) {
            System.out.println("CNP INVALID! ");
            System.out.print("Introduceti CNP: ");
            cnp = scanner.nextLine();
        }
        this.CNP = cnp;
    }

    public Persoana (String ceva){
        nume=prenume=CNP=telefon="";
    }

    private boolean isValidCNP(String cnp) {
        String pattern = "^[1-9][0-9]{12}$";
        return cnp.matches(pattern);
    }


    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getCNP() {
        return CNP;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String NumePrenume() {return nume+" "+prenume;}
    public void setCNP(String cnp) {
        Scanner scanner = new Scanner(System.in);
        while (!isValidCNP(cnp)) {
            System.out.println("CNP INVALID! ");
            System.out.print("Introduceti CNP: ");
            cnp = scanner.nextLine();
        }
        this.CNP = cnp;
    }

//de facut override

}

