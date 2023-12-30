package controller;

import Classes.Departement;
import Service.GestionDepartement;
import Service.GestionEnseignant;



import java.util.Scanner;

public class Departementcontroller {
    public static boolean isNull(Object ob) {
        return ob == null ;
    }
    public static void affichmenu() {
        System.out.println("1: Pour ajouter un département");
        System.out.println("2: Pour afficher  département");
        System.out.println("3: Pour modifier un département");
        System.out.println("4: Pour supprimer un département");
        System.out.println("0: Pour retourner au menu principal");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        if (m == 2){showDepartements();}
        if (m == 1){createDepartement();}
        if (m == 3){editDepartement();}
        if (m == 4){destroyDepartement();}


    }


            public static void showDepartements() {
                for (Departement departement = null;;) {
                    System.out.print("Id : " + departement.getId_departement());
                    System.out.print(" | Intitulé : " + departement.getIntitule());
                    System.out.print(" | Chef : " + departement.getResponsable_departement().getnom()
                            + " " + departement.getResponsable_departement().getprenom());
                    if (! Departementcontroller.isNull(departement.getResponsable_departement())) {
                        System.out.print(" | respo : " + departement.getResponsable_departement().getnom() + " "
                                + departement.getResponsable_departement().getprenom());
                    }
                }
    }
                public static void createDepartement () {
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Entrez l'intitulé :");
                    String intitule = sc.nextLine();
                    System.out.print("Sélecionnez un enseignant par id : :");
                    int id = sc.nextInt();
                    GestionDepartement.addDepartement(intitule, GestionEnseignant.getEnsById(id));

            }
            public static void editDepartement(){
                Scanner sc = new Scanner(System.in);
                System.out.print("Sélecionnez un departement par id :" );
                int id = sc.nextInt();
                System.out.print("Entrez l'intitulé  :" );
                String intitule = sc.nextLine();
                System.out.print("Sélecionnez un enseignant par id :" );
                int idEns = sc.nextInt();
                GestionDepartement.modifierDepartement(id, GestionEnseignant.getEnsById(idEns));
            }
            public static void destroyDepartement() {
                Scanner sc = new Scanner(System.in);
                System.out.print("Sélecionnez un departement par id :");
                    int id = sc.nextInt();
                    GestionDepartement.supprimerDepartement(id);

                }
            }




