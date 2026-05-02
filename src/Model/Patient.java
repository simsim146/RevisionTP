package Model;

public class Patient {

    private String nomComplet;
    private int age;
    private boolean diabetique;
    private static int idCounter= 0;
    private int id;

    public Patient(String n, int a, boolean d){
        n = nomComplet;
        a = age;
        d = diabetique;
        id = ++idCounter;
    }

    Patient(){
        nomComplet = "";
        age = 0;
        diabetique = false;
        id = 0;
    }

    Patient(Patient p){
        nomComplet = new String(p.nomComplet);
        age = p.age;
        diabetique = p.diabetique;
        id = p.idCounter;
    }

    public String toStrning(){
        if (diabetique){
            return "Patient #"+id+" : Le nom "+nomComplet+" , agee "+age+" ans, le patient est diabetique.";
        }else {
            return "Patient #"+id+" : Le nom "+nomComplet+" , agee "+age+" ans, le patient n'est pas diabetique.";
        }
    }

    //I don't see a need for setters or getters

}
