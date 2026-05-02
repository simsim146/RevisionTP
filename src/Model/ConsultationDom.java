package Model;

public class ConsultationDom extends Consultation{
    private String adressePat;

    public ConsultationDom(Medecin med, Patient pat, String dat, String notesCons, String ap){
        super(med, pat, dat, notesCons);
        adressePat = ap;
    }

    public ConsultationDom(){
        super();
        adressePat = "";
    }

    public ConsultationDom(ConsultationDom cd){
        super(cd);
        adressePat = cd.adressePat;
    }

    public String toString(){
        return super.toString()+ ", Il s'agit d'une consultation domicile, l'adresse du patient est: "+adressePat+".";
    }



}
