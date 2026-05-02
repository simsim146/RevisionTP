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

    public Medecin(Medecin m){
        INPE = new String(m.INPE);
        nomComplet = new String(m.nomComplet);
        service = new String(m.service);
        grade = new String(m.grade);
    }

    public String toString(){
        return "Le medecin "+nomComplet+", avec INPE de: "+INPE+" service: "+service+", grade: "+grade;
    }


}
