package Classes;
import java.util.ArrayList;

public class Departement {
    private int id_departement;
    private Enseignant responsable_departement;

    private String intitule;
    private ArrayList<Filliere> filliere;
    public Departement(){}

    public  Departement(String intitule, Enseignant responsable_departement) {
        this.responsable_departement =responsable_departement;
        this.intitule = intitule;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule)
    {
        this.intitule = intitule;
    }

    public Enseignant getResponsable_departement()
    {
        return responsable_departement;
    }

    public void setResponsable_departement(Enseignant responsable_departement)
    {
        this.responsable_departement = responsable_departement;
    }

    public int getId_departement() {
        return id_departement;
    }

    public void setId_departement(int id_departement) {
        this.id_departement = id_departement;
    }

    public ArrayList<Filliere> getFilliere() {
        return filliere;
    }

    public void setFilliere(ArrayList<Filliere> filliere) {
        this.filliere = filliere;
    }
}
