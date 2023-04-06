package Catalog;
import java.util.Scanner;
public class Main {
    static Servicii service = new Servicii();
    public static void main(String[] args) {
        boolean var = true;
        while ( var == true) {
            Scanner scanner = new Scanner(System.in);
            int Alegere = 0;
            System.out.println("1. Creeaza un catalog pentru clasele 1-4");
            System.out.println("2. Adauga un calificativ pentru clasele 1-4");
            System.out.println("3. Adaugati o absenta pentru clasele 1-4");
            System.out.println("4. Motivati o absenta pentru clasele 1-4");
            System.out.println("5. Creeaza un catalog pentru clasele 5-8");
            System.out.println("6. Adauga o nota pentru clasele 5-8");
            System.out.println("7. Adaugati o absenta pentru clasele 5-8");
            System.out.println("8. Motivati o absenta pentru clasele 5-8");
            System.out.println("9. Calculeaza media generala pentru clasele 5-8");
            System.out.println("10. Creeaza un catalog pentru facultate");
            System.out.println("11. Adauga o nota intr-un catalog pentru facultate");
            System.out.println("12. Calculeaza media ponderata intr-un catalog pentru facultate");
            System.out.println("13. Calculeaza media aritmetica intr-un catalog pentru facultate");
            System.out.println("14. Sorteaza toate cataloagele introduse in functie de numarul de elevi/studenti");
            System.out.println("15. Iesire");
            Alegere = scanner.nextInt();
            switch (Alegere) {
                case 1:
                    service.CatalogUnuPatru();
                    break;
                case 2:
                    service.CalificativUnuPatru();
                    break;
                case 3:
                    service.AdAbsente_UnuPatru();
                    break;
                case 4:
                    service.MotivAbsente_UnuPatru();
                    break;
                case 5:
                    service.CatalogGimnaziu();
                    break;
                case 6:
                    service.NotaGimnaziu();
                    break;
                case 7:
                    service.AdAbsenteGimnaziu();
                    break;
                case 8:
                    service.MotivAbsenteGimnaziu();
                    break;
                case 9:
                    service.Calcul_Medie_Gimnaziu();
                    break;
                case 10:
                    service.CatalogFacultate();
                    break;
                case 11:
                    service.NotaFacultate();
                    break;
                case 12:
                    service.Calcul_Medie_Facultate_Ponderata();
                    break;
                case 13:
                    service.Calcul_Medie_Facultate_Aritmetica();
                    break;
                case 14:
                    service.Sortare_Cataloage();
                    break;
                case 15:
                    var = false;
                default:
                    System.out.println("Alegere invalida, incercati din nou.");
                    break;
            }
        }


    }
}