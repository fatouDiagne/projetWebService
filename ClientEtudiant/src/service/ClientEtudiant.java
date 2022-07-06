package service;

import java.util.List;
import java.util.Scanner;

public class ClientEtudiant {

	public static void main(String[] args) {

		EtudiantService stub = new EtudiantWSService().getEtudiantServicePort();
        String option = "";
        Scanner sc = new Scanner(System.in);

        do
        {
            System.out.println("A. Afficher Etudiant ");
            System.out.println("B. Ajouter Etudiant");
            System.out.println("C. Update Etudiant");
            System.out.println("D. Delete Etudiant");
            System.out.println("E. Exit");
            System.out.println("===========================================");
            System.out.println("Enter an option");
            System.out.println("===========================================");

            option = sc.nextLine();

            System.out.println("\n");

            switch(option.toUpperCase())
            {
            case "A":

            	System.out.println("Liste des Etudiants");
            	List<Etudiant> res = stub.getEudiant();
            	System.out.println(res);

                break;

            case "B":
                System.out.println(stub.ajouterEtudiant("astou", "faye"));
                break;

            case "C":
                System.out.println(stub.modifierEtudiant(2, "Fall"));
            	System.out.println("hello");
                break;

            case "D":
                stub.supprimerEtudiant(14);
            	System.out.println("Id 14 a été supprimé!");
                break;

            case "E":
            	System.out.println("******************************Merci********************");
                System.exit(0);
                break;

            default:
                System.out.println("Cette option n'existe pas choisir encore");
                break;
            }
        }while (!option.equals("E"));
		}


}


