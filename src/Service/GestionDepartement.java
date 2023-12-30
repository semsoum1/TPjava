package Service;
import Classes.Departement;
import Classes.Enseignant;

import java.util.ArrayList;
import java.util.List;

public class GestionDepartement {
    static List<Integer> departements = new ArrayList<>();


    public static  Departement addDepartement(String intitule,int Id_departement, Enseignant... responsable_departement)
    {
        Departement departement = new Departement();
        departement.setIntitule(intitule);
        departement.setId_departement(Id_departement);
        departement.setResponsable_departement(responsable_departement[0]);

        return  departement;
    }


    public static void modifierDepartement(int index, int nouveauDepartement) {
        departements.set(index, nouveauDepartement);
    }

    public static void supprimerDepartement(int index) {
        departements.remove(index);


    }
}
