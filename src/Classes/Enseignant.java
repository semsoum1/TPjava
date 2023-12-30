package Classes;
import java.util.ArrayList;

public class Enseignant {

    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String grade;
    private Departement departement;
    ArrayList<Module> modules = new ArrayList<Module>();

    public Enseignant(){}
    public Enseignant(String nom, String prenom, String email, String grade, Departement departement)
    {
        this.nom=nom;
        this.prenom=prenom;
        this.email=email;
        this.grade=grade;
        this.departement=departement;
    }
    public int getId() {
        return id;
    }
    public String getnom()
    {return nom;}

    public String getprenom()
    {return prenom;}

    public String getemail()
    {return email;}

    public String getgrade()
    {return grade;}

    public Departement getdepartement ()
    {return departement;}

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setId(int id)
        {this.id = id;}
    public void setNom(String nom)
    {this.nom = nom;}

    public void setPrenom(String prenom)
    {this.prenom=prenom;}

    public void setEmail(String email)
    {this.email=email;}

    public void setGrade(String grade)
    {this.grade=grade;}

    public void setDepartement(Departement departement)
    {this.departement=departement;}

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;}

}
