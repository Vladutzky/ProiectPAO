package Utilitati;
import java.util.Scanner;
public class Adresa {
    private String strada;
    private String oras;
    private String judet;

    public Adresa() {
    Scanner scanner = new Scanner (System.in);
    System.out.print("Introduceti judetul");
    this.judet = scanner.nextLine();
    System.out.print("Introduceti orasul");
    this.oras = scanner.nextLine();
    System.out.print("Introduceti strada");
    this.strada = scanner.nextLine();
    }
}
