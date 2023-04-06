package Catalog;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Catalog {
    int nr_materii;
    int nr_elevi;

    List<String> Materii = new ArrayList<>();
    List<Elev> Persoane = new ArrayList<>();

    List<Materie_Persoana> CatalogBasic = new ArrayList<>();
    public Catalog() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numarul de materii: ");
        this.nr_materii = scanner.nextInt();
        for (int i = 0; i < nr_materii; i++) {
            System.out.print("Introduceti o materie: ");
            String materie = scanner.next();
            Materii.add(materie);
        }
        System.out.print("Introduceti numarul de elevi: ");
        this.nr_elevi = scanner.nextInt();
        for (int i = 0; i < nr_elevi; i++) {
            System.out.print("Introduceti un elev: \n");
            Elev pi = new Elev(1);
            Persoane.add(pi);
        }
        for (String Materie : Materii){
            for (Elev persoana : Persoane) {
                Materie_Persoana item = new Materie_Persoana(Materie, persoana);
                CatalogBasic.add(item);
            }
        }
    }
    public void printCatalogBasic() {
        for (Materie_Persoana item : CatalogBasic) {
            System.out.println("Materie: " + item.getMaterie() + ", Persoana: " + item.getPersoana());
        }
    }
    int getLength() {
        return nr_elevi;
    }
    public static void main(String[] args) {

    }
}
