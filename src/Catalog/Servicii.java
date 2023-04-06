package Catalog;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Servicii {

    List<Catalog> cataloage = new ArrayList<Catalog>();

    void CatalogUnuPatru(){
        Catalog1_4 catalog = new Catalog1_4();
        cataloage.add(catalog);
    }
    void CalificativUnuPatru(){
        for(Catalog cat : cataloage)
            if (cat instanceof Catalog1_4)
                ((Catalog1_4) cat).Adauga_Calificativ();
    }
    void AdAbsente_UnuPatru(){
        for(Catalog cat : cataloage)
            if (cat instanceof Catalog1_4)
                ((Catalog1_4) cat).Adauga_Absenta();
    }
    void MotivAbsente_UnuPatru(){
        for(Catalog cat : cataloage)
            if (cat instanceof Catalog1_4)
                ((Catalog1_4) cat).Motiveaza_Absenta();
    }
    void CatalogGimnaziu(){
        CatalogGimnaziu catalog = new CatalogGimnaziu();
        cataloage.add(catalog);
    }
    void NotaGimnaziu(){
        for(Catalog cat : cataloage)
            if (cat instanceof CatalogGimnaziu)
                ((CatalogGimnaziu) cat).Adauga_Nota();
    }
    void AdAbsenteGimnaziu(){
        for(Catalog cat : cataloage)
            if (cat instanceof CatalogGimnaziu)
                ((CatalogGimnaziu) cat).Adauga_Absenta();
    }
    void MotivAbsenteGimnaziu(){
        for(Catalog cat : cataloage)
            if (cat instanceof CatalogGimnaziu)
                ((CatalogGimnaziu) cat).Motiveaza_Absenta();
    }
    void Calcul_Medie_Gimnaziu(){
        for(Catalog cat : cataloage)
            if (cat instanceof CatalogGimnaziu)
                ((CatalogGimnaziu) cat).Calcul_Medie();
    }
    void CatalogFacultate(){
        CatalogFacultate catalog = new CatalogFacultate();
        cataloage.add(catalog);
    }
    void NotaFacultate(){
        for(Catalog cat : cataloage)
            if (cat instanceof CatalogFacultate)
                ((CatalogFacultate) cat).Adauga_Nota();
    }
    void Calcul_Medie_Facultate_Ponderata(){
        for(Catalog cat : cataloage)
            if (cat instanceof CatalogFacultate)
                ((CatalogFacultate) cat).Calcul_Medie_Ponderata();
    }
    void Calcul_Medie_Facultate_Aritmetica(){
        for(Catalog cat : cataloage)
            if (cat instanceof CatalogFacultate)
                ((CatalogFacultate) cat).Calcul_Medie_Aritmetica();
    }
    void Sortare_Cataloage(){
        Collections.sort(cataloage, new Comparator<Catalog>() {
            @Override
            public int compare(Catalog c1, Catalog c2) {
                return Integer.compare(c1.getLength(), c2.getLength());
            }
    });

}
}
