package Service;
import Classes.Filliere;
import Classes.Module;
import Classes.Enseignant;
import java.util.ArrayList;
public class GestionModule {
    public static Module addmodule(String id_module,  Filliere filliere,  Enseignant chef)
    {

        return new Module();
    }

    public static Module updatemodule(int id , String intitule,  Filliere filliere, Enseignant chef){
        return  new Module();
    }
    public static ArrayList<Module> deleteModuleById(int id){
        return  null;
    }
}
