package Model;

public class MedecinGeneraliste extends Medecin{

    //il faut ajouter des constructeurs
    MedecinGeneraliste(String i, String n, String s, String g){
        super(i,n,s,g);
    }

    MedecinGeneraliste(){
        super();
    }

    MedecinGeneraliste(MedecinGeneraliste m){
        super(m);
    }

    //string to string
    public String toString(){
        return super.toString() + ", il s'agit d'un medecin generaliste.";
    }



}
