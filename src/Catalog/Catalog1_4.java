package Catalog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class Catalog1_4  extends Catalog{
    Map<Materie_Persoana, Integer> absente = new HashMap<>();
    Map<Materie_Persoana, List<String>> note = new HashMap<>();

    List <String> Calificative = new ArrayList<>();
    Catalog1_4() {
     super();
     for (Materie_Persoana item : CatalogBasic) {
         absente.put(item, 0);
         note.put(item, Calificative);
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

    public boolean calificativExists(String calificativ) {
        if(calificativ.equals("FB") || calificativ .equals("B") || calificativ.equals("S") || calificativ.equals("IS")  )
                return true;

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
                System.out.print("\n");
                absente.put(item, nrAbsente);
            }
        }
    }


    public void Adauga_Calificativ() {
        Scanner scanner = new Scanner(System.in);
        String NumeAbsenta;
        String PrenumeAbsenta;
        String NumeMaterie;
        String Calificativ;

        System.out.print("Numele elevului: ");
        NumeAbsenta = scanner.nextLine();
        System.out.print("Prenumele elevului: ");
        PrenumeAbsenta = scanner.nextLine();
        System.out.print("Materia la care a obtinut calificativ: ");
        NumeMaterie = scanner.nextLine();
        System.out.print("Calificativ: ");
        Calificativ = scanner.nextLine();

        while (!persoanaExists(NumeAbsenta, PrenumeAbsenta)) {
            System.out.print("Nume si prenume incorecte \n");
            System.out.print("Numele elevului: ");
            NumeAbsenta = scanner.nextLine();
            System.out.print("Prenumele elevului: ");
            PrenumeAbsenta = scanner.nextLine();
        }

        while (!materieExists(NumeMaterie)) {
            System.out.print("Materia incorecta \n");
            System.out.print("Materia la care a obtinut calificativ: ");
            NumeMaterie = scanner.nextLine();
        }

        while (!calificativExists(Calificativ)) {
            System.out.print("Calificativ incorect");
            System.out.print("Calificativ: ");
            Calificativ = scanner.nextLine();
        }

        for (Materie_Persoana item : note.keySet()) {
            if (item.getPersoana().equals(NumeAbsenta + " " + PrenumeAbsenta) && item.getMaterie().equals(NumeMaterie)) {
                List <String> Calification = note.get(item);
                Calification.add(Calificativ);
                System.out.print("Elevul are urmatoarele calificative: ");
                for (String calification : Calification)
                    System.out.println(calification);
                System.out.print("\n");
                note.put(item, Calification);
                return;
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
                System.out.print("\n");
                absente.put(item, nrAbsente);
            }
        }
    }


    public static void main(String[] args) {
        Catalog1_4 catalog = new Catalog1_4();
        catalog.Adauga_Calificativ();
        //catalog.Adauga_Calificativ();
//
        for (Materie_Persoana i : catalog.absente.keySet()) {
        System.out.println("key: " + i.getPersoana() + " value: " + catalog.note.get(i));}
    }

    }



