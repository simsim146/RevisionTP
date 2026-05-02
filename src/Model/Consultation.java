package Model;

public abstract class Consultation {
    private Medecin medecin;
    private Patient patient;
    private String date;
    private String notesConsul;

    /*medecin
    patient
    date
    notes de consultation
    --domicile ; adresse du patient
    --hopital  ; le service
    * */

    public Consultation(Medecin med, Patient pat, String dat, String notesCons){
        medecin = med;
        patient = pat;
        date = dat;
        notesConsul = notesCons;
    }

    public Consultation(){
        medecin = null;
        patient = null;
        date = "";
        notesConsul = "";
    }

    public Consultation(Consultation c){
        medecin = c.medecin;
        patient = c.patient;
        date = c.date;
        notesConsul = c.notesConsul;
    }

    public String toString(){
        return "Le medecin de cette consultation est : "+ medecin+", Le patient concerne est: "+patient+", la date est "+date+", les notes de consultation sont: "+notesConsul;
    }

}
