package Model;

public class MedecinSpecialiste extends Medecin{
    private String spec;
    private boolean chir;

    MedecinSpecialiste(String i, String n, String s, String g, String spec, boolean chir){
        super(i,n,s,g);
        this.spec = spec;
        this.chir = chir;
    }

    MedecinSpecialiste(){
        super();
        spec = "";
        chir = false;
    }

    MedecinSpecialiste(MedecinSpecialiste ms){
        super(ms);
        this.spec = new String(ms.spec);
        this.chir = ms.chir;
    }

    //String toString
    public String toString(){
        if(chir){
            return super.toString()+", il s'agit d;un medecin specialiste et chirurgian";
        }else{
            return super.toString()+", il s'agit d;un medecin specialiste non chirurgian";
        }

    }
    

}
