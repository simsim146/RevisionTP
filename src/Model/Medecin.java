package Model;

public abstract class Medecin {

    private String INPE;
    private String nomComplet;
    private String service;
    private String grade;

    public Medecin(String i, String n, String s, String g){
        i = INPE;
        n = nomComplet;
        s = service;
        g = grade;
    }

    public Medecin(){
        INPE = "";
        nomComplet = "";
        service = "";
        grade = "";
    }



}
