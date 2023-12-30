package controller;

import Classes.Module;

import java.util.Scanner;

public class Modulecontroller {
    public static void affichmenu() {
        System.out.println("1: Pour ajouter un module");
        System.out.println("2: Pour afficher  les modules");
        System.out.println("3: Pour modifier un module");
        System.out.println("4: Pour supprimer un module");
        System.out.println("0: Pour retourner au menu principal");
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        if (n == 2){showModule();}
        if (n == 1){addmodule();}
        if (n == 3){updatemodule();}
        if (n == 4){deleteModuleById();}

    }
    public static void showModule() {
        for (Module module = null;;) {
            System.out.print(" | nom : " + module.getId_module());
            System.out.print(" | filliere : " + module.getFilliere());
            System.out.print("responsable de departement : " + module.getResponsable_departement());
            System.out.println("");
        }}

    public static void addmodule() {
    }

    public static void updatemodule(){
    }

    public static void deleteModuleById() {
    }
}
