package controller;

import Classes.Departement;
import Classes.Enseignant;
import Classes.Filliere;
import Service.*;

import java.util.Scanner;

public class Fillierecontroller {

    public static void affichmenu() {
        System.out.println("1: Pour ajouter une filliere");
        System.out.println("2: Pour afficher  les fillieres");
        System.out.println("3: Pour modifier une filliere");
        System.out.println("4: Pour supprimer une fillieres");
        System.out.println("0: Pour retourner au menu principal");
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        if (n == 2){showFilliere();}
        if (n == 1){addFilliere();}
        if (n == 3){updateFilliere();}
        if (n == 4){deleteFilliereById();}

    }

    public static void showFilliere() {
        for (Filliere filliere = null;;) {
            System.out.print("Id : " + filliere.getId());
            System.out.print(" | intitule : " + filliere.getntitule());
            System.out.print(" | modules : " + filliere.getModules());
            System.out.print(" | departement  : " + filliere.getdepartement());
            System.out.println("");
        }}

    public static void addFilliere() {
    }

    public static void updateFilliere(){
    }

    public static void deleteFilliereById() {
    }
}
