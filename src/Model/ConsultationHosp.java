package Model;

public class ConsultationHosp extends Consultation{
    private String serviceHos;

    public ConsultationHosp(Medecin med, Patient pat, String dat, String notesCons, String sh){
        super(med, pat, dat, notesCons);
        serviceHos = sh;
    }

    public ConsultationHosp(){
        super();
        serviceHos = "";
    }

    public ConsultationHosp(ConsultationHosp ch){
        super(ch);
        serviceHos = ch.serviceHos;
    }

    public String toString(){
        return super.toString()+", Il s'agit d'une consultation hospitalier, le service du consultation est: "+ serviceHos;
    }
}





