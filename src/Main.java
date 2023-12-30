import java.util.Scanner;
import controller.*;

public class Main {
public static void showPrincipalMenu(){
        System.out.println("-------------------------[ Bienvenu ]---------------------------");


        System.out.println("1: Pour gérer les départements");
        System.out.println("2: Pour gérer les filières");
        System.out.println("3: Pour gérer les enseignants");
        System.out.println("4: Pour gérer les modules");
        System.out.println("5: Pour gérer les étudiants");
        System.out.println("0: Pour sortir");

    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    if (m == 1){Departementcontroller.affichmenu();}
    if (m == 2){Fillierecontroller.affichmenu();}
    if (m == 3){Enseignantcontroller.affichmenu();}
    if (m == 4){Modulecontroller.affichmenu();}
    if (m == 5){Enseignantcontroller.affichmenu();}

}



    public static void main(String[] args) {


    Main.showPrincipalMenu();
}
}



