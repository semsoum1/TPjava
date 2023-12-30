package Classes;
import java.util.ArrayList;
import Classes.Departement;
import Classes.Enseignant;

public class Filliere {

    int id;
    String intitule;
    Enseignant responsable_departement;
    Departement departement;
    ArrayList<Module> modules = new ArrayList<Module>();

    public Filliere(){}
   public Filliere(String intitule,Enseignant responsable_departement,Departement departement)
   {
       this.intitule=intitule;
       this.responsable_departement=responsable_departement;
       this.departement=departement;

   }

   public String getntitule()
   {return intitule;}
   public Enseignant getrespo()
   {return responsable_departement;}
   public Departement getdepartement()
   {return departement;}

    public void setDepartement(Departement departement)
    {this.departement = departement;}

    public void setintitule(String intitule)
    {this.intitule = intitule;}

    public void setRespo(Enseignant respo)
    {this.responsable_departement = responsable_departement;}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }
}
