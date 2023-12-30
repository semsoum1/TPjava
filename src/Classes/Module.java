package Classes;

public class Module {

        int id;
        private String id_module;
        private Filliere filliere;
        private Enseignant responsable_departement;

    public Module() {
    }

    public Module(String id_module, Filliere filliere, Enseignant responsable_departement)
    {
        this.id_module = id_module;
        this.filliere = filliere;
        this.responsable_departement = responsable_departement;
    }

    public String getId_module() {
        return id_module;
    }

    public void setId_module(String id_module) {
        this.id_module = id_module;
    }

    public Filliere getFilliere() {
        return filliere;
    }

    public void setFilliere(Filliere filliere) {
        this.filliere = filliere;
    }

    public Enseignant getResponsable_departement() {
        return responsable_departement;
    }

    public void setResponsable_departement(Enseignant responsable_departement) {
        this.responsable_departement = responsable_departement;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
