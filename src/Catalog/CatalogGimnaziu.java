package Catalog;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class CatalogGimnaziu extends Catalog {

    Map<Materie_Persoana, Integer> absente = new HashMap<>();
    Map<Materie_Persoana, List<String>> note = new HashMap<>();

    Map<Materie_Persoana, Integer> teza = new HashMap<>();

    List <String> Note = new ArrayList<>();
    Integer Teza = 5;
    CatalogGimnaziu() {
        super();
        Scanner scanner  =new Scanner (System.in);
        for (Materie_Persoana item : CatalogBasic) {
            absente.put(item, 0);
            note.put(item, Note);
            String materie  = item.getMaterie();
            System.out.print("Este"+ " "+materie+" o materie la care se da teza?");
            String materie_teza = scanner.nextLine();
            if(materie_teza.equals("Da")){
                System.out.print("Ce nota a obtinut in teza?");
                Teza = scanner.nextInt();
                teza.put(item, Teza) ;
            }
        }
    }

    public boolean persoanaExists(String nume, String prenume) {
        for (Persoana persoana : Persoane) {
            if (persoana.getNume().equals(nume) && persoana.getPrenume().equals(prenume)) {
                return true;
            }
        }
        return false;


    }

    public boolean materieExists(String materie) {
        for (String Materie : Materii) {
            if (Materie.equals(materie)) {
                return true;
            }
        }
        return false;
    }

    public void Adauga_Absenta() {
        Scanner scanner = new Scanner(System.in);
        String NumeAbsenta;
        String PrenumeAbsenta;
        String NumeMaterie;

        System.out.print("Numele elevului: ");
        NumeAbsenta = scanner.nextLine();
        System.out.print("Prenumele elevului: ");
        PrenumeAbsenta = scanner.nextLine();
        System.out.print("Materia la care a absentat: ");
        NumeMaterie = scanner.nextLine();

        while (!persoanaExists(NumeAbsenta, PrenumeAbsenta)) {
            System.out.print("Nume si prenume incorecte \n");
            System.out.print("Numele elevului: ");
            NumeAbsenta = scanner.nextLine();
            System.out.print("Prenumele elevului: ");
            PrenumeAbsenta = scanner.nextLine();
        }

        while (!materieExists(NumeMaterie)) {
            System.out.print("Materia incorecta \n");
            System.out.print("Materia la care a absentat: ");
            NumeMaterie = scanner.nextLine();
        }

        for (Materie_Persoana item : absente.keySet()) {
            if (item.getPersoana().equals(NumeAbsenta + " " + PrenumeAbsenta) && item.getMaterie().equals(NumeMaterie)) {
                int nrAbsente = absente.get(item);
                nrAbsente++;
                System.out.print("Elevul mai are "+ nrAbsente + " absente");
                absente.put(item, nrAbsente);
            }
        }
    }

    public void Motiveaza_Absenta() {
        Scanner scanner = new Scanner(System.in);
        String NumeAbsenta;
        String PrenumeAbsenta;
        String NumeMaterie;

        System.out.print("Numele elevului: ");
        NumeAbsenta = scanner.nextLine();
        System.out.print("Prenumele elevului: ");
        PrenumeAbsenta = scanner.nextLine();
        System.out.print("Materia la care a absentat: ");
        NumeMaterie = scanner.nextLine();

        while (!persoanaExists(NumeAbsenta, PrenumeAbsenta)) {
            System.out.print("Nume si prenume incorecte \n");
            System.out.print("Numele elevului: ");
            NumeAbsenta = scanner.nextLine();
            System.out.print("Prenumele elevului: ");
            PrenumeAbsenta = scanner.nextLine();
        }

        while (!materieExists(NumeMaterie)) {
            System.out.print("Materia incorecta \n");
            System.out.print("Materia la care a absentat: ");
            NumeMaterie = scanner.nextLine();
        }

        for (Materie_Persoana item : absente.keySet()) {
            if (item.getPersoana().equals(NumeAbsenta + " " + PrenumeAbsenta) && item.getMaterie().equals(NumeMaterie)) {
                int nrAbsente = absente.get(item);
                nrAbsente--;
                System.out.print("Elevul mai are "+ nrAbsente + " absente");
                absente.put(item, nrAbsente);
            }
        }
    }

    public void Adauga_Nota() {
        Scanner scanner = new Scanner(System.in);
        String NumeAbsenta;
        String PrenumeAbsenta;
        String NumeMaterie;
        String Nota;

        System.out.print("Numele elevului: ");
        NumeAbsenta = scanner.nextLine();
        System.out.print("Prenumele elevului: ");
        PrenumeAbsenta = scanner.nextLine();
        System.out.print("Materia la care a obtinut nota: ");
        NumeMaterie = scanner.nextLine();
        System.out.print("Nota: ");
        Nota = scanner.nextLine();

        while (!persoanaExists(NumeAbsenta, PrenumeAbsenta)) {
            System.out.print("Nume si prenume incorecte \n");
            System.out.print("Numele elevului: ");
            NumeAbsenta = scanner.nextLine();
            System.out.print("Prenumele elevului: ");
            PrenumeAbsenta = scanner.nextLine();
            System.out.print("Nota: ");
            Nota = scanner.nextLine();
        }

        while (!materieExists(NumeMaterie)) {
            System.out.print("Materia incorecta \n");
            System.out.print("Materia la care a obtinut nota: ");
            NumeMaterie = scanner.nextLine();
        }
        int number = Integer.parseInt(Nota);
        while (!(number >= 1 && number <= 10)) {
            number = Integer.parseInt(Nota);
            System.out.print("Nota incorecta");
            System.out.print("Nota: ");
            Nota = scanner.nextLine();
        }

        for (Materie_Persoana item : note.keySet()) {
            if (item.getPersoana().equals(NumeAbsenta + " " + PrenumeAbsenta) && item.getMaterie().equals(NumeMaterie)) {
                List <String> Notes = note.get(item);
                Notes.add(Nota);
                System.out.print("Elevul are urmatoarele note: ");
                for (String calification : Notes)
                    System.out.println(calification);
                System.out.print("\n");
                note.put(item, Notes);
                return;
            }
        }
    }

    void Calcul_Medie(){

        for (Materie_Persoana item : note.keySet()) {
            int medie  = 0;
            int contor = 0;
            List<String> NoteElev = note.get(item);
            for (String nota : NoteElev)
            {
                int number = Integer.parseInt(nota);
                medie = medie + number;
                contor++;
            }
            float medie1 = 0;
            for (Materie_Persoana esteteza : teza.keySet())
            {
                if (esteteza.getMaterie().equals(item.getMaterie())) {
                    int NotaTeza = teza.get(esteteza);
                    System.out.print("Media este: " + medie);
                    System.out.print("Teza este: " + NotaTeza);
                    medie1 = ((float)(medie + NotaTeza))/4;


            }
            }
            System.out.print("Elevul "+ item.getPersoana() + " a obtinut media " + medie1 + " la materia " + item.getMaterie());
        }
    }

    public static void main(String[] args) {
        CatalogGimnaziu catalog = new CatalogGimnaziu();
        catalog.Adauga_Nota();
        catalog.Adauga_Nota();
        catalog.Adauga_Nota();
        catalog.Calcul_Medie();

    }
}
