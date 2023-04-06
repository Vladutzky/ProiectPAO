package Catalog;

import java.util.*;

public class CatalogFacultate extends Catalog {

    Map<String, Integer> credite = new HashMap<>();
    Map<Materie_Persoana, Integer> note = new HashMap<>();

    CatalogFacultate(){
        super();
        Scanner scanner  =new Scanner (System.in);
        for (String holograf : Materii ){
            System.out.print("Cate credite are materia " + holograf);
            int credits = scanner.nextInt();
            credite.put(holograf, credits);

        }
        for (Materie_Persoana item : CatalogBasic) {
            int nota = 0;
            note.put(item, nota);
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


    public void Adauga_Nota() {
        Scanner scanner = new Scanner(System.in);
        String NumeAbsenta;
        String PrenumeAbsenta;
        String NumeMaterie;
        int Nota;

        System.out.print("Numele elevului: ");
        NumeAbsenta = scanner.nextLine();
        System.out.print("Prenumele elevului: ");
        PrenumeAbsenta = scanner.nextLine();
        System.out.print("Materia la care a obtinut nota: ");
        NumeMaterie = scanner.nextLine();
        System.out.print("Nota: ");
        Nota = scanner.nextInt();

        while (!persoanaExists(NumeAbsenta, PrenumeAbsenta)) {
            System.out.print("Nume si prenume incorecte \n");
            System.out.print("Numele elevului: ");
            NumeAbsenta = scanner.nextLine();
            System.out.print("Prenumele elevului: ");
            PrenumeAbsenta = scanner.nextLine();
            System.out.print("Nota: ");
            Nota = scanner.nextInt();
            scanner.nextLine();  // Consume the end-of-line charact
        }

        while (!materieExists(NumeMaterie)) {
            System.out.print("Materia incorecta \n");
            System.out.print("Materia la care a obtinut nota: ");
            NumeMaterie = scanner.nextLine();
        }
        int number = Nota;
        while (!(number >= 1 && number <= 10)) {
            System.out.print("Nota incorecta");
            System.out.print("Nota: ");
            number = scanner.nextInt();
            Nota = number;  //
        }

        for (Materie_Persoana item : note.keySet()) {
            if (item.getPersoana().equals(NumeAbsenta + " " + PrenumeAbsenta) && item.getMaterie().equals(NumeMaterie))
                note.put(item, Nota);
        }

        }


    void Calcul_Medie_Aritmetica(){
//        for (Materie_Persoana item : note.keySet()) {
//            System.out.print(item.getMaterie() + " " + note.get(item));
//        }
        int medie  = 0;
        int contor = 0;
        String stud = "";
        for (Materie_Persoana item : note.keySet()) {
            stud = item.getPersoana();
            int nota_student = note.get(item);
            medie = medie + nota_student;
            contor++;
            }
            float medie1 = ((float)(medie))/contor;
            // System.out.print("Medie "+ medie + " contor "+ contor);
            System.out.print("Studentul "+ stud + " a obtinut media aritmetica"+ medie1);
        }

    void Calcul_Medie_Ponderata() {
        int medie = 0;
        int nr_credite_total = 0;
        String stud;
        for (Materie_Persoana item : note.keySet()) {
            stud = item.getPersoana();
            for (String subject : credite.keySet()){

                if (item.getMaterie().equals(subject)) {
                    medie += note.get(item)*credite.get(subject);
                    nr_credite_total +=credite.get(subject);
                }}
            float medie1 = ((float)(medie))/nr_credite_total;
            System.out.print("Studentul "+ stud + " a obtinut media ponderata"+ medie1);
        }
    }
    public static void main(String[] args) {
        CatalogFacultate catalog = new CatalogFacultate();
        catalog.Adauga_Nota();
        catalog.Adauga_Nota();
        catalog.Calcul_Medie_Ponderata();
        catalog.Calcul_Medie_Aritmetica();

    }


    }


