package Classes;

public class Note {
    private float note;
    private Etudiant etudiant;
    private Filliere filliere;

    public Note(){}

    public Note(float note, Etudiant etudiant, Filliere filliere) {
        this.note = note;
        this.etudiant = etudiant;
        this.filliere = filliere;
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public Filliere getFilliere() {
        return filliere;
    }

    public void setFilliere(Filliere filliere) {
        this.filliere = filliere;
    }
}
