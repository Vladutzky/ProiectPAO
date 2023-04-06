package Catalog;

import java.util.Scanner;

public class Elev extends Persoana {

    protected String telefon;
    public Elev (String ceva){
        nume=prenume=CNP=telefon="";
    }
    public Elev (){

        nume=prenume=CNP=telefon="";
    }
    public Elev(int x){
        super();
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Introduceti telefonul tutorelui/parintelui: ");
//        this.telefon = scanner.nextLine();
//        while(!isValidPhone(telefon)){
//            System.out.println("Numar de telefon gresit!");
//            System.out.print("Introduceti telefonul tutorelui/parintelui: ");
//            telefon = scanner.nextLine();
//        }
//        this.telefon = telefon;
    }

    public Elev(String nume, String prenume, String cnp, String telefon) {
        super(nume, prenume, cnp);
        Scanner scanner = new Scanner(System.in);
        while(!isValidPhone(telefon)){
            System.out.println("Numar de telefon gresit!");
            System.out.print("Introduceti telefon: ");
            telefon = scanner.nextLine();
        }
        this.telefon = telefon;
    }

    private boolean isValidPhone(String telefon) {
        String pattern = "^07[0-9]{8}$";
        return telefon.matches(pattern);
    }

    public String getPhoneNumber() {
        return telefon;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.telefon = phoneNumber;
    }
    public static void main(String[] args) {
        Elev e = new Elev(1);
    }
}


