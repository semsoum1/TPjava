package controller;

import Classes.Etudiant;

import java.util.Scanner;

public class Etudiantcontroller {
    public void affichmenu() {
        System.out.println("1: Pour ajouter un etudiant");
        System.out.println("2: Pour afficher  les etudiants");
        System.out.println("3: Pour modifier un etudiant");
        System.out.println("4: Pour supprimer un etudiant");
        System.out.println("0: Pour retourner au menu principal");
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        if (n == 2){showEtudiant();}
        if (n == 1){addEtudiant();}
        if (n == 3){updateEtudiant();}
        if (n == 4){deleteEtdById();}

    }
    public static void showEtudiant() {
        for (Etudiant etudiant = null;;) {
            System.out.print("appoge : " + etudiant.getAppogee());
            System.out.print(" | prenom : " + etudiant.getPrenom());
            System.out.print(" | nom : " + etudiant.getNom());
            System.out.print(" | email  : " + etudiant.getEmail());
            System.out.println("");
        }}

    public static void addEtudiant() {
    }

    public static void updateEtudiant(){
    }

    public static void deleteEtdById() {
    }
}
