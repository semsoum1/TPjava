package Service;

import Classes.Departement;
import Classes.Enseignant;

import java.util.ArrayList;

public class GestionEnseignant {

    public static int getEnsById(int id){
        Enseignant[] enseignants = new Enseignant[0];
        for (Enseignant enseignant :enseignants) {
            if (enseignant.getId() == id) return enseignant.getId();
        }
        return id;
    }
    public static Enseignant addEnseignant(String nom, String prenom, String email, String grade, Departement dept)
    {
        return  new Enseignant();
    }

    public static Enseignant updateEnseignant(int id, String nom, String prenom, String email, String grade, Departement dept)
    {
        return new Enseignant();
    }

    public static ArrayList<Enseignant> deleteEnseignantById(int id){
        return null;
    }
}
