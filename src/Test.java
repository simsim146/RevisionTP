import java.util.ArrayList;
import java.util.Scanner;

import Model.*;
import Business.*;

import static java.lang.Integer.parseInt;

public class Test{

    static Scanner scanner = new Scanner(System.in);

    ArrayList<Patient> patients = new ArrayList<Patient>();
    ArrayList<Medecin> medecins = new ArrayList<Medecin>();
    ArrayList<Consultation> consultations = new ArrayList<Consultation>();

    static public void menu(){
        int choix = 0;
        while (choix != 4){

            System.out.println("Choisis la fonctionnalite: ");
            System.out.println("1. Gerer les patients");
            System.out.println("2. Gerer les medecins");
            System.out.println("3. Gerer les consultations");
            System.out.println("4. Quitter le systeme");
            System.out.println("Je choisis: ");
            choix = parseInt(scanner.next());

            switch(choix){
                case 1:
                    System.out.println("-->Gerer les patients: ");
                    GestionPat gp = new GestionPat();
                    break;
                case 2:
                    System.out.println("-->Gerer les medecins: ");
                    break;
                case 3:
                    System.out.println("-->Gerer les consultations: ");
                    break;
                case 4:
                    System.out.println("bien quitte");
                    break;
                default:
                    System.out.println("not valid!");
            }
        }
    }



    public static void main(String [] args){
        //the main shall stay minimal

    }
}
//so i finished model and test, next go fill bus
