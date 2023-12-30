package controller;

import Classes.Departement;
import Classes.Enseignant;
import Service.GestionDepartement;
import Service.GestionEnseignant;

import java.util.Scanner;

public class Enseignantcontroller {



    public static void affichmenu() {
        System.out.println("1: Pour ajouter un enseignant");
        System.out.println("2: Pour afficher  les enseignants");
        System.out.println("3: Pour modifier un enseignant");
        System.out.println("4: Pour supprimer un enseignant");
        System.out.println("0: Pour retourner au menu principal");
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        if (n == 2){showEnseignant();}
        if (n == 1){addEnseignant();}
        if (n == 3){updateEnseignant();}
        if (n == 4){deleteEnseignantById();}

    }



            public static void showEnseignant() {
                for (Enseignant enseignant = null;;) {
                    System.out.print("Id : " + enseignant.getId());
                    System.out.print(" | prenom : " + enseignant.getprenom());
                    System.out.print(" | nom : " + enseignant.getnom());
                    System.out.print(" | departement  : " + enseignant.getdepartement());

                }}

                public static void addEnseignant() {
                }

                public static void updateEnseignant(){
                }

                public static void deleteEnseignantById() {
                }





}
